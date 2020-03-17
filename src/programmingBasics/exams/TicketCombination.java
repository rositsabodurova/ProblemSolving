package programmingBasics.exams;

import java.util.Scanner;

public class TicketCombination {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int counter = 0;

        for (char first = 'B'; first <= 'L'; first += 2) {
            for (char second = 'f'; second >= 'a'; second--) {
                for (char third = 'A'; third <= 'C'; third++) {
                    for (int fourth = 1; fourth <= 10; fourth++) {
                        for (int fifth = 10; fifth >= 1; fifth--) {
                            counter++;
                            if (counter == n) {
                                System.out.printf("Ticket combination: %c%c%c%d%d%n", first, second, third, fourth, fifth);
                                int prize = first + second + third + fourth + fifth;
                                System.out.printf("Prize: %d lv.", prize);
                                break;
                            }
                        }
                    }
                }
            }
        }
    }
}
