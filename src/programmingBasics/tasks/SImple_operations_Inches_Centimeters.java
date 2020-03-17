package programmingBasics.tasks;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SImple_operations_Inches_Centimeters {
    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("#.###");
        Scanner scanner = new Scanner(System.in);
        double inches = Double.parseDouble(scanner.nextLine());

        double centimeters = inches * 2.54;
        System.out.println(df.format(centimeters));
    }
}
