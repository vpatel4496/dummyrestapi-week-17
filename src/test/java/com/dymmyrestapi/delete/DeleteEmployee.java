package com.dymmyrestapi.delete;

import com.dymmyrestapi.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class DeleteEmployee extends TestBase {
    @Test
    public void deleteEmployeeInfo() {
        Response response = given()
                .when()
                .delete("/api/v1/delete/7");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}
