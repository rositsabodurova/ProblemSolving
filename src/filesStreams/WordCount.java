package filesStreams;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class WordCount {
    public static void main(String[] args) {
        String path = "files-resources\\Files-and-streams-exercises\\words.txt";
        String pathToCheck = "files-resources\\Files-and-streams-exercises\\text.txt";
        String output = "files-resources\\Files-and-streams-exercises\\results.txt";

        Map<String, Integer> wordsToCheck = new LinkedHashMap<>();

        try (BufferedReader reader = new BufferedReader(Files.newBufferedReader(Path.of(path)))) {
            String oneLine = reader.readLine();
            while (oneLine != null) {
                String[] lineArr = oneLine.split(" ");
                for (String word : lineArr) {
                    word = word.trim();
                    wordsToCheck.put(word, 0);
                }
                oneLine = reader.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        try (BufferedReader reader = new BufferedReader(Files.newBufferedReader(Path.of(pathToCheck)))) {
            String oneLine = reader.readLine();
            while (oneLine != null) {
                String[] lineArr = oneLine.split(" ");
                for (String word : lineArr) {
                    if (wordsToCheck.containsKey(word)) {
                        wordsToCheck.put(word, wordsToCheck.get(word) + 1);
                    }
                }
                oneLine = reader.readLine();
            }
            PrintWriter writer = new PrintWriter(new FileOutputStream(output));
            for (Map.Entry<String, Integer> entry : wordsToCheck.entrySet()) {
                writer.println(entry.getKey() + " - " + entry.getValue());
                writer.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
