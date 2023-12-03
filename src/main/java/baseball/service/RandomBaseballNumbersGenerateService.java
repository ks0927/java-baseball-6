package baseball.service;

import baseball.domain.BaseballNumber;
import baseball.domain.BaseballNumbers;
import java.util.ArrayList;
import java.util.List;

public class RandomBaseballNumbersGenerateService {
    private final RandomBaseballNumberGenerateService baseballNumberGenerateService = new RandomBaseballNumberGenerateService();

    public BaseballNumbers generate() {
        List<BaseballNumber> generateNumbers = new ArrayList<>();

        while (generateNumbers.size() != 3) {
            BaseballNumber generate = baseballNumberGenerateService.generate();
            if (generateNumbers.contains(generate)) {
                continue;
            }
            generateNumbers.add(generate);
        }
        return new BaseballNumbers(generateNumbers);
    }
}
