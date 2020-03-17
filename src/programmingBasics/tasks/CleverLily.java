package programmingBasics.tasks;

import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());
        double machinePrice = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());

        int moneyCount = 0;
        int toyCount = 0;
        int sum = 0;

        for (int i = 1; i <= age; i++) {
            if (i % 2 == 0) {
                moneyCount++;
                sum += moneyCount * 10;
            } else {
                toyCount++;
            }
        }
        int toySum = toyCount * toyPrice;
        int finalSum = sum + toySum - moneyCount;

        if (finalSum >= machinePrice) {
            System.out.printf("Yes! %.2f", finalSum - machinePrice);
        } else {
            System.out.printf("No! %.2f", machinePrice - finalSum);
        }
    }
}
