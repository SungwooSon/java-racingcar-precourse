package racinggame;

public class PrintResult {

    private final static String DELIMETER = "-";
    static StringBuilder sb;

    public static String printCarPoition(Car car) {
        sb = new StringBuilder(); // single ton으로 리팩터링.

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
}
