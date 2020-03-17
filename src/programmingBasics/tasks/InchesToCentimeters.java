package programmingBasics.tasks;

import java.util.Scanner;

public class InchesToCentimeters {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double centimeters = Double.parseDouble(scanner.nextLine());

        double inches = centimeters * 2.54;

        System.out.printf("%.2f", inches);
    }
}
