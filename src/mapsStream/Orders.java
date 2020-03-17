package mapsStream;

import java.util.*;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Map<String, Double> itemsCount = new LinkedHashMap<>();
        Map<String, Double> itemsPrices = new HashMap<>();

        while (!"buy".equals(input)) {
            String[] productInfo = input.split(" ");

            if (!itemsCount.containsKey(productInfo[0])) {
                itemsCount.put(productInfo[0], Double.parseDouble(productInfo[2]));
                itemsPrices.put(productInfo[0], Double.parseDouble(productInfo[1]));
            } else {
                itemsCount.put(productInfo[0], itemsCount.get(productInfo[0]) + Double.parseDouble(productInfo[2]));
                itemsPrices.put(productInfo[0], Double.parseDouble(productInfo[1]));
            }
            input = scanner.nextLine();
        }
        for (Map.Entry<String, Double> entry : itemsCount.entrySet()) {
            itemsCount.put(entry.getKey(), entry.getValue() * itemsPrices.get(entry.getKey()));
        }

        itemsCount.forEach((k, v) -> System.out.printf("%s -> %.2f%n", k, v));
    }
}
