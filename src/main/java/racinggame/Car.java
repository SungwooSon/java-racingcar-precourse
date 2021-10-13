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
        if(isMoveOrStop(number)) {
            position++;
        }
    }

    private boolean isMoveOrStop(int number) {
        return number >= CRITERION_MOVE_OR_STOP;
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

    public String getName() {
        return this.name;
    }

    public int getPosition() {
        return this.position;
    }

}
