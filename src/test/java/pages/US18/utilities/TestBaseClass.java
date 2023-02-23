package pages.US18.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public abstract class TestBaseClass {

    protected  WebDriver driver;

    // @BeforeClass ve @AfterClass notosyonlarini TestNG de kullanirken JUnit deki gibi statik yapmaya gerek yoktur

    @BeforeClass(groups = "gp1")
    public  void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @AfterClass(groups = "gp1")
    public  void tearDown(){
        driver.quit();
    }
}
