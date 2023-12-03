package baseball;

import baseball.controller.MainController;
import baseball.service.RandomBaseballNumbersGenerateService;
import baseball.service.ScoreCalculateService;
import baseball.view.InputView;
import baseball.view.OutputView;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        MainController mainController = new MainController(new InputView(), new OutputView(),
                new RandomBaseballNumbersGenerateService(), new ScoreCalculateService());
        mainController.run();
    }
}
