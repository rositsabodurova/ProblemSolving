package mapsStream;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Map<String, Integer> sum = new LinkedHashMap<>();

        while (!"stop".equals(input)) {
            int quantity = Integer.parseInt(scanner.nextLine());
            if (sum.containsKey(input)) {
                sum.put(input, sum.get(input) + quantity);
            } else {
                sum.put(input, quantity);
            }
            input = scanner.nextLine();
        }
        for (Map.Entry<String, Integer> entry : sum.entrySet()) {
            System.out.printf("%s -> %d%n", entry.getKey(), entry.getValue());
        }
    }
}
