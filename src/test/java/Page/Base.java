package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Base {

    public static WebDriver driver;
    public static Properties prop;

    public static WebDriver getDriver() throws IOException {

        prop = new Properties();
        FileInputStream file = new FileInputStream("C:/Otomasyon/src/test/java/Page/global.properties");
        prop.load(file);
        System.setProperty("webdriver.chrome.driver","C:/selenium1/Drivers/ChromeDriver/chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get(prop.getProperty("url"));
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        return driver;


    }



    public void tearDown() {
        driver.quit();
    }


}
