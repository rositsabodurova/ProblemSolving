package methods;

import java.util.Scanner;

public class AddAndSubtract {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        System.out.println(subtractNumbers(addNumbers(a, b), c));
    }

    static int addNumbers(int a, int b) {
        return a + b;
    }

    static int subtractNumbers(int sum, int c) {
        return sum - c;
    }
}
