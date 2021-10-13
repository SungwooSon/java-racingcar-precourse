package racinggame;

import nextstep.utils.Console;

public class InputView {

    private static final String ERROR_MESSAGE = "[ERROR]형식에 맞는 정확한 값을 입력하세요.";

    public static String readCarNames() throws IllegalStateException{
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String carNames = Console.readLine();
        try {
            validateCarNames(carNames);
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
            carNames = readCarNames();
        }
        return carNames;
    }

    public static void validateCarNames(String carNames) {
        if(carNames == null || carNames.length() == 0) {
            throw new IllegalStateException(ERROR_MESSAGE);
        }

        for(String carName : carNames.split(",")) {
            if(carName.length() > 5) {
                throw new IllegalStateException(ERROR_MESSAGE);
            }
        }
    }

    public static String readAttemptCount() {
        System.out.println("시도할 회수는 몇회인가요?");
        String attemptCount = Console.readLine();
        try {
            validateNumberFormat(attemptCount);
        } catch (NumberFormatException e){
            System.out.println(ERROR_MESSAGE);
            attemptCount = readAttemptCount();
        }
        return attemptCount;
    }

    public static void validateNumberFormat(String number) {
        Integer.parseInt(number);
    }
}
