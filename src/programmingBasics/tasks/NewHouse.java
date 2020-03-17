package programmingBasics.tasks;

import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String typeOfFlower = scanner.nextLine();
        int flowersCount = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double flowerCost = 0;

        switch (typeOfFlower) {
            case "Roses":
                flowerCost = flowersCount * 5;
                if (flowersCount > 80) {
                    flowerCost = flowerCost * 0.9;
                }
                break;
            case "Dahlias":
                flowerCost = flowersCount * 3.8;
                if (flowersCount > 90) {
                    flowerCost = flowerCost * 0.85;
                }
                break;
            case "Tulips":
                flowerCost = flowersCount * 2.8;
                if (flowersCount > 80) {
                    flowerCost = flowerCost * 0.85;
                }
                break;
            case "Narcissus":
                flowerCost = flowersCount * 3;
                if (flowersCount < 120) {
                    flowerCost = flowerCost * 1.15;
                }
                break;
            case "Gladiolus":
                flowerCost = flowersCount * 2.5;
                if (flowersCount < 80) {
                    flowerCost = flowerCost * 1.2;
                }
        }
        double difference = Math.abs(budget - flowerCost);
        if (budget >= flowerCost) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", flowersCount, typeOfFlower, difference);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", difference);
        }
    }
}
