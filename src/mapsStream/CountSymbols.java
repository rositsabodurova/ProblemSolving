package mapsStream;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] input = scanner.nextLine().toCharArray();
        Map<Character, Integer> symbols = new TreeMap<>();

        for (int i = 0; i < input.length; i++) {
            if (!symbols.containsKey(input[i])) {
                symbols.put(input[i], 1);
            } else {
                int currentCount = symbols.get(input[i]);
                symbols.put(input[i], currentCount + 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : symbols.entrySet()) {
            System.out.printf("%c: %d time/s%n", entry.getKey(), entry.getValue());
        }
    }
}
