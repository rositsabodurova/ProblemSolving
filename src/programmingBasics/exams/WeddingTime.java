package programmingBasics.exams;

import java.util.Scanner;

public class WeddingTime {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double whiskeyPrice = Double.parseDouble(scanner.nextLine());
        double waterQuantity = Double.parseDouble(scanner.nextLine());
        double wineQuantity = Double.parseDouble(scanner.nextLine());
        double champaignQuantity = Double.parseDouble(scanner.nextLine());
        double whiskeyQuantity = Double.parseDouble(scanner.nextLine());

        double champaignPrice = whiskeyPrice * 0.5;
        double winePrice = champaignPrice * 0.4;
        double waterPrice = champaignPrice * 0.1;

        double totalMoney = whiskeyPrice * whiskeyQuantity + waterPrice * waterQuantity + winePrice * wineQuantity + champaignPrice * champaignQuantity;
        System.out.printf("%.2f", totalMoney);
    }
}
