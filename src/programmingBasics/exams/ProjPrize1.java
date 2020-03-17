package programmingBasics.exams;

import java.util.Scanner;

public class ProjPrize1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int projectStages = Integer.parseInt(scanner.nextLine());
        double prizePerPoint = Double.parseDouble(scanner.nextLine());

        int pointSum = 0;

        for (int i = 1; i <= projectStages; i++) {
            int points = Integer.parseInt(scanner.nextLine());

            if (i % 2 == 0) {
                pointSum = points * 2;
            } else {
                pointSum += points;
            }
        }
        double totalSum = pointSum * prizePerPoint;
        System.out.printf("The project prize was %.2f lv.", totalSum);
    }
}
