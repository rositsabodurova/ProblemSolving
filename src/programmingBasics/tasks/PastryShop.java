package programmingBasics.tasks;

import java.util.Scanner;

public class PastryShop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String typeOfPastry = scanner.nextLine();
        int pastryCount = Integer.parseInt(scanner.nextLine());
        int day = Integer.parseInt(scanner.nextLine());

        double totalSum = 0;

        switch (typeOfPastry) {
            case "Cake":
                if (day <= 15) {
                    double cakePrice = 24;
                    totalSum = pastryCount * cakePrice;
                    if (totalSum >= 100 && totalSum <= 200) {
                        totalSum = totalSum * 0.85;
                        totalSum = totalSum * 0.9;
                        System.out.printf("%.2f", totalSum);
                    } else if (totalSum > 200) {
                        totalSum = totalSum * 0.75;
                        totalSum = totalSum * 0.9;
                        System.out.printf("%.2f", totalSum);
                    } else {
                        totalSum = totalSum * 0.9;
                        System.out.printf("%.2f", totalSum);
                    }
                } else if (day > 15 && day <= 22) {
                    double cakePrice = 28.7;
                    totalSum = pastryCount * cakePrice;
                    if (totalSum >= 100 && totalSum <= 200) {
                        totalSum = totalSum * 0.85;
                        System.out.printf("%.2f", totalSum);
                    } else if (totalSum > 200) {
                        totalSum = totalSum * 0.75;
                        System.out.printf("%.2f", totalSum);
                    } else {
                        totalSum = totalSum * 0.9;
                        System.out.printf("%.2f", totalSum);
                    }
                } else if (day > 22) {
                    double cakePrice = 28.7;
                    totalSum = pastryCount * cakePrice;
                    System.out.printf("%.2f", totalSum);
                }
                break;
            case "Souffle":
                if (day <= 15) {
                    double cakePrice = 6.66;
                    totalSum = pastryCount * cakePrice;
                    if (totalSum >= 100 && totalSum <= 200) {
                        totalSum = totalSum * 0.85;
                        totalSum = totalSum * 0.9;
                        System.out.printf("%.2f", totalSum);
                    } else if (totalSum > 200) {
                        totalSum = totalSum * 0.75;
                        totalSum = totalSum * 0.9;
                        System.out.printf("%.2f", totalSum);
                    } else {
                        totalSum = totalSum * 0.9;
                        System.out.printf("%.2f", totalSum);
                    }
                } else if (day > 15 && day <= 22) {
                    double cakePrice = 9.8;
                    totalSum = pastryCount * cakePrice;
                    if (totalSum >= 100 && totalSum <= 200) {
                        totalSum = totalSum * 0.85;
                        System.out.printf("%.2f", totalSum);
                    } else if (totalSum > 200) {
                        totalSum = totalSum * 0.75;
                        System.out.printf("%.2f", totalSum);
                    } else {
                        totalSum = totalSum * 0.9;
                    }
                } else if (day > 22) {
                    double cakePrice = 9.8;
                    totalSum = pastryCount * cakePrice;
                    System.out.printf("%.2f", totalSum);
                }
                break;
            case "Baklava":
                if (day <= 15) {
                    double cakePrice = 12.6;
                    totalSum = pastryCount * cakePrice;
                    if (totalSum >= 100 && totalSum <= 200) {
                        totalSum = totalSum * 0.85;
                        totalSum = totalSum * 0.9;
                        System.out.printf("%.2f", totalSum);
                    } else if (totalSum > 200) {
                        totalSum = totalSum * 0.75;
                        totalSum = totalSum * 0.9;
                        System.out.printf("%.2f", totalSum);
                    } else {
                        totalSum = totalSum * 0.9;
                        System.out.printf("%.2f", totalSum);
                    }
                } else if (day > 15 && day <= 22) {
                    double cakePrice = 16.98;
                    totalSum = pastryCount * cakePrice;
                    if (totalSum >= 100 && totalSum <= 200) {
                        totalSum = totalSum * 0.85;
                        System.out.printf("%.2f", totalSum);
                    } else if (totalSum > 200) {
                        totalSum = totalSum * 0.75;
                        System.out.printf("%.2f", totalSum);
                    } else {
                        totalSum = totalSum * 0.9;
                        System.out.printf("%.2f", totalSum);
                    }
                } else if (day > 22) {
                    double cakePrice = 16.98;
                    totalSum = pastryCount * cakePrice;
                    System.out.printf("%.2f", totalSum);
                }
                break;
        }
    }
}
