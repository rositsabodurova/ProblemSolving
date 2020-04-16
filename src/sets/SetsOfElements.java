package sets;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class SetsOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstSize = scanner.nextInt();
        int secondSize = scanner.nextInt();
        scanner.nextLine();

        Set<Integer> firstSet = new LinkedHashSet<>();
        Set<Integer> secondSet = new LinkedHashSet<>();
        Set<Integer> coincidenceSet = new LinkedHashSet<>();


        for (int i = 0; i < firstSize; i++) {
            firstSet.add(Integer.parseInt(scanner.nextLine()));
        }
        for (int i = 0; i < secondSize; i++) {
            secondSet.add(Integer.parseInt(scanner.nextLine()));
        }

        if (firstSize >= secondSize) {
            for (Integer number : firstSet) {
                if (secondSet.contains(number)) {
                    coincidenceSet.add(number);
                }
            }
        } else {
            for (Integer number : secondSet) {
                if (firstSet.contains(number)) {
                    coincidenceSet.add(number);
                }
            }
        }
        for (Integer number : coincidenceSet) {
            System.out.print(number + " ");
        }
    }
}
