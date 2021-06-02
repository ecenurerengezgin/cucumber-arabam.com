package Constants;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageConstants {
    public WebDriver driver;

    public LoginPageConstants(WebDriver driver) {

        this.driver = driver;
    }

    By girisYap = By.xpath("//*[@id=\"header-non-authenticated-navigator\"]/a[1]");
    By userName = By.name("userName");
    By password = By.name("password");
    By rememberMe = By.id("rememberMe");


    public WebElement getGirisYap() {
        return driver.findElement(girisYap);
    }

    public WebElement getUserName() {
        return driver.findElement(userName);
    }

    public WebElement getPassword() {
        return driver.findElement(password);
    }

    public WebElement getRememberMe() {
        return driver.findElement(rememberMe);

    }
}
