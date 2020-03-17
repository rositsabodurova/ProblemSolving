package programmingBasics.exams;

import java.util.Scanner;

public class BachelorParty {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int singerFee = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();

        int totalMoney = 0;
        int guestsCount = 0;

        while (!command.equals("The restaurant is full")) {
            int groupCount = Integer.parseInt(command);
            int groupMoney = 0;
            if (groupCount < 5) {
                groupMoney = groupCount * 100;
            } else {
                groupMoney = groupCount * 70;
            }
            totalMoney += groupMoney;
            guestsCount += groupCount;
            command = scanner.nextLine();
        }

        if (totalMoney >= singerFee) {
            int difference = totalMoney - singerFee;
            System.out.printf("You have %d guests and %d leva left.", guestsCount, difference);
        } else {
            System.out.printf("You have %d guests and %d leva income, but no singer.", guestsCount, totalMoney);
        }
    }
}
