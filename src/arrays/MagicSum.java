package arrays;

import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int targetSum = Integer.parseInt(scanner.nextLine());

        String[] inputArray = input.split(" ");
        int[] inputIntArray = new int[inputArray.length];

        for (int i = 0; i < inputArray.length; i++) {
            inputIntArray[i] = Integer.parseInt(inputArray[i]);
        }

        for (int i = 0; i <= inputIntArray.length; i++) {
            for (int j = i + 1; j < inputIntArray.length; j++) {
                int num1 = inputIntArray[i];
                int num2 = inputIntArray[j];
                if (targetSum == num1 + num2) {
                    System.out.println(num1 + " " + num2);
                }
            }
        }
    }
}