package racinggame;

public class Position {

    private final int INITIAL_POSITION = 0;

    private int position;

    public Position(int number) {
        validateInitialPosition(number);
        this.position = number;
    }

    private void validateInitialPosition(int number) {
        if(number != INITIAL_POSITION)
            throw new IllegalStateException("포지션의 최초 위치는 항상 0이어야 합니다.");
    }

    public void move() {
        position++;
    }

    public int getPosition() {
        return this.position;
    }
}
