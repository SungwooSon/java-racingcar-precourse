package racinggame;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class RaceTest {

    @Test
    void 가장_멀리간_자동차_리스트_만들기_테스트() {
        //Race race = new Race(Arrays.asList(pobiCar, honuxCar, crongCar));
        Race race = new Race();
        race.makeCarList("pobi,honux,crong");
        List<Car> carList = race.getCarList();

        Car pobiCar = carList.get(0);
        Car honuxCar = carList.get(1);
        Car crongCar = carList.get(2);

        pobiCar.move(9);
        pobiCar.move(9);
        pobiCar.move(3);
        honuxCar.move(9);
        honuxCar.move(1);
        honuxCar.move(2);
        crongCar.move(9);
        crongCar.move(9);
        crongCar.move(9);

        assertThat(race.getWinnerList()).containsExactly(crongCar);
        assertThat(race.getWinnerList()).doesNotContain(honuxCar);
    }

    @Test
    void 자동차_리스트_생성_테스트() {
        Race race = new Race();
        race.makeCarList("pobi,crong,honux");
        List<Car> carList = race.getCarList();
        assertThat(carList).containsExactly(new Car("pobi"), new Car("crong"), new Car("honux"));
    }
}
