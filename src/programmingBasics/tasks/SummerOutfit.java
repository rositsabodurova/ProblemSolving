package programmingBasics.tasks;

import java.util.Scanner;

public class SummerOutfit {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int temperature = Integer.parseInt(scanner.nextLine());
        String timeOfDay = scanner.nextLine();

        String outfit = "";
        String shoes = "";

        switch (timeOfDay) {
            case "Morning":
                if (temperature >= 10 && temperature <= 18) {
                    outfit = "Sweatshirt";
                    shoes = "Sneakers";
                    System.out.printf("It's %d degrees, get your %s and %s.", temperature, outfit, shoes);
                } else if (temperature > 18 && temperature <= 24) {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                    System.out.printf("It's %d degrees, get your %s and %s.", temperature, outfit, shoes);
                } else if (temperature >= 25) {
                    outfit = "T-Shirt";
                    shoes = "Sandals";
                    System.out.printf("It's %d degrees, get your %s and %s.", temperature, outfit, shoes);
                }
                break;
            case "Afternoon":
                if (temperature >= 10 && temperature <= 18) {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                    System.out.printf("It's %d degrees, get your %s and %s.", temperature, outfit, shoes);
                } else if (temperature > 18 && temperature <= 24) {
                    outfit = "T-Shirt";
                    shoes = "Sandals";
                    System.out.printf("It's %d degrees, get your %s and %s.", temperature, outfit, shoes);
                } else if (temperature >= 25) {
                    outfit = "Swim Suit";
                    shoes = "Barefoot";
                    System.out.printf("It's %d degrees, get your %s and %s.", temperature, outfit, shoes);
                }
                break;
            case "Evening":
                outfit = "Shirt";
                shoes = "Moccasins";
                System.out.printf("It's %d degrees, get your %s and %s.", temperature, outfit, shoes);
                break;
        }
    }
}
