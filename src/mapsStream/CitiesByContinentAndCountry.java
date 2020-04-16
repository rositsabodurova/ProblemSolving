package mapsStream;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CitiesByContinentAndCountry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfIterations = Integer.parseInt(scanner.nextLine());
        Map<String, Map<String, ArrayList<String>>> continents = new LinkedHashMap<>();

        for (int i = 0; i < numberOfIterations; i++) {
            String[] command = scanner.nextLine().split("\\s");
            String continent = command[0];
            String country = command[1];
            String city = command[2];
            if (!continents.containsKey(continent)) {
                Map<String, ArrayList<String>> newCountries = new LinkedHashMap<>();
                ArrayList<String> newCities = new ArrayList<>();
                newCities.add(city);
                newCountries.put(country, newCities);
                continents.put(continent, newCountries);
            } else {
                if (!continents.get(continent).containsKey(country)) {
                    ArrayList<String> newCities = new ArrayList<>();
                    newCities.add(city);
                    continents.get(continent).put(country, newCities);

                } else {
                    continents.get(continent).get(country).add(city);
                }
            }
        }
        for (Map.Entry<String, Map<String, ArrayList<String>>> continent : continents.entrySet()) {
            System.out.println(continent.getKey() + ":");
            for (Map.Entry<String, ArrayList<String>> country : continent.getValue().entrySet()) {
                String cities = String.join(", ", country.getValue());
                System.out.println(country.getKey() + " -> " + cities);
            }
        }

    }
}
