package programmingBasics.tasks;

import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double record = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double secondsPerMeter = Double.parseDouble(scanner.nextLine());

        double cleanTime = distance * secondsPerMeter;
        double numberDelays = Math.floor(distance / 15);
        double totalTime = cleanTime + numberDelays * 12.5;
        double difference = totalTime - record;

        if (totalTime < record) {
            System.out.printf(" Yes, he succeeded! The new world record is %.2f seconds.", totalTime);
        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", difference);
        }
    }
}
