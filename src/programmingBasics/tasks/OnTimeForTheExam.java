package programmingBasics.tasks;

import java.util.Scanner;

public class OnTimeForTheExam {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int examHour = Integer.parseInt(scanner.nextLine());
        int examMinutes = Integer.parseInt(scanner.nextLine());
        int arriveHour = Integer.parseInt(scanner.nextLine());
        int arriveMinutes = Integer.parseInt(scanner.nextLine());

        int examTotalMinutes = examHour * 60 + examMinutes;
        int arriveTotalMinutes = arriveHour * 60 + arriveMinutes;
        int differenceInMinutes = Math.abs(arriveTotalMinutes - examTotalMinutes);

        if (arriveTotalMinutes > examTotalMinutes) {

            if (differenceInMinutes < 60) {
                System.out.println("Late");
                System.out.printf("%d minutes after the start", differenceInMinutes);
            } else {

                System.out.println("Late");
                System.out.printf("%d:%02d hours after the start", (differenceInMinutes / 60), (differenceInMinutes % 60));
            }
        } else if (arriveTotalMinutes == examTotalMinutes) {
            System.out.println("On time");
        } else if (arriveTotalMinutes < examTotalMinutes && differenceInMinutes <= 30) {
            System.out.println("On time");
            System.out.printf("%d minutes before the start", differenceInMinutes);
        } else if (arriveTotalMinutes < examTotalMinutes && differenceInMinutes > 30) {
            if (differenceInMinutes < 60) {
                System.out.println("Early");
                System.out.printf("%d minutes before the start", differenceInMinutes);
            } else {
                System.out.println("Early");
                System.out.printf("%d:%02d hours before the start", (differenceInMinutes / 60), (differenceInMinutes % 60));
            }
        }
    }
}
