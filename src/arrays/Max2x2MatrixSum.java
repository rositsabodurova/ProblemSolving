package arrays;

import java.util.Scanner;

public class Max2x2MatrixSum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[][] matrix = readInput(scanner);
        int maxSum = Integer.MIN_VALUE;
        int maxSumRow = 0;
        int maxSumCol = 0;


        for (int row = 0; row < matrix.length - 1; row++) {
            for (int column = 0; column < matrix[row].length - 1; column++) {
                int sum = matrix[row][column]
                        + matrix[row][column + 1]
                        + matrix[row + 1][column]
                        + matrix[row + 1][column + 1];

                if (sum > maxSum) {
                    maxSum = sum;
                    maxSumRow = row;
                    maxSumCol = column;
                }
            }
        }
        System.out.println(matrix[maxSumRow][maxSumCol] + " " + matrix[maxSumRow][maxSumCol + 1]);
        System.out.println(matrix[maxSumRow + 1][maxSumCol] + " " + matrix[maxSumRow + 1][maxSumCol + 1]);
        System.out.println(maxSum);
    }

    static int[][] readInput(Scanner scanner) {
        String[] command = scanner.nextLine().split(", ");
        int[][] matrix = new int[Integer.parseInt(command[0])][Integer.parseInt(command[1])];

        for (int i = 0; i < Integer.parseInt(command[0]); i++) {
            String[] currentLine = scanner.nextLine().split(", ");
            for (int j = 0; j < currentLine.length; j++) {
                matrix[i][j] = Integer.parseInt(currentLine[j]);
            }
        }
        return matrix;
    }
}
