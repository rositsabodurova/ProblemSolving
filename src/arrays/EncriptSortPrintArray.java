package arrays;

import java.util.Scanner;

public class EncriptSortPrintArray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        int[] values = new int[number];

        for (int i = 0; i < number; i++) {
            String input = scanner.nextLine();
            char[] array = input.toCharArray();
            int sum = 0;
            for (int j = 0; j < array.length; j++) {

                if (array[j] == 'a' || array[j] == 'e' || array[j] == 'i' || array[j] == 'o' || array[j] == 'u'
                        || array[j] == 'A' || array[j] == 'E' || array[j] == 'O' || array[j] == 'U' || array[j] == 'I') {
                    sum += ((int) array[j]) * input.length();
                } else {
                    sum += ((int) array[j]) / input.length();
                }

            }
            values[i] = sum;
        }
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values.length; j++) {
                if (values[i] < values[j]) {
                    int temp = values[i];
                    values[i] = values[j];
                    values[j] = temp;
                }
            }
        }

        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }
    }
}
