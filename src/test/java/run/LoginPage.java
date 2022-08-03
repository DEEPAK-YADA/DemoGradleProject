package run;

import base.BaseUtil;
import org.openqa.selenium.By;

public class LoginPage extends BaseUtil {

    By email_txt= By.xpath("//label[contains(text(),'Email:')]/following-sibling::input");
    By pwd_txt= By.xpath("//label[contains(text(),'Password:')]/following-sibling::input");
    By login_bt= By.xpath("//div[@class='buttons']/button");

    public void username(String email){
        getDriver().findElement(email_txt).clear();
        getDriver().findElement(email_txt).sendKeys(email);
    }

    public void password(String pwd){
        getDriver().findElement(pwd_txt).clear();
        getDriver().findElement(pwd_txt).sendKeys(pwd);
    }

    public void clickOnLoginBt(){
        getDriver().findElement(login_bt).click();
    }
}
