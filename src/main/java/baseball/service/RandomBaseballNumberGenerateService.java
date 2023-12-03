package baseball.service;

import baseball.domain.BaseballNumber;
import camp.nextstep.edu.missionutils.Randoms;

public class RandomBaseballNumberGenerateService {

    public BaseballNumber generate() {
        int randomNumber = Randoms.pickNumberInRange(1, 9);
        return new BaseballNumber(randomNumber);
    }
}
