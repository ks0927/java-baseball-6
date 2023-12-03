package baseball.view;

import baseball.domain.ScoreDto;

public class OutputView {
    private static final String GAME_START_MESSAGE = "숫자 야구 게임을 시작합니다.";
    private static final String GAME_END_MESSAGE = "3개의 숫자를 모두 맞히셨습니다! 게임 종료";
    private static final String NO_STRIKE_SCORE = "%d볼";
    private static final String NO_BALL_SCORE = "%d스트라이크";
    private static final String DEFAULT_SCORE = "%d볼 %d스트라이크";
    private static final String NOTHING_SCORE = "낫싱";

    public void printGameStartMessage() {
        System.out.println(GAME_START_MESSAGE);
    }

    public void printScore(ScoreDto scoreDto) {
        if (scoreDto.getBall() == 0 && scoreDto.getStrike() != 0) {
            System.out.println(String.format(NO_BALL_SCORE, scoreDto.getStrike()));
        }
        if (scoreDto.getStrike() == 0 && scoreDto.getBall() != 0) {
            System.out.println(String.format(NO_STRIKE_SCORE, scoreDto.getBall()));
        }
        if (scoreDto.getBall() != 0 && scoreDto.getStrike() != 0) {
            System.out.println(String.format(DEFAULT_SCORE, scoreDto.getBall(), scoreDto.getStrike()));
        }
        if (scoreDto.getBall() == 0 && scoreDto.getStrike() == 0) {
            System.out.println(String.format(NOTHING_SCORE));
        }

    }

    public void printGameEndMessage() {
        System.out.println(GAME_END_MESSAGE);
    }
}
