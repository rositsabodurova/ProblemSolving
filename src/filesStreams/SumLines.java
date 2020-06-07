package filesStreams;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.file.Files;
import java.nio.file.Path;

public class SumLines {
    public static void main(String[] args) {
        String path = "files-resources\\Files-and-streams-exercises\\Exercises Resources\\input.txt";
//        String output = "files-resources\\06.SortLinesOutput.txt";

        try(BufferedReader reader = Files.newBufferedReader(Path.of(path))){
            String oneLine = reader.readLine();
            while(oneLine != null){
                long sum = 0;
                for(char c : oneLine.toCharArray()){
                    sum += c;
                }
                System.out.println(sum);
                oneLine = reader.readLine();
            }

        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
