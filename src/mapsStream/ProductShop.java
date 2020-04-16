package mapsStream;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ProductShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Map<String, Double>> stores = new TreeMap<>();
        String input = scanner.nextLine();


        while (!"Revision".equals(input)) {
            String[] command = input.split(", ");
            String shop = command[0];
            String product = command[1];
            double price = Double.parseDouble(command[2]);
            if (!stores.containsKey(shop)) {
                Map<String, Double> currentStore = new LinkedHashMap<>();
                currentStore.put(product, price);
                stores.put(shop, currentStore);
            } else {
                stores.get(shop).put(product, price);
            }
            input = scanner.nextLine();
        }
        for (Map.Entry<String, Map<String, Double>> shop : stores.entrySet()) {
            System.out.printf("%s->%n", shop.getKey());
            for (Map.Entry<String, Double> product : shop.getValue().entrySet()) {
                System.out.printf("Product: %s, Price: %.1f%n", product.getKey(), product.getValue());
            }
        }
    }
}
