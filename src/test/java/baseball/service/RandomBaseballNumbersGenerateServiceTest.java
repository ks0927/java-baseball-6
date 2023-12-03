package baseball.service;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("랜덤 숫자야구 숫자값들 생성 서비스 테스트")
class RandomBaseballNumbersGenerateServiceTest {
    @DisplayName("1이상 9이하의 숫자값이 3자리 생성되었다면 예외가 발생하지 않는다.")
    @Test
    public void generateTest() {
        RandomBaseballNumbersGenerateService baseballNumbersGenerateService = new RandomBaseballNumbersGenerateService();
        Assertions.assertThatCode(() -> baseballNumbersGenerateService.generate()).doesNotThrowAnyException();
    }
}