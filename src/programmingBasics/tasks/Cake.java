package programmingBasics.tasks;

import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int cakeWidth = Integer.parseInt(scanner.nextLine());
        int cakeLength = Integer.parseInt(scanner.nextLine());
        int piecesCount = cakeLength * cakeWidth;

        String input = scanner.nextLine();

        while (!input.equals("STOP")) {
            int piecesTaken = Integer.parseInt(input);
            piecesCount = piecesCount - piecesTaken;

            if (piecesCount < 0) {
                System.out.printf("No more cake left! You need %d pieces more.", Math.abs(piecesCount));
                break;
            }
            input = scanner.nextLine();
        }
        if (input.equals("STOP")) {
            System.out.printf("%d pieces are left.", piecesCount);
        }
    }
}
