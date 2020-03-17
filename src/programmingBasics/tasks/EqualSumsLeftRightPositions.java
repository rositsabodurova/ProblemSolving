package programmingBasics.tasks;

import java.util.Scanner;

public class EqualSumsLeftRightPositions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());

        for (int i = firstNum; i <= secondNum; i++) {
            int n1, n2, n3, n4, n5;
            String currentNum = "" + i;
            n1 = Integer.parseInt("" + currentNum.charAt(0));
            n2 = Integer.parseInt("" + currentNum.charAt(1));
            n3 = Integer.parseInt("" + currentNum.charAt(2));
            n4 = Integer.parseInt("" + currentNum.charAt(3));
            n5 = Integer.parseInt("" + currentNum.charAt(4));
            int sumLeft = n1 + n2;
            int sumRight = n4 + n5;

            if (sumLeft < sumRight) {
                sumLeft += n3;
            } else if (sumRight < sumLeft) {
                sumRight += n3;
            }
            if (sumLeft == sumRight) {
                System.out.print(i + " ");
            }
        }
    }
}
