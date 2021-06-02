package Steps;

import Constants.SignUpConstants;
import Page.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.qameta.allure.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class SignUpStep extends Base {
    public WebDriver driver;
    SignUpConstants signUp ;

    @Step("üye ol tikla")
    @When("^uye ol hyperlink tikla$")
    public void uye_ol_hyperlink_tikla() throws Throwable {
        driver = Base.getDriver();
        signUp = new SignUpConstants(driver);
        signUp.getUyeOl().click();

    }
    @Step("Sayfanın title ve url kontrol et")
    @Then("^sayfanin title \"([^\"]*)\" ve url \"([^\"]*)\" kontrol et$")
    public void sayfanin_title_something_ve_url_something_kontrol_et(String strArg1, String strArg2) throws Throwable {
        Assert.assertTrue(driver.getTitle().contains(strArg1));
        Assert.assertEquals(driver.getCurrentUrl(), strArg2);

    }
    //@Step("kullanıcı  adı: {0} gir")
    @Test(priority = 2, description = "kullanici adi gir")
    @Severity(SeverityLevel.CRITICAL)
    @Description("test case description: kullanici")
    @Story("story name : user")
    @And("^kullanici ad \"([^\"]*)\" gir$")
    public void kullanici_ad_something_gir(String name) throws Throwable {
        signUp.getName().sendKeys(name);


    }
    @Step("soyad alanı doldur")
    @And("^kullanici soyad \"([^\"]*)\" gir$")
    public void kullanici_soyad_something_gir(String surname) throws Throwable {
        signUp.getSurName().sendKeys(surname);

    }
    @Step("email alanı doldur")
    @And("^kullanici email \"([^\"]*)\" gir$")
    public void kullanici_email_something_gir(String email) throws Throwable {
        signUp.getEmail().sendKeys(email);

    }
    @Step("şifre alanı doldur")
    @And("^kullanici sifre \"([^\"]*)\" gir$")
    public void kullanici_sifre_something_gir(String password) throws Throwable {
        signUp.getPassword().sendKeys(password);

    }
    @Step("şifre alanini tekrar doldur")
    @And("^kullanici tekrar sifre \"([^\"]*)\" gir$")
    public void kullanici_tekrar_sifre_something_gir(String password) throws Throwable {
        signUp.getConfirmPassword().sendKeys(password);

    }
    @Step("kvk checkbox tıkla")
    @And("^Kvk checkbox tikla$")
    public void kvk_checkbox_tikla() throws Throwable {
        //signUp.getKvkCheckbox().click();
        //signUp.getKvkOnayButton().click();
        //signUp.getKvkCheckbox().isSelected();


    }
    @Step("sözleşme checkbox tikla")
    @And("^sozleşme checkbox tikla$")
    public void sozleme_checkbox_tikla() throws Throwable {
        signUp.getSozlesmeCheckbox().click();
        signUp.getSozlesmeCheckbox().isSelected();
    }

}
