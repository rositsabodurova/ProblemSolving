package programmingBasics.tasks;

import java.util.Scanner;

public class RadiansToDegrees {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double radian = Double.parseDouble(scanner.nextLine());

        double degree = (radian * 180) / Math.PI;
        System.out.println(Math.round(degree));
    }
}
