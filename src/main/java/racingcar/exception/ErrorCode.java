package racingcar.exception;

public enum ErrorCode {

    NUMBER_FORMAT_EX("시도 횟수는 숫자여야 합니다."),
    NUMBER_RANGE_EX("시도 횟수는 0보다 크고 100보다 작아야 합니다."),
    INVALID_NAME("자동차 이름은 5자 이하여야 합니다.");

    private final String message;

    ErrorCode(String message) {
        this.message = "[ERROR] " + message;
    }

    public String getMessage() {
        return message;
    }
}
