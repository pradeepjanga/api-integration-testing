package com.poc.apitesting;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class DemoIntegrationTest {


    public static void shouldCallGetXXX() {
         Response response = given()
                .contentType(ContentType.JSON)
                .get("https://jsonplaceholder.typicode.com/posts/{id}", 1);
         String output = response.asString();
         System.out.println(output);
    }

    public static void shouldCallPOSTXXX() {

        String jsonPostBody = "{" +
                "\"title\": \"foo\"," +
                " \"body\": \"bar\"," +
                " \"userId\": 1" +
                " }";

        Response response = given()
                .contentType("application/json").body(jsonPostBody)
                .when()
                .post("https://jsonplaceholder.typicode.com/posts");
        String output = response.asString();
        System.out.println(output);
    }

    public static void shouldCallPUTXXX() {
        String jsonPostBody = "{" +
                "\"id\": 12,"+
                "\"title\": \"foo\"," +
                " \"body\": \"bar\"," +
                " \"userId\": 1" +
                " }";

        Response response = given()
                .contentType("application/json").body(jsonPostBody)
                .when()
                .put("https://jsonplaceholder.typicode.com/posts/{Id}", 1);
        String output = response.asString();
        System.out.println(output);
    }

    public static void shouldCallDELETEXXX() {
        Response response = given()
                .contentType(ContentType.JSON)
                .delete("https://jsonplaceholder.typicode.com/posts/{id}", 1);
        String output = response.asString();
        System.out.println(output);
    }

}
