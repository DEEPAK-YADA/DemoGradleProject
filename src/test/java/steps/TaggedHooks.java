package steps;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.*;

public class TaggedHooks {

    //GLobal Hooks


    @Before          //i.e means  Before Class
    public void setup(){
        System.out.println("launch browser");
        System.out.println("open URL");
    }

    @After
    public void tearDown(){
        System.out.println("close browser");
    }

    @BeforeStep         //i.e means  Before Class
    public void aa(){
        System.out.println("take scrennshot");
    }

    @AfterStep
    public void bb(){
        System.out.println("Refresh Page");
    }
    @Before("@First")
    public void beforeFirst(){
        System.out.println("before only first scenario");
    }

    @Before("@First")
    public void afterFirst(){
        System.out.println("after only first scenario");
    }

    @Before("@Second")
    public void beforeSecond(){
        System.out.println("before only second scenario");
    }

    @Before("@Second")
    public void afterSecond(){
        System.out.println("after only second scenario");
    }

    @Before("@Second")
    public void beforeThird(){
        System.out.println("before only third scenario");
    }

    @Before("@Second")   //i.e means  Before Method
    public void afterThird(){
        System.out.println("after only third scenario");
    }

    @Given("this is the first step")
    public void this_is_the_first_step() {
        System.out.println("this_is_the_first_step");
    }

    @When("this is the second step")
    public void this_is_the_second_step() {
        System.out.println("this_is_the_second_step");
    }

    @Then("this is the third step")
    public void this_is_the_third_step() {
        System.out.println("this_is_the_third_step");
    }
}
