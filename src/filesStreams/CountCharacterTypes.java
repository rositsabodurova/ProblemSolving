package filesStreams;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CountCharacterTypes {
    public static void main(String[] args) {
        String path = "files-resources\\Files-and-streams-exercises\\Exercises Resources\\input.txt";
        String output = "output.txt";
        int vowels_count = 0;
        int consonants_count = 0;
        int punctuation_count = 0;
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        Set<Character> punctuation = new HashSet<>(Arrays.asList('!', ',', '.', '?'));

        try (BufferedReader reader = new BufferedReader(Files.newBufferedReader(Path.of(path)))) {
            String oneLine = reader.readLine();
            while (oneLine != null) {
                for (char oneChar : oneLine.toCharArray()) {
                    if (oneChar != 32) {
                        if (vowels.contains(oneChar)) {
                            vowels_count++;
                        } else if (punctuation.contains(oneChar)) {
                            punctuation_count++;
                        } else {
                            consonants_count++;
                        }
                    }
                }
                oneLine = reader.readLine();
            }

            PrintWriter writer = new PrintWriter(new FileOutputStream(output));
            writer.printf("Vowels: %d%n", vowels_count);
            writer.printf("Consonants: %d%n", consonants_count);
            writer.printf("Punctuation: %d%n", punctuation_count);
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
