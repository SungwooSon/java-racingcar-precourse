package racinggame;

import java.util.ArrayList;
import java.util.List;

public class WinnerCarGroup {

    private List<Car> winnerList;

    public WinnerCarGroup() {
        winnerList = new ArrayList<>();
    }

    public List<Car> makeWinnerList(List<Car> carList) {
        Car farthestMovingCar = carList.get(0);
        for(Car car : carList) {
            farthestMovingCar = clearWinnerListIfChangeFarthestMovingCar(car, farthestMovingCar);
            addListIfFarthestMovingCar(car, farthestMovingCar);
        }
        return winnerList;
    }

    private Car clearWinnerListIfChangeFarthestMovingCar(Car car, Car farthestMovingCar) {
        if(isChangedFarthestMovingCar(car, farthestMovingCar)) {
            winnerList.clear();
            return car;
        }
        return farthestMovingCar;
    }

    private boolean isChangedFarthestMovingCar(Car car, Car farthestMovingCar) {
        return car.compareTo(farthestMovingCar) > 0;
    }

    private void addListIfFarthestMovingCar(Car car, Car farthestMovingCar) {
        if(isAddCar(car, farthestMovingCar)) {
            winnerList.add(car);
        }
    }

    private boolean isAddCar(Car car, Car farthestMovingCar) {
        return car.compareTo(farthestMovingCar) >= 0;
    }
}
