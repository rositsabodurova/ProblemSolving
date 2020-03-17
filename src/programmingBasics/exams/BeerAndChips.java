package programmingBasics.exams;

import java.util.Scanner;

public class BeerAndChips {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        double budget = Double.parseDouble(scanner.nextLine());
        int beerCount = Integer.parseInt(scanner.nextLine());
        int chipsCount = Integer.parseInt(scanner.nextLine());

        double beerSum = beerCount * 1.2;
        double chipsPrice = beerSum * 0.45;
        double chipsSum = Math.ceil(chipsCount * chipsPrice);
        double totalMoney = beerSum + chipsSum;

        double difference = Math.abs(totalMoney - budget);
        if (totalMoney <= budget) {
            System.out.printf("%s bought a snack and has %.2f leva left.", name, difference);
        } else {
            System.out.printf("%s needs %.2f more leva!", name, difference);
        }
    }
}
