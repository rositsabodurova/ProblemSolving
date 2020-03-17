package methods;

import java.util.Scanner;

public class VowelCount {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toLowerCase();
        char[] inputArr = input.toCharArray();
        System.out.println(countVowels(inputArr));
    }

    static int countVowels(char[] inputArr) {
        int count = 0;
        for (int i = 0; i < inputArr.length; i++) {
            if (inputArr[i] == 'a' || inputArr[i] == 'e' || inputArr[i] == 'i' || inputArr[i] == 'o' || inputArr[i] == 'u') {
                count++;
            }
        }
        return count;
    }
}
