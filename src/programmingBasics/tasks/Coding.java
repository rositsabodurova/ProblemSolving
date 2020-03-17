package programmingBasics.tasks;

import java.util.Scanner;

public class Coding {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String inputNum = scanner.nextLine();

        for (int i = inputNum.length() - 1; i >= 0; i--) {
            char currentDigit = inputNum.charAt(i);
            int currentDigitNum = Integer.parseInt("" + currentDigit);
            if (currentDigitNum == 0) {
                System.out.println("ZERO");
                continue;
            }
            for (int j = 1; j <= currentDigitNum; j++) {
                System.out.print((char) (currentDigitNum + 33));
            }
            System.out.println();
        }
    }
}
