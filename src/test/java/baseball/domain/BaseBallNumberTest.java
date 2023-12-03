package baseball.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

@DisplayName("숫자 야구 숫자값 테스트")
class BaseBallNumberTest {
    @DisplayName("올바른 숫자값을 넣었을때는 예외가 일어나지 않는다.")
    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4, 5, 6, 7, 8, 9})
    public void ableBaseBallNumber(int target) {
        Assertions.assertThatCode(() -> new BaseBallNumber(target)).doesNotThrowAnyException();
    }

    @DisplayName("1이상 9이하 범위 밖의 숫자값을 넣었을때는 예외가 발생한다.")
    @ParameterizedTest
    @ValueSource(ints = {0, -1, -1000, 10, 11, 100, 2000})
    public void enableBaseBallNumber(int target) {
        Assertions.assertThatThrownBy(() -> new BaseBallNumber(target))
                .isExactlyInstanceOf(IllegalArgumentException.class);
    }
}