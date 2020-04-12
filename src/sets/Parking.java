package sets;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Parking {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Set<String> parking = new LinkedHashSet<>();
        String input = scanner.nextLine();

        while (!"END".equals(input)) {
            String[] command = input.split(", ");
            String direction = command[0];
            String plateNumber = command[1];
            if ("IN".equals(direction)) {
                parking.add(plateNumber);
            } else if ("OUT".equals(direction)) {
                parking.remove(plateNumber);
            }
            input = scanner.nextLine();
        }
        for (String car : parking) {
            System.out.println(car);
        }
        if (parking.isEmpty()) {
            System.out.println("Parking Lot is Empty");
        }
    }
}
