package programmingBasics.exams;

import java.util.Scanner;

public class SeaTrip {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double moneyFoodPerDay = Double.parseDouble(scanner.nextLine());
        double moneySouvenirsPerDay = Double.parseDouble(scanner.nextLine());
        double moneyHotelPerDay = Double.parseDouble(scanner.nextLine());

        double fuelMoney = (420.0 / 100 * 7) * 1.85;
        double moneyHotelDay1 = moneyHotelPerDay * 0.9;
        double moneyHotelDay2 = moneyHotelPerDay * 0.85;
        double moneyHotelDay3 = moneyHotelPerDay * 0.8;

        double totalHotelMoney = moneyHotelDay1 + moneyHotelDay2 + moneyHotelDay3;
        double totalSum = fuelMoney + totalHotelMoney + (moneyFoodPerDay * 3) + (moneySouvenirsPerDay * 3);
        System.out.printf("Money needed: %.2f", totalSum);
    }
}
