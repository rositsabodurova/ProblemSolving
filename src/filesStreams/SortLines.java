package filesStreams;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

public class SortLines {
    public static void main(String[] args) throws IOException {

        String path = "files-resources\\input.txt";
        String output = "files-resources\\06.SortLinesOutput.txt";

        List<String> allLines = Files.lines(Path.of(path))
                .sorted()
                .collect(Collectors.toList());
        Files.write(Path.of(output),allLines);
    }
}
