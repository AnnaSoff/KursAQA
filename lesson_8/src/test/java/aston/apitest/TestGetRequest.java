package aston.apitest;

import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class TestGetRequest {
    private static final String BASE_URL = "https://postman-echo.com";

    @Test
    void getRequest_shouldReturnCorrectResponse() {
        given()
                .baseUri(BASE_URL)        
                .queryParam("foo1", "bar1")
                .queryParam("foo2", "bar2")
                .when()
                .get(BASE_URL + "/get")
                .then()
                .statusCode(200)
                .body("args.foo1", equalTo("bar1"))
                .body("args.foo2", equalTo("bar2"))
                .body("url", equalTo("/get"))
                .extract().response();
    }
}
