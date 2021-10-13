package racinggame;

import nextstep.utils.Randoms;

public class Race {

    private CarGroup carGroup;
    private AttemptCount attemptCount;

    public Race() {
    }

    public void run() {
        initGame();
        playGame();
        endGame();
    }

    private void initGame() {
        carGroup = new CarGroup(InputView.readCarNames());
        attemptCount = new AttemptCount(Integer.parseInt(InputView.readAttemptCount()));
        System.out.println();
    }

    private void playGame() {
        System.out.println("실행 결과");
        for(int i=0; i<attemptCount.getCount(); i++) {
            playOneAttempt();
        }
    }

    private void playOneAttempt() {
        for(Car car : carGroup.getCarList()) {
            car.move(Randoms.pickNumberInRange(0,9));
            PrintResult.printCarPoition(car);
        }
        System.out.println();
    }

    private void endGame() {
        PrintResult.printWinner(new WinnerCarGroup().makeWinnerList(carGroup.getCarList()));
    }
}
