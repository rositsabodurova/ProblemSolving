package filesStreams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyBytes {
    public static void main(String[] args) throws IOException {
        String path = "files-resources\\input.txt";
        String output = "files-resources\\03.CopyBytesOutput.txt";
        int space = ' ';
        int newLine = '\n';

        try {
            FileInputStream fis = new FileInputStream(path);
            FileOutputStream fos = new FileOutputStream(output);
            int oneByte = fis.read();
            while (oneByte != -1) {
                if (oneByte == space || oneByte == newLine) {
                    fos.write(oneByte);
                } else {
                    String stringNumber = String.valueOf(oneByte);
                    for (int i = 0; i < stringNumber.length(); i++) {
                        fos.write(stringNumber.charAt(i));
                    }
                }
                oneByte = fis.read();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
