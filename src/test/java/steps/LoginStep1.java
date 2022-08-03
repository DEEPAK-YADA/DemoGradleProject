package steps;

import base.CommonClass;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.testng.Assert;
import run.AddCustomerPage;
import run.LoginPage;
import run.SearchCustomerPage;

public class LoginStep1 {

    LoginPage lpage =new LoginPage();
    AddCustomerPage addcust=new AddCustomerPage();
    SearchCustomerPage seacrchCust=new SearchCustomerPage();
    CommonClass  commonPg=new CommonClass();

    @Given("User Launch chrome browser new")
    public void launchbrowser() {
    lpage.getDriver().manage().window().maximize();
    }

    @When("User opens URL{string}")
    public void openurl(String url) {
        lpage.logger.info("*****************   opening  URL  *****************");
        lpage.getDriver().get(url);
    }

    @When("User enters Email as {string} and Password as {string}")
    public void user_enters_email_as_and_password_as(String email, String pwd) {
        lpage.logger.info("*****************   providing Login details  *****************");
        lpage.username(email);
        lpage.password(pwd);
    }

    @When("Click on Login")
    public void click_on_login() {
        lpage.logger.info("*****************   started Login   *****************");
        lpage.clickOnLoginBt();
    }

    @Then("User can view Dashboard")
    public void verifyOnDashboard() {
        String expTitle=lpage.getDriver().getTitle();
        Assert.assertEquals("Dashboard / nopCommerce administration",expTitle);
    }

    @When("User click on customers Menu")
    public void user_click_on_customers_menu() {
        addcust.clickOnCustomerMenu();
    }

    @When("Click on customers Menu Item")
    public void click_on_customers_menu_item() {
        addcust.clickOnCustomerMenuItem();
    }

    @When("click on Add a new button")
    public void clickAddNewButton() {
        addcust.clickOnAddNew();
    }

    @Then("user can view Add new customers page")
    public void user_can_view_add_new_customers_page() {
        Assert.assertEquals("Add a new customer / nopCommerce administration",addcust.getTitle());
    }

    @When("user enters customer info")
    public void user_enters_customer_info() throws InterruptedException {
        lpage.logger.info("*****************   Adding new customer  ****************");
        lpage.logger.info("*****************   providing customer details  *****************");
        String email=lpage.randomString()+"@gmail.com";
        addcust.setEmail(email);
        addcust.setPassword("test123455");
        addcust.setGender("M");
        //addcust.setCustomerRole();
        addcust.setFirstName("CHANDAN Ji");
        addcust.setLastName("Kumar");
    }

    @When("click on Save button")
    public void clickSaveButton() {
        lpage.logger.info("*****************   saving customer data  *****************");
        addcust.clickOnSave();
    }

    @Then("User can view configuration message {string}")
    public void user_can_view_configuration_message(String string) {
    Assert.assertTrue(lpage.getDriver().findElement(By.tagName("body")).getText().
            contains("The new customer has been added successfully."));
    }

    @Then("close browser new")
    public void close_browser() {
        lpage.logger.info("*****************   sucessfully logout  *****************");
        commonPg.logOut();
    }

    // Search By Emai ID
    @When("Enters Customer Email")
    public void enterCustomerEmail() {
        lpage.logger.info("*****************   searching email ID  *****************");
        seacrchCust.setEmail("victoria_victoria@nopCommerce.com");
    }

    @When("Click on search button")
    public void clickOnSearchButton() {
        seacrchCust.clickSearchBt();
    }

    @Then("User should found Email in the search table")
    public void userFoundEmailTable() {
        boolean status=seacrchCust.searchCustomerByEmail("victoria_victoria@nopCommerce.com");
        Assert.assertEquals(true,status);
    }


    ////Seacrch By Name

    @When("Enters Customer firstName")
    public void enters_customer_first_name() {
        lpage.logger.info("*****************   searching member name  *****************");
        seacrchCust.setFirstName("James");
    }

    @When("Enters Customer lastName")
    public void enters_customer_last_name() {
        seacrchCust.setLast("Pan");
    }

    @Then("User should found Name in the search table")
    public void user_should_found_name_in_the_search_table() {
        boolean status=seacrchCust.searchByName("James Pan");
        Assert.assertEquals(true,status);
    }
}
