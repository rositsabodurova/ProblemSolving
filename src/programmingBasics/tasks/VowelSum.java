package programmingBasics.tasks;

import java.util.Scanner;

public class VowelSum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int sum = 0;

        for (int letterIndex = 0; letterIndex < input.length(); letterIndex++) {
            char currentLetter = input.charAt(letterIndex);
            switch (currentLetter) {
                case 'a':
                    sum += 1;
                    break;
                case 'e':
                    sum += 2;
                    break;
                case 'i':
                    sum += 3;
                    break;
                case 'o':
                    sum += 4;
                    break;
                case 'u':
                    sum += 5;
                    break;
            }
        }
        System.out.println(sum);
    }
}
