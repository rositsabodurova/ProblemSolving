package programmingBasics.tasks;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double needMoney = Double.parseDouble(scanner.nextLine());
        double currentMoney = Double.parseDouble(scanner.nextLine());

        int totalDays = 0;
        int totalSpendDays = 0;

        while (currentMoney < needMoney) {
            String input = scanner.nextLine();
            double sum = Double.parseDouble(scanner.nextLine());
            totalDays++;
            if (input.equals("save")) {
                totalSpendDays = 0;
                currentMoney += sum;
            } else if (input.equals("spend")) {
                totalSpendDays++;
                currentMoney -= sum;
                if (currentMoney < 0) {
                    currentMoney = 0;
                }
            }
            if (totalSpendDays == 5) {
                System.out.println("You can't save the money.");
                System.out.printf("%d", totalDays);
                break;
            }
        }
        if (currentMoney >= needMoney) {
            System.out.printf("You saved the money for %d days.", totalDays);
        }
    }
}
