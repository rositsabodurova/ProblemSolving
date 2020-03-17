package programmingBasics.exams;

import java.util.Scanner;

public class GameStatistics {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int minutes = Integer.parseInt(scanner.nextLine());
        String name = scanner.nextLine();

        if (minutes == 0) {
            System.out.println("Match has just began!");
        } else if (minutes < 45) {
            System.out.println("First half time.");
            if (minutes >= 1 && minutes <= 10) {
                System.out.printf("%s missed a penalty.%n", name);
                if (minutes % 2 == 0) {
                    System.out.printf("%s was injured after the penalty.", name);
                }
            } else if (minutes <= 35) {
                System.out.printf("%s received yellow card.%n", name);
                if (minutes % 2 != 0) {
                    System.out.printf("%s got another yellow card.", name);
                }
            } else {
                System.out.printf("%s SCORED A GOAL !!!", name);
            }
        } else {
            System.out.println("Second half time.");
            if (minutes <= 55) {
                System.out.printf("%s got a freekick.%n", name);
                if (minutes % 2 == 0) {
                    System.out.printf("%s missed the freekick.", name);
                }
            } else if (minutes <= 80) {
                System.out.printf("%s missed a shot from corner.%n", name);
                if (minutes % 2 != 0) {
                    System.out.printf("%s has been changed with another player.", name);
                }
            } else {
                System.out.printf("%s SCORED A GOAL FROM PENALTY !!!", name);
            }
        }
    }
}
