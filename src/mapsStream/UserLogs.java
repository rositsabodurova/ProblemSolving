package mapsStream;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class UserLogs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Map<String, Integer>> userLogs = new TreeMap<>();
        String input = scanner.nextLine();

        while(!"end".equals(input)){
            String[] command = input.split("\\s");
            String[] ipAddressArr = command[0].split("=");
            String ipAddress = ipAddressArr[1];
            String[] userArr = command[2].split("=");
            String userName = userArr[1];

            if(!userLogs.containsKey(userName)){
                Map<String, Integer> currentUser = new LinkedHashMap<>();
                currentUser.put(ipAddress, 1);
                userLogs.put(userName,currentUser);
            } else {
                if(!userLogs.get(userName).containsKey(ipAddress)){
                    userLogs.get(userName).put(ipAddress, 1);
                } else {
                    int currentCount = userLogs.get(userName).get(ipAddress);
                    userLogs.get(userName).put(ipAddress, currentCount + 1);
                }
            }
            input = scanner.nextLine();
        }
        for(Map.Entry<String, Map<String, Integer>> log : userLogs.entrySet()){
            System.out.println(log.getKey() + ":");
            String mapAsString = log.getValue().keySet().stream()
                    .map(key -> key + " => " + log.getValue().get(key))
                    .collect(Collectors.joining(", "));
            System.out.println(mapAsString + ".");
        }
    }
}
