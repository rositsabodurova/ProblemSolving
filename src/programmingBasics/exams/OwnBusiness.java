package programmingBasics.exams;

import java.util.Scanner;

public class OwnBusiness {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int spaceWidth = Integer.parseInt(scanner.nextLine());
        int spaceLength = Integer.parseInt(scanner.nextLine());
        int spaceHeight = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();

        int freeSpace = spaceWidth * spaceLength * spaceHeight;

        while (!command.equals("Done")) {
            int currentNumber = Integer.parseInt(command);
            freeSpace -= currentNumber;
            if (freeSpace <= 0) {
                break;
            }
            command = scanner.nextLine();
        }

        if (freeSpace > 0) {
            System.out.printf("%d Cubic meters left.", freeSpace);
        } else {
            System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(freeSpace));
        }
    }
}
