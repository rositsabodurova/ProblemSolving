package techmodule;

import java.util.Scanner;

public class GamingStore {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double moneyAvailable = Double.parseDouble(scanner.nextLine());
        String input = scanner.nextLine();

        double totalPrice = 0;

        while (!input.equals("Game Time")) {
            switch (input) {
                case "OutFall 4":
                    if (moneyAvailable >= 39.99) {
                        moneyAvailable -= 39.99;
                        totalPrice += 39.99;
                        System.out.printf("Bought %s%n", input);
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;
                case "CS: OG":
                    if (moneyAvailable >= 15.99) {
                        moneyAvailable -= 15.99;
                        totalPrice += 15.99;
                        System.out.printf("Bought %s%n", input);
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;
                case "Zplinter Zell":
                    if (moneyAvailable >= 19.99) {
                        moneyAvailable -= 19.99;
                        totalPrice += 19.99;
                        System.out.printf("Bought %s%n", input);
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;
                case "Honored 2":
                    if (moneyAvailable >= 59.99) {
                        moneyAvailable -= 59.99;
                        totalPrice += 59.99;
                        System.out.printf("Bought %s%n", input);
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;
                case "RoverWatch":
                    if (moneyAvailable >= 29.99) {
                        moneyAvailable -= 29.99;
                        totalPrice += 29.99;
                        System.out.printf("Bought %s%n", input);
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;
                case "RoverWatch Origins Edition":
                    if (moneyAvailable >= 39.99) {
                        moneyAvailable -= 39.99;
                        totalPrice += 39.99;
                        System.out.printf("Bought %s%n", input);
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;
                default:
                    System.out.println("Not Found");
                    break;
            }
            if (moneyAvailable == 0) {
                System.out.println("Out of money!");
            }
            input = scanner.nextLine();
        }

        if (input.equals("Game Time") && moneyAvailable != 0) {
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", totalPrice, moneyAvailable);
        }
    }
}
