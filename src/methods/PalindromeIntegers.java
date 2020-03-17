package methods;

import java.util.Scanner;

public class PalindromeIntegers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        while (!input.equals("END")) {
            System.out.println(findIfPalindrome(input));
            input = scanner.nextLine();
        }
    }

    static boolean findIfPalindrome(String number) {
        boolean isPalindrome = true;
        for (int i = 0; i < number.length() / 2; i++) {
            if (number.charAt(i) != number.charAt(number.length() - 1 - i)) {
                isPalindrome = false;
            }
        }
        return isPalindrome;
    }
}
