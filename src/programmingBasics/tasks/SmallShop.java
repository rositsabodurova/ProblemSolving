package programmingBasics.tasks;

import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        String city = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        switch (city) {
            case "Sofia": {
                switch (product) {
                    case "coffee":
                        System.out.printf("%.2f", quantity * 0.5);
                        break;
                    case "water":
                        System.out.printf("%.2f", quantity * 0.8);
                        break;
                    case "beer":
                        System.out.printf("%.2f", quantity * 1.2);
                        break;
                    case "sweets":
                        System.out.printf("%.2f", quantity * 1.45);
                        break;
                    case "peanuts":
                        System.out.printf("%.2f", quantity * 1.60);
                        break;
                }
                break;
            }
            case "Plovdiv": {
                switch (product) {
                    case "coffee":
                        System.out.printf("%.2f", quantity * 0.4);
                        break;
                    case "water":
                        System.out.printf("%.2f", quantity * 0.7);
                        break;
                    case "beer":
                        System.out.printf("%.2f", quantity * 1.15);
                        break;
                    case "sweets":
                        System.out.printf("%.2f", quantity * 1.3);
                        break;
                    case "peanuts":
                        System.out.printf("%.2f", quantity * 1.50);
                        break;
                }
                break;
            }
            case "Varna":
                switch (product) {
                    case "coffee":
                        System.out.printf("%.2f", quantity * 0.45);
                        break;
                    case "water":
                        System.out.printf("%.2f", quantity * 0.7);
                        break;
                    case "beer":
                        System.out.printf("%.2f", quantity * 1.1);
                        break;
                    case "sweets":
                        System.out.printf("%.2f", quantity * 1.35);
                        break;
                    case "peanuts":
                        System.out.printf("%.2f", quantity * 1.55);
                        break;
                }
        }
    }
}
