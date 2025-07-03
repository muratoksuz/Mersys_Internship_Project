package API_Tests.RestAssured;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class TC_105 extends MersysParent{

    String SchoolId="6576fd8f8af7ce488ac69b89";
    String GroupId="";

    @Test
    public void CreateStudentGroup(){

        Map<String,String>newGroup=new HashMap<>();
        newGroup.put("schoolId",SchoolId);
        newGroup.put("name","Java6 Study Group");
        newGroup.put("description","Group for students taking Java6 classes.");
        newGroup.put("active","true");
        newGroup.put("public","false");
        newGroup.put("visibilitytoStudent","true");


       GroupId=
        given()

                .spec(reqSpec)
                .body(newGroup)

                .when()
                .post("https://test.mersys.io/school-service/api/student-group")

                .then()
                .statusCode(201)
                .log().body()
                .extract().path("id")
       ;

        System.out.println("GroupId = " + GroupId);
    }


    @Test(dependsOnMethods = "CreateStudentGroup")
    public void UpdateGroup(){
        Map<String,String>updatenewGroup=new HashMap<>();
        updatenewGroup.put("id",GroupId);
        updatenewGroup.put("schoolId",SchoolId);
        updatenewGroup.put("name","Spanish6 Study Group");
        updatenewGroup.put("description","Group for students who learn Spanish");
        updatenewGroup.put("active","true");
        updatenewGroup.put("public","false");
        updatenewGroup.put("visibilitytoStudent","true");


        given()
                .spec(reqSpec)
                .body(updatenewGroup)

                .when()
                .put("https://test.mersys.io/school-service/api/student-group")

                .then()
                .statusCode(200)
                .log().body()
        ;
    }

    @Test(dependsOnMethods = "UpdateGroup")
    public void DeleteGroup(){
        given()
                .spec(reqSpec)

                .when()
                .delete("https://test.mersys.io/school-service/api/student-group/"+GroupId)

                .then()
                .statusCode(200)
        ;
    }



}
