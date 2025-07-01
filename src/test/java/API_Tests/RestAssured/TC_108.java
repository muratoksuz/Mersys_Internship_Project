package API_Tests.RestAssured;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class TC_108 extends MersysParent {

    String xTenant = "646cb816433c0f46e7d44cb0";
    String schoolID = "6576fd8f8af7ce488ac69b89";
    String standardId = "";

    @Test
    public void GetEducationStandards() {
        given()
                .spec(reqSpec)
                .when()
                .get("/school-service/api/subjects/" + xTenant + "/tenant/" + schoolID + "/school/keyvalue")
                .then()
                .log().body()
                .statusCode(200);
    }

    @Test
    public void CreateEducationStandard() {

        Map<String, String> standardMap = new HashMap<>();
        standardMap.put("name", "Trial25");
        standardMap.put("description", "Trial25 Description");
        standardMap.put("gradeLevelId", "65489964e70d9e34a8331e57");
        standardMap.put("calculationMode", "MEAN");
        standardMap.put("gradeCategoriesTemplateId", "646dff4eab1d8d3d700f1037");
        standardMap.put("gradeCategoryId", "e38e-911f");
        standardMap.put("numberOfScores", "5");
        standardMap.put("parentStandardCalculationStarategy", "TURN_OFF");
        standardMap.put("subjectId", "657705ec8af7ce488ac69ba5");

        standardId =
                given()
                        .spec(reqSpec)
                        .body(standardMap)

                        .when()
                        .post("/school-service/api/education-standard")

                        .then()
                        .log().body()
                        .statusCode(201)
                        .extract().path("id");

    }

    @Test
    public void UpdateEducationStandard() {

        Map<String, String> standardMap2 = new HashMap<>();
        standardMap2.put("id",standardId);
        standardMap2.put("name", "Trial35");
        standardMap2.put("description", "Trial35 Description");
        standardMap2.put("gradeLevelId", "65489964e70d9e34a8331e57");
        standardMap2.put("calculationMode", "MEAN");
        standardMap2.put("gradeCategoriesTemplateId", "646dff4eab1d8d3d700f1037");
        standardMap2.put("gradeCategoryId", "e38e-911f");
        standardMap2.put("numberOfScores", "5");
        standardMap2.put("parentStandardCalculationStarategy", "TURN_OFF");
        standardMap2.put("subjectId", "657705ec8af7ce488ac69ba5");


        given()
                .spec(reqSpec)
                .body(standardMap2)

                .when()
                .put("/school-service/api/education-standard")

                .then()
                .log().body()
                .statusCode(200);

    }

    @Test
    public void DeleteEducationStandard() {

        given()
                .spec(reqSpec)

                .when()
                .delete("/school-service/api/education-standard/"+standardId)

                .then()
                .log().body()
                .statusCode(204);

    }

    @Test
    public void DeleteEducationStandardNegative() {

        given()
                .spec(reqSpec)

                .when()
                .delete("/school-service/api/education-standard/"+standardId)

                .then()
                .log().body()
                .statusCode(400);

    }


}
