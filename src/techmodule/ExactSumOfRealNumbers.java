package techmodule;

import java.math.BigDecimal;
import java.util.Scanner;

public class ExactSumOfRealNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int times = Integer.parseInt(scanner.nextLine());

        BigDecimal bDSum = new BigDecimal("0");
        for (int i = 0; i < times; i++) {
            BigDecimal bDInput = new BigDecimal(scanner.nextLine());

            bDSum = bDSum.add(bDInput);
        }
        System.out.println(bDSum);
    }
}
