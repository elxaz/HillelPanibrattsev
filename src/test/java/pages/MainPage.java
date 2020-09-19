package pages;
import cucumber.api.java.en.And;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends Utils {

    @FindBy(xpath = "//ul[@class='ho_menu ho_menu-account']//li[1]//a[1]")
    public WebElement logInPopButton;

    @FindBy(xpath = "//input[@name='words']")
    public WebElement searchField;

    @FindBy(xpath = "//input[@name='login']")
    public WebElement loginField;

    @FindBy(xpath = "//input[@name='pass']")
    public WebElement passwordField;

    @FindBy(xpath = "//*[@id=\"FloatLogin\"]/div/div/form/input[6]")
    public WebElement logInButton;

    @FindBy(xpath = "//span[@class='user_name']")
    public WebElement userName;

    @FindBy(xpath = "//tr[3]//td[1]//a[1]//span[1]//i[1]")
    public WebElement playButton;

    @FindBy(xpath = "//a[contains(text(),'My Own Summer (Shove It) (Deftones)')]")
    public WebElement song;

    public void clickOnLogInPopButton() {
        logInPopButton.click();
    }

    public void clickOnSearchField() {
        searchField.click();
    }

    public void clickOnLogInButton() {
        logInButton.click();
    }

    public void clickOnPlayButton() {
        playButton.click();
    }
}

