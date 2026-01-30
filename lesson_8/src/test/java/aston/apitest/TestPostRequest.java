package aston.apitest;

import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class TestPostRequest {
    private static final String BASE_URL = "https://postman-echo.com";

    @Test
    public void testPostRequest() {
        EchoRequest request = new EchoRequest("bar1", "bar2");
        given()
                .baseUri(BASE_URL)
                .queryParam("foo1", "bar1")
                .queryParam("foo2", "bar2")
                .body(request)
                .when()
                .post(BASE_URL + "/post")
                .then()
                .statusCode(200)
                .body("json.foo1", equalTo("bar1"))
                .body("json.foo2", equalTo("bar2"))
                .body("url",equalTo("/post"));
    }
}
