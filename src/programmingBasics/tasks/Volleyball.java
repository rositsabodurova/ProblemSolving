package programmingBasics.tasks;

import java.util.Scanner;

public class Volleyball {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String yearType = scanner.nextLine();
        int numberP = Integer.parseInt(scanner.nextLine());
        int numberH = Integer.parseInt(scanner.nextLine());

        double weekendsInSofia = 48 - numberH;
        double weekendPlaysInSofia = (weekendsInSofia * 3.0) / 4;
        double holidayPlaysinSofia = (numberP * 2.0) / 3;
        double totalPlay = weekendPlaysInSofia + holidayPlaysinSofia + numberH;

        switch (yearType) {
            case "leap":
                totalPlay = Math.floor(totalPlay * 1.15);
                System.out.printf("%.0f", totalPlay);
                break;
            case "normal":
                totalPlay = Math.floor(totalPlay);
                System.out.printf("%.0f", totalPlay);
                break;
        }
    }
}
