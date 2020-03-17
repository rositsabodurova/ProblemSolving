package arrays;

import java.util.Scanner;

public class TopIntegers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String[] inputArr = input.split(" ");
        int[] numbers = new int[inputArr.length];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(inputArr[i]);
        }

        for (int i = 0; i < numbers.length; i++) {
            boolean isTop = true;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] <= numbers[j]) {
                    isTop = false;
                    break;
                }
            }
            if (isTop) {
                System.out.print(numbers[i] + " ");
            }
        }
    }
}
