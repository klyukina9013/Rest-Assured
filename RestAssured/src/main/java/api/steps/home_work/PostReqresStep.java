package api.steps.home_work;

import api.models.RegisterUser;
import api.steps.seminar.SpecHelper;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;

import static io.restassured.RestAssured.given;

public class PostReqresStep {

    public static Response postRegisterUser(RegisterUser newUser){
        return given()
                .spec(SpecHelper.getRequestSpec())
                .when()
                .body(newUser)
                .post("register")
                .then()
                .spec(SpecHelper.getResponseSpec(200))
                .extract()
                .response();
    }

    public void check200(Response response) {
        int statusCode = response.statusCode();
        Assertions.assertEquals(statusCode, 200);
    }

    public void checkToken(Response response) {
        Assertions.assertEquals(response.jsonPath().getString("token"),"QpwL5tke4Pnpja7X");
    }


}
