package programmingBasics.exams;

import java.util.Scanner;

public class StadiumIncome {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sectors = Integer.parseInt(scanner.nextLine());
        int stadiumCapacity = Integer.parseInt(scanner.nextLine());
        double ticketPrice = Double.parseDouble(scanner.nextLine());

        double totalIncome = stadiumCapacity * ticketPrice;
        double sectorMoney = totalIncome / sectors;
        double difference = totalIncome - sectorMoney * 0.75;
        double charityMoney = 1.0 / 8 * difference;

        System.out.printf("Total income - %.2f BGN%n", totalIncome);
        System.out.printf("Money for charity - %.2f BGN", charityMoney);
    }
}
