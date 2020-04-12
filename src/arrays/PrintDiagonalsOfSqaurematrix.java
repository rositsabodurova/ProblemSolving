package arrays;

import java.util.Scanner;

public class PrintDiagonalsOfSqaurematrix {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[size][size];


        for (int i = 0; i < size; i++) {
            String[] command = scanner.nextLine().split(" ");
            for (int j = 0; j < size; j++) {
                matrix[i][j] = Integer.parseInt(command[j]);
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i == j) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }

        System.out.println();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = matrix.length - 1; j >= 0; j--) {
                if ((i + j) == matrix.length - 1) {
                    System.out.print(matrix[j][i] + " ");
                }
            }
        }
    }
}
