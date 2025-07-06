package API_Tests.RestAssured;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class CityTest extends MersysParent {
    String CityID = "";
    String lastCreatedCityName = "";
    String nameID = "";
    @Test
    public void GetCities() {
        given()
                .spec(reqSpec)
                .when()
                .get("/school-service/api/cities")
                .then()
                .statusCode(200)
                .time(lessThan(1000L))
        ;
    }


    @Test(dependsOnMethods = "GetCities")
    public void CreateCity() {
        String cityName = randomuretici.address().cityName() + randomuretici.number().digits(4);
        String countryId = "685998ef8ed86951f650b876";

        Map<String, Object> cityData = new HashMap<>();
        cityData.put("id", null);
        cityData.put("name", cityName);
        cityData.put("state", null);
        cityData.put("translateName", new ArrayList<>());

        Map<String, String> country = new HashMap<>();
        country.put("id", countryId);

        cityData.put("country", country);

        CityID =
                given()
                        .spec(reqSpec)
                        .body(cityData)
                        .log().body()
                        .when()
                        .post("/school-service/api/cities")
                        .then()
                        .log().body()
                        .statusCode(201)
                        .extract().path("id");

        System.out.println("City Created with ID = " + CityID);
    }







    @Test(dependsOnMethods = "CreateCity")
    public void CreateCityNegative() {

        Map<String, Object> cityData = new HashMap<>();
        cityData.put("id", null);
        cityData.put("name", lastCreatedCityName);
        cityData.put("state", null);
        cityData.put("translateName", new ArrayList<>());

        Map<String, String> country = new HashMap<>();
        country.put("id", "685998ef8ed86951f650b876");

        cityData.put("country", country);

        given()
                .spec(reqSpec)
                .body(cityData)
                .log().body()
                .when()
                .post("/school-service/api/cities")
                .then()
                .log().body()
                .statusCode(400)
                .body("fieldErrors[0].message", containsString("NAME_CANNOT_EMPTY_OR_NULL"))
        ;
    }


    @Test(dependsOnMethods = "CreateCity")
    public void UpdateCity() {
        String updatedCityName = "Updated_" + randomuretici.address().cityName() + randomuretici.number().digits(3);

        Map<String, Object> updateCity = new HashMap<>();
        updateCity.put("id", CityID);
        updateCity.put("name", updatedCityName);
        updateCity.put("translateName", new ArrayList<>());

        Map<String, String> country = new HashMap<>();
        country.put("id", "685998ef8ed86951f650b876");
        updateCity.put("country", country);


        Map<String, String> emptyState = new HashMap<>();
        emptyState.put("id", null);
        updateCity.put("state", emptyState);

        given()
                .spec(reqSpec)
                .body(updateCity)
                .log().body()
                .when()
                .put("/school-service/api/cities")
                .then()
                .log().body()
                .statusCode(200)
                .body("name", equalTo(updatedCityName));
    }
    @Test(dependsOnMethods = "UpdateCity")
    public void DeleteCity() {

        given()
                .spec(reqSpec)
                .pathParam("cityId", CityID)

                .when()
                .delete("/school-service/api/cities/{cityId}")

                .then()
                .log().body()
                .statusCode(200);
    }

}
