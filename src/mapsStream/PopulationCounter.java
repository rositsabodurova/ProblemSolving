package mapsStream;

import java.util.*;

public class PopulationCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Map<String, Long>> countries = new LinkedHashMap<>();
        Map<String, Long> countriesPopCount = new LinkedHashMap<>();
        String input = scanner.nextLine();

        while (!"report".equals(input)) {
            String[] command = input.split("\\|");
            String country = command[1];
            String city = command[0];
            Long cityPopulation = Long.parseLong(command[2]);

            if (!countries.containsKey(country)) {
                Map<String, Long> currentCities = new TreeMap<>(Collections.reverseOrder());
                currentCities.put(city, cityPopulation);
                countries.put(country, currentCities);
                countriesPopCount.put(country, cityPopulation);
            } else {
                Long updatedPopulation = countriesPopCount.get(country) + cityPopulation;
                countriesPopCount.put(country, updatedPopulation);
                countries.get(country).put(city, cityPopulation);
            }
            input = scanner.nextLine();
        }

        Map<String, Long> sortedCountries = new LinkedHashMap<>();
        countriesPopCount.entrySet()
                .stream()
                .sorted(Map.Entry.<String, Long>comparingByValue(Comparator.reverseOrder()))
                .forEachOrdered(entry -> sortedCountries.put(entry.getKey(), entry.getValue()));

        for (Map.Entry<String, Long> entry : sortedCountries.entrySet()) {
            System.out.printf("%s (total population: %d)%n", entry.getKey(), entry.getValue());
            Map<String, Long> temporaryCities = new LinkedHashMap<>();
            countries.get(entry.getKey()).entrySet()
                    .stream()
                    .sorted(Map.Entry.<String, Long>comparingByValue(Comparator.reverseOrder()))
                    .forEachOrdered(city -> temporaryCities.put(city.getKey(), city.getValue()));
            for (Map.Entry<String, Long> city : temporaryCities.entrySet()) {
                System.out.printf("=>%s: %d%n", city.getKey(), city.getValue());
            }
        }
    }
}