package Constants;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpConstants {

    public WebDriver driver;

    public SignUpConstants(WebDriver driver) {

        this.driver = driver;
    }

    By uyeOl = By.xpath("//*[@id=\"header-non-authenticated-navigator\"]/a[2]");
    By name = By.name("name");
    By surName = By.name("surname");
    By email = By.id("email");
    By password = By.name("password");
    By tPassword = By.name("confirmPassword");
    By kvkCheckbox = By.xpath("//*[@id=\"wrapper\"]/div[6]/div/div[2]/div/div[2]/form/label[1]/a/span[2]");
    By kvkOnayButton = By.xpath("#ngdialog2 > div.ngserrwrwdialog-content > button");
    By sozlesmeCheckbox = By.xpath("//*[@id=\"wrapper\"]/div[6]/div/div[2]/div/div[2]/form/label[2]/span[2]");

    public WebElement getUyeOl() {
        return driver.findElement(uyeOl);
    }

    public WebElement getName() {
        return driver.findElement(name);
    }

    public WebElement getSurName() {
        return driver.findElement(surName);
    }

    public WebElement getEmail() { return driver.findElement(email); }

    public WebElement getPassword() {
        return driver.findElement(password);
    }

    public WebElement getConfirmPassword() { return driver.findElement(tPassword); }

    public WebElement getKvkCheckbox() { return driver.findElement(kvkCheckbox); }

    public WebElement getSozlesmeCheckbox() { return driver.findElement(sozlesmeCheckbox); }

    public WebElement getKvkOnayButton() { return driver.findElement(kvkOnayButton);}
}
