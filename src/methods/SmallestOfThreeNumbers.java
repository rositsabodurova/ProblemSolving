package methods;

import java.util.Scanner;

public class SmallestOfThreeNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        printSmallestOfThreeNums(a, b, c);
    }

    static void printSmallestOfThreeNums(int a, int b, int c) {
        if (a < b && a <= c) {
            System.out.println(a);
        } else if (b < a && b <= c) {
            System.out.println(b);
        } else if (c < a && c <= b) {
            System.out.println(c);
        } else if (a == b && a < c) {
            System.out.println(a);
        } else if (a == c && a < b) {
            System.out.println(a);
        } else if (b == c && b < a) {
            System.out.println(b);
        } else {
            System.out.println(a);
        }
    }
}
