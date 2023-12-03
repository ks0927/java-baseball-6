package baseball.view;

import baseball.domain.BaseballNumbers;
import camp.nextstep.edu.missionutils.Console;

public class InputView {
    private static final String READ_BASEBALL_NUMBER_MESSAGE = "숫자를 입력해주세요 : ";
    private final InputMapper inputMapper = new InputMapper();

    public BaseballNumbers readBaseballNumbers() {
        System.out.print(READ_BASEBALL_NUMBER_MESSAGE);
        return inputMapper.mapToBaseballNumbers(Console.readLine());
    }
}
