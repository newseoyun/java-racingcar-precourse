package racingcar.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CarPositionTest {

    CarPosition carPosition = new CarPosition();

    @DisplayName("자동차는 (랜덤)값이 4 이상이면 전진한다.")
    @ParameterizedTest
    @CsvSource(value = {"1:0", "4:1", "5:1"}, delimiter = ':')
    void plusPosition(int power, int position) {
        carPosition.addOneWhenEnough(power);
        assertEquals(position, carPosition.getPosition());
    }

}
