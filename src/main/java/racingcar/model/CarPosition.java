package racingcar.model;

import camp.nextstep.edu.missionutils.Randoms;
import racingcar.constraint.Constraint;
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

}
