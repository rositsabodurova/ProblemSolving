package programmingBasics.exams;

import java.util.Scanner;

public class MultiplyTable {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int inputNumber = Integer.parseInt(scanner.nextLine());

        for (int third = 1; third <= (inputNumber % 10); third++) {

            for (int second = 1; second <= ((inputNumber / 10) % 10); second++) {

                for (int first = 1; first <= (inputNumber / 100) % 10; first++) {
                    int result = first * second * third;
                    System.out.printf("%d * %d * %d = %d;%n", third, second, first, result);
                }
            }
        }
    }
}
