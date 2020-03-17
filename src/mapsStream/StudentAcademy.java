package mapsStream;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class StudentAcademy {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numberOfCommands = Integer.parseInt(scanner.nextLine());

        Map<String, List<Double>> students = new ConcurrentHashMap<>();

        for (int i = 0; i < numberOfCommands; i++) {
            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());
            if (!students.containsKey(name)) {
                List<Double> grades = new ArrayList<>();
                grades.add(grade);
                students.put(name, grades);
            } else {
                students.get(name).add(grade);
            }
        }
        for (Map.Entry<String, List<Double>> student : students.entrySet()) {
            double sum = 0.0;
            for (int i = 0; i < student.getValue().size(); i++) {
                sum += student.getValue().get(i);
            }
            double average = sum / student.getValue().size();
            student.getValue().add(average);
        }

        for (Map.Entry<String, List<Double>> student : students.entrySet()) {
            if (student.getValue().get(student.getValue().size() - 1) < 4.5) {
                students.remove(student.getKey());
            }
        }
        students.entrySet().stream().sorted((left, right) -> Double.compare(right.getValue().get(right.getValue().size() - 1), left.getValue().get(left.getValue().size() - 1)))
                .forEach(entry -> {
                    System.out.printf("%s -> %.2f%n", entry.getKey(), entry.getValue().get(entry.getValue().size() - 1));
                });
    }
}
