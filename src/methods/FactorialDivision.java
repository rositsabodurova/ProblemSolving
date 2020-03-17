package methods;

import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

        printDivision(factorial(num1), factorial(num2));
    }

    static int factorial(int num1) {

        if (num1 == 0) {
            return 1;
        } else {
            return num1 * factorial(num1 - 1);
        }
    }

    static void printDivision(int a, int b) {
        double result = (a * 1.00) / b;
        System.out.printf("%.2f", result);
    }
}
