package Creational.DependencyInjection.IoCContainer;

import javax.management.InstanceNotFoundException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Injector {
    private static final String IOC_CONFIGURATION_FILE_NAME = "src\\Creational\\DependencyInjection\\IoCContainer\\resources\\ioc.properties";

    private Injector() {
        throw new UnsupportedOperationException();
    }

    public static Object getInstance(String key) throws InstanceNotFoundException {

        try (InputStream input = new FileInputStream(IOC_CONFIGURATION_FILE_NAME)) {
            // load a properties file
            Properties prop = new Properties();
            prop.load(input);

            // get the property value
            String className = prop.getProperty(key);
            return Class.forName(className).newInstance();
        } catch (IOException | InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            e.printStackTrace();
            throw new InstanceNotFoundException(
                    "Can't create instance of " + key + " base on the configuration of " + IOC_CONFIGURATION_FILE_NAME);
        }
    }
}
