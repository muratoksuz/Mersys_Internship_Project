import API_Tests.RestAssured.MersysParent
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class TC_101 extends MersysParent {

    String stateID;

    @Test(priority = 1)
    public void createState() {
        Map<String, Object> newState = new HashMap<>();
        newState.put("name", "TestState");

        Map<String, String> country = new HashMap<>();
        country.put("id", "63b91ac3-2f31-4bcb-8e92-00e2c6cd3c92"); // Türkiye ID'si gibi

        newState.put("country", country);

        Response response = given()
                .spec(reqSpec)
                .body(newState)
                .when()
                .post("/school-service/api/states")
                .then()
                .statusCode(201)
                .extract().response();

        stateID = response.path("id");
    }

    @Test(priority = 2)
    public void getAllStates() {
        given()
                .spec(reqSpec)
                .when()
                .get("/school-service/api/states")
                .then()
                .statusCode(200)
                .body("content.name", hasItem("TestState"));
    }

    @Test(priority = 3)
    public void updateState() {
        Map<String, Object> updatedState = new HashMap<>();
        updatedState.put("id", stateID);
        updatedState.put("name", "UpdatedState");

        Map<String, String> country = new HashMap<>();
        country.put("id", "63b91ac3-2f31-4bcb-8e92-00e2c6cd3c92");

        updatedState.put("country", country);

        given()
                .spec(reqSpec)
                .body(updatedState)
                .when()
                .put("/school-service/api/states")
                .then()
                .statusCode(200)
                .body("name", equalTo("UpdatedState"));
    }

    @Test(priority = 4)
    public void deleteState() {
        given()
                .spec(reqSpec)
                .when()
                .delete("/school-service/api/states/" + stateID)
                .then()
                .statusCode(anyOf(is(200), is(204)));
    }

    @Test(priority = 5)
    public void deleteStateNegative() {
        given()
                .spec(reqSpec)
                .when()
                .delete("/school-service/api/states/" + stateID)
                .then()
                .statusCode(400); // Zaten silinmiş olduğu için hata beklenir.

    }
}