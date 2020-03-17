package mapsStream;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int commandCount = Integer.parseInt(scanner.nextLine());

        Map<String, String> cars = new LinkedHashMap<>();

        for (int i = 0; i < commandCount; i++) {
            String[] carInfo = scanner.nextLine().split(" ");
            //case: register
            if (carInfo[0].equals("register")) {
                if (cars.containsKey(carInfo[1])) {
                    System.out.printf("ERROR: already registered with plate number %s%n", carInfo[2]);
                } else {
                    cars.put(carInfo[1], carInfo[2]);
                    System.out.printf("%s registered %s successfully%n", carInfo[1], carInfo[2]);
                }
                //case: unregister
            } else if (carInfo[0].equals("unregister")) {
                if (cars.containsKey(carInfo[1])) {
                    cars.remove(carInfo[1]);
                    System.out.printf("%s unregistered successfully%n", carInfo[1]);
                } else {
                    System.out.printf("ERROR: user %s not found%n", carInfo[1]);
                }
            }
        }
        cars.forEach((k, v) -> System.out.printf("%s => %s%n", k, v));
    }
}
