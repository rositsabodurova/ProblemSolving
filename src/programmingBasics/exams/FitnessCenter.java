package programmingBasics.exams;

import java.util.Scanner;

public class FitnessCenter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int backCount = 0;
        int chestCount = 0;
        int legsCount = 0;
        int absCount = 0;
        int proteinShakeCount = 0;
        int proteinBarCount = 0;
        int trainingCounter = 0;
        int proteinCounter = 0;

        for (int i = 1; i <= n; i++) {
            String reason = scanner.nextLine();
            switch (reason) {
                case "Back":
                    backCount++;
                    trainingCounter++;
                    break;
                case "Chest":
                    chestCount++;
                    trainingCounter++;
                    break;
                case "Legs":
                    legsCount++;
                    trainingCounter++;
                    break;
                case "Abs":
                    absCount++;
                    trainingCounter++;
                    break;
                case "Protein shake":
                    proteinShakeCount++;
                    proteinCounter++;
                    break;
                case "Protein bar":
                    proteinBarCount++;
                    proteinCounter++;
                    break;
            }
        }
        System.out.printf("%d - back%n", backCount);
        System.out.printf("%d - chest%n", chestCount);
        System.out.printf("%d - legs%n", legsCount);
        System.out.printf("%d - abs%n", absCount);
        System.out.printf("%d - protein shake%n", proteinShakeCount);
        System.out.printf("%d - protein bar%n", proteinBarCount);
        System.out.printf("%.2f%% - work out%n", (trainingCounter * 1.0 / n) * 100);
        System.out.printf("%.2f%% - protein", (proteinCounter * 1.0 / n) * 100);
    }
}
