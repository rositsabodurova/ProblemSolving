package programmingBasics.tasks;

import java.util.Scanner;

public class DanceHall {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double hallLength = Double.parseDouble(scanner.nextLine());
        double hallWidth = Double.parseDouble(scanner.nextLine());
        double wardrobeSide = Double.parseDouble(scanner.nextLine());

        double hallAreaCm = (hallLength * 100) * (hallWidth * 100);
        double benchAreaCm = hallAreaCm / 10;
        double wardrobeAreaCm = (wardrobeSide * 100) * (wardrobeSide * 100);

        double freeSpaceCm = hallAreaCm - benchAreaCm - wardrobeAreaCm;

        System.out.printf("%.0f", Math.floor(freeSpaceCm / 7040));
    }
}
