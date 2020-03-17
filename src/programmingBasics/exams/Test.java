package programmingBasics.exams;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int remainder;
        int remainderNext = 0;
        int counter = 0;
        int max = Integer.MIN_VALUE;

        while (n > 0) {
            if (counter > max) {
                max = counter;
            }
            remainder = n % 2;
            n = n / 2;

            if (remainder == 1 && remainder == remainderNext) {
                counter++;
            } else if (remainder == 1 && remainder != remainderNext) {
                counter = 1;
            }
            remainderNext = remainder;
        }
        if (counter > max) {
            max = counter;
        }
        System.out.println(max);
    }
}
