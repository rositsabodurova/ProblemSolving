package arrays;

import java.util.*;

public class LongestIncreasingSubsequence {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String[] stringArr = input.split(" ");
        int[] numbers = new int[stringArr.length];
        int[] len = new int[numbers.length];
        int[] prev = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(stringArr[i]);
        }

        int maxLen = 0;
        int lastIndex = -1;

        for (int x = 0; x < numbers.length; x++) {
            len[x] = 1;
            prev[x] = -1;

            for (int i = 0; i < x; i++) {
                if ((numbers[i] < numbers[x]) && (len[i] + 1 > len[x])) {
                    len[x] = len[i] + 1;
                    prev[x] = i;
                }
                if (len[x] > maxLen) {
                    maxLen = len[x];
                    lastIndex = x;
                }
            }
        }

        int[] longestInts = reverseLongestInts(restoreList(numbers, prev, lastIndex));
        for (int i = 0; i < longestInts.length; i++) {
            System.out.print(longestInts[i] + " ");
        }
    }

    static int[] restoreList(int[] numbers, int[] prev, int lastIndex) {
        List<Integer> longestSeq = new ArrayList<>();
        while (lastIndex != -1) {
            longestSeq.add(numbers[lastIndex]);
            lastIndex = prev[lastIndex];
        }
        int[] longestInts = new int[longestSeq.size()];
        for (int i = 0; i < longestInts.length; i++) {
            longestInts[i] = longestSeq.get(i);
        }
        return longestInts;
    }

    static int[] reverseLongestInts(int[] longestInts) {
        for (int i = 0; i < longestInts.length / 2; i++) {
            int temp = longestInts[i];
            longestInts[i] = longestInts[longestInts.length - 1 - i];
            longestInts[longestInts.length - 1 - i] = temp;
        }
        return longestInts;
    }
}

