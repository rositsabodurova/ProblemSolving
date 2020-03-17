package programmingBasics.exams;

import java.util.Scanner;

public class ArrayExercises {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
    }

    public void changeArray(int[] arr, int k) {
        if (k > arr.length) {
            k = k % arr.length;
        }
        int[] results = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            results[i] = arr[i];
        }
    }
}
