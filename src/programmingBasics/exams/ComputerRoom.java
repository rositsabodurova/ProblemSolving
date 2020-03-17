package programmingBasics.exams;

import java.util.Scanner;

public class ComputerRoom {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine();
        int hoursCount = Integer.parseInt(scanner.nextLine());
        int peopleCount = Integer.parseInt(scanner.nextLine());
        String partOfDay = scanner.nextLine();

        double totalMoney = 0;

        if (month.equalsIgnoreCase("march") || month.equalsIgnoreCase("april") || month.equalsIgnoreCase("may")) {
            if (partOfDay.equalsIgnoreCase("day")) {
                totalMoney = hoursCount * 10.5 * peopleCount;
            } else if (partOfDay.equalsIgnoreCase("night")) {
                totalMoney = hoursCount * 8.4 * peopleCount;
            }
        } else if (month.equalsIgnoreCase("august") || month.equalsIgnoreCase("june") || month.equalsIgnoreCase("july")) {
            if (partOfDay.equalsIgnoreCase("day")) {
                totalMoney = hoursCount * 12.6 * peopleCount;
            } else if (partOfDay.equalsIgnoreCase("night")) {
                totalMoney = hoursCount * 10.2 * peopleCount;
            }
        }
        if (peopleCount >= 4) {
            totalMoney = totalMoney * 0.9;
        }
        if (hoursCount >= 5) {
            totalMoney = totalMoney * 0.5;
        }
        System.out.printf("Price per person for one hour: %.2f%n", totalMoney / peopleCount / hoursCount);
        System.out.printf("Total cost of the visit: %.2f", totalMoney);
    }
}
