package com.dymmyrestapi.get;

import com.dymmyrestapi.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class GetEmployees extends TestBase {
    @Test
    public void getAllEmployeesInfo() {
        Response response = given()
                .when()
                .get("api/v1/employees");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}