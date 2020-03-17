package programmingBasics.tasks;

import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String favoriteBook = scanner.nextLine();
        int capacity = Integer.parseInt(scanner.nextLine());

        int bookCounter = 0;
        String inputBook = scanner.nextLine();

        while (!inputBook.equals(favoriteBook)) {
            bookCounter++;

            if (bookCounter == capacity) {
                System.out.println("The book you search is not here!");
                System.out.printf("You checked %d books.", capacity);
                break;
            }
            inputBook = scanner.nextLine();
        }
        if (inputBook.equals(favoriteBook)) {
            System.out.printf("You checked %d books and found it.", bookCounter);
        }
    }
}
