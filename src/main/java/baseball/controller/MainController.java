package baseball.controller;

import baseball.domain.BaseballNumbers;
import baseball.domain.GameDecision;
import baseball.domain.ScoreDto;
import baseball.service.RandomBaseballNumbersGenerateService;
import baseball.service.ScoreCalculateService;
import baseball.view.InputView;
import baseball.view.OutputView;

public class MainController {

    private final InputView inputView;
    private final OutputView outputView;
    private final RandomBaseballNumbersGenerateService randomBaseballNumbersGenerateService;
    private final ScoreCalculateService scoreCalculateService;

    public MainController(InputView inputView, OutputView outputView,
                          RandomBaseballNumbersGenerateService randomBaseballNumbersGenerateService,
                          ScoreCalculateService scoreCalculateService) {
        this.inputView = inputView;
        this.outputView = outputView;
        this.randomBaseballNumbersGenerateService = randomBaseballNumbersGenerateService;
        this.scoreCalculateService = scoreCalculateService;
    }

    public void run() {
        GameDecision gameDecision = new GameDecision(1);
        outputView.printGameStartMessage();
        while (gameDecision.getGameDecision()) {
            BaseballNumbers generate = randomBaseballNumbersGenerateService.generate();
            baseballPlaying(generate);
            gameDecision = inputView.readGameDecision();
        }
    }

    private void baseballPlaying(BaseballNumbers generate) {
        while (true) {
            BaseballNumbers baseballNumbers = inputView.readBaseballNumbers();
            ScoreDto calculate = scoreCalculateService.calculate(baseballNumbers, generate);
            outputView.printScore(calculate);
            if (calculate.getStrike() == 3) {
                outputView.printGameEndMessage();
                break;
            }
        }
    }

    private int scoreFlag(ScoreDto scoreDto) {
        if (scoreDto.getBall() == 0 && scoreDto.getStrike() != 0) {
            return 1;
        }
        if (scoreDto.getStrike() == 0 && scoreDto.getBall() != 0) {
            return 2;
        }
        if (scoreDto.getBall() != 0 && scoreDto.getStrike() != 0) {
            return 3;
        }
        if (scoreDto.getBall() == 0 && scoreDto.getStrike() == 0) {
            return 4;
        }
        return -1;
    }
}
