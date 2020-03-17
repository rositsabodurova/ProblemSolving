package programmingBasics.exams;

import java.util.Scanner;

public class GoingHome {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int distance = Integer.parseInt(scanner.nextLine());
        int fuelConsumption = Integer.parseInt(scanner.nextLine());
        double fuelPrice = Double.parseDouble(scanner.nextLine());
        int tournamentMoney = Integer.parseInt(scanner.nextLine());

        double fuelMoney = distance * 1.0 / 100 * fuelConsumption * fuelPrice;

        if (tournamentMoney >= fuelMoney) {
            System.out.printf("You can go home. %.2f money left.", tournamentMoney - fuelMoney);
        } else {
            double moneyLeftPerPerson = tournamentMoney * 1.0 / 5;
            System.out.printf("Sorry, you cannot go home. Each will receive %.2f money.", moneyLeftPerPerson);
        }
    }
}
