package baseball.domain;

public class ScoreDto {
    private static final int BASEBALL_SIZE = 3;

    private int ball;
    private int strike;

    public ScoreDto(int ball, int strike) {
        this.ball = ball;
        this.strike = strike;
    }

    public int getBall() {
        return ball;
    }

    public int getStrike() {
        return strike;
    }
}
