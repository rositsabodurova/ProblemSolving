package mapsStream;

import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class AcademyGraduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfIterations = Integer.parseInt(scanner.nextLine());
        Map<String, ArrayList<Double>> students = new TreeMap<>();

        for (int i = 0; i < numberOfIterations; i++) {
            String name = scanner.nextLine();
            String[] input = scanner.nextLine().split(" ");
            double[] gradesArr = new double[input.length];
            for (int j = 0; j < input.length; j++) {
                gradesArr[j] = Double.parseDouble(input[j]);
            }
            double sumOfGrades = 0;
            for (double grade : gradesArr) {
                sumOfGrades += grade;
            }
            double averageGrade = sumOfGrades / gradesArr.length;
            ArrayList<Double> grades = DoubleStream.of(gradesArr).boxed()
                    .collect(Collectors.toCollection(ArrayList::new));
            grades.add(averageGrade);
            students.put(name, grades);
        }

        for (Map.Entry<String, ArrayList<Double>> entry : students.entrySet()) {
            DecimalFormat df = new DecimalFormat("#.###############################");
            System.out.printf("%s is graduated with %s%n", entry.getKey(), df.format(entry.getValue().get(entry.getValue().size() - 1)));
        }
    }
}