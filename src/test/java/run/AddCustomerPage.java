package run;

import base.BaseUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class AddCustomerPage  {

    BaseUtil butil=new BaseUtil();

    By lnkCustomers_menu= By.xpath("//a[@href='#']/descendant::p[contains(text(),'Customers')]");
    By lnkCustomers_menuItem= By.xpath("//p[contains(text(),' Customers')]");

    By add_newbtn= By.xpath("//i[@class='fas fa-plus-square']");

    By email_txt= By.xpath("//input[@id='Email']");
    By pwd_txt= By.xpath("//input[@id='Password']");
    By fName_txt=By.xpath("//input[@name='FirstName']");
    By lName_txt=By.xpath("//input[@name='LastName']");
    By male_txt=By.xpath("//input[@name='Gender' and @value='M']");
    By femal_txt=By.xpath("//input[@name='Gender' and @value='F']");
    By customerRole_txt=By.xpath("//label[@id='SelectedCustomerRoleIds_label']/../../following-sibling::div/div/div/div");
    By guest_dd=By.xpath("//li[contains(text(),'Vendors')]");
    By save_bt=By.xpath("//button[@name='save']");
    By ddOfVendor_bt=By.xpath("//select[@id='VendorId']");


    public String getTitle(){
        return butil.getDriver().getTitle();
    }
    public void clickOnCustomerMenu(){
        butil.getDriver().findElement(lnkCustomers_menu).click();
    }

    public void clickOnCustomerMenuItem(){
        butil.getDriver().findElement(lnkCustomers_menuItem).click();
    }

    public void clickOnAddNew(){
        butil.getDriver().findElement(add_newbtn).click();
    }

    public void setEmail(String email){
        butil.getDriver().findElement(email_txt).sendKeys(email);
    }

    public void setPassword(String password){
        butil.getDriver().findElement(pwd_txt).sendKeys(password);
    }

    public void setCustomerRole() throws InterruptedException {
       // butil.getDriver().findElement(customerRole_txt).sendKeys(Keys.BACK_SPACE);
        Thread.sleep(3000);
        butil.getDriver().findElement(customerRole_txt).click();
        butil.getDriver().findElement(guest_dd).click();
    }

    public void setGender(String gender){
        if(gender.equalsIgnoreCase("MALE") ||gender.equalsIgnoreCase("M") ){
            butil.getDriver().findElement(male_txt).click();
        }
       else if(gender.equalsIgnoreCase("FEMALE") ||gender.equalsIgnoreCase("F") ){
            butil.getDriver().findElement(femal_txt).click();
        }
    }

    public void setFirstName(String fName){
        butil.getDriver().findElement(fName_txt).sendKeys(fName);
    }

    public void setLastName(String lName){
        butil.getDriver().findElement(lName_txt).sendKeys(lName);
    }

    public void setManagerOfVendor(String value){
        Select  selObj=new Select(butil.getDriver().findElement(ddOfVendor_bt));
        selObj.selectByValue(value);
    }

    public void clickOnSave() {
        butil.getDriver().findElement(save_bt).click();
    }
}