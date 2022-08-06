package school.mjc.stage0.conditions.task4;

public class TernaryAssignment {
    public static void assignAndPrintBasedOnWhichBigger(int first, int second) {
        int result = first > second? 10 : -10;
        System.out.println(result);
    }

    public static void main(String[] args) {
        assignAndPrintBasedOnWhichBigger(1, 5);
        assignAndPrintBasedOnWhichBigger(6, 6);
        assignAndPrintBasedOnWhichBigger(7, 3);
    }
}
