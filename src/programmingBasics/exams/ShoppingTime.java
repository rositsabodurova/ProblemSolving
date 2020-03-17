package programmingBasics.exams;

import java.util.Scanner;

public class ShoppingTime {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int relaxTime = Integer.parseInt(scanner.nextLine());
        double peripheryPrice = Double.parseDouble(scanner.nextLine());
        double softwarePrice = Double.parseDouble(scanner.nextLine());
        double frappePrice = Double.parseDouble(scanner.nextLine());

        int remainingTime = relaxTime - 3 * 2 - 2 * 2 - 5;
        double totalMoney = 3 * peripheryPrice + 2 * softwarePrice + frappePrice;

        System.out.printf("%.2f%n", totalMoney);
        System.out.println(remainingTime);
    }
}
