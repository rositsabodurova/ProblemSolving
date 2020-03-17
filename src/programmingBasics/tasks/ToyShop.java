package programmingBasics.tasks;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double tripPrize = Double.parseDouble(scanner.nextLine());
        int puzzelCount = Integer.parseInt(scanner.nextLine());
        int dollsCount = Integer.parseInt(scanner.nextLine());
        int bearsCount = Integer.parseInt(scanner.nextLine());
        int minionsCount = Integer.parseInt(scanner.nextLine());
        int trucksCount = Integer.parseInt(scanner.nextLine());

        double totalCount = puzzelCount + dollsCount + bearsCount + minionsCount + trucksCount;
        double totalProfit = puzzelCount * 2.6 + dollsCount * 3 + bearsCount * 4.1 + minionsCount * 8.2 + trucksCount * 2;

        if (totalCount >= 50) {
            totalProfit = totalProfit * 0.75;
        }
        totalProfit = totalProfit * 0.9;

        double difference = Math.abs(totalProfit - tripPrize);
        if (totalProfit >= tripPrize) {
            System.out.printf("Yes! %.2f lv left.", difference);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", difference);
        }
    }
}
