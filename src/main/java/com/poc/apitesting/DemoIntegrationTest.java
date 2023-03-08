package com.poc.apitesting;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class DemoIntegrationTest {


    public static void shouldGetDetailsAboutXXX() {
         Response response = given()
                .contentType(ContentType.JSON)
                .get("https://jsonplaceholder.typicode.com/todos/{id}", 1);
         String output = response.asString();
         System.out.println(output);

    }

}
