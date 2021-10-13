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


}
