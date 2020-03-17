package programmingBasics.tasks;

import java.util.Scanner;

public class TwoDRectangleArea {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Double x1 = Double.parseDouble(scanner.nextLine());
        Double y1 = Double.parseDouble(scanner.nextLine());
        Double x2 = Double.parseDouble(scanner.nextLine());
        Double y2 = Double.parseDouble(scanner.nextLine());

        Double sideA = Math.abs(x1 - x2);
        Double sideB = Math.abs(y1 - y2);

        Double area = sideA * sideB;
        Double perimeter = 2 * (sideA + sideB);

        System.out.printf("%.2f%n", area);
        System.out.printf("%.2f", perimeter);
    }
}
