package programmingBasics.tasks;

import java.util.Scanner;

public class Graduation2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        double totalScore = 0;
        int poorGradesCounter = 0;
        int gradesCounter = 1;
        boolean isFailed = false;

        while (gradesCounter <= 12) {
            double grade = Double.parseDouble(scanner.nextLine());
            if (grade >= 4) {
                gradesCounter++;
                totalScore = totalScore + grade;
            } else {
                poorGradesCounter++;
            }
            if (poorGradesCounter == 2) {
                isFailed = true;
                break;
            }
        }
        if (isFailed) {
            System.out.printf("%s has been excluded at %d grade", name, gradesCounter);
        } else {
            System.out.printf("%s graduated. Average grade: %.2f", name, totalScore / 12);
        }
    }
}
