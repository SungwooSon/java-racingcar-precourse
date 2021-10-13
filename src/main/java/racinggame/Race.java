package racinggame;

import nextstep.utils.Randoms;

public class Race {

    private CarGroup carGroup;
    private String attemptCount;

    public Race() {
    }

    public void run() {
        initGame();
        playGame();
        endGame();
    }

    private void initGame() {
        carGroup = new CarGroup(InputView.readCarNames());
        attemptCount = InputView.readAttemptCount();
        System.out.println();
    }

    private void playGame() {
        System.out.println("실행 결과");
        for(int i=0; i<Integer.parseInt(attemptCount); i++) {
            playOneAttempt();
        }
    }

    private void playOneAttempt() {
        for(Car car : carGroup.getCars()) {
            car.move(Randoms.pickNumberInRange(0,9));
            PrintResult.printCarPoition(car);
        }
        System.out.println();
    }

    private void endGame() {
        WinnerCarGroup winnerCarGroup = new WinnerCarGroup();
        PrintResult.printWinner(winnerCarGroup.makeWinnerList(carGroup.getCars()));
    }
}
