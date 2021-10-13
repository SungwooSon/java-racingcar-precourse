package racinggame;

import java.util.ArrayList;
import java.util.List;

public class Race {

    private List<Car> carList;
    private List<Car> winnerList;
    private Car farthestMovingCar;

    public Race() {
        this.carList = new ArrayList<>();
        this.winnerList = new ArrayList<>();
    }

    public List<Car> getWinnerList() {
        farthestMovingCar = carList.get(0);
        for(Car car : carList) {
            clearWinnerListIfChangeFarthestMovingCar(car);
            addListIfFarthestMovingCar(car);
        }
        return winnerList;
    }

    private void clearWinnerListIfChangeFarthestMovingCar(Car car) {
        if(car.compareTo(farthestMovingCar) > 0) {
            winnerList.clear();
        }
    }

    private void addListIfFarthestMovingCar(Car car) {
        if(car.compareTo(farthestMovingCar) >= 0) {
            winnerList.add(car);
            farthestMovingCar = car;
        }
    }

    public void makeCarList(String values) {
        for(String value : splitValues(values)) {
            carList.add(new Car(value));
        }
    }

    private String[] splitValues(String values) {
        return values.split(",");
    }

    public List<Car> getCarList() {
        return this.carList;
    }
}
