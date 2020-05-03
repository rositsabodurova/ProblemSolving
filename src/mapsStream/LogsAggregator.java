package mapsStream;

import java.util.*;

public class LogsAggregator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Set<String>> playersIPs = new HashMap<>();
        Map<String, Integer> playersDuration = new TreeMap<>();

        int numberOfIterations = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numberOfIterations; i++) {
            String[] command = scanner.nextLine().split("\\s");
            String ip = command[0];
            String name = command[1];
            int duration = Integer.parseInt(command[2]);

            if (!playersIPs.containsKey(name)) {
                Set<String> currentIps = new TreeSet<>();
                currentIps.add(ip);
                playersIPs.put(name, currentIps);
                playersDuration.put(name, duration);

            } else {
                playersIPs.get(name).add(ip);
                int previousTime = playersDuration.get(name);
                playersDuration.put(name, previousTime + duration);
            }
        }
        for (Map.Entry<String, Integer> entry : playersDuration.entrySet()) {
            String currentIPset = String.join(", ", playersIPs.get(entry.getKey()));
            System.out.printf("%s: %d [%s]%n", entry.getKey(), entry.getValue(), currentIPset);
        }
    }
}
