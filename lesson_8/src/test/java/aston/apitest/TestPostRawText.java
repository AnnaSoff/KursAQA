package aston.apitest;

import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class TestPostRawText {
    private static final String BASE_URL = "https://postman-echo.com";

    @Test
    public void testPostWithRawTextBody() {
        String rawBody = "{\n  \"test\": \"value\"\n}";
        given()
                .baseUri(BASE_URL)
                .header("Content-Type", "text/plain")
                .body(rawBody)
                .when()
                .post(BASE_URL + "/post")
                .then()
                .statusCode(200)
                .body("data", equalTo(rawBody))
                .body("headers.content-type", equalTo("text/plain"))
                .body("url", equalTo("/post"));
    }
}
