package sets;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfIterations = Integer.parseInt(scanner.nextLine());

        Set<String> periodicTable = new TreeSet<>();

        for (int i = 0; i < numOfIterations; i++) {
            String[] input = scanner.nextLine().split("\\s");
            for (String element : input) {
                periodicTable.add(element);
            }
        }
        for (String element : periodicTable) {
            System.out.print(element + " ");
        }
    }
}
