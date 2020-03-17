package programmingBasics.tasks;

import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String figureType = scanner.nextLine();

        switch (figureType) {
            case "square": {
                double squareSide = Double.parseDouble(scanner.nextLine());
                double squareArea = squareSide * squareSide;
                System.out.printf("%.3f", squareArea);
                break;
            }
            case "rectangle": {
                double side1 = Double.parseDouble(scanner.nextLine());
                double side2 = Double.parseDouble(scanner.nextLine());
                double rectangleArea = side1 * side2;
                System.out.printf("%.3f", rectangleArea);
                break;
            }
            case "circle": {
                double radius = Double.parseDouble(scanner.nextLine());
                double circleArea = Math.PI * radius * radius;
                System.out.printf("%.3f", circleArea);
                break;
            }
            case "triangle": {
                double side = Double.parseDouble(scanner.nextLine());
                double heigth = Double.parseDouble(scanner.nextLine());
                double triangleArea = (side * heigth) / 2;
                System.out.printf("%.3f", triangleArea);
            }
        }
    }
}
