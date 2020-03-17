package programmingBasics.exams;

import java.util.Scanner;

public class SpaceShip {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double shipWidth = Double.parseDouble(scanner.nextLine());
        double shipLength = Double.parseDouble(scanner.nextLine());
        double shipHeight = Double.parseDouble(scanner.nextLine());
        double astronautHeight = Double.parseDouble(scanner.nextLine());

        double roomSize = 2 * 2 * (astronautHeight + 0.4);
        double shipSize = shipWidth * shipHeight * shipLength;
        double capacity = Math.floor(shipSize / roomSize);

        if (capacity < 3) {
            System.out.println("The spacecraft is too small.");
        } else if (capacity > 3 && capacity < 10) {
            System.out.printf("The spacecraft holds %.0f astronauts.", capacity);
        } else {
            System.out.println("The spacecraft is too big.");
        }
    }
}
