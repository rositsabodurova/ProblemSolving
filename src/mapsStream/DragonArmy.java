package mapsStream;

import java.util.*;

public class DragonArmy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfIterations = Integer.parseInt(scanner.nextLine());

        Map<String, Map<String, ArrayList<Integer>>> dragonTypes = new LinkedHashMap<>();
        Map<String, ArrayList<Double>> averageStats = new LinkedHashMap<>();

        for (int i = 0; i < numberOfIterations; i++) {
            String[] tokens = scanner.nextLine().split(" ");
            String type = tokens[0];
            String dragonName = tokens[1];
            int damage = 45;
            int health = 250;
            int armor = 10;
            if (!tokens[2].equals("null")) {
                damage = Integer.parseInt(tokens[2]);
            }
            if (!tokens[3].equals("null")) {
                health = Integer.parseInt(tokens[3]);
            }
            if (!tokens[4].equals("null")) {
                armor = Integer.parseInt(tokens[4]);
            }
            if (!dragonTypes.containsKey(type)) {
                ArrayList<Integer> tempStats = new ArrayList<>();
                tempStats.add(damage);
                tempStats.add(health);
                tempStats.add(armor);
                Map<String, ArrayList<Integer>> tempDragons = new TreeMap<>();
                tempDragons.put(dragonName, tempStats);
                dragonTypes.put(type, tempDragons);
            } else {
                if (!dragonTypes.get(type).containsKey(dragonName)) {
                    ArrayList<Integer> tempStats = new ArrayList<>();
                    tempStats.add(damage);
                    tempStats.add(health);
                    tempStats.add(armor);
                    dragonTypes.get(type).put(dragonName, tempStats);
                } else {
                    dragonTypes.get(type).get(dragonName).set(0, damage);
                    dragonTypes.get(type).get(dragonName).set(1, health);
                    dragonTypes.get(type).get(dragonName).set(2, armor);
                }
            }
        }

        for (Map.Entry<String, Map<String, ArrayList<Integer>>> entry : dragonTypes.entrySet()) {
            int totalDamage = 0;
            int totalHealth = 0;
            int totalArmor = 0;
            for (Map.Entry<String, ArrayList<Integer>> innerEntry : entry.getValue().entrySet()) {
                totalDamage += innerEntry.getValue().get(0);
                totalHealth += innerEntry.getValue().get(1);
                totalArmor += innerEntry.getValue().get(2);
            }
            double averageDamage = totalDamage * 1.0 / entry.getValue().size();
            double averageHealth = totalHealth * 1.0 / entry.getValue().size();
            double averageArmor = totalArmor * 1.0 / entry.getValue().size();
            ArrayList<Double> tempAverages = new ArrayList<>();
            tempAverages.add(averageDamage);
            tempAverages.add(averageHealth);
            tempAverages.add(averageArmor);
            averageStats.put(entry.getKey(), tempAverages);
        }

        for (Map.Entry<String, ArrayList<Double>> entry : averageStats.entrySet()) {
            System.out.printf("%s::(%.2f/%.2f/%.2f)%n", entry.getKey(), entry.getValue().get(0), entry.getValue().get(1), entry.getValue().get(2));
            for (Map.Entry<String, ArrayList<Integer>> innerEntry : dragonTypes.get(entry.getKey()).entrySet()) {
                int currentDamage = innerEntry.getValue().get(0);
                int currentHealth = innerEntry.getValue().get(1);
                int currentArmor = innerEntry.getValue().get(2);
                System.out.printf("-%s -> damage: %d, health: %d, armor: %d%n", innerEntry.getKey(), currentDamage, currentHealth, currentArmor);
            }
        }
    }
}
