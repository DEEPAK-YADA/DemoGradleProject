package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import run.FirstClass;

public class LoginStep {

    FirstClass fclass=new FirstClass();

    @Given("User Launch chrome browser")
    public void launchbrowser() {

    }

    @When("user opens URL{string}")
    public void openUrl(String url) {
        fclass.getDriver().get(url);
    }

    @When("user enters Email as {string} and password as {string}")
    public void user_enters_email_as_and_password_as(String string, String string2) {

    }

    @When("click on login button")
    public void click_on_login_button() {
        fclass.clickSkipBt();
        fclass.fillTheForm();

    }

    @Then("page title should be {string}")
    public void page_title_should_be(String title) {
        if(fclass.getDriver().getPageSource().contains(" Invalid User Name or PassWord ")){
            fclass.getDriver().close();
            Assert.assertTrue(false);
        }else {
            Assert.assertEquals(title,fclass.getDriver().getTitle());
        }
    }

    @Then("close browser")
    public void close_browser() {
            fclass.getDriver().close();
    }

}
