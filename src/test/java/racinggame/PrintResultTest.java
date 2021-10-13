package racinggame;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PrintResultTest {

    @Test
    void 위치_만큼_대시_기호_찍기_테스트() {
        Car car = new Car("pobi");
        car.move(9);
        car.move(1);
        car.move(7);

        assertThat(car.getPosition()).isEqualTo(2);
        assertThat(PrintResult.printCarPoition(car)).contains("pobi");
        assertThat(PrintResult.printCarPoition(car)).contains("--");
    }
}
