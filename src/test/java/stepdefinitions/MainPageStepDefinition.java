package stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.MainPageSteps;

public class MainPageStepDefinition {

    @Steps
    MainPageSteps mainPageSteps;

    @Given("^I access main page \"([^\"]*)\"$")
    public void i_access_main_page(String arg1) {
        mainPageSteps.openMainPage();
    }


    @When("^I click at log in button$")
    public void i_click_at_log_in_button() {
        mainPageSteps.clickOnTheLoginPop();
    }

    @When("^Enter login$")
    public void enter_login() {
        mainPageSteps.enterLogin();
    }

    @When("^Enter pass$")
    public void enter_pass() {
        mainPageSteps.enterPassword();
    }

    @When("^Click at log in button$")
    public void click_at_log_in_button() {
        mainPageSteps.logIn();
    }

    @Then("^I logged in$")
    public void i_logged_in() {
        mainPageSteps.checkLogIn();
    }

    @When("^I click to the search button$")
    public void i_click_to_the_search_button() {
        mainPageSteps.clickAtTheSearchField();
    }

    @When("^Enter my lovely composition$")
    public void enter_my_lovely_composition() {
        mainPageSteps.enterAtSearchField();
    }

    @Then("^I can see my lovely song$")
    public void i_can_see_my_lovely_song() {
        mainPageSteps.clickAtTheSearchField();
    }

    @Then("^Play it$")
    public void play_it() {
        mainPageSteps.playMusic();
    }


}
