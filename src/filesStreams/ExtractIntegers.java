package filesStreams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class ExtractIntegers {
    public static void main(String[] args) throws FileNotFoundException {
        String path = "files-resources\\input.txt";
        String output = "files-resources\\04.ExtractIntegersOutput.txt";
        FileInputStream fis = new FileInputStream(path);

        Scanner scanner = new Scanner(fis);
        PrintWriter printWriter = new PrintWriter(output);

        try {
            FileOutputStream fos = new FileOutputStream(output);
            while(scanner.hasNext()){
                if(scanner.hasNextInt()){
                    int oneInt = scanner.nextInt();
                    printWriter.println(oneInt);
                    printWriter.flush();
                } else {
                    scanner.next();
                }

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        printWriter.close();
        scanner.close();
    }
}
