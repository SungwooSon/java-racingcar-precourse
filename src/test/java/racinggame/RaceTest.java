package racinggame;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class RaceTest {

    @Test
    void 가장_멀리간_자동차_리스트_만들기_테스트() {
        Car pobiCar = new Car("pobi");
        Car honuxCar = new Car("honux");
        Car crongCar = new Car("crong");

        pobiCar.move(9);
        pobiCar.move(9);
        pobiCar.move(3);
        honuxCar.move(9);
        honuxCar.move(1);
        honuxCar.move(2);
        crongCar.move(9);
        crongCar.move(9);
        crongCar.move(9);

        Race race = new Race(Arrays.asList(pobiCar, honuxCar, crongCar));
        assertThat(race.getWinnerList()).containsExactly(crongCar);
        assertThat(race.getWinnerList()).doesNotContain(honuxCar);
    }

}
