package mapsStream;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class LegendaryFarming {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> specialItems = new TreeMap<>();
        Map<String, Integer> junkItems = new TreeMap<>();

        specialItems.put("shards", 0);
        specialItems.put("fragments", 0);
        specialItems.put("motes", 0);

        boolean isObtained = false;
        while (!isObtained) {
            String[] tokens = scanner.nextLine().toLowerCase().split(" ");

            for (int i = 0; i < tokens.length - 1; i += 2) {
                if (specialItems.containsKey(tokens[i + 1])) {
                    specialItems.put(tokens[i + 1], specialItems.get(tokens[i + 1]) + Integer.parseInt(tokens[i]));
                    if (specialItems.get("shards") >= 250) {
                        System.out.println("Shadowmourne obtained!");
                        specialItems.put("shards", specialItems.get("shards") - 250);
                        isObtained = true;
                        break;
                    } else if (specialItems.get("fragments") >= 250) {
                        System.out.println("Valanyr obtained!");
                        specialItems.put("fragments", specialItems.get("fragments") - 250);
                        isObtained = true;
                        break;
                    } else if (specialItems.get("motes") >= 250) {
                        System.out.println("Dragonwrath obtained!");
                        specialItems.put("motes", specialItems.get("motes") - 250);
                        isObtained = true;
                        break;
                    }
                } else {
                    if (!junkItems.containsKey(tokens[i + 1])) {
                        junkItems.put(tokens[i + 1], Integer.parseInt(tokens[i]));
                    } else {
                        junkItems.put(tokens[i + 1], junkItems.get(tokens[i + 1]) + Integer.parseInt(tokens[i]));
                    }
                }
            }
        }

        specialItems.entrySet()
                .stream()
                .sorted((a, b) -> Integer.compare(b.getValue(), (a.getValue())))
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
        junkItems.forEach((k, v) -> System.out.printf("%s: %d%n", k, v));

    }
}
