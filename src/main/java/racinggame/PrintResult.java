package racinggame;

import java.util.List;

public class PrintResult {

    private final static String DELIMETER = "-";
    static StringBuilder sb;

    public static String printCarPoition(Car car) {
        sb = new StringBuilder();

        appendCarName(car);
        appendDelimeter(car);
        printResult();

        return sb.toString();
    }

    private static void appendCarName(Car car) {
        sb.append(car.getName() + ":");
    }

    private static void appendDelimeter(Car car) {
        for(int i=0 ; i<car.getPosition(); i++) {
            sb.append(DELIMETER);
        }
    }

    private static void printResult() {
        System.out.println(sb.toString());
    }

    public static void printWinner(List<Car> winnerList) {
        StringBuilder sb = new StringBuilder();
        for(Car car : winnerList) {
            sb.append(car.getName()+",");
        }
        String winners = sb.substring(0, sb.lastIndexOf(","));

        System.out.println(String.format("최종 우승자는 %s 입니다.", winners));
    }
}
