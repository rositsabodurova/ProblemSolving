package programmingBasics.exams;

import java.util.Scanner;

public class Bus {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int passengerCount = Integer.parseInt(scanner.nextLine());
        int stopsCount = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= stopsCount; i++) {
            int passengersOff = Integer.parseInt(scanner.nextLine());
            int passengersOn = Integer.parseInt(scanner.nextLine());
            passengerCount = passengerCount + passengersOn - passengersOff;
            if (i % 2 != 0) {
                passengerCount += 2;
            } else {
                passengerCount -= 2;
            }
        }

        System.out.printf("The final number of passengers is : %d", passengerCount);
    }
}
