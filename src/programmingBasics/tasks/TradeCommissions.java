package programmingBasics.tasks;

import java.util.Scanner;

public class TradeCommissions {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String city = scanner.nextLine();
        double volume = Double.parseDouble(scanner.nextLine());

        switch (city) {
            case "Sofia":
                if (volume >= 0 && volume <= 500) {
                    System.out.printf("%.2f", volume * 0.05);
                } else if (volume > 500 && volume <= 1000) {
                    System.out.printf("%.2f", volume * 0.07);
                } else if (volume > 1000 && volume <= 10000) {
                    System.out.printf("%.2f", volume * 0.08);
                } else if (volume > 10000) {
                    System.out.printf("%.2f", volume * 0.12);
                } else {
                    System.out.println("error");
                }
                break;
            case "Varna":
                if (volume >= 0 && volume <= 500) {
                    System.out.printf("%.2f", volume * 0.045);
                } else if (volume > 500 && volume <= 1000) {
                    System.out.printf("%.2f", volume * 0.075);
                } else if (volume > 1000 && volume <= 10000) {
                    System.out.printf("%.2f", volume * 0.1);
                } else if (volume > 10000) {
                    System.out.printf("%.2f", volume * 0.13);
                } else {
                    System.out.println("error");
                }
                break;
            case "Plovdiv":
                if (volume >= 0 && volume <= 500) {
                    System.out.printf("%.2f", volume * 0.055);
                } else if (volume > 500 && volume <= 1000) {
                    System.out.printf("%.2f", volume * 0.08);
                } else if (volume > 1000 && volume <= 10000) {
                    System.out.printf("%.2f", volume * 0.12);
                } else if (volume > 10000) {
                    System.out.printf("%.2f", volume * 0.145);
                } else {
                    System.out.println("error");
                }
                break;
            default:
                System.out.println("error");
        }
    }
}
