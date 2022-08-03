package run;

import base.BaseUtil;
import org.openqa.selenium.By;


public class SearchCustomerPage {

    BaseUtil util=new BaseUtil();

    By txtEmail=By.id("SearchEmail");
    By txtFirstName=By.id("SearchFirstName");
    By txtLastName=By.id("SearchLastName");
    By dd_Month=By.id("SearchMonthOfBirth");
    By dd_Day=By.id("SearchDayOfBirth");
    By dd_Company=By.id("SearchCompany");
    By dd_IP_Add=By.id("SearchIpAddress");
    By search_BT=By.id("search-customers");
    By table=By.xpath("//table[@id='customers-grid']");
    By tableRows=By.xpath("//table[@id='customers-grid']//tbody/tr");
    By tableColumns=By.xpath("//table[@id='customers-grid']//tbody/tr/td");


    public void setEmail(String email){
        util.waitForElement(txtEmail,30);
        util.getDriver().findElement(txtEmail).clear();
        util.getDriver().findElement(txtEmail).sendKeys(email);
    }

    public void setFirstName(String email){
        util.waitForElement(txtFirstName,30);
        util.getDriver().findElement(txtFirstName).clear();
        util.getDriver().findElement(txtFirstName).sendKeys(email);
    }

    public void setLast(String email){
        util.waitForElement(txtLastName,30);
        util.getDriver().findElement(txtLastName).clear();
        util.getDriver().findElement(txtLastName).sendKeys(email);
    }

    public void clickSearchBt(){
        util.getDriver().findElement(search_BT).click();
        util.waitForElement(txtLastName,30);
    }

    public int getNoRows(){
        return util.getDriver().findElements(tableRows).size();
    }

    public int getNoColumns(){
        return util.getDriver().findElements(tableColumns).size();
    }

    public boolean searchCustomerByEmail(String email){
            boolean flag=false;
        for (int i = 1; i <=getNoRows(); i++) {
            By aa=By.xpath("");
                String emaiID=util.getDriver().findElement(table).findElement(By.xpath("//table[@id='customers-grid']//tr["+i+"]/td[2]")).getText();
                if (emaiID.equalsIgnoreCase(email)){
                    flag=true;
                    break;
                }
        }
        return flag;
    }

    public boolean searchByName(String name){
        boolean flag=false;
        for (int i = 1; i <=getNoRows(); i++) {
            By aa=By.xpath("");
            String fName_LName=util.getDriver().findElement(table).findElement(By.xpath("//table[@id='customers-grid']//tr["+i+"]/td[3]")).getText();
            String spilt[]=fName_LName.split(" ");
            if (spilt[0].equals("James") && spilt[1].equals("Pan")){
                flag=true;
                break;
            }
        }
        return flag;
    }
}
