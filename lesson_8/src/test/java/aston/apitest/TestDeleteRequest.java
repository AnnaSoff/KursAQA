package aston.apitest;

import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class TestDeleteRequest {
    private static final String BASE_URL = "https://postman-echo.com";

    @Test
    public void testDeleteRequest() {
        String body = "This is expected to be sent back as part of response body.";
        given()
                .baseUri(BASE_URL)
                .header("Content-Type", "text/plain")
                .body(body)
                .when()
                .delete(BASE_URL + "/delete")
                .then()
                .statusCode(200)
                .body("data", equalTo(body))
                .body("url", equalTo("/delete"));
    }
}
