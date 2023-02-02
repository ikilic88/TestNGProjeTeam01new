package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class TestBaseBeforeMethodAfterMethod {

   protected WebDriver driver;
    // TestNG framwork unde @Before @After notasyonlari yerine @BeforeMethod @AfterMethod kullanilir
    // Calisma prensibi JUNIT deki @Before, @After ile aynidir
    protected String tarih="";
    @BeforeMethod(groups = "gp1")
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("YYMMDDHHmmss");
        tarih = date.format(dtf);
    }

    @AfterMethod(groups = "gp1")
    public void tearDown(){
        driver.quit();
    }
}
