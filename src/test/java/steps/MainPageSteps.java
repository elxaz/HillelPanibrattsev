package steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import pages.MainPage;

public class MainPageSteps {
    MainPage mainPage;

    @Step
    public void openMainPage(){
        mainPage.open();
    }

    @Step
    public void clickOnTheLoginPop() {
        mainPage.clickOnLogInPopButton();
    }

    @Step
    public void enterLogin() {
        mainPage.loginField.sendKeys("lexa.pan2014@gmail.com");
    }

    @Step
    public void enterPassword() {
        mainPage.passwordField.sendKeys("01122000");
    }

    @Step
    public void logIn() {
        mainPage.clickOnLogInButton();
    }

    @Step
    public void checkLogIn() {
        Assert.assertTrue(mainPage.userName.isDisplayed());
    }

    @Step
    public void clickAtTheSearchField() {
        mainPage.clickOnSearchField();
    }

    @Step
    public void enterAtSearchField() {
        mainPage.searchField.sendKeys("deftones\n");
    }

    @Step
    public void playMusic() {
        Assert.assertTrue(mainPage.song.isDisplayed());
        mainPage.clickOnPlayButton();
    }
}
