package programmingBasics.tasks;

import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int length = 1;
        int current = 0;

        for (int rows = 1; rows <= n; rows++) {
            System.out.print(rows + " ");
            current++;
            if (current == length) {
                System.out.println();
                length++;
                current = 0;
            }
        }
    }
}
