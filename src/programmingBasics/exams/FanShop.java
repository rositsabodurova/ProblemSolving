package programmingBasics.exams;

import java.util.Scanner;

public class FanShop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int budget = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        for (int i = 0; i < n; i++) {
            String item = scanner.nextLine();
            switch (item) {
                case "hoodie":
                    sum += 30;
                    break;
                case "keychain":
                    sum += 4;
                    break;
                case "T-shirt":
                    sum += 20;
                    break;
                case "flag":
                    sum += 15;
                    break;
                case "sticker":
                    sum += 1.5;
                    break;
            }
        }
        int diff = Math.abs(budget - sum);
        if (sum <= budget) {
            System.out.printf("You bought %d items and left with %d lv.", n, diff);
        } else {
            System.out.printf("Not enough money, you need %d more lv.", diff);
        }
    }
}
