package programmingBasics.tasks;

import java.util.Scanner;

public class Choreography {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double steps = Integer.parseInt(scanner.nextLine());
        double dancers = Integer.parseInt(scanner.nextLine());
        double days = Integer.parseInt(scanner.nextLine());

        double percentagePerDay = Math.ceil(steps / days / steps * 100);
        double percentagePerDancer = percentagePerDay / dancers;

        if (percentagePerDay <= 13) {
            System.out.printf("Yes, they will succeed in that goal! %.2f%%.", percentagePerDancer);
        } else {
            System.out.printf("No, they will not succeed in that goal! Required %.2f%% steps to be learned per day.", percentagePerDancer);
        }
    }
}
