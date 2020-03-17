package methods;

import java.util.Scanner;

public class TopNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        printTopNumbers(number);
    }

    static void printTopNumbers(int number) {
        for (int i = 16; i < number; i++) {
            int sum = 0;
            int length = String.valueOf(i).length();
            boolean hasOdd = false;
            int numberToProcess = i;
            for (int j = 0; j < length; j++) {

                int last = numberToProcess % 10;
                numberToProcess = numberToProcess / 10;
                sum += last;
                if (last % 2 != 0) {
                    hasOdd = true;
                }
            }
            if (sum % 8 == 0 && hasOdd) {
                System.out.println(i);
            }
        }
    }
}
