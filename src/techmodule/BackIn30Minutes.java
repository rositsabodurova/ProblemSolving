package techmodule;

import java.util.Scanner;

public class BackIn30Minutes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int totalMinutes = hours * 60 + minutes + 30;

        int finalHours = totalMinutes / 60;
        int finalMins = totalMinutes % 60;

        if (finalHours == 24) {
            finalHours = 0;
        }

        System.out.println(String.format("%d:%02d", finalHours, finalMins));
    }
}
