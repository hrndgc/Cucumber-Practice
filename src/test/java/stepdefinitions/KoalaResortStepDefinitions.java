package stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.KoalaResortPage;
import utilities.ConfigReader;
import utilities.Driver;

public class KoalaResortStepDefinitions {
    KoalaResortPage koalaResortPage = new KoalaResortPage();

    @Then("Log in yazisina tiklar")
    public void log_in_yazisina_tiklar() {
        koalaResortPage.ilkLoginLinki.click();
    }

    @Then("gecerli username girer")
    public void gecerli_username_girer() {
        koalaResortPage.userTextBox.sendKeys(ConfigReader.getProperty("kr_valid_username"));
    }

    @Then("gecerli password girer")
    public void gecerli_password_girer() {
        koalaResortPage.passwordTextBox.sendKeys(ConfigReader.getProperty("kr_valid_password"));
    }

    @Then("Login butonuna basar")
    public void login_butonuna_basar() {
        koalaResortPage.loginButonu.click();
    }

    @Then("sayfaya giris yaptigini kontrol eder")
    public void sayfaya_giris_yaptigini_kontrol_eder() {
        Assert.assertEquals(ConfigReader.getProperty("kr_basarili_giris_url"), Driver.getDriver().getCurrentUrl());
    }

    @Then("kullanıcı ismi olarak {string} girer")
    public void kullanıcı_ismi_olarak_girer(String userName) {
        koalaResortPage.userTextBox.sendKeys(ConfigReader.getProperty(userName));
    }

    @Then("kullnıcı password olarak {string} girer")
    public void kullnıcı_password_olarak_girer(String password) {
        koalaResortPage.passwordTextBox.sendKeys(ConfigReader.getProperty(password));

    }

    @Then("sayfaya giris yapılmadigini kontrol eder")
    public void sayfaya_giris_yapılmadigini_kontrol_eder() {
        Assert.assertTrue(koalaResortPage.girilemediYazisi.isDisplayed());
    }


}
