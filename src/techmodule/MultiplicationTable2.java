package techmodule;

import java.util.Scanner;

public class MultiplicationTable2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int start = Integer.parseInt(scanner.nextLine());

        for (int i = start; i <= 10; i++) {
            int product = i * n;
            System.out.printf("%d X %d = %d%n", n, i, product);
        }
        if (start > 10) {
            int product = n * start;
            System.out.printf("%d X %d = %d", n, start, product);
        }
    }
}
