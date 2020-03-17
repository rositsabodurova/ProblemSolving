package programmingBasics.exams;

import java.util.Scanner;

public class HoneyMoon {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String destination = scanner.nextLine();
        int nightCount = Integer.parseInt(scanner.nextLine());

        double totalPrice = 0.0;

        if (nightCount >= 1 && nightCount <= 4) {
            switch (destination) {
                case "Cairo":
                    totalPrice = (nightCount * 2.0 * 250 + 600) * 0.97;
                    break;
                case "Paris":
                    totalPrice = nightCount * 2.0 * 150 + 350;
                    break;
                case "Lima":
                    totalPrice = nightCount * 2.0 * 400 + 850;
                    break;
                case "New York":
                    totalPrice = (nightCount * 2.0 * 300 + 650) * 0.97;
                    break;
                case "Tokyo":
                    totalPrice = nightCount * 2.0 * 350 + 700;
                    break;
            }
        } else if (nightCount >= 5 && nightCount <= 9) {
            switch (destination) {
                case "Cairo":
                    totalPrice = (nightCount * 2.0 * 250 + 600) * 0.95;
                    break;
                case "Paris":
                    totalPrice = (nightCount * 2.0 * 150 + 350) * 0.93;
                    break;
                case "Lima":
                    totalPrice = nightCount * 2.0 * 400 + 850;
                    break;
                case "New York":
                    totalPrice = (nightCount * 2.0 * 300 + 650) * 0.95;
                    break;
                case "Tokyo":
                    totalPrice = nightCount * 2.0 * 350 + 700;
                    break;
            }
        } else if (nightCount >= 10 && nightCount <= 24) {
            switch (destination) {
                case "Cairo":
                    totalPrice = (nightCount * 2.0 * 250 + 600) * 0.9;
                    break;
                case "Paris":
                    totalPrice = (nightCount * 2.0 * 150 + 350) * 0.88;
                    break;
                case "Lima":
                    totalPrice = nightCount * 2.0 * 400 + 850;
                    break;
                case "New York":
                    totalPrice = (nightCount * 2.0 * 300 + 650) * 0.88;
                    break;
                case "Tokyo":
                    totalPrice = (nightCount * 2.0 * 350 + 700) * 0.88;
                    break;
            }
        } else if (nightCount >= 25 && nightCount <= 49) {
            switch (destination) {
                case "Cairo":
                    totalPrice = (nightCount * 2.0 * 250 + 600) * 0.83;
                    break;
                case "Paris":
                    totalPrice = (nightCount * 2.0 * 150 + 350) * 0.78;
                    break;
                case "Lima":
                    totalPrice = (nightCount * 2.0 * 400 + 850) * 0.81;
                    break;
                case "New York":
                    totalPrice = (nightCount * 2.0 * 300 + 650) * 0.81;
                    break;
                case "Tokyo":
                    totalPrice = (nightCount * 2.0 * 350 + 700) * 0.83;
                    break;
            }
        } else if (nightCount >= 50) {
            switch (destination) {
                case "Cairo":
                    totalPrice = (nightCount * 2.0 * 250 + 600) * 0.7;
                    break;
                case "Paris":
                    totalPrice = (nightCount * 2.0 * 150 + 350) * 0.7;
                    break;
                case "Lima":
                    totalPrice = (nightCount * 2.0 * 400 + 850) * 0.7;
                    break;
                case "New York":
                    totalPrice = (nightCount * 2.0 * 300 + 650) * 0.7;
                    break;
                case "Tokyo":
                    totalPrice = (nightCount * 2.0 * 350 + 700) * 0.7;
                    break;
            }
        }
        double difference = Math.abs(totalPrice - budget);

        if (budget >= totalPrice) {
            System.out.printf("Yes! You have %.2f leva left.", difference);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", difference);
        }
    }
}
