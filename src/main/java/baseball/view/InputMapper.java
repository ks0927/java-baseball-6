package baseball.view;

import baseball.domain.BaseballNumber;
import baseball.domain.BaseballNumbers;
import baseball.domain.GameDecision;
import java.util.ArrayList;
import java.util.List;

public class InputMapper {

    public BaseballNumbers mapToBaseballNumbers(String input) {
        List<BaseballNumber> baseballNumbers = new ArrayList<>();
        for (char aChar : input.toCharArray()) {
            int number = validInteger(aChar);
            baseballNumbers.add(new BaseballNumber(number));
        }
        return new BaseballNumbers(baseballNumbers);
    }

    public GameDecision mapToGameDecision(String input) {
        int number = validInteger(input.charAt(0));
        return new GameDecision(number);
    }

    private int validInteger(char aChar) {
        int num;
        try {
            num = Integer.parseInt(String.valueOf(aChar));
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException();
        }
        return num;
    }
}
