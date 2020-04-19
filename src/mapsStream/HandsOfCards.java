package mapsStream;

import java.util.*;

public class HandsOfCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Set<String>> playersDecks = new LinkedHashMap<>();
        Map<String, Integer> playersScores = new LinkedHashMap<>();
        Map<Character, Integer> cardValues = new HashMap<>();
        cardValues.put('J', 11);
        cardValues.put('Q', 12);
        cardValues.put('K', 13);
        cardValues.put('A', 14);

        String input = scanner.nextLine();

        while (!"JOKER".equals(input)) {
            String[] processedString = input.split(": ");
            String[] currentPlayerCards = processedString[1].split(", ");
            String playerName = processedString[0];
            if (!playersDecks.containsKey(playerName)) {
                Set<String> currentDeckSet = new HashSet<>();
                for (String card : currentPlayerCards) {
                    currentDeckSet.add(card);
                }
                playersDecks.put(playerName, currentDeckSet);
            } else {
                for (String card : currentPlayerCards) {
                    playersDecks.get(playerName).add(card);
                }
            }
            input = scanner.nextLine();
        }

        for (Map.Entry<String, Set<String>> entry : playersDecks.entrySet()) {
            int totalValue = 0;
            for (String currentCard : entry.getValue()) {
                int currentCardValue;

                char[] currentCardArr = currentCard.toCharArray();
                if (currentCardArr.length == 3) {
                    currentCardValue = 10;
                } else {
                    if (!cardValues.containsKey(currentCardArr[0])) {
                        currentCardValue = Character.getNumericValue(currentCardArr[0]);
                    } else {
                        currentCardValue = cardValues.get(currentCardArr[0]);
                    }
                }

                //multipliers: (S -> 4, H-> 3, D -> 2, C -> 1)
                switch (currentCardArr[currentCardArr.length - 1]) {
                    case 'S':
                        totalValue += currentCardValue * 4;
                        break;
                    case 'H':
                        totalValue += currentCardValue * 3;
                        break;
                    case 'D':
                        totalValue += currentCardValue * 2;
                        break;
                    case 'C':
                        totalValue += currentCardValue;
                        break;
                }
            }
            playersScores.put(entry.getKey(), totalValue);
        }

        for (Map.Entry<String, Integer> entry : playersScores.entrySet()) {
            System.out.printf("%s: %d%n", entry.getKey(), entry.getValue());
        }
    }
}

