package mapsStream;

import java.text.DecimalFormat;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountRealNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] numberStrings = scanner.nextLine().split(" ");
        double[] numbers = new double[numberStrings.length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Double.parseDouble(numberStrings[i]);
        }

        Map<Double, Integer> numbercounts = new TreeMap<>();

        for (double number : numbers) {
            if (numbercounts.containsKey(number)) {
                numbercounts.put(number, 1 + numbercounts.get(number));
            } else {
                numbercounts.put(number, 1);
            }
        }

        for (Map.Entry<Double, Integer> entry : numbercounts.entrySet()) {
            DecimalFormat df = new DecimalFormat("#.######");
            System.out.printf("%s -> %d%n", df.format(entry.getKey()), entry.getValue());
        }
    }
}
