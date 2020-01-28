package util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileUtil {

    public static void toFile(String filePath, String data) {
        try {
            File file = new File(filePath);
            System.out.println(file.getAbsolutePath());
            file.createNewFile();
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            writer.write(data);
            writer.close();
        } catch (IOException e) {
            LoggerUtil.LOGGER.error(e.getStackTrace());
        }
    }
}
