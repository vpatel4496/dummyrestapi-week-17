package com.dymmyrestapi.create;

import com.dymmyrestapi.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class CreateEmployee extends TestBase {
    @Test
    public void createEmployeeInfo() {
        Response response = given()
                .when()
                .post("/api/v1/create");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}
