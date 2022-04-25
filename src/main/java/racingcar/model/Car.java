package racingcar.model;

import camp.nextstep.edu.missionutils.Randoms;
import racingcar.constraint.Constraint;
import racingcar.exception.ErrorCode;

public class Car {

    private final CarName name;
    private final CarPosition position;

    private Car(String name) {
        this.name = new CarName(name);
        this.position = new CarPosition();
    }

    public static Car setup(String name) {
        return new Car(name);
    }

    public void tryMoveForward(String count) {
        int tryCount = convertIntCount(count);
        validateRange(tryCount);
        int power = Randoms.pickNumberInRange(Constraint.RANGE_START_NUMBER, Constraint.RANGE_END_NUMBER);
        for (int i = 0; i < tryCount; i++) {
            position.addOneWhenEnough(power);
        }
    }

    private int convertIntCount(String tryCount) {
        int count;
        try {
            count = Integer.parseInt(tryCount);
        } catch(NumberFormatException ex) {
            throw new IllegalArgumentException(ErrorCode.NUMBER_FORMAT_EX.getMessage());
        }
        return count;
    }

    private void validateRange(int tryCount) {
        if (isValidRange(tryCount)) {
            throw new IllegalArgumentException(ErrorCode.NUMBER_RANGE_EX.getMessage());
        }
    }

    private boolean isValidRange(int tryCount) {
        return tryCount > 100 || tryCount < 1;
    }


    public String getName() {
        return name.getName();
    }

    public int getPosition() {
        return position.getPosition();
    }
}
