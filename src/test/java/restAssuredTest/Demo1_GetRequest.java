package restAssuredTest;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matcher.*;


public class Demo1_GetRequest {
    /*
    given()
         set cookies,add auth,add param,set headers info  etc ......

    when()
            get, post, put,delete ..............

    then()
            validate status code, extract response, extract headers cookies & response body  ............
            */

    @Test
    public void getEmployeeDetails(){
        given()
                .when().
                get("https://dummy.restapiexample.com/api/v1/employee/2")
                        .then()
                .statusCode(200)
                //.assertThat().body("employee_name",equalTo("Garrett Winters"))
                .header("Content-Type","application/json");
        ;

        ;

    }
}
