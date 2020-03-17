package techmodule;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int peopleCount = Integer.parseInt(scanner.nextLine());
        String typeOfTraveler = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();

        double totalSum = 0;

        switch (typeOfTraveler) {
            case "Students":
                switch (dayOfWeek) {
                    case "Friday":
                        totalSum = peopleCount * 8.45;
                        if (peopleCount >= 30) {
                            totalSum = totalSum * 0.85;
                        }
                        break;
                    case "Saturday":
                        totalSum = peopleCount * 9.80;
                        if (peopleCount >= 30) {
                            totalSum = totalSum * 0.85;
                        }
                        break;
                    case "Sunday":
                        totalSum = peopleCount * 10.46;
                        if (peopleCount >= 30) {
                            totalSum = totalSum * 0.85;
                        }
                        break;
                }
                break;
            case "Business":
                switch (dayOfWeek) {
                    case "Friday":
                        totalSum = peopleCount * 10.90;
                        if (peopleCount >= 100) {
                            totalSum = totalSum - 109;
                        }
                        break;
                    case "Saturday":
                        totalSum = peopleCount * 15.60;
                        if (peopleCount >= 100) {
                            totalSum = totalSum - 156;
                        }
                        break;
                    case "Sunday":
                        totalSum = peopleCount * 16.0;
                        if (peopleCount >= 100) {
                            totalSum = totalSum - 160;
                        }
                        break;
                }
                break;
            case "Regular":
                switch (dayOfWeek) {
                    case "Friday":
                        totalSum = peopleCount * 15;
                        if (peopleCount >= 10 && peopleCount <= 20) {
                            totalSum = totalSum * 0.95;
                        }

                        break;
                    case "Saturday":
                        totalSum = peopleCount * 20;
                        if (peopleCount >= 10 && peopleCount <= 20) {
                            totalSum = totalSum * 0.95;
                        }
                        break;
                    case "Sunday":
                        totalSum = peopleCount * 22.5;
                        if (peopleCount >= 10 && peopleCount <= 20) {
                            totalSum = totalSum * 0.95;
                        }
                        break;
                }
                break;
        }
        System.out.printf("Total price: %.2f", totalSum);
    }
}
