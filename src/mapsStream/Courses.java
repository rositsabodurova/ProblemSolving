package mapsStream;

import java.util.*;

public class Courses {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Map<String, List<String>> courseTrack = new LinkedHashMap<>();

        while (!input.equals("end")) {
            String[] command = input.split(" : ");
            if (!courseTrack.containsKey(command[0])) {
                List<String> studentList = new ArrayList<>();
                studentList.add(command[1]);
                courseTrack.put(command[0], studentList);
            } else {
                courseTrack.get(command[0]).add(command[1]);
            }
            input = scanner.nextLine();
        }

        courseTrack.entrySet().stream().sorted((left, right) -> Integer.compare(right.getValue().size(), left.getValue().size()))
                .forEach(entry -> {
                    System.out.printf("%s: %d%n", entry.getKey(), entry.getValue().size());
                    entry.getValue().stream().sorted((a, b) -> a.compareTo(b))
                            .forEach(element -> System.out.println("-- " + element));
                });
    }
}
