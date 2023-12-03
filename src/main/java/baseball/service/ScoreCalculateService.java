package baseball.service;

import baseball.domain.BaseballNumber;
import baseball.domain.BaseballNumbers;
import baseball.domain.ScoreDto;
import java.util.List;

public class ScoreCalculateService {

    public ScoreDto calculate(BaseballNumbers userNumbers, BaseballNumbers computerNumbers) {

        int containsCount = containsCount(userNumbers, computerNumbers);
        int countStrike = countStrike(userNumbers, computerNumbers);
        int countBall = containsCount - countStrike;

        return new ScoreDto(countBall, countStrike);
    }

    private int containsCount(BaseballNumbers userNumbers, BaseballNumbers computerNumbers) {
        int count = 0;
        List<BaseballNumber> baseballNumbers = userNumbers.getBaseballNumbers();
        List<BaseballNumber> baseballNumbers1 = computerNumbers.getBaseballNumbers();
        for (BaseballNumber baseballNumber : baseballNumbers) {
            if (baseballNumbers1.contains(baseballNumber)) {
                count++;
            }
        }
        return count;
    }

    private int countStrike(BaseballNumbers userNumbers, BaseballNumbers computerNumbers) {
        int strike = 0;
        for (int i = 0; i < 3; i++) {
            if (userNumbers.getBaseballNumbers().get(i).equals(computerNumbers.getBaseballNumbers().get(i))) {
                strike++;
            }
        }
        return strike;
    }

}
