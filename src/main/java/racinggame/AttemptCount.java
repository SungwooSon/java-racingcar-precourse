package racinggame;

public class AttemptCount {
    private int count ;

    public AttemptCount(int count) {
        validateCount(count);
        this.count = count;
    }

    private void validateCount(int count) {
        if(isNegativeNumber(count)) {
            throw new IllegalStateException("시도할 횟수는 0보다 커야합니다.");
        }
    }

    private boolean isNegativeNumber(int count) {
        return count <= 0;
    }

    public int getCount() {
        return this.count;
    }
}
