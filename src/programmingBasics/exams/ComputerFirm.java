package programmingBasics.exams;

import java.util.Scanner;

public class ComputerFirm {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sales = 0;
        int ratingSum = 0;

        for (int i = 1; i <= n; i++) {
            int currentNumber = Integer.parseInt(scanner.nextLine());
            if (currentNumber % 10 == 2) {
                sales += 0;
                ratingSum += (currentNumber % 10);
            } else if (currentNumber % 10 == 3) {
                sales += (currentNumber / 10) * 0.5;
                ratingSum += (currentNumber % 10);
            } else if (currentNumber % 10 == 4) {
                sales += (currentNumber / 10) * 0.70;
                ratingSum += (currentNumber % 10);
            } else if (currentNumber % 10 == 5) {
                sales += (currentNumber / 10) * 0.85;
                ratingSum += (currentNumber % 10);
            } else if (currentNumber % 10 == 6) {
                sales += (currentNumber / 10);
                ratingSum += (currentNumber % 10);
            }
        }
        System.out.printf("%.2f%n", sales * 1.0);
        System.out.printf("%.2f", ratingSum * 1.0 / n);
    }
}
