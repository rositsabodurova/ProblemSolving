package programmingBasics.tasks;

import java.util.Scanner;

public class Scholarship {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double incomeBGN = Double.parseDouble(scanner.nextLine());
        double averageResults = Double.parseDouble(scanner.nextLine());
        double minimalSalary = Double.parseDouble(scanner.nextLine());

        double socialScholarship = Math.floor(minimalSalary * 0.35);
        double excellentScholarship = Math.floor(averageResults * 25);

        if (averageResults >= 5.5 && incomeBGN < minimalSalary && socialScholarship > excellentScholarship) {
            System.out.printf("You get a Social scholarship %.0f BGN", socialScholarship);
        } else if (averageResults >= 5.5 && socialScholarship < excellentScholarship) {
            System.out.printf("You get a scholarship for excellent results %.2f BGN", excellentScholarship);
        } else if (averageResults > 4.5 && incomeBGN < minimalSalary) {
            System.out.printf("You get a Social scholarship %.0f BGN", socialScholarship);
        } else if (averageResults >= 5.5) {
            System.out.printf("You get a scholarship for excellent results %.2f BGN", excellentScholarship);
        } else {
            System.out.println("You cannot get a scholarship!");
        }
    }
}
