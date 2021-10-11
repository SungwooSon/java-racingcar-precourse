package racinggame;

public class Car {
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
}
