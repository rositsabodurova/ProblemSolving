package programmingBasics.tasks;

import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int nightCount = Integer.parseInt(scanner.nextLine());

        boolean mayOct = month.equals("May") || month.equals("October");
        boolean juneSept = month.equals("June") || month.equals("September");
        boolean julyAug = month.equals("July") || month.equals("August");

        double studioPrice = 0;
        double appartmentPrice = 0;

        if (mayOct) {
            studioPrice = nightCount * 50;
            appartmentPrice = nightCount * 65;
            if (nightCount > 7 && nightCount <= 14) {
                studioPrice = studioPrice * 0.95;
            } else if (nightCount > 14) {
                studioPrice = studioPrice * 0.7;
                appartmentPrice = appartmentPrice * 0.9;
            }

        } else if (juneSept) {
            studioPrice = nightCount * 75.20;
            appartmentPrice = nightCount * 68.70;
            if (nightCount > 14) {
                studioPrice = studioPrice * 0.80;
                appartmentPrice = appartmentPrice * 0.90;
            }
        } else if (julyAug) {
            studioPrice = nightCount * 76;
            appartmentPrice = nightCount * 77;
            if (nightCount > 14) {
                appartmentPrice = appartmentPrice * 0.90;
            }
        }

        System.out.printf("Apartment: %.2f lv.%n", appartmentPrice);
        System.out.printf("Studio: %.2f lv.", studioPrice);
    }
}
