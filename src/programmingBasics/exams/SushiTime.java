package programmingBasics.exams;

import java.util.Scanner;

public class SushiTime {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String sushiType = scanner.nextLine();
        String restaurantName = scanner.nextLine();
        int servings = Integer.parseInt(scanner.nextLine());
        String delivery = scanner.nextLine();

        double totalSum = 0;
        boolean isValidRestaurant = true;

        switch (restaurantName) {
            case "Sushi Zone":
                if (sushiType.equals("sashimi")) {
                    totalSum = servings * 4.99;
                } else if (sushiType.equals("maki")) {
                    totalSum = servings * 5.29;
                } else if (sushiType.equals("uramaki")) {
                    totalSum = servings * 5.99;
                } else if (sushiType.equals("temaki")) {
                    totalSum = servings * 4.29;
                }
                break;
            case "Sushi Time":
                if (sushiType.equals("sashimi")) {
                    totalSum = servings * 5.49;
                } else if (sushiType.equals("maki")) {
                    totalSum = servings * 4.69;
                } else if (sushiType.equals("uramaki")) {
                    totalSum = servings * 4.49;
                } else if (sushiType.equals("temaki")) {
                    totalSum = servings * 5.19;
                }
                break;
            case "Sushi Bar":
                if (sushiType.equals("sashimi")) {
                    totalSum = servings * 5.25;
                } else if (sushiType.equals("maki")) {
                    totalSum = servings * 5.55;
                } else if (sushiType.equals("uramaki")) {
                    totalSum = servings * 6.25;
                } else if (sushiType.equals("temaki")) {
                    totalSum = servings * 4.75;
                }
                break;
            case "Asian Pub":
                if (sushiType.equals("sashimi")) {
                    totalSum = servings * 4.5;
                } else if (sushiType.equals("maki")) {
                    totalSum = servings * 4.8;
                } else if (sushiType.equals("uramaki")) {
                    totalSum = servings * 5.5;
                } else if (sushiType.equals("temaki")) {
                    totalSum = servings * 5.5;
                }
                break;
            default:
                isValidRestaurant = false;
                System.out.printf("%s is invalid restaurant!", restaurantName);
                break;
        }
        if (delivery.equals("Y")) {
            totalSum = totalSum * 1.2;
        }
        if (isValidRestaurant) {
            System.out.printf("Total price: %.0f lv.", Math.ceil(totalSum));
        }
    }
}
