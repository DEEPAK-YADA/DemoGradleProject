package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class HookStep {

//    @Before
//    public void setup(){
//        System.out.println("launch browser");
//        System.out.println("open URL");
//    }
//
//    @After
//    public void tearDown(){
//        System.out.println("close browser");
//    }
    @Given("user login the RCM Application")
    public void user_login_the_rcm_application() {
    System.out.println("Step1");
    }

    @When("user enter the club name or member name")
    public void user_enter_the_club_name_or_member_name() {
        System.out.println("Step2");
    }

    @Given("user pull the data on batch")
    public void user_pull_the_data_on_batch() {
        System.out.println("Scenario2 Step1");
    }

    @When("user search the data on batch")
    public void user_search_the_data_on_batch() {
        System.out.println("Scenario2 Step2");
    }
}
