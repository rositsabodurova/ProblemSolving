package techmodule;

import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double moneyAvailable = Double.parseDouble(scanner.nextLine());
        int studentsCount = Integer.parseInt(scanner.nextLine());
        double lightSabrePrice = Double.parseDouble(scanner.nextLine());
        double robePrice = Double.parseDouble(scanner.nextLine());
        double beltPrice = Double.parseDouble(scanner.nextLine());

        int freeBelts = studentsCount / 6;
        double moneyNeeded = lightSabrePrice * Math.ceil(studentsCount * 1.1) + robePrice * studentsCount + beltPrice * (studentsCount - freeBelts);

        if (moneyAvailable >= moneyNeeded) {
            System.out.printf("The money is enough - it would cost %.2flv.", moneyNeeded);
        } else {
            System.out.printf("Ivan Cho will need %.2flv more.", moneyNeeded - moneyAvailable);
        }
    }
}
