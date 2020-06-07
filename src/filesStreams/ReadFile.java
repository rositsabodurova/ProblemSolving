package filesStreams;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) throws IOException {
        String path = "files-resources\\input.txt";

        FileInputStream fis = new FileInputStream(path);

        int oneByte = fis.read();

        while(oneByte != -1){
            System.out.print(Integer.toBinaryString(oneByte) + " ");
            oneByte = fis.read();
        }
    }
}
