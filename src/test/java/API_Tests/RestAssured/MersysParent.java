package API_Tests.RestAssured;

import com.github.javafaker.Faker;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeClass;

import java.util.HashMap;
import java.util.Map;
import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

public class MersysParent {
    Faker randomuretici = new Faker();
    RequestSpecification reqSpec;

    @BeforeClass
    public void Setup(){
        baseURI = "https://test.mersys.io";

        Map<String,String> credential = new HashMap<>();
        credential.put("username","turkeyts");
        credential.put("password","TS.%=2025TR");
        credential.put("rememberMe","true");

        String token =
            given()

                    .contentType(ContentType.JSON)
                    .body(credential)

                    .when()
                    .post("/auth/login")

                    .then()
                    .log().body()
                    .statusCode(200)
                    .extract().path("access_token");

        reqSpec = new RequestSpecBuilder()
                .setContentType(ContentType.JSON)
                .addHeader("Authorization","Bearer "+token)
                .build();
    }

}
