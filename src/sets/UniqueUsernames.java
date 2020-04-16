package sets;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfIterations = Integer.parseInt(scanner.nextLine());
        Set<String> usernames = new LinkedHashSet<>();

        for (int i = 0; i < numberOfIterations; i++) {
            usernames.add(scanner.nextLine());
        }
        for (String name : usernames) {
            System.out.println(name);
        }
    }
}
