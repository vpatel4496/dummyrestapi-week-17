package com.dymmyrestapi.testbase;

import io.restassured.RestAssured;
import org.junit.BeforeClass;


public class TestBase {

    @BeforeClass
    public static void inIt() {
        RestAssured.baseURI ="https://dummy.restapiexample.com";
       // RestAssured.port = ;
        RestAssured.basePath = "/";

    }
}
