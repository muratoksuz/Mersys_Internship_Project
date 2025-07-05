package API_Tests.RestAssured;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static API_Tests.RestAssured.TC_106.StudentID;
import static io.restassured.RestAssured.given;

public class TC_107 extends MersysParent{

    String groupId = "685ed7774c3e939a5dd3ddc8";

    @Test (dependsOnMethods = "TC_106")
    public void DeleteStudent() {

        String body = """
        [
          "%s"
        ]
        """.formatted(StudentID);

        given()
                .spec(reqSpec)
                .contentType(ContentType.JSON)
                .body(body)
                .when()
                .post("/school-service/api/student-group/"+groupId+"/remove-students?page=0&size=10")
                .then()
                .log().all()
                .statusCode(200);


    }


    @Test
    public void StudentList() {


        given()
                .spec(reqSpec)
                .when()
                .get("/school-service/api/students/group/" + groupId + "?page=0&size=10")
                .then()
                .statusCode(200);

        System.out.println();

    }


}
