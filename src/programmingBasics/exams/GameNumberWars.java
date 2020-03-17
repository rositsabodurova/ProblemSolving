package programmingBasics.exams;

import java.util.Scanner;

public class GameNumberWars {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String firstPlayerName = scanner.nextLine();
        String secondPlayerName = scanner.nextLine();
        String command = scanner.nextLine();

        int firstPlayerPoints = 0;
        int secondPlayerPoints = 0;

        while (!command.equals("End of game")) {
            int firstPlayerCard = Integer.parseInt(command);
            int secondPlayerCard = Integer.parseInt(scanner.nextLine());
            if (firstPlayerCard > secondPlayerCard) {
                firstPlayerPoints = firstPlayerPoints + (firstPlayerCard - secondPlayerCard);
            } else if (secondPlayerCard > firstPlayerCard) {
                secondPlayerPoints = secondPlayerPoints + (secondPlayerCard - firstPlayerCard);
            } else {
                System.out.println("Number wars!");
                firstPlayerCard = Integer.parseInt(scanner.nextLine());
                secondPlayerCard = Integer.parseInt(scanner.nextLine());
                if (firstPlayerCard > secondPlayerCard) {
                    System.out.printf("%s is winner with %d points", firstPlayerName, firstPlayerPoints);
                    break;
                } else if (secondPlayerCard > firstPlayerCard) {
                    System.out.printf("%s is winner with %d points", secondPlayerName, secondPlayerPoints);
                    break;
                }
            }
            command = scanner.nextLine();

        }
        if (command.equals("End of game")) {
            System.out.printf("%s has %d points%n", firstPlayerName, firstPlayerPoints);
            System.out.printf("%s has %d points", secondPlayerName, secondPlayerPoints);
        }
    }
}
