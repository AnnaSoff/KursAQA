package aston.apitest;

import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class TestPatchRequest {
    private static final String BASE_URL = "https://postman-echo.com";
    
    @Test
    public void testPatchRequest() {
        String body = "This is expected to be sent back as part of response body.";
        given()
                .baseUri(BASE_URL)
                .header("Content-Type", "text/plain")
                .body(body)
                .when()
                .patch(BASE_URL + "/patch")
                .then()
                .statusCode(200)
                .body("data", equalTo(body))
                .body("url", equalTo("/patch"));
    }

}
