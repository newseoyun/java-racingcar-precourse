package racingcar.controller;

import camp.nextstep.edu.missionutils.Console;
import java.util.ArrayList;
import java.util.List;
import racingcar.model.Car;
import racingcar.view.Printer;

public class GameController {

    private List<Car> cars = new ArrayList<>();
    private Printer printer;


    private void processing() {
        printer.printCarNameInfo();
        String input = Console.readLine();
        readyCars(input);

    }

    private void racing() {
        printer.printTryCountInfo();
        String tryCount = Console.readLine();
        printer.printResultInfo();
        for (Car car : cars) {
            car.tryMoveForward(tryCount);
            printer.printResult(car);
        }
        System.out.println();
    }

    private void readyCars(String input) {
        String[] carNames = input.split(",");
        for (String carName : carNames) {
            cars.add(Car.setup(carName));
        }
    }

}
