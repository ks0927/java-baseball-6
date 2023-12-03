package baseball.domain;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class BaseballNumbers {
    private static final int BASEBALL_SIZE = 3;

    private final List<BaseballNumber> baseballNumbers;

    public BaseballNumbers(List<BaseballNumber> baseballNumbers) {
        validate(baseballNumbers);
        this.baseballNumbers = baseballNumbers;
    }

    private void validate(List<BaseballNumber> baseballNumbers) {
        if (isInvalidSize(baseballNumbers)) {
            throw new IllegalArgumentException();
        }
        if (isNotDistinct(baseballNumbers)) {
            throw new IllegalArgumentException();
        }
    }

    private boolean isInvalidSize(List<BaseballNumber> baseballNumbers) {
        return baseballNumbers.size() != BASEBALL_SIZE;
    }

    private boolean isNotDistinct(List<BaseballNumber> baseballNumbers) {
        Set<BaseballNumber> distinctNumbers = baseballNumbers.stream().collect(Collectors.toSet());
        return distinctNumbers.size() != BASEBALL_SIZE;
    }

    public List<BaseballNumber> getBaseballNumbers() {
        return baseballNumbers;
    }
}
