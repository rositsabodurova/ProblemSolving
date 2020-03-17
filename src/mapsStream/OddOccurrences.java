package mapsStream;

import java.util.*;

public class OddOccurrences {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split(" ");

        Map<String, Integer> counts = new LinkedHashMap<>();

        for (String word : words) {
            String wordInLower = word.toLowerCase();
            if (counts.containsKey(wordInLower)) {
                counts.put(wordInLower, counts.get(wordInLower) + 1);
            } else {
                counts.put(wordInLower, 1);
            }
        }
        List<String> odds = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : counts.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                odds.add(entry.getKey());
            }
        }
        System.out.println(String.join(", ", odds));
    }
}
