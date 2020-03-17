package programmingBasics.tasks;

import java.util.Scanner;

public class EqualPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int firstSum = 0;
        int midSum = 0;
        int diff1 = 0;

        boolean check = true;

        for (int i = 1; i <= n; i++) {
            int numA = Integer.parseInt(scanner.nextLine());
            int numB = Integer.parseInt(scanner.nextLine());

            if (i % 2 != 0) {
                firstSum = numA + numB;
            } else {
                midSum = numA + numB;
            }

            if (firstSum == midSum || n < 2) {
                check = true;
            } else {
                diff1 = Math.abs(midSum - firstSum);
                check = false;
            }
        }

        if (check) {
            System.out.printf("Yes, value=%d", firstSum);
        } else {

            System.out.printf("No, maxdiff=%d", diff1);
        }
    }
}
