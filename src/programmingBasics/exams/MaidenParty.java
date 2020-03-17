package programmingBasics.exams;

import java.util.Scanner;

public class MaidenParty {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double partyCost = Double.parseDouble(scanner.nextLine());
        int loveMessagesCount = Integer.parseInt(scanner.nextLine());
        int waxRosesCount = Integer.parseInt(scanner.nextLine());
        int keyChainsCount = Integer.parseInt(scanner.nextLine());
        int caricatureCount = Integer.parseInt(scanner.nextLine());
        int luckySurprisesCount = Integer.parseInt(scanner.nextLine());

        int totalCount = loveMessagesCount + waxRosesCount + keyChainsCount + caricatureCount + luckySurprisesCount;
        double orderTotal = loveMessagesCount * 0.6 + waxRosesCount * 7.2 + keyChainsCount * 3.6 + caricatureCount * 18.20 + luckySurprisesCount * 22;

        if (totalCount >= 25) {
            orderTotal = orderTotal * 0.65;

        }
        orderTotal = orderTotal * 0.9;
        double difference = Math.abs(orderTotal - partyCost);

        if (orderTotal >= partyCost) {
            System.out.printf("Yes! %.2f lv left.", difference);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", difference);
        }
    }
}
