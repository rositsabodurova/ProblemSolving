package programmingBasics.tasks;

import java.util.Scanner;

public class CircleAreaAndParameter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double radius = Double.parseDouble(scanner.nextLine());

        double circleArea = Math.PI * radius * radius;
        double circlePerimeter = 2 * Math.PI * radius;

        System.out.printf("%.2f%n", circleArea);
        System.out.printf("%.2f", circlePerimeter);
    }
}
