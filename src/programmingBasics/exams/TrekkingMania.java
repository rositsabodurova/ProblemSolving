package programmingBasics.exams;

import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int groupCount = Integer.parseInt(scanner.nextLine());

        int musalaCount = 0;
        int monblanCount = 0;
        int kilimandjaroCount = 0;
        int k2Count = 0;
        int everestCount = 0;
        int totalClimbers = 0;

        for (int i = 1; i <= groupCount; i++) {
            int peopleCount = Integer.parseInt(scanner.nextLine());
            totalClimbers += peopleCount;
            if (peopleCount <= 5) {
                musalaCount += peopleCount;
            } else if (peopleCount <= 12) {
                monblanCount += peopleCount;
            } else if (peopleCount <= 25) {
                kilimandjaroCount += peopleCount;
            } else if (peopleCount <= 40) {
                k2Count += peopleCount;
            } else {
                everestCount += peopleCount;
            }
        }
        System.out.printf("%.2f%%%n", (musalaCount * 1.0 / totalClimbers) * 100);
        System.out.printf("%.2f%%%n", (monblanCount * 1.0 / totalClimbers) * 100);
        System.out.printf("%.2f%%%n", (kilimandjaroCount * 1.0 / totalClimbers) * 100);
        System.out.printf("%.2f%%%n", (k2Count * 1.0 / totalClimbers) * 100);
        System.out.printf("%.2f%%%n", (everestCount * 1.0 / totalClimbers) * 100);
    }
}
