package methods;

import java.util.Scanner;

public class ArrayManipulation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String[] inputArr = input.split(" ");
        int[] numbers = new int[inputArr.length];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(inputArr[i]);
        }
        input = scanner.nextLine();

        while (!"end".equals(input)) {
            if (input.contains("exchange")) {
                String[] command = input.split(" ");
                int index = Integer.parseInt(command[1]);
                printExchange(numbers, index);
            } else if (input.equals("max odd")) {
                printMaxOdd(numbers);
            } else if (input.equals("max even")) {
                printMaxEven(numbers);
            } else if (input.equals("min odd")) {
                printMinOdd(numbers);
            } else if (input.contains("first") && input.contains("odd")) {
                String[] command = input.split("");
                int count = Integer.parseInt(command[1]);
                printFirstNOdds(numbers, count);
            } else if (input.contains("first") && input.contains("even")) {
                String[] command = input.split("");
                int count = Integer.parseInt(command[1]);
                printFirstNEvens(numbers, count);
            } else if (input.contains("last") && input.contains("odd")) {
                String[] command = input.split("");
                int count = Integer.parseInt(command[1]);
                printlastNOdds(numbers, count);
            } else if (input.contains("last") && input.contains("even")) {
                String[] command = input.split("");
                int count = Integer.parseInt(command[1]);
                printLastNEvens(numbers, count);
            }
            input = scanner.nextLine();
        }
    }

    static void printExchange(int[] numbers, int index) {
        if (index > numbers.length) {
            System.out.println("Invalid index");
        } else {
            for (int i = index; i < numbers.length; i++) {
                System.out.print(numbers[i] + " ");
            }
            for (int i = 0; i < index; i++) {
                System.out.print(numbers[i] + " ");
            }
            System.out.println();
        }
    }

    static void printMaxOdd(int[] numbers) {
        int maxOdd = Integer.MIN_VALUE;
        int maxOddIndex = 0;
        boolean hasOdd = false;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                hasOdd = true;
                if (numbers[i] > maxOdd) {
                    maxOdd = numbers[i];
                    maxOddIndex = i;
                }
            }
        }
        if (hasOdd) {
            System.out.println(maxOddIndex);
        } else {
            System.out.println("No matches");
        }
    }

    static void printMaxEven(int[] numbers) {
        int maxEven = Integer.MIN_VALUE;
        int maxEvenIndex = 0;
        boolean hasEven = false;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                hasEven = true;
                if (numbers[i] > maxEven) {
                    maxEven = numbers[i];
                    maxEvenIndex = i;
                }
            }
        }
        if (hasEven) {
            System.out.println(maxEvenIndex);
        } else {
            System.out.println("No matches");
        }
    }

    static void printMinOdd(int[] numbers) {
        int minOdd = Integer.MAX_VALUE;
        int minOddIndex = 0;
        boolean hasOdd = false;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                hasOdd = true;
                if (numbers[i] < minOdd) {
                    minOdd = numbers[i];
                    minOddIndex = i;
                }
            }
        }
        if (hasOdd) {
            System.out.println(minOddIndex);
        } else {
            System.out.println("No matches");
        }
    }

    static void printMinEven(int[] numbers) {
        int minEven = Integer.MAX_VALUE;
        int minEvenIndex = 0;
        boolean hasEven = false;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                hasEven = true;
                if (numbers[i] < minEven) {
                    minEven = numbers[i];
                    minEvenIndex = i;
                }
            }
        }
        if (hasEven) {
            System.out.println(minEvenIndex);
        } else {
            System.out.println("No matches");
        }
    }

    static void printFirstNOdds(int[] numbers, int count) {
        //to fix
        int reachedIndex = 0;
        boolean hasOdds = false;
        int[] newArr = new int[count];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                hasOdds = true;
                reachedIndex++;
                if (reachedIndex == count) {
                    break;
                }
            }
        }
    }

    static void printFirstNEvens(int[] numbers, int count) {
        //to do
    }

    static void printlastNOdds(int[] numbers, int count) {
        //to do
    }

    static void printLastNEvens(int[] numbers, int count) {
        //to do
    }
}
