package filesStreams;

import java.io.*;
import java.util.Set;

public class WriteToFile {
    public static void main(String[] args) throws FileNotFoundException {

        String path = "files-resources\\input.txt";
        String output = "files-resources\\02.WriteToFileOutput.txt";

        try(FileInputStream fis = new FileInputStream(path)){
            FileOutputStream fos = new FileOutputStream(output);
            int oneByte = fis.read();
            Set<Character> punctuation = Set.of(',', '.', '!', '?');
            while(oneByte != -1){
                if(!punctuation.contains((char)oneByte)){
                    fos.write(oneByte);
                }
                oneByte = fis.read();
            }
        } catch (IOException e){
            e.printStackTrace();

        }
    }
}
