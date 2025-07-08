package API_Tests.RestAssured;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class TC_110 extends MersysParent{
Faker randomUreteci = new Faker();
String nameID = "";

@Test
public void getList() {

    given()

            .when()
            .get("/incident-types/list")

            .then()
            .statusCode(200)
            .log().body();
}
@Test
public void addStudent() {
    String a = randomUreteci.leagueOfLegends().champion() ;

    Map<String, Object> nameData = new HashMap<>();
    nameData.put("name", a);
    nameData.put("maxPoint", 70);
    nameData.put("minPoint", 20);
    nameData.put("tenantId", "646cb816433c0f46e7d44cb0");

    nameID =
            given()
                    .spec(reqSpec)
                    .body(nameData)
                    .log().body()
                    .when()
                    .post("/school-service/api/incident-type")
                    .then()
                    .log().body()
                    .statusCode(201)
                    .extract().path("id");
    System.out.println("name Created with ID = " + nameID);
}
@Test(dependsOnMethods ="addStudent")
public void uptadeStudent() {
    String name = "Hero"+randomUreteci.leagueOfLegends().champion() ;

    Map<String, Object> nameData = new HashMap<>();
    nameData.put("name", name);
    nameData.put("maxPoint", 55);
    nameData.put("minPoint", 25);
    nameData.put("id", "68665d7c9bed308e7da822df");
    nameData.put("tenantId", "646cb816433c0f46e7d44cb0");


    given()
            .spec(reqSpec)
            .body(nameData)

            .log().body()
            .when()
            .put("/school-service/api/incident-type")

            .then()
            .log().body()
            .statusCode(200)
    ;
}
@Test(dependsOnMethods ="uptadeStudent")
public void deleteStudent()
{
    given()
            .spec(reqSpec)


            .when()
            .delete("/school-service/api/incident-type/"+nameID)

            .then()
            .log().body()
            .statusCode(200)
    ;
}
}


