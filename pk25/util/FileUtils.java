package util;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileUtils {

    // private constructor
    private FileUtils() {
    }

    // ham doc file
    public static String readFile(String fileName) throws Exception {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        StringBuilder content = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            if (!line.trim().isEmpty()) {
                content.append(line).append(" ");
            }
        }
        reader.close();
        return content.toString();
    }
}
