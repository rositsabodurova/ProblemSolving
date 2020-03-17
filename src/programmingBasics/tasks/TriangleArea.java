package programmingBasics.tasks;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double side = Double.parseDouble(scanner.nextLine());
        double heigth = Double.parseDouble(scanner.nextLine());
        double triangleArea = side * heigth / 2;
        System.out.printf("%.2f", triangleArea);
    }
}
