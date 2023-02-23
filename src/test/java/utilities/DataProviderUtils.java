package utilities;

import org.testng.annotations.DataProvider;

public class DataProviderUtils {

    @DataProvider
    public Object [][] kullaniciAdiPassword(){
        Object namePassword [][] = {{"Serhat" , "Serhat513066"}};
        return namePassword;
    }

}
