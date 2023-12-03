package baseball.domain;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BaseballNumber that = (BaseballNumber) o;
        return ballNumber == that.ballNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ballNumber);
    }
}
