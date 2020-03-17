package programmingBasics.tasks;

import java.util.Scanner;

public class EqualSumsEvenOddPositions {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());

        for (int i = firstNum; i <= secondNum; i++) {
            String currentNum = "" + i;
            int evenSum = 0;
            int oddSum = 0;

            for (int j = 0; j < currentNum.length(); j++) {
                int currentDigit = Integer.parseInt("" + currentNum.charAt(j));
                if (j % 2 == 0) {
                    evenSum += currentDigit;
                } else {
                    oddSum += currentDigit;
                }
            }
            if (evenSum == oddSum) {
                System.out.print(i + " ");
            }
        }
    }
}
