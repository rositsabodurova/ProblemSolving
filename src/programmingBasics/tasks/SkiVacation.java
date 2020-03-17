package programmingBasics.tasks;

import java.util.Scanner;

public class SkiVacation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        String typeOfRoom = scanner.nextLine();
        String feedback = scanner.nextLine();

        double totalPrice = 0;

        switch (typeOfRoom) {
            case "room for one person":
                totalPrice = (days - 1) * 18.00;
                break;
            case "apartment":
                if (days < 10) {
                    totalPrice = (days - 1) * 25.00 * 0.7;
                } else if (days >= 10 && days <= 15) {
                    totalPrice = (days - 1) * 25.00 * 0.65;
                } else if (days > 15) {
                    totalPrice = (days - 1) * 25.00 * 0.5;
                }
                break;
            case "president apartment":
                if (days < 10) {
                    totalPrice = (days - 1) * 35.00 * 0.9;
                } else if (days >= 10 && days <= 15) {
                    totalPrice = (days - 1) * 35.00 * 0.85;
                } else if (days > 15) {
                    totalPrice = (days - 1) * 35.00 * 0.8;
                }
                break;
        }
        if (feedback.equals("positive")) {
            totalPrice = totalPrice * 1.25;
        } else if (feedback.equals("negative")) {
            totalPrice = totalPrice * 0.9;
        }
        System.out.printf("%.2f", totalPrice);
    }
}
