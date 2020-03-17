package programmingBasics.exams;

import java.util.Scanner;

public class GroupStage {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String teamName = scanner.nextLine();
        int matchesCount = Integer.parseInt(scanner.nextLine());

        int points = 0;
        int goalDiff = 0;

        for (int i = 1; i <= matchesCount; i++) {
            int goalsScored = Integer.parseInt(scanner.nextLine());
            int goalsReceived = Integer.parseInt((scanner.nextLine()));
            goalDiff = goalDiff + goalsScored - goalsReceived;
            if (goalsScored > goalsReceived) {
                points += 3;
            } else if (goalsScored == goalsReceived) {
                points += 1;
            }
        }
        if (goalDiff >= 0) {
            System.out.printf("%s has finished the group phase with %d points.%n", teamName, points);
            System.out.printf("Goal difference: %d.", goalDiff);
        } else {
            System.out.printf("%s has been eliminated from the group phase.%n", teamName);
            System.out.printf("Goal difference: %d.", goalDiff);
        }
    }
}
