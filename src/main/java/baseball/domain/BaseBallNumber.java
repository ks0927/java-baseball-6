package baseball.domain;

public class BaseballNumber {
    private static final int MIN_RANGE = 1;
    private static final int MAX_RANGE = 9;

    private final int ballNumber;

    public BaseballNumber(int ballNumber) {
        validate(ballNumber);
        this.ballNumber = ballNumber;
    }

    private void validate(int ballNumber) {
        if (isInvalidRange(ballNumber)) {
            throw new IllegalArgumentException();
        }
    }

    private boolean isInvalidRange(int target) {
        return MIN_RANGE > target || target > MAX_RANGE;
    }
}
