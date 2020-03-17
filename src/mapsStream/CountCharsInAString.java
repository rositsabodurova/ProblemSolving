package mapsStream;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInAString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char[] charArr = scanner.nextLine().toCharArray();

        Map<Character, Integer> count = new LinkedHashMap<>();

        for (char c : charArr) {
            if (c != ' ') {
                if (!count.containsKey(c)) {
                    count.put(c, 1);
                } else {
                    count.put(c, count.get(c) + 1);
                }
            }
        }
        for (Map.Entry<Character, Integer> entry : count.entrySet()) {
            System.out.printf("%c -> %d%n", entry.getKey(), entry.getValue());
        }
    }
}
