package mapsStream;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, String> phonebook = new LinkedHashMap<>();

        while (!"search".equals(input)) {
            String[] entry = input.split("-");
            String name = entry[0];
            String phoneNumber = entry[1];
            phonebook.put(name, phoneNumber);
            input = scanner.nextLine();
        }
        input = scanner.nextLine();

        while (!"stop".equals(input)) {
            if (phonebook.containsKey(input)) {
                System.out.printf("%s -> %s%n", input, phonebook.get(input));
            } else {
                System.out.printf("Contact %s does not exist.%n", input);
            }
            input = scanner.nextLine();
        }
    }
}
