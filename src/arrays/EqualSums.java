package arrays;

import java.util.Scanner;

public class EqualSums {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String[] inputArr = input.split(" ");
        int[] numbers = new int[inputArr.length];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(inputArr[i]);
        }
        int leftSum = 0;
        int rightSum = 0;
        boolean areEqual = false;
        int index = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers.length == 1) {
                areEqual = true;
                break;
            }
            if (i == 0) {
                for (int j = i + 1; j < numbers.length; j++) {
                    rightSum += numbers[j];
                    if (leftSum == rightSum) {
                        areEqual = true;
                        index = i;
                    }
                }
            }
            if (i == numbers.length - 1) {
                for (int j = i - 1; j <= 0; j++) {
                    leftSum += numbers[j];
                    if (leftSum == rightSum) {
                        areEqual = true;
                        index = i;
                    }
                }
            }
            for (int j = 0; j < i; j++) {
                leftSum += numbers[j];
            }
            for (int j = numbers.length - 1; j > i; j--) {
                rightSum += numbers[j];
            }
            if (leftSum == rightSum) {
                areEqual = true;
                index = i;
            }
            leftSum = 0;
            rightSum = 0;
        }
        if (areEqual) {
            System.out.println(index);
        } else {
            System.out.println("no");
        }
    }
}
