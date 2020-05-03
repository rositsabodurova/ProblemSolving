package mapsStream;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SrabskoUnleashed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Map<String, Map<String, Integer>> resorts = new LinkedHashMap<>();

        final String regex = "^(?<singer>.+ ){1,3}@(?<venue>\\w+[^0-9]+ ){1,3}(?<tickets>\\d+) (?<count>\\d+)";
        Pattern pattern = Pattern.compile(regex);

        while (!"End".equals(input)) {
            Matcher matcher = pattern.matcher(input);

            while (matcher.find()) {
                String singer = matcher.group("singer").trim();
                String venue = matcher.group("venue").trim();
                int tickets = Integer.parseInt(matcher.group("tickets").trim());
                int count = Integer.parseInt(matcher.group("count").trim());

                if (!resorts.containsKey(venue)) {
                    Map<String, Integer> tempSingerMap = new LinkedHashMap<>();
                    tempSingerMap.put(singer, tickets * count);
                    resorts.put(venue, tempSingerMap);
                } else {
                    if (!resorts.get(venue).containsKey(singer)) {
                        resorts.get(venue).put(singer, tickets * count);
                    } else {
                        resorts.get(venue).put(singer, resorts.get(venue).get(singer) + tickets * count);
                    }
                }
            }
            input = scanner.nextLine();
        }

        for (Map.Entry<String, Map<String, Integer>> entry : resorts.entrySet()) {
            System.out.println(entry.getKey());

            entry.getValue().entrySet().stream()
                    .sorted((f, s) -> s.getValue() - f.getValue())
                    .forEach(innerEntry ->
                            System.out.printf("#  %s -> %d%n", innerEntry.getKey(), innerEntry.getValue()));
        }
    }
}
