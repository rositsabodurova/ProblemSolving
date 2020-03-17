package programmingBasics.tasks;

import java.util.Scanner;

public class NameWars {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int maxSum = 0;
        String winner = "";

        while (!input.equals("STOP")) {
            int currentSum = 0;

            for (int i = 0; i < input.length(); i++) {
                currentSum += input.charAt(i);
            }
            if (currentSum > maxSum) {
                maxSum = currentSum;
                winner = input;
            }
            input = scanner.nextLine();
        }
        System.out.printf("Winner is %s - %d!", winner, maxSum);
    }
}
