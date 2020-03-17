package programmingBasics.exams;

import java.util.Scanner;

public class FootballSouvenirs {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String team = scanner.nextLine();
        String souvenirType = scanner.nextLine();
        int souvenirCount = Integer.parseInt(scanner.nextLine());

        double sum = 0;
        boolean isValidCountry = true;
        boolean isValidStock = true;

        switch (team) {
            case "Argentina":
                if (souvenirType.equals("flags")) {
                    sum = souvenirCount * 3.25;
                } else if (souvenirType.equals("caps")) {
                    sum = souvenirCount * 7.2;
                } else if (souvenirType.equals("posters")) {
                    sum = souvenirCount * 5.1;
                } else if (souvenirType.equals("stickers")) {
                    sum = souvenirCount * 1.25;
                } else {
                    isValidStock = false;
                    System.out.println("Invalid stock!");
                }
                break;
            case "Brazil":
                if (souvenirType.equals("flags")) {
                    sum = souvenirCount * 4.2;
                } else if (souvenirType.equals("caps")) {
                    sum = souvenirCount * 8.5;
                } else if (souvenirType.equals("posters")) {
                    sum = souvenirCount * 5.35;
                } else if (souvenirType.equals("stickers")) {
                    sum = souvenirCount * 1.2;
                } else {
                    isValidStock = false;
                    System.out.println("Invalid stock!");
                }
                break;
            case "Croatia":
                if (souvenirType.equals("flags")) {
                    sum = souvenirCount * 2.75;
                } else if (souvenirType.equals("caps")) {
                    sum = souvenirCount * 6.9;
                } else if (souvenirType.equals("posters")) {
                    sum = souvenirCount * 4.95;
                } else if (souvenirType.equals("stickers")) {
                    sum = souvenirCount * 1.1;
                } else {
                    isValidStock = false;
                    System.out.println("Invalid stock!");
                }
                break;
            case "Denmark":
                if (souvenirType.equals("flags")) {
                    sum = souvenirCount * 3.1;
                } else if (souvenirType.equals("caps")) {
                    sum = souvenirCount * 6.5;
                } else if (souvenirType.equals("posters")) {
                    sum = souvenirCount * 4.8;
                } else if (souvenirType.equals("stickers")) {
                    sum = souvenirCount * 0.9;
                } else {
                    isValidStock = false;
                    System.out.println("Invalid stock!");
                }
                break;
            default:
                isValidCountry = false;
                System.out.println("Invalid country!");
                break;
        }
        if (isValidCountry && isValidStock) {
            System.out.printf("Pepi bought %d %s of %s for %.2f lv.", souvenirCount, souvenirType, team, sum);
        }
    }
}
