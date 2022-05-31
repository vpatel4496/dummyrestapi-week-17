package com.dymmyrestapi.update;

import com.dymmyrestapi.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class UpdateEmployee extends TestBase {
    @Test
    public void updateEmployeeInfo() {
        Response response = given()
                .when()
                .put("/api/v1/update/21/");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}
