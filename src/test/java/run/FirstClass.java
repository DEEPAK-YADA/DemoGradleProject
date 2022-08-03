package run;

import base.BaseUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstClass extends BaseUtil {

 By submit_bt= By.xpath("//button[@id='submitbtn']");
 By skip_Bt= By.xpath("//button[@id='btn2']");
 By fName_txt=By.xpath("//input[@ng-model='FirstName']");
 By lName_txt=By.xpath("//input[@ng-model='LastName']");
 By address_txt=By.xpath("//label[contains(text(),'Address')]/following-sibling::div/descendant::textarea");
 By email_txt= By.xpath("//input[@ng-model='EmailAdress']");
 By phone_txt= By.xpath("//input[@ng-model='Phone']");
 By gen_rdbtn= By.xpath("//input[@type='radio' and @value='Male']");
 By sign_bt=By.xpath("//button[@id='btn1']");
 By country_dd= By.xpath("//select[@id='countries']");

//@Test
//   public void m1(){
//    System.setProperty("webdriver.chrome.driver","chromedriver.exe");
//        WebDriver driver =new ChromeDriver();
//        driver.get("http://demo.automationtesting.in/");
//
//    }
    public void username(){
//        getDriver().findElement(uname).clear();
//        getDriver().findElement(uname).sendKeys("");
    }

 public void clickSkipBt(){
        getDriver().findElement(skip_Bt).click();
 }
    public void fillTheForm(){
        getDriver().findElement(fName_txt).sendKeys("deepak");
        getDriver().findElement(lName_txt).sendKeys("yadavG");
        getDriver().findElement(address_txt).sendKeys("Sanatcruz east");
        getDriver().findElement(email_txt).sendKeys("qwe@gmail.com");
        getDriver().findElement(phone_txt).sendKeys("1234567890");
        getDriver().findElement(gen_rdbtn).click();
        getDriver().findElement(submit_bt).click();
    }

    public void clickOnSign(){
        getDriver().findElement(sign_bt).click();
    }

}
