package com.dymmyrestapi.getemployee;

import com.dymmyrestapi.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class GetEmployee extends TestBase {
    @Test
    public void getEmployeeInfo() {
        Response response = given()
                .when()
                .get("/api/v1/employee/1");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}
