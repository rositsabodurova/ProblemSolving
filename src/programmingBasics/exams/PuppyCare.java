package programmingBasics.exams;

import java.util.Scanner;

public class PuppyCare {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int foodBoughtKg = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        int foodInGrams = foodBoughtKg * 1000;

        while (!input.equals("Adopted")) {
            int foodPerMeal = Integer.parseInt(input);
            foodInGrams -= foodPerMeal;
            input = scanner.nextLine();
        }
        if (foodInGrams >= 0) {
            System.out.printf("Food is enough! Leftovers: %d grams.", foodInGrams);
        } else {
            System.out.printf("Food is not enough. You need %d grams more.", Math.abs(foodInGrams));
        }
    }
}
