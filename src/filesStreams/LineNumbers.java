package filesStreams;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class LineNumbers {
    public static void main(String[] args) {
        String path = "files-resources\\Files-and-streams-exercises\\inputLineNumbers.txt";
        String output = "output.txt";
        int counter = 1;

        try(BufferedReader reader = new BufferedReader(Files.newBufferedReader(Path.of(path)))){
            String oneLine = reader.readLine();
            PrintWriter writer = new PrintWriter(new FileOutputStream(output));
            while(oneLine != null){
                writer.println(counter + ". " + oneLine);
                writer.flush();
                counter++;
                oneLine = reader.readLine();
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
