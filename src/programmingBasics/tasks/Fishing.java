package programmingBasics.tasks;

import java.util.Scanner;

public class Fishing {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int quotaFish = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        int fishCount = 0;
        double moneyPay = 0;
        double moneyReceive = 0;

        while (!input.equals("Stop")) {
            double fishWeight = Double.parseDouble(scanner.nextLine());
            fishCount++;
            double fishCurrentSum = 0;
            for (char i = 0; i < input.length(); i++) {
                int currentChar = input.charAt(i);
                fishCurrentSum += currentChar;
            }
            double fishPrice = fishCurrentSum / fishWeight;
            if (fishCount % 3 == 0) {
                moneyReceive += fishPrice;
            } else {
                moneyPay += fishPrice;
            }
            if (fishCount == quotaFish) {
                break;
            }
            input = scanner.nextLine();
        }

        double difference = Math.abs(moneyPay - moneyReceive);
        if (fishCount == quotaFish) {
            System.out.println("Lyubo fulfilled the quota!");
        }
        if (moneyPay <= moneyReceive) {
            System.out.printf("Lyubo's profit from %d fishes is %.2f leva.", fishCount, difference);
        } else {
            System.out.printf("Lyubo lost %.2f leva today.", difference);
        }
    }
}
