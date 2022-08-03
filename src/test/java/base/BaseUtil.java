package base;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;


public class BaseUtil {
    public static WebDriver driver;
    public static Logger logger;
    public Properties prop;
    public WebDriver getDriver(){
        if(driver==null){
            //Reading Properties
            //prop=new Properties();
            //FileInputStream fis=new FileInputStream("config.properties");
            logger=Logger.getLogger("DemoGradle");     //Added logger
            PropertyConfigurator.configure("log4j.properties");   //Added logger
            System.setProperty("webdriver.chrome.driver","chromedriver.exe");
            driver=new ChromeDriver();
            logger.info("*****************   launching Browser  *****************");
        }return driver;

    }
    public static String randomString() {
        return RandomStringUtils.randomAlphabetic(5);

    }
    public void waitForElement(By element, long timeOutInSeconds){
        WebDriverWait wait=new WebDriverWait(getDriver(), Duration.ofSeconds(timeOutInSeconds));
        wait.until(ExpectedConditions.visibilityOf(getDriver().findElement(element)));
    }
}
