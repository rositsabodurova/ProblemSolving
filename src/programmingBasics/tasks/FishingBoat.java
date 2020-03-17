package programmingBasics.tasks;

import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishermenCount = Integer.parseInt(scanner.nextLine());

        double boatPrice = 0;

        switch (season) {
            case "Spring":
                boatPrice = 3000;
                if (fishermenCount <= 6) {
                    boatPrice = boatPrice * 0.9;
                } else if (fishermenCount >= 7 && fishermenCount <= 11) {
                    boatPrice = boatPrice * 0.85;
                } else if (fishermenCount >= 12) {
                    boatPrice = boatPrice * 0.75;
                }
                if (fishermenCount % 2 == 0) {
                    boatPrice = boatPrice * 0.95;
                }
                break;
            case "Summer":
                boatPrice = 4200;
                if (fishermenCount <= 6) {
                    boatPrice = boatPrice * 0.9;
                } else if (fishermenCount >= 7 && fishermenCount <= 11) {
                    boatPrice = boatPrice * 0.85;
                } else if (fishermenCount >= 12) {
                    boatPrice = boatPrice * 0.75;
                }
                if (fishermenCount % 2 == 0) {
                    boatPrice = boatPrice * 0.95;
                }
                break;
            case "Autumn":
                boatPrice = 4200;
                if (fishermenCount <= 6) {
                    boatPrice = boatPrice * 0.9;
                } else if (fishermenCount >= 7 && fishermenCount <= 11) {
                    boatPrice = boatPrice * 0.85;
                } else if (fishermenCount >= 12) {
                    boatPrice = boatPrice * 0.75;
                }
                break;
            case "Winter":
                boatPrice = 2600;
                if (fishermenCount <= 6) {
                    boatPrice = boatPrice * 0.9;
                } else if (fishermenCount >= 7 && fishermenCount <= 11) {
                    boatPrice = boatPrice * 0.85;
                } else if (fishermenCount >= 12) {
                    boatPrice = boatPrice * 0.75;
                }
                if (fishermenCount % 2 == 0) {
                    boatPrice = boatPrice * 0.95;
                }
                break;
        }
        double difference = Math.abs(budget - boatPrice);
        if (budget >= boatPrice) {
            System.out.printf("Yes! You have %.2f leva left.", difference);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", difference);
        }
    }
}
