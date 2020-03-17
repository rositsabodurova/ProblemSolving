package mapsStream;

import java.util.*;

public class WordSynonyms {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numberPairs = Integer.parseInt(scanner.nextLine());

        Map<String, List<String>> wordSynonyms = new LinkedHashMap<>();

        for (int i = 0; i < numberPairs; i++) {
            String word = scanner.nextLine();
            String synonym = scanner.nextLine();

            List<String> currentSynonyms = wordSynonyms.get(word);
            if (currentSynonyms != null) {
                currentSynonyms.add(synonym);
            } else {
                currentSynonyms = new ArrayList<>();
                currentSynonyms.add(synonym);
                wordSynonyms.put(word, currentSynonyms);
            }
        }
        for (Map.Entry<String, List<String>> entry : wordSynonyms.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().toString().replace("[", "").replace("]", ""));
        }
    }
}
