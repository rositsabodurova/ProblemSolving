package programmingBasics.tasks;

import java.util.Scanner;

public class TimePlus15Minutes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int startHour = Integer.parseInt(scanner.nextLine());
        int startMinutes = Integer.parseInt(scanner.nextLine());

        int totalMinutes = startHour * 60 + startMinutes + 15;
        int finalHour = totalMinutes / 60;
        int finalMinutes = totalMinutes % 60;

        if (finalHour == 24) {
            finalHour = 0;
        }

        if (finalMinutes < 10) {
            System.out.println(finalHour + ":0" + finalMinutes);
        } else {
            System.out.println(finalHour + ":" + finalMinutes);
        }
    }
}
