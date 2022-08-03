package base;

import org.openqa.selenium.By;

public class CommonClass extends BaseUtil{

    By logOut_Bt= By.xpath("//a[contains(text(),'Logout')]");

    public void logOut(){
        getDriver().findElement(logOut_Bt).click();
    }
}
