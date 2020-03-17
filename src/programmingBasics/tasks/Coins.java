package programmingBasics.tasks;

import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double change = Double.parseDouble(scanner.nextLine());

        change = Math.floor(change * 100);
        int coinsCount = 0;

        while (change > 0) {
            if (change >= 200) {
                coinsCount++;
                change = change - 200;
            } else if (change >= 100) {
                coinsCount++;
                change -= 100;
            } else if (change >= 50) {
                coinsCount++;
                change -= 50;
            } else if (change >= 20) {
                coinsCount++;
                change -= 20;
            } else if (change >= 10) {
                coinsCount++;
                change -= 10;
            } else if (change >= 5) {
                coinsCount++;
                change -= 5;
            } else if (change >= 2) {
                coinsCount++;
                change -= 2;
            } else if (change >= 1) {
                coinsCount++;
                change -= 1;
            }
        }
        System.out.println(coinsCount);
    }
}
