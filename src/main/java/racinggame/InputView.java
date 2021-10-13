package racinggame;

import nextstep.utils.Console;

public class InputView {

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
            throw new IllegalStateException("[Error]");
        }

        for(String carName : carNames.split(",")) {
            if(carName.length() > 5) {
                throw new IllegalStateException("[Error]");
            }
        }
    }

    public static String readAttemptCount() {
        System.out.println("시도할 회수는 몇회인가요?");
        String attemptCount = Console.readLine();
        try {
            validateNumberFormat(attemptCount);
        } catch (NumberFormatException e){
            System.out.println("[Error]");
            attemptCount = readAttemptCount();
        }
        return attemptCount;
    }


    public static void validateNumberFormat(String number) {
        Integer.parseInt(number);
    }
}
