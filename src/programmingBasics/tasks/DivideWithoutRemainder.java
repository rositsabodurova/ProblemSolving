package programmingBasics.tasks;

import java.util.Scanner;

public class DivideWithoutRemainder {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int count2 = 0;
        int count3 = 0;
        int count4 = 0;

        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scanner.nextLine());

            if (number % 2 == 0) {
                count2++;
            }
            if (number % 3 == 0) {
                count3++;
            }
            if (number % 4 == 0) {
                count4++;
            }
        }
        System.out.printf("%.2f%%%n", (count2 * 1.0 / n) * 100);
        System.out.printf("%.2f%%%n", (count3 * 1.0 / n) * 100);
        System.out.printf("%.2f%%%n", (count4 * 1.0 / n) * 100);
    }
}
