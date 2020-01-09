package util;

import model.Address;
import model.Office;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

public class PropertiesParser {

    private static final PropertiesParser PROPERTIES_PARSER = new PropertiesParser();

    private PropertiesParser() {
    }

    @Deprecated
    private static FileInputStream getFileInputStream(File file) throws FileNotFoundException {
        return new FileInputStream(file);
    }

    @Deprecated
    public static Office getOfficeFromFile(File file) throws IOException {

        Properties properties = new Properties();
        properties.load(getFileInputStream(file));

        Address officeAddress = new Address(
                properties.getProperty("office.address.city"),
                properties.getProperty("office.address.street"),
                Integer.parseInt(properties.getProperty("office.address.building"))
        );
        return new Office(
                properties.getProperty("office.name"),
                officeAddress
        );
    }

    public static String getPropertyByName(String key, String file) {

        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream(PROPERTIES_PARSER.getFileFromResources(file)));
            return properties.getProperty(key);
        } catch (IOException e) {
            return null;
        }

    }

    @Deprecated
    private static FileInputStream getInputStreamFromFile(File file) {
        try {
            return getFileInputStream(file);
        } catch (FileNotFoundException e) {
            return null;
        }
    }

    private File getFileFromResources(String fileName) {

        ClassLoader classLoader = getClass().getClassLoader();

        URL resource = classLoader.getResource(fileName);
        if (resource == null) {
            throw new IllegalArgumentException("file not found");
        } else {
            return new File(resource.getFile());
        }

    }
}
