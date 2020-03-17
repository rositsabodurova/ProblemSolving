package programmingBasics.tasks;

import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int poorGradesMax = Integer.parseInt(scanner.nextLine());
        String task = scanner.nextLine();

        int taskCounter = 0;
        int totalTask = 0;
        int poorGradesCounter = 0;
        String lastTask = "";

        while (!task.equals("Enough")) {
            int grade = Integer.parseInt(scanner.nextLine());
            taskCounter++;
            totalTask += grade;

            if (grade <= 4) {
                poorGradesCounter++;
            }
            if (poorGradesCounter == poorGradesMax) {
                System.out.printf("You need a break, %d poor grades.", poorGradesCounter);
                break;
            }
            lastTask = task;
            task = scanner.nextLine();
        }
        if (task.equals("Enough")) {
            System.out.printf("Average score: %.2f%n", totalTask * 1.0 / taskCounter);
            System.out.printf("Number of problems: %d%n", taskCounter);
            System.out.printf("Last problem: %s", lastTask);
        }
    }
}
