package methods;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();

        boolean isLongEnough = checkLength(password);
        boolean containsLettersDigits = checkLettersDigits(password);
        boolean contains2Digits = checkDigitCount(password);

        if (isLongEnough && contains2Digits && containsLettersDigits) {
            System.out.println("Password is valid");
        }
    }

    static boolean checkLength(String password) {
        boolean isValid = false;
        if (password.length() < 6 || password.length() > 10) {
            System.out.println("Password must be between 6 and 10 characters");
        } else {
            isValid = true;
        }
        return isValid;
    }

    static boolean checkLettersDigits(String password) {
        char[] passwordArr = password.toCharArray();
        boolean isValid = true;

        for (int i = 0; i < passwordArr.length; i++) {
            if (!Character.isLetterOrDigit(passwordArr[i])) {
                isValid = false;
                System.out.println("Password must consist only of letters and digits");
                break;
            } else {
                isValid = true;
            }
        }

        return isValid;
    }

    static boolean checkDigitCount(String password) {
        char[] passwordArr = password.toCharArray();
        boolean isValid = false;
        int digitCounter = 0;

        for (int i = 0; i < passwordArr.length; i++) {
            if (Character.isDigit(passwordArr[i])) {
                digitCounter++;
            }
        }
        if (digitCounter >= 2) {
            isValid = true;
        } else {
            System.out.println("Password must have at least 2 digits");
        }
        return isValid;
    }
}
