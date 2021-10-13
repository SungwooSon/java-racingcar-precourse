package racinggame;

import java.util.ArrayList;
import java.util.List;

public class CarGroup {
    private static final int CAR_NAME_LENGTH = 5;

    private List<Car> carList;

    public CarGroup(String carNames) {
        carList = new ArrayList<>();
        splitStringAndAddList(carNames);
    }

    private void splitStringAndAddList(String carNames) {
        String[] carNamesArray = splitValues(carNames);
        for(String carName : carNamesArray) {
            validateCarNameFormat(carName);
            carList.add(new Car(carName));
        }
    }

    private String[] splitValues(String values) {
        return values.split(",");
    }

    private void validateCarNameFormat(String carName) {
        if(carName.length() > CAR_NAME_LENGTH)
            throw new IllegalStateException("자동차 이름의 길이는 5자리가 최대입니다.");
    }

    public List<Car> getCarList() {
        return carList;
    }
}
