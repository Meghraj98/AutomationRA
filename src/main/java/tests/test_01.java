package tests;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class test_01 {

    public static void main(String[] args) {

        Response response = RestAssured.get("https://reqres.in/api/users?page=2");
        System.out.println(response.getStatusCode());
        System.out.println(response.getTime());
        System.out.println("hello world");

    }
}
