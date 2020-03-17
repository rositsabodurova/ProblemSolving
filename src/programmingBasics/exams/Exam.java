package programmingBasics.exams;

import java.util.Scanner;

public class Exam {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int studentsCount = Integer.parseInt(scanner.nextLine());

        double topStudentsCount = 0;
        double students4Count = 0;
        double students3Count = 0;
        double studentsFailCount = 0;
        double totalScore = 0;

        for (int i = 1; i <= studentsCount; i++) {
            double grade = Double.parseDouble(scanner.nextLine());
            totalScore += grade;
            if (grade >= 5.00) {
                topStudentsCount++;
            } else if (grade >= 4.00) {
                students4Count++;
            } else if (grade >= 3.00) {
                students3Count++;
            } else {
                studentsFailCount++;
            }
        }
        System.out.printf("Top students: %.2f%%%n", (topStudentsCount / studentsCount) * 100);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n", (students4Count / studentsCount) * 100);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n", (students3Count / studentsCount) * 100);
        System.out.printf("Fail: %.2f%%%n", (studentsFailCount / studentsCount) * 100);
        System.out.printf("Average: %.2f", totalScore / studentsCount);
    }
}
