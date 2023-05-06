package lang.print.gaps.task4;

import static java.lang.Math.pow;

public class FormulaCreator {
    public static void main(String[] args) {
        int a = 2;
        int b = 10;
        double sum = ((9 * a * a - 5 * b + 2 + a - 7) * (a + b - 4 * a * b) / 2);
        System.out.println(sum);
    }
}
