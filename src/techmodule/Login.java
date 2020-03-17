package techmodule;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String username = sc.nextLine();
        String attempt = sc.nextLine();
        String password = "";
        int counter = 0;

        for (int i = username.length() - 1; i >= 0; i--) {
            char currentChar = username.charAt(i);
            password = password + currentChar;
        }
        while (!attempt.equals(password)) {
            counter++;
            if (counter == 4) {
                System.out.printf("User %s blocked!", username);
                break;
            }
            System.out.println("Incorrect password. Try again.");
            attempt = sc.nextLine();
        }

        if (attempt.equals(password)) {
            System.out.printf("User %s logged in.", username);
        }
    }
}
