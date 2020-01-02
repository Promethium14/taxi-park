package util;

import model.Address;
import model.Office;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesParser {

    private static FileInputStream getFileInputStream(File file) throws FileNotFoundException {
        return new FileInputStream(file);
    }

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
}
