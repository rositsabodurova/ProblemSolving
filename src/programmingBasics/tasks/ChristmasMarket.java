package programmingBasics.tasks;

import java.util.Scanner;

public class ChristmasMarket {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double targetSum = Double.parseDouble(scanner.nextLine());
        int fantasyCount = Integer.parseInt(scanner.nextLine());
        int horrorCount = Integer.parseInt(scanner.nextLine());
        int romanticCount = Integer.parseInt(scanner.nextLine());

        double fantasySum = fantasyCount * 14.9;
        double horrorSum = horrorCount * 9.8;
        double romanticSum = romanticCount * 4.3;

        double totalSum = fantasySum + horrorSum + romanticSum;
        double totalSumWithoutVAT = totalSum - totalSum * 0.2;
        double difference = Math.abs(totalSumWithoutVAT - targetSum);

        if (totalSumWithoutVAT >= targetSum) {
            double sellerMoney = Math.floor(difference * 0.1);
            System.out.printf("%.2f leva donated.%n", (totalSumWithoutVAT - sellerMoney));
            System.out.printf("Sellers will receive %.0f leva.", sellerMoney);
        } else {
            System.out.printf("%.2f money needed.", difference);
        }
    }
}
