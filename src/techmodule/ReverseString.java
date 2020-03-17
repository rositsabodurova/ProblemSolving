package techmodule;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        for (int i = input.length() - 1; i >= 0; i--) {
            char currentChar = input.charAt(i);
            System.out.print(currentChar);
        }
    }
}
