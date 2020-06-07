package filesStreams;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class AllCapitals {
    public static void main(String[] args) throws IOException {

        String path = "files-resources\\Files-and-streams-exercises\\Exercises Resources\\input.txt";
        String output = "output.txt";

        FileOutputStream outputStream = new FileOutputStream(output);
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(outputStream));

        Files.readAllLines(Path.of(path))
                .forEach(str -> {
                    try {
                        writer.write(str.toUpperCase());
                        writer.newLine();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                });
        writer.close();
    }
}
