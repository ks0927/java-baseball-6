package baseball.domain;

public class GameDecision {

    private final int gameDecision;

    public GameDecision(int gameDecision) {
        validate(gameDecision);
        this.gameDecision = gameDecision;
    }

    private void validate(int ballNumber) {
        if (isInvalidValue(ballNumber)) {
            throw new IllegalArgumentException();
        }
    }

    private boolean isInvalidValue(int target) {
        return target != 1 && target != 2;
    }

}
