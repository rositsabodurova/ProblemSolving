package programmingBasics.tasks;

import java.util.Scanner;

public class ChristmasSweets {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double baklavaPricePerKg = Double.parseDouble(scanner.nextLine());
        double muffinPricePerKg = Double.parseDouble(scanner.nextLine());
        double shtolenQuantity = Double.parseDouble(scanner.nextLine());
        double sweetsQuatity = Double.parseDouble(scanner.nextLine());
        int biscuitsQuantity = Integer.parseInt(scanner.nextLine());

        double priceShtolen = baklavaPricePerKg * 1.6;
        double priceSweets = muffinPricePerKg * 1.8;
        double priceBiscuits = 7.5;

        double shtolenSum = shtolenQuantity * priceShtolen;
        double sweetsSum = sweetsQuatity * priceSweets;
        double biscuitsSum = biscuitsQuantity * priceBiscuits;

        System.out.printf("%.2f", (shtolenSum + sweetsSum + biscuitsSum));
    }
}
