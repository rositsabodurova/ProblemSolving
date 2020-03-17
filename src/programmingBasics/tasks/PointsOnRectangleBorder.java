package programmingBasics.tasks;

import java.util.Scanner;

public class PointsOnRectangleBorder {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double x1 = Double.parseDouble(scanner.nextLine());
        double y1 = Double.parseDouble(scanner.nextLine());
        double x2 = Double.parseDouble(scanner.nextLine());
        double y2 = Double.parseDouble(scanner.nextLine());
        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());

        boolean xEqual = x == x1 || x == x2;
        boolean yBetween = y >= y1 && y <= y2;
        boolean firstCheck = xEqual && yBetween;

        boolean yEqual = y == y1 || y == y2;
        boolean xBetween = x >= x1 && x <= x2;
        boolean secondCheck = yEqual && xBetween;

        if (firstCheck || secondCheck) {
            System.out.println("Border");
        } else {
            System.out.println("Inside / Outside");
        }
    }
}
