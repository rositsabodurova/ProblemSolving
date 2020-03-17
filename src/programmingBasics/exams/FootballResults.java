package programmingBasics.exams;

import java.util.Scanner;

public class FootballResults {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String firstGame = scanner.nextLine();
        String secondGame = scanner.nextLine();
        String thirdGame = scanner.nextLine();

        int winCounter = 0;
        int lossCounter = 0;
        int drawCounter = 0;

        if (firstGame.charAt(0) > firstGame.charAt(2)) {
            winCounter += 1;
        } else if (firstGame.charAt(0) < firstGame.charAt(2)) {
            lossCounter += 1;
        } else if (firstGame.charAt(0) == firstGame.charAt(2)) {
            drawCounter += 1;
        }
        if (secondGame.charAt(0) > secondGame.charAt(2)) {
            winCounter += 1;
        } else if (secondGame.charAt(0) < secondGame.charAt(2)) {
            lossCounter += 1;
        } else if (secondGame.charAt(0) == secondGame.charAt(2)) {
            drawCounter += 1;
        }
        if (thirdGame.charAt(0) > thirdGame.charAt(2)) {
            winCounter += 1;
        } else if (thirdGame.charAt(0) < thirdGame.charAt(2)) {
            lossCounter += 1;
        } else if (thirdGame.charAt(0) == thirdGame.charAt(2)) {
            drawCounter += 1;
        }

        System.out.printf("Team won %d games.%n", winCounter);
        System.out.printf("Team lost %d games.%n", lossCounter);
        System.out.printf("Drawn games: %d", drawCounter);
    }
}
