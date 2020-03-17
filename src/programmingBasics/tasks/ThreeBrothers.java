package programmingBasics.tasks;

import java.util.Scanner;

public class ThreeBrothers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double time1 = Double.parseDouble(scanner.nextLine());
        double time2 = Double.parseDouble(scanner.nextLine());
        double time3 = Double.parseDouble(scanner.nextLine());
        double timeFather = Double.parseDouble(scanner.nextLine());

        double cleaningTime = 1 / (1 / time1 + 1 / time2 + 1 / time3);
        double rest = cleaningTime * 0.15;
        double totalTime = cleaningTime + rest;

        if (totalTime < timeFather) {
            double timeDifference = Math.floor(timeFather - totalTime);
            System.out.printf("Cleaning time: %.2f%n", totalTime);
            System.out.printf("Yes, there is a surprise - time left -> %.0f hours.", timeDifference);
        } else if (totalTime >= timeFather) {
            double timeDifference2 = Math.ceil(totalTime - timeFather);
            System.out.printf("Cleaning time: %.2f%n", totalTime);
            System.out.printf("No, there isn't a surprise - shortage of time -> %.0f hours.", timeDifference2);
        }
    }
}
