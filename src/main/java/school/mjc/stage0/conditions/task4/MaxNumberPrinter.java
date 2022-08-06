package school.mjc.stage0.conditions.task4;

public class MaxNumberPrinter {
    public static void printGreatest(int first, int second, int third) {
        int greatest = first >= second? first: second;
        greatest = greatest >= third? greatest : third;
        System.out.println(greatest);
    }

    public static void main(String[] args) {
        printGreatest(-5, 0, -2);
    }
}
