package racingcar.model;

import racingcar.exception.ErrorCode;

public class CarPosition {

    private int position;

    public CarPosition() {
        this.position = 0;
    }

    public int getPosition() {
        return position;
    }

    public void addOneWhenEnough(int power) {
        if (isEnough(power)) {
            this.position++;
        }
    }

    private boolean isEnough(int power) {
        return power >= 4;
    }

    private void validateRange(int tryCount) {
        if (isValidRange(tryCount)) {
            throw new IllegalArgumentException(ErrorCode.NUMBER_RANGE_EX.getMessage());
        }
    }

    private boolean isValidRange(int tryCount) {
        return tryCount > 100 || tryCount < 1;
    }
}
