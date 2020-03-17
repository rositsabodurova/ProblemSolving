package programmingBasics.exams;

import java.util.Scanner;

public class BasketBallTournament {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();

        int hostCounter = 0;
        int guestCounter = 0;
        int gameCounter = 0;
        int totalGameCounter = 0;

        while (!command.equals("End of tournaments")) {
            int n = Integer.parseInt(scanner.nextLine());
            gameCounter = 0;

            for (int i = 1; i <= n; i++) {
                int hostResult = Integer.parseInt(scanner.nextLine());
                int guestResult = Integer.parseInt(scanner.nextLine());
                if (hostResult > guestResult) {
                    hostCounter++;
                    gameCounter++;
                    totalGameCounter++;
                    int difference = hostResult - guestResult;
                    System.out.printf("Game %d of tournament %s: win with %d points.%n", gameCounter, command, difference);
                } else if (guestResult > hostResult) {
                    guestCounter++;
                    gameCounter++;
                    totalGameCounter++;
                    int difference = guestResult - hostResult;
                    System.out.printf("Game %d of tournament %s: lost with %d points.%n", gameCounter, command, difference);
                }
            }
            command = scanner.nextLine();
        }
        System.out.printf("%.2f%% matches win%n", (hostCounter * 1.0 / totalGameCounter) * 100);
        System.out.printf("%.2f%% matches lost", (guestCounter * 1.0 / totalGameCounter) * 100);
    }
}
