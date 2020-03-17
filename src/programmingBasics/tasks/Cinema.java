package programmingBasics.tasks;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String typeOfProjection = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());

        int seats = rows * columns;
        double income = 0;

        switch (typeOfProjection) {
            case "Premiere":
                income = seats * 12;
                System.out.printf("%.2f leva", income);
                break;
            case "Normal":
                income = seats * 7.50;
                System.out.printf("%.2f leva", income);
                break;
            case "Discount":
                income = seats * 5.00;
                System.out.printf("%.2f leva", income);
                break;
        }
    }
}
