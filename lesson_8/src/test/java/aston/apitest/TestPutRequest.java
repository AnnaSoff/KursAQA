package aston.apitest;

import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class TestPutRequest {
    private static final String BASE_URL = "https://postman-echo.com";

    @Test
    public void testPutRequest() {
        String requestBody = "This is expected to be sent back as part of response body.";
        given()
                .baseUri(BASE_URL)
                .header("Content-Type", "text/plain")
                .body(requestBody)
                .when()
                .put(BASE_URL + "/put")
                .then()
                .statusCode(200)
                .body("data", equalTo(requestBody))
                .body("url", equalTo("/put"));
    }
}
