package programmingBasics.tasks;

import java.util.Scanner;

public class CookieFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        boolean hasEggs = false;
        boolean hasFlour = false;
        boolean hasSugar = false;

        for (int i = 1; i <= n; i++) {

            String input = scanner.nextLine();

            while (!input.equalsIgnoreCase("Bake!")) {

                switch (input) {
                    case "eggs":
                        hasEggs = true;
                        break;
                    case "flour":
                        hasFlour = true;
                        break;
                    case "sugar":
                        hasSugar = true;
                    default:
                        break;
                }
                input = scanner.nextLine();
            }
            if (hasEggs && hasFlour && hasSugar) {
                System.out.printf("Baking batch number %d...%n", i);
                hasEggs = false;
                hasFlour = false;
                hasSugar = false;
            } else {
                System.out.println("The batter should contain flour, eggs and sugar!");
                i--;
            }
        }
    }
}
