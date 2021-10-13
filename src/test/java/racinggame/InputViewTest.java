package racinggame;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

public class InputViewTest {

    @Test
    void 자동차_이름_5자리_이하_테스트() {
        String carNames = "pobi,honux,crongcrong";

        assertThatExceptionOfType(IllegalStateException.class).isThrownBy(
                () -> InputView.validateCarNames(carNames)
        );
    }

}
