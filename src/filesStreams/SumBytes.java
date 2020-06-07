package filesStreams;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class SumBytes {
    public static void main(String[] args) throws IOException {
        String path = "files-resources\\Files-and-streams-exercises\\Exercises Resources\\input.txt";

        long sum = 0;
        for(byte oneByte : Files.readAllBytes(Path.of(path))){
            if (oneByte != 10 && oneByte !=13){
                sum += oneByte;
            }
        }
        System.out.println(sum);
    }
}
