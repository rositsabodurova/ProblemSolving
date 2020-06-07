package filesStreams;

import java.io.*;

public class WriteEveryThirdLine {
    public static void main(String[] args) {

        String path = "files-resources\\input.txt";
        String output = "files-resources\\05.WriteEveryThirdLineOutput.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path));
             PrintWriter pr = new PrintWriter(new FileOutputStream(output))) {
            String line = br.readLine();
            int counter = 1;
            while(line != null){
                if(counter % 3 ==0){
                    pr.println(line);
                    pr.flush();
                }
                line = br.readLine();
                counter++;
            }

        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
