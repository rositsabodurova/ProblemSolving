package programmingBasics.tasks;

import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double inputNumber = Double.parseDouble(scanner.nextLine());
        String inputType = scanner.nextLine();
        String outputType = scanner.nextLine();

        double outputNumber = 0;

        switch (inputType) {
            case "m": {
                if (outputType.equals("mm")) {
                    outputNumber = inputNumber * 1000;
                    System.out.printf("%.3f", outputNumber);
                } else if (outputType.equals("cm")) {
                    outputNumber = inputNumber * 100;
                    System.out.printf("%.3f", outputNumber);
                }
                break;
            }
            case "cm": {
                if (outputType.equals("m")) {
                    outputNumber = inputNumber / 100;
                    System.out.printf("%.3f", outputNumber);
                } else if (outputType.equals("mm")) {
                    outputNumber = inputNumber * 10;
                    System.out.printf("%.3f", outputNumber);
                }
                break;
            }
            case "mm": {
                if (outputType.equals("m")) {
                    outputNumber = inputNumber / 1000;
                    System.out.printf("%.3f", outputNumber);
                } else if (outputType.equals("cm")) {
                    outputNumber = inputNumber / 10;
                    System.out.printf("%.3f", outputNumber);
                }
                break;
            }
        }
    }
}
