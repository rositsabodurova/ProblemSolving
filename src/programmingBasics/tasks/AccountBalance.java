package programmingBasics.tasks;

import java.util.Scanner;

public class AccountBalance {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberOfDeposits = Integer.parseInt(scanner.nextLine());
        int depositsMade = 0;

        double totalSum = 0;

        while (depositsMade < numberOfDeposits) {
            double inputSum = Double.parseDouble(scanner.nextLine());
            if (inputSum < 0) {
                System.out.println("Invalid operation!");
                break;
            }
            System.out.printf("Increase: %.2f%n", inputSum);
            totalSum = totalSum + inputSum;
            depositsMade++;
        }
        System.out.printf("Total: %.2f", totalSum);
    }
}
