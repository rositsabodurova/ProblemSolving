package mapsStream;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> emails = new LinkedHashMap<>();

        while (true) {
            String name = scanner.nextLine();
            if ("stop".equals(name)) {
                break;
            }
            String email = scanner.nextLine();
            String[] emailWorking = email.split("\\.");
            if (!emailWorking[1].equals("us")
                    && !emailWorking[1].equals("uk")
                    && !emailWorking[1].equals("com")) {
                emails.put(name, email);
            }
        }
        for (Map.Entry<String, String> entry : emails.entrySet()) {
            System.out.printf("%s -> %s%n", entry.getKey(), entry.getValue());
        }
    }
}
