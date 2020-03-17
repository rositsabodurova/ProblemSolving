package programmingBasics.tasks;

import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int heigth = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        int freeSpace = width * length * heigth;

        while (!input.equals("Done")) {
            int boxes = Integer.parseInt(input);
            freeSpace = freeSpace - boxes;
            if (freeSpace <= 0) {
                System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(freeSpace));
                break;
            }
            input = scanner.nextLine();
        }
        if (input.equals("Done")) {
            System.out.printf("%d Cubic meters left.", Math.abs(freeSpace));
        }
    }
}
