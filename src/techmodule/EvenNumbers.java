package techmodule;

import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());

        while (Math.abs(input) % 2 != 0) {
            System.out.println("Please write an even number.");
            input = Integer.parseInt(scanner.nextLine());

        }
        if (Math.abs(input) % 2 == 0) {
            System.out.printf("The number is: %d", Math.abs(input));
        }
    }
}
