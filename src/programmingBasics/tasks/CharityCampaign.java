package programmingBasics.tasks;

import java.util.Scanner;

public class CharityCampaign {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        int cooks = Integer.parseInt(scanner.nextLine());
        int cakesNumber = Integer.parseInt(scanner.nextLine());
        int wafflesNumber = Integer.parseInt(scanner.nextLine());
        int pancakesNumber = Integer.parseInt(scanner.nextLine());

        double cakesProfitByOne = cakesNumber * 45;
        double wafflesProfitByOne = wafflesNumber * 5.8;
        double pancakeProfitByOne = pancakesNumber * 3.2;

        double cakeProfitByAll = cakesProfitByOne * cooks;
        double waffleProfitByAll = wafflesProfitByOne * cooks;
        double pancakeProfitByAll = pancakeProfitByOne * cooks;

        double profitBTotal = (cakeProfitByAll + waffleProfitByAll + pancakeProfitByAll) * days;
        double expenses = profitBTotal / 8;
        double profitFinal = profitBTotal - expenses;

        System.out.printf("%.2f", profitFinal);
    }
}
