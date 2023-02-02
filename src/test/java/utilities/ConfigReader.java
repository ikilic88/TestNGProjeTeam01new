package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    static Properties properties;

    static {
        String dosyaYolu = "configuration.properties";
        try {
            FileInputStream fis = new FileInputStream(dosyaYolu);
            // fis dosya yolunu tanimladigimiz configuration.properties dosyasini okudu
            properties = new Properties();
            properties.load(fis);// fis in okudugu bilgileri properties e yukledi


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String getProperty(String key){
        /*
        Test methodundan yolladigimiz string key degerini alip
        Properties class inden getProperty() methodunu kullanarak
        bu key e ait value u bize getirdi
         */


        return properties.getProperty(key);
    }
}
