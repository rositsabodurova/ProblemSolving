package techmodule;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        double moneyAvailable = 0;

        while (!input.equals("Start")) {
            double currentMoney = Double.parseDouble(input);
            if (currentMoney == 0.1 || currentMoney == 0.2 || currentMoney == 0.5 || currentMoney == 1 || currentMoney == 2) {
                moneyAvailable += currentMoney;
            } else {
                System.out.printf("Cannot accept %.2f%n", currentMoney);
            }
            input = scanner.nextLine();
        }
        String productInput = scanner.nextLine();

        while (!productInput.equals("End")) {

            switch (productInput) {

                case "Nuts":
                    if (moneyAvailable >= 2.0) {
                        moneyAvailable -= 2.0;
                        System.out.printf("Purchased %s%n", productInput);
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Water":
                    if (moneyAvailable >= 0.7) {
                        moneyAvailable -= 0.7;
                        System.out.printf("Purchased %s%n", productInput);
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Crisps":
                    if (moneyAvailable >= 1.5) {
                        moneyAvailable -= 1.5;
                        System.out.printf("Purchased %s%n", productInput);
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Soda":
                    if (moneyAvailable >= 0.8) {
                        moneyAvailable -= 0.8;
                        System.out.printf("Purchased %s%n", productInput);
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Coke":
                    if (moneyAvailable >= 1.0) {
                        moneyAvailable -= 1.0;
                        System.out.printf("Purchased %s%n", productInput);
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                default:
                    System.out.println("Invalid product");
                    break;
            }

            productInput = scanner.nextLine();

        }
        System.out.printf("Change: %.2f", moneyAvailable);
    }
}

