package testRunner;


//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
//import org.junit.runner.RunWith;
//import cucumber.api.CucumberOptions;
//import cucumber.api.CucumberOptions;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

//@RunWith(Cucumber.class)
@CucumberOptions(
                    features ={"src/test/java/features/TaggedHooks.feature"},//src/test/java/features/Login.feature
                    glue="steps",
                    dryRun = false,
                    monochrome = true,
                    plugin={"pretty","html:test-output"}
                   // tags= "@regression"
)
public class TestRun extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider
    public Object[][] scenarios() {
        return super.scenarios();
    }
//    @BeforeClass
//    public void setUp(){
//    }
//
//    @AfterClass
//    public void TearDownTest() {
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        // getDriver().quit();
//    }

}
