package programmingBasics.tasks;

import java.util.Scanner;

public class OperationsBetweenNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());

        char operator = scanner.nextLine().charAt(0);
        double result = 0;

        switch (operator) {
            case '+':
                result = number1 + number2;
                if (result % 2 == 0) {
                    System.out.printf("%d + %d = %.0f - even", number1, number2, result);
                } else {
                    System.out.printf("%d + %d = %.0f - odd", number1, number2, result);
                }
                break;
            case '-':
                result = number1 - number2;
                if (result % 2 == 0) {
                    System.out.printf("%d - %d = %.0f - even", number1, number2, result);
                } else {
                    System.out.printf("%d - %d = %.0f - odd", number1, number2, result);
                }
                break;
            case '*':
                result = number1 * number2;
                if (result % 2 == 0) {
                    System.out.printf("%d * %d = %.0f - even", number1, number2, result);
                } else {
                    System.out.printf("%d * %d = %.0f - odd", number1, number2, result);
                }
                break;
            case '/':
                if (number2 == 0) {
                    System.out.printf("Cannot divide %d by zero", number1);
                } else {
                    result = number1 * 1.0 / number2;
                    System.out.printf("%d / %d = %.2f", number1, number2, result);
                }
                break;
            case '%':
                if (number2 == 0) {
                    System.out.printf("Cannot divide %d by zero", number1);
                } else {
                    result = number1 % number2;
                    System.out.printf("%d %% %d = %.0f", number1, number2, result);
                }
                break;
        }
    }
}
