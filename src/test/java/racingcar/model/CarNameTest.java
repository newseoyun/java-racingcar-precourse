package racingcar.model;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CarNameTest {

    @DisplayName("자동차 이름이 다섯글자를 초과하면 예외 발생")
    @Test
    void carName() {
        String name = "다섯글자초과";
        assertThrows(IllegalArgumentException.class, () -> new CarName(name));
    }

}
