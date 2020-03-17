package programmingBasics.exams;

import java.util.Scanner;

public class ProjectPrize {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int projectParts = Integer.parseInt(scanner.nextLine());
        double prizePerPoint = Double.parseDouble(scanner.nextLine());

        int totalPoints = 0;

        for (int i = 1; i <= projectParts; i++) {
            int partPoints = Integer.parseInt(scanner.nextLine());
            if (i % 2 == 0) {
                totalPoints += partPoints * 2;
            } else {
                totalPoints += partPoints;
            }
        }
        double totalPrize = totalPoints * prizePerPoint;
        System.out.printf("The project prize was %.2f lv.", totalPrize);
    }
}
