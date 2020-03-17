package techmodule;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int result = 0;
        int product = 1;

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            int currentDigit = Character.getNumericValue(currentChar);
            for (int j = 1; j <= currentDigit; j++) {
                product = product * j;
            }
            result = result + product;
            product = 1;
        }

        if (Integer.parseInt(input) == result) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
