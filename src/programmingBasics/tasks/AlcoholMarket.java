package programmingBasics.tasks;
import java.util.Scanner;

public class AlcoholMarket {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double whiskeyPrice = Double.parseDouble(scanner.nextLine());
        double beerQuantity = Double.parseDouble(scanner.nextLine());
        double wineQuantity = Double.parseDouble(scanner.nextLine());
        double brandyQuantity = Double.parseDouble(scanner.nextLine());
        double whiskeyQuantity = Double.parseDouble(scanner.nextLine());

        double brandyPrice = whiskeyPrice * 0.5;
        double winePrice = brandyPrice * 0.6;
        double beerPrice = brandyPrice * 0.2;

        double whiskeyExpenses = whiskeyPrice * whiskeyQuantity;
        double beerExpenses = beerPrice * beerQuantity;
        double wineExpenses = winePrice * wineQuantity;
        double brandyExpenses = brandyPrice * brandyQuantity;

        double totalExpenses = whiskeyExpenses + beerExpenses + wineExpenses + brandyExpenses;
        System.out.printf("%.2f", totalExpenses);
    }
}
