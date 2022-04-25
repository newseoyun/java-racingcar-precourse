package racingcar.view;

import java.util.Collections;
import racingcar.model.Car;

public class Printer {

    private static final String CAR_NAME_INFO = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
    private static final String TRY_COUNT_INFO = "시도할 회수는 몇회인가요?";
    private static final String RESULT_INFO = "실행 결과";
    private static final String WINNER_INFO = "최종 우승자: ";


    public void printCarNameInfo() {
        System.out.println(CAR_NAME_INFO);
    }

    public void printTryCountInfo() {
        System.out.println(TRY_COUNT_INFO);
    }

    public void printResultInfo() {
        System.out.println(RESULT_INFO);
    }

    public void printWinner(String winners) {
        System.out.print(WINNER_INFO + winners);
    }

    public void printResult(Car car) {
        String positionView = String.join("", Collections.nCopies(car.getPosition(), "-"));
        System.out.println(car.getName() + " : " + positionView);
    }

}
