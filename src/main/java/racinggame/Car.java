package racinggame;

import java.util.Objects;

public class Car implements Comparable<Car> {
    private final int CRITERION_MOVE_OR_STOP = 4;

    private String name;
    private int position;

    public Car(String name) {
        this.name = name;
        this.position = 0;
    }

    public void move(int number) {
        if(isMove(number)) {
            position++;
        }
    }

    private boolean isMove(int number) {
        return number >= CRITERION_MOVE_OR_STOP;
    }

    public int getPosition() {
        return this.position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public int compareTo(Car o) {
        return this.position - o.position;
    }

}
