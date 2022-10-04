package racingcar.model.race.wrap_variable;

import racingcar.constant.Message;

public class NumberOfAttemptMove {
    private final int numberOfAttemptMove;

    public NumberOfAttemptMove(String strNumber) {
        if (!isNumeric(strNumber)) {
            throw new IllegalArgumentException(Message.ERROR_MESSAGE + "시도 회수는 숫자만 입력할 수 있습니다");
        }

        this.numberOfAttemptMove = Integer.parseInt(strNumber);
    }

    public int getNumberOfAttemptMove() {
        return numberOfAttemptMove;
    }

    private static boolean isNumeric(String s) {
        try {
            Double.parseDouble(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
