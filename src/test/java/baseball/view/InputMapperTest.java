package baseball.view;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

@DisplayName("입력값 매핑 테스트")
class InputMapperTest {

    @DisplayName("숫자 야구 숫자값들을 올바른 값을 입력했을때 예외가 발생하지 않는다.")
    @ParameterizedTest
    @ValueSource(strings = {"123", "456", "678", "154", "198"})
    void correctMapToBaseballNumbers(String target) {

        InputMapper inputMapper = new InputMapper();
        Assertions.assertThatCode(() -> inputMapper.mapToBaseballNumbers(target)).doesNotThrowAnyException();
    }

    @DisplayName("숫자 야구 숫자값들을 숫자가 아닌 값을 입력했을때 예외가 발생한다.")
    @ParameterizedTest
    @ValueSource(strings = {"abc", "12a", "23v", "t3t"})
    void enableMapToBaseballNumbers1(String target) {

        InputMapper inputMapper = new InputMapper();
        Assertions.assertThatCode(() -> inputMapper.mapToBaseballNumbers(target))
                .isExactlyInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("게임 플레이 결정값을 올바른 값을 입력했을때 예외가 발생하지 않는다.")
    @ParameterizedTest
    @ValueSource(strings = {"1", "2"})
    void correctMapToGameDecision(String target) {

        InputMapper inputMapper = new InputMapper();
        Assertions.assertThatCode(() -> inputMapper.mapToGameDecision(target)).doesNotThrowAnyException();
    }

    @DisplayName("숫자 야구 숫자값들을 숫자가 아닌 값을 입력했을때 예외가 발생한다.")
    @ParameterizedTest
    @ValueSource(strings = {"3", "4", "a", "tabc"})
    void enableMapToGameDecision1(String target) {

        InputMapper inputMapper = new InputMapper();
        Assertions.assertThatCode(() -> inputMapper.mapToGameDecision(target))
                .isExactlyInstanceOf(IllegalArgumentException.class);
    }
}