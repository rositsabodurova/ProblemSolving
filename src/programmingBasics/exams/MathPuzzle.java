package programmingBasics.exams;

import java.util.Scanner;

public class MathPuzzle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int key = Integer.parseInt(scanner.nextLine());

        boolean control = false;

        for (int i = 1; i <= 30; i++) {
            for (int j = 1; j <= 30; j++) {
                for (int k = 1; k <= 30; k++) {
                    if (i + j + k == key) {
                        if (i < j && j < k) {
                            System.out.printf("%d + %d + %d = %d%n", i, j, k, key);
                            control = true;
                        }
                    }
                    if (i * j * k == key) {
                        if (i > j && j > k) {
                            System.out.printf("%d * %d * %d = %d%n", i, j, k, key);
                            control = true;
                        }
                    }
                }
            }
        }
        if (!control) {
            System.out.println("No!");
        }
    }
}
