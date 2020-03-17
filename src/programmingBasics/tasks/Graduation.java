package programmingBasics.tasks;

import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        double totalGrades = 0;
        int classCount = 0;

        while (classCount < 12) {
            double grade = Double.parseDouble(scanner.nextLine());
            if (grade >= 4) {
                classCount++;
                totalGrades += grade;
            }
        }
        System.out.printf("%s graduated. Average grade: %.2f", name, (totalGrades / classCount));
    }
}
