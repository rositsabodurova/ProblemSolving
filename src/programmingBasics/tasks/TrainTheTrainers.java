package programmingBasics.tasks;

import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int juryCount = Integer.parseInt(scanner.nextLine());
        String presentationName = scanner.nextLine();

        int presentationCount = 0;
        double finalAssessment = 0;

        while (!presentationName.equals("Finish")) {
            double sumGrades = 0;
            for (int i = 1; i <= juryCount; i++) {
                double grade = Double.parseDouble(scanner.nextLine());
                sumGrades += grade;
            }
            double averageAssessment = sumGrades / juryCount;
            finalAssessment += averageAssessment;
            System.out.printf("%s - %.2f.%n", presentationName, averageAssessment);
            presentationCount++;
            presentationName = scanner.nextLine();
        }
        double studentAverage = finalAssessment / presentationCount;
        System.out.printf("Student's final assessment is %.2f.", studentAverage);
    }
}
