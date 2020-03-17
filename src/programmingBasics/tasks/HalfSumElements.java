package programmingBasics.tasks;

import java.util.Scanner;

public class HalfSumElements {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        int maxValue = Integer.MIN_VALUE;

        for (int i = 1; i <= n; i++) {
            int inputNumber = Integer.parseInt(scanner.nextLine());
            sum += inputNumber;
            if (inputNumber > maxValue) {
                maxValue = inputNumber;
            }
        }

        if (maxValue == (sum - maxValue)) {
            System.out.println("Yes");
            System.out.printf("Sum = %d", sum - maxValue);
        } else {
            System.out.println("No");
            System.out.printf("Diff = %d", Math.abs(sum - maxValue - maxValue));
        }
    }
}
