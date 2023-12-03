package baseball.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

@DisplayName("게임 시작과 종료를 구분하는 수 테스트")
class GameDecisionTest {
    @DisplayName("올바른 숫자값을 넣었을때는 예외가 일어나지 않는다.")
    @ParameterizedTest
    @ValueSource(ints = {1, 2})
    public void ableBaseBallNumber(int target) {
        Assertions.assertThatCode(() -> new GameDecision(target)).doesNotThrowAnyException();
    }

    @DisplayName("1또는 2가 아닌 숫자값을 넣었을때는 예외가 발생한다.")
    @ParameterizedTest
    @ValueSource(ints = {0, -1, -1000, 3, 4, 100, 2000})
    public void enableBaseBallNumber(int target) {
        Assertions.assertThatThrownBy(() -> new GameDecision(target))
                .isExactlyInstanceOf(IllegalArgumentException.class);
    }
}