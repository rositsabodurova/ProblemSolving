package programmingBasics.exams;

import java.util.Scanner;

public class WorldSnookerChampionship {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String championshipPhase = scanner.nextLine();
        String ticketType = scanner.nextLine();
        int ticketCount = Integer.parseInt(scanner.nextLine());

        char picture = scanner.next().charAt(0);
        double totalCost = 0;

        switch (championshipPhase) {
            case "Quarter final":
                if (ticketType.equals("Standard")) {
                    totalCost = ticketCount * 55.5;
                    if (totalCost > 4000) {
                        totalCost = totalCost * 0.75;
                    } else if (totalCost > 2500) {
                        totalCost = totalCost * 0.9;
                    }
                }
                if (ticketType.equals("Premium")) {
                    totalCost = ticketCount * 105.2;
                    if (totalCost > 4000) {
                        totalCost = totalCost * 0.75;
                    } else if (totalCost > 2500) {
                        totalCost = totalCost * 0.9;
                    }
                }
                if (ticketType.equals("VIP")) {
                    totalCost = ticketCount * 118.9;
                    if (totalCost > 4000) {
                        totalCost = totalCost * 0.75;
                    } else if (totalCost > 2500) {
                        totalCost = totalCost * 0.9;
                    }
                }
                break;
            case "Semi final":
                if (ticketType.equals("Standard")) {
                    totalCost = ticketCount * 75.88;
                    if (totalCost > 4000) {
                        totalCost = totalCost * 0.75;
                    } else if (totalCost > 2500) {
                        totalCost = totalCost * 0.9;
                    }
                }
                if (ticketType.equals("Premium")) {
                    totalCost = ticketCount * 125.22;
                    if (totalCost > 4000) {
                        totalCost = totalCost * 0.75;
                    } else if (totalCost > 2500) {
                        totalCost = totalCost * 0.9;
                    }
                }
                if (ticketType.equals("VIP")) {
                    totalCost = ticketCount * 300.4;
                    if (totalCost > 4000) {
                        totalCost = totalCost * 0.75;
                    } else if (totalCost > 2500) {
                        totalCost = totalCost * 0.9;
                    }
                }
                break;
            case "Final":
                if (ticketType.equals("Standard")) {
                    totalCost = ticketCount * 110.1;
                    if (totalCost > 4000) {
                        totalCost = totalCost * 0.75;
                    } else if (totalCost > 2500) {
                        totalCost = totalCost * 0.9;
                    }
                }
                if (ticketType.equals("Premium")) {
                    totalCost = ticketCount * 160.66;
                    if (totalCost > 4000) {
                        totalCost = totalCost * 0.75;
                    } else if (totalCost > 2500) {
                        totalCost = totalCost * 0.9;
                    }
                }
                if (ticketType.equals("VIP")) {
                    totalCost = ticketCount * 400;
                    if (totalCost > 4000) {
                        totalCost = totalCost * 0.75;
                    } else if (totalCost > 2500) {
                        totalCost = totalCost * 0.9;
                    }
                }
                break;
        }

        if (picture == 'Y' && totalCost <= 4000) {
            totalCost = totalCost + ticketCount * 40;
        }
        System.out.printf("%.2f", totalCost);
    }
}
