package programmingBasics.tasks;

import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        int count5 = 0;

        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scanner.nextLine());

            if (number < 200) {
                count1++;
            } else if (number >= 200 && number <= 399) {
                count2++;
            } else if (number >= 400 && number <= 599) {
                count3++;
            } else if (number >= 600 && number <= 799) {
                count4++;
            } else if (number >= 800) {
                count5++;
            }
        }
        System.out.printf("%.2f%%%n", (count1 * 1.0 / n) * 100);
        System.out.printf("%.2f%%%n", (count2 * 1.0 / n) * 100);
        System.out.printf("%.2f%%%n", (count3 * 1.0 / n) * 100);
        System.out.printf("%.2f%%%n", (count4 * 1.0 / n) * 100);
        System.out.printf("%.2f%%%n", (count5 * 1.0 / n) * 100);
    }
}
