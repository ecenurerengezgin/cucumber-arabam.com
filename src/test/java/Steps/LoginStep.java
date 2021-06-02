package Steps;

import Constants.LoginPageConstants;
import Page.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;


public class LoginStep extends Base {
    public WebDriver driver;
    LoginPageConstants login ;



    @Step("Anasayfa Aç")
    @Given("^Browser anasayfa kal$")
    public void browser_anasayfa_kal() throws Throwable {
        driver = Base.getDriver();
    }
    @Step("Giris yap tıkla")
    @When("^giris yap hyperlink tikla$")
    public void giris_yap_hyperlink_tikla() throws Throwable {
        login = new LoginPageConstants(driver);
        login.getGirisYap().click();

    }
    @Step("sayfanın title ve url kontrol et")
    @Then("^sayfanin title ve url kontrol et$")
    public void sayfanin_title_kontrol_et() throws Throwable {
        Assert.assertTrue(driver.getTitle().contains("Üye Girişi"));
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.arabam.com/uyelik?returnUrl=%2F");

    }
    @Step("kullanıcı adı: {0} bilgisini gir")
    @And("^kullanici bilgisi \"([^\"]*)\" gir$")
    public void kullanici_bilgisi_something_gir(String user) throws Throwable {
        login.getUserName().sendKeys(user);
    }
    @Step("kullanıcı password gir")
    @And("^kullanici password \"([^\"]*)\" gir$")
    public void kullanici_password_something_gir(String password) throws Throwable {
        login.getPassword().sendKeys(password);
    }
    @Step("beni hatirla checkbox tikla")
    @And("^beni hatirla checkbox tikla$")
    public void beni_hatirla_checkbox_tikla() throws Throwable {
        login.getRememberMe().click();
        login.getRememberMe().isSelected();

    }


}
