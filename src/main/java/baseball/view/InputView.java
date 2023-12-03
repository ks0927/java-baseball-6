package baseball.view;

import baseball.domain.BaseballNumbers;
import baseball.domain.GameDecision;
import camp.nextstep.edu.missionutils.Console;

public class InputView {
    private static final String READ_BASEBALL_NUMBER_MESSAGE = "숫자를 입력해주세요 : ";
    private static final String READ_GAME_DECISION_MESSAGE = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";
    private final InputMapper inputMapper = new InputMapper();

    public BaseballNumbers readBaseballNumbers() {
        System.out.print(READ_BASEBALL_NUMBER_MESSAGE);
        return inputMapper.mapToBaseballNumbers(Console.readLine());
    }

    public GameDecision readGameDecision() {
        System.out.print(READ_GAME_DECISION_MESSAGE);
        return inputMapper.mapToGameDecision(Console.readLine());
    }
}
