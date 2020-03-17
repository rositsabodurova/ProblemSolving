package arrays;

import java.util.Scanner;

public class MaxSequenceOfEqualElements {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] inputArray = scanner.nextLine().split(" ");

        int[] inputIntArray = new int[inputArray.length];

        for (int i = 0; i < inputArray.length; i++) {
            inputIntArray[i] = Integer.parseInt(inputArray[i]);
        }
        int maxCount = 1;
        int num = inputIntArray[0];

        for (int i = 0; i < inputIntArray.length; i++) {
            int currentNum = inputIntArray[i];
            int currentCount = 1;
            for (int j = i + 1; j < inputIntArray.length; j++) {
                int secondNum = inputIntArray[j];
                if (currentNum == secondNum) {
                    currentCount++;
                    if (currentCount > maxCount) {
                        maxCount = currentCount;
                        num = currentNum;
                    }
                } else {
                    break;
                }
            }
        }
        for (int i = 1; i <= maxCount; i++) {
            System.out.print(num + " ");
        }
    }
}
