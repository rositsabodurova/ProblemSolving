package programmingBasics.tasks;

import java.util.Scanner;

public class NumberSequence {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int maxNumber = Integer.MIN_VALUE;
        int minNumber = Integer.MAX_VALUE;

        while (!input.equals("END")) {
            int currentNumber = Integer.parseInt(input);
            if (currentNumber > maxNumber) {
                maxNumber = currentNumber;
            }
            if (currentNumber < minNumber) {
                minNumber = currentNumber;
            }
            input = scanner.nextLine();
        }
        if (input.equals("END")) {
            System.out.printf("Max number: %d%n", maxNumber);
            System.out.printf("Min number: %d", minNumber);
        }
    }
}
