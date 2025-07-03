package API_Tests.RestAssured;

import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;

public class TC_106 extends MersysParent{

    String StudentID = "";
    String groupId = "685ed7774c3e939a5dd3ddc8";

    @Test(priority = 1)
    public void SearchStudent() {

        String requestBody = """
                {
                    "studentId": "",
                    "classId": "65770d9b8af7ce488ac69bb6",
                    "schoolId": "6576fd8f8af7ce488ac69b89",
                    "firstName": "",
                    "lastName": "",
                    "gender": null,
                    "status": null,
                    "exceptIds": [],
                    "schoolClassIds": [],
                    "departmentId": null,
                    "pageSize": 10,
                    "pageIndex": 0,
                    "classStudentIds": [],
                    "academicPeriodId": "65779022e8af7ce488ac69b96"
                }
                """;

        Response response = given()
                .spec(reqSpec)
                .body(requestBody)
                .when()
                .post("/school-service/api/classes/students/pageable?page=0&size=10")
                .then()
                .statusCode(200)
                .extract().response();

        StudentID = response.jsonPath().getString("content[0].id");
        System.out.println("Eklenecek öğrencinin ID: " + StudentID);
    }


    @Test(priority = 2)
    public void AddStudent() {

        List<String> studentList = new ArrayList<>();
        studentList.add(StudentID);

        given()
                .spec(reqSpec)
                .body(studentList)
                .when()
                .post("/school-service/api/student-group/" + groupId + "/add-students?page=0&size=10")
                .then()
                .statusCode(200);

        System.out.println();

    }

    @Test(priority = 3)
    public void getStudentDetails() {

        given()
                .spec(reqSpec)
                .when()
                .get("/school-service/api/student-group/" + groupId + "?page=0&size=10")
                .then()
                .statusCode(200)
                .log().body();
    }

}
