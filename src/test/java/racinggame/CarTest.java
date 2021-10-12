package racinggame;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {
    @Test
    void 전진() {
        Car car = new Car("pobi");
        car.move(4);
        int position = car.getPosition();
        assertThat(position).isGreaterThan(0);
    }

    @Test
    void 스탑() {
        Car car = new Car("honux");
        car.move(3);
        int position = car.getPosition();
        assertThat(position).isEqualTo(0);
    }

    @Test
    void 더_멀리간_자동차_테스트() {
        Car pobiCar = new Car("pobi");
        Car honuxCar = new Car("honux");

        pobiCar.move(9);
        pobiCar.move(9);
        pobiCar.move(9);
        honuxCar.move(9);
        honuxCar.move(1);
        honuxCar.move(2);

        assertThat(pobiCar.compareTo(honuxCar)).isGreaterThan(0);
    }
}
