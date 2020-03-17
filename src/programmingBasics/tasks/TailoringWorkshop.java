package programmingBasics.tasks;

import java.util.Scanner;

public class TailoringWorkshop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Double numberTables = Double.parseDouble(scanner.nextLine());
        Double lengthTable = Double.parseDouble(scanner.nextLine());
        Double widthTable = Double.parseDouble(scanner.nextLine());

        Double tableCoverLength = lengthTable + 0.6;
        Double tableCoverWidth = widthTable + 0.6;
        Double coverSquareSide = lengthTable * 0.5;

        Double areaTableCover = tableCoverLength * tableCoverWidth;
        Double areaCoverSquare = coverSquareSide * coverSquareSide;

        Double tableCoverPrice = areaTableCover * 7;
        Double CoverSquarePrice = areaCoverSquare * 9;

        Double totalAmountUSD = (numberTables * tableCoverPrice) + (numberTables * CoverSquarePrice);
        Double totalAmountBGN = totalAmountUSD * 1.85;

        System.out.printf("%.2f USD", totalAmountUSD);
        System.out.println();
        System.out.printf("%.2f BGN", totalAmountBGN);
    }
}
