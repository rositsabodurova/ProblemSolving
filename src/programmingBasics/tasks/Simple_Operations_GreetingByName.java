package programmingBasics.tasks;

import java.util.Scanner;

public class Simple_Operations_GreetingByName {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println("Hello, " + name + "!");
    }
}
