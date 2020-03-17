package programmingBasics.tasks;

import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int totalSteps = 0;

        while (totalSteps < 10000) {
            String input = scanner.nextLine();
            if (input.equals("Going home")) {
                int stepsToHome = Integer.parseInt(scanner.nextLine());
                totalSteps = totalSteps + stepsToHome;

                break;
            }
            int steps = Integer.parseInt(input);
            totalSteps = totalSteps + steps;

        }
        if (totalSteps >= 10000) {
            System.out.println("Goal reached! Good job!");
        } else {
            int stepsRemaining = 10000 - totalSteps;
            System.out.printf("%d more steps to reach goal.", stepsRemaining);
        }
    }
}
