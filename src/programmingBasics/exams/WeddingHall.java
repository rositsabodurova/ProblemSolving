package programmingBasics.exams;

import java.util.Scanner;

public class WeddingHall {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double hallLength = Double.parseDouble(scanner.nextLine());
        double hallWidth = Double.parseDouble(scanner.nextLine());
        double barSide = Double.parseDouble(scanner.nextLine());

        double hallSpace = hallLength * hallWidth;
        double peopleCount = Math.ceil((hallSpace - Math.pow(barSide, 2) - hallSpace * 0.19) / 3.2);
        System.out.printf("%.0f", peopleCount);
    }
}
