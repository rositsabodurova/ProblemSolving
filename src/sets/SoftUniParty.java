package sets;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SoftUniParty {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Set<String> vip = new TreeSet<>();
        Set<String> regular = new TreeSet<>();

        while (!"PARTY".equals(input)) {
            char firstSymbol = input.charAt(0);

            if (Character.isDigit(firstSymbol)) {
                vip.add(input);
            } else if (Character.isLetter(firstSymbol)) {
                regular.add(input);
            }
            input = scanner.nextLine();
        }

        while (!"END".equals(input)) {
            char firstSymbol = input.charAt(0);

            if (Character.isDigit(firstSymbol)) {
                vip.remove(input);
            } else if (Character.isLetter(firstSymbol)) {
                regular.remove(input);
            }
            input = scanner.nextLine();
        }

        System.out.println(vip.size() + regular.size());

        for (String guest : vip) {
            System.out.println(guest);
        }

        for (String guest : regular) {
            System.out.println(guest);
        }
    }
}
