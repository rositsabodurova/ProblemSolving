package sets;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class VoinaNumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] firstPlayersStr = scanner.nextLine().split(" ");
        String[] secondPlayerStr = scanner.nextLine().split(" ");

        Set<Integer> firstPlayer = new LinkedHashSet<>();
        Set<Integer> secondPlayer = new LinkedHashSet<>();

        for (int i = 0; i < firstPlayersStr.length; i++) {
            firstPlayer.add(Integer.parseInt(firstPlayersStr[i]));
        }

        for (int i = 0; i < secondPlayerStr.length; i++) {
            secondPlayer.add(Integer.parseInt(secondPlayerStr[i]));
        }

        for (int i = 0; i < 50; i++) {
            if (!firstPlayer.isEmpty() || !secondPlayer.isEmpty()) {
                int firstNum = firstPlayer.iterator().next();
                firstPlayer.remove(firstNum);
                int secondNum = secondPlayer.iterator().next();
                secondPlayer.remove(secondNum);

                if (firstNum > secondNum) {
                    firstPlayer.add(firstNum);
                    firstPlayer.add(secondNum);

                } else if(secondNum > firstNum){
                    secondPlayer.add(firstNum);
                    secondPlayer.add(secondNum);

                }
            } else {
                break;
            }
        }

        if (firstPlayer.isEmpty()) {
            System.out.println("Second player win!");
        } else if (secondPlayer.isEmpty()) {
            System.out.println("First player win!");
        } else if (firstPlayer.size() > secondPlayer.size()) {
            System.out.println("First player win!");
        } else if (secondPlayer.size() > firstPlayer.size()) {
            System.out.println("Second player win!");
        } else {
            System.out.println("Draw!");
        }
    }
}
