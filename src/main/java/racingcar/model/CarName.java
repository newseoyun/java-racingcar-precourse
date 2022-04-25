package racingcar.model;

import racingcar.constraint.Constraint;
import racingcar.exception.ErrorCode;

public class CarName {

    private final String name;

    public CarName(String name) {
        validateLength(name);
        this.name = name;
    }

    private void validateLength(String name) {
        if (isValidLength(name)) {
            throw new IllegalArgumentException(ErrorCode.INVALID_NAME.getMessage());
        }
    }

    private boolean isValidLength(String name) {
        return name.length() > Constraint.MAX_CAR_NAME_LENGTH;
    }
}
