package baseball.domain;

import java.util.ArrayList;
import java.util.List;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("숫자 야구 숫자값들 테스트")
class BaseballNumbersTest {
    @DisplayName("올바른 숫자값들을 넣었을때는 예외가 일어나지 않는다.")
    @Test
    public void ableBaseBallNumber() {
        List<BaseballNumber> baseballNumbers = new ArrayList<>();
        baseballNumbers.add(new BaseballNumber(1));
        baseballNumbers.add(new BaseballNumber(2));
        baseballNumbers.add(new BaseballNumber(3));

        Assertions.assertThatCode(() -> new BaseballNumbers(baseballNumbers)).doesNotThrowAnyException();
    }

    @DisplayName("3자리의 숫자가 아니면 예외가 발생한다.")
    @Test
    public void enableBaseBallNumber1() {
        List<BaseballNumber> baseballNumbers = new ArrayList<>();
        baseballNumbers.add(new BaseballNumber(1));
        baseballNumbers.add(new BaseballNumber(2));
        baseballNumbers.add(new BaseballNumber(3));
        baseballNumbers.add(new BaseballNumber(4));

        Assertions.assertThatThrownBy(() -> new BaseballNumbers(baseballNumbers))
                .isExactlyInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("서로 다른 숫자가 아니면 예외가 발생한다.")
    @Test
    public void enableBaseBallNumber2() {
        List<BaseballNumber> baseballNumbers = new ArrayList<>();
        baseballNumbers.add(new BaseballNumber(1));
        baseballNumbers.add(new BaseballNumber(3));
        baseballNumbers.add(new BaseballNumber(3));

        Assertions.assertThatThrownBy(() -> new BaseballNumbers(baseballNumbers))
                .isExactlyInstanceOf(IllegalArgumentException.class);
    }
}