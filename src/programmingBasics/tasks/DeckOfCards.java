package programmingBasics.tasks;

import java.util.Scanner;

public class DeckOfCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cards[][] = {{"2 of spades", "3 of spades", "4 of spades", "5 of spades", "6 of spades", "7 of spades", "8 of spades", "9 of spades", "10 of spades", "J of spades", "Q of spades", "K of spades", "A of spades"}, {"2 of clubs", "3 of clubs", "4 of clubs", "5 of clubs", "6 of clubs", "7 of clubs", "8 of clubs", "9 of clubs", "10 of clubs", "J of clubs", "Q of clubs", "K of clubs", "A of clubs"}, {"2 of hearts", "3 of hearts", "4 of hearts", "5 of hearts", "6 of hearts", "7 of hearts", "8 of hearts", "9 of hearts", "10 of hearts", "J of hearts", "Q of hearts", "K of hearts", "A of hearts"}, {"2 of diamonds", "3 of diamonds", "4 of diamonds", "5 of diamonds", "6 of diamonds", "7 of diamonds", "8 of diamonds", "9 of diamonds", "10 of diamonds", "J of diamonds", "Q of diamonds", "K of diamonds", "A of diamonds"}};
        String inputCard = scanner.nextLine();
        int inputNumber = 0;
        switch (inputCard) {
            case "2": {
                inputNumber = 2;
                break;
            }
            case "3": {
                inputNumber = 3;
                break;
            }
            case "4": {
                inputNumber = 4;
                break;
            }
            case "5": {
                inputNumber = 5;
                break;
            }
            case "6": {
                inputNumber = 6;
                break;
            }
            case "7": {
                inputNumber = 7;
                break;
            }
            case "8": {
                inputNumber = 8;
                break;
            }
            case "9": {
                inputNumber = 9;
                break;
            }
            case "10": {
                inputNumber = 10;
                break;
            }
            case "J": {
                inputNumber = 11;
                break;
            }
            case "Q": {
                inputNumber = 12;
                break;
            }
            case "K": {
                inputNumber = 13;
                break;
            }
            case "A": {
                inputNumber = 14;
                break;
            }
        }

        for (int i = 0; i <= inputNumber - 2; i++) {
            System.out.println(cards[0][i] + ", " + cards[1][i] + ", " + cards[2][i] + ", " + cards[3][i]);
        }
    }
}

