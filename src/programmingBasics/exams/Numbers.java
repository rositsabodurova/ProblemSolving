package programmingBasics.exams;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        String inputInString = "" + input;

        int firstDigit = Integer.valueOf(String.valueOf(inputInString.charAt(0)));
        int secondDigit = Integer.valueOf(String.valueOf(inputInString.charAt(1)));
        int thirdDigit = Integer.valueOf(String.valueOf(inputInString.charAt(2)));

        int rows = firstDigit + secondDigit;
        int columns = firstDigit + thirdDigit;

        for (int i = 1; i <= rows; i++) {
            System.out.println();
            for (int j = 1; j <= columns; j++) {
                if (input % 5 == 0) {
                    input -= firstDigit;
                } else if (input % 3 == 0) {
                    input -= secondDigit;
                } else {
                    input += thirdDigit;
                }
                System.out.print(input + " ");
            }
        }
    }
}
