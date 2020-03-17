package programmingBasics.tasks;

import java.util.Scanner;

public class FruitOrVegetable {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String inputFruit = scanner.nextLine();

        boolean isFruit = inputFruit.equals("banana") ||
                inputFruit.equals("apple") ||
                inputFruit.equals("kiwi") ||
                inputFruit.equals("cherry") ||
                inputFruit.equals("lemon") ||
                inputFruit.equals("grapes");

        boolean isVegetable = inputFruit.equals("tomato") ||
                inputFruit.equals("cucumber") ||
                inputFruit.equals("pepper") ||
                inputFruit.equals("carrot");

        if (isFruit) {
            System.out.println("fruit");
        } else if (isVegetable) {
            System.out.println("vegetable");
        } else {
            System.out.println("unknown");
        }

    }
}
