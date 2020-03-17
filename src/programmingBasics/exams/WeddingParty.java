package programmingBasics.exams;

import java.util.Scanner;

public class WeddingParty {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int guestsCount = Integer.parseInt(scanner.nextLine());
        int budgetForeseen = Integer.parseInt(scanner.nextLine());

        int totalCost = guestsCount * 20;
        if (totalCost > budgetForeseen) {
            System.out.printf("They won't have enough money to pay the covert. They will need %d lv more.", totalCost - budgetForeseen);
        } else {
            int difference = budgetForeseen - totalCost;
            double fireworks = difference * 0.4;
            double charity = difference - fireworks;

            System.out.printf("Yes! %.0f lv are for fireworks and %.0f lv are for donation.", fireworks, charity);
        }
    }
}
