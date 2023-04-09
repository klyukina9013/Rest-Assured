package api.steps.home_work;

import api.models.UserResponse;
import api.steps.seminar.SpecHelper;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;

import static io.restassured.RestAssured.given;

public class DeleteReqresStep {

    public static Response deleteUser(String id){
        return given()
                .spec(SpecHelper.getRequestSpec())
                .when()
                .delete(String.format("users/%s", id));
    }

    public void check204(Response response) {
        int statusCode = response.statusCode();
        Assertions.assertEquals(statusCode, 204);
    }

    public void checkStatusCode(Response response) {
        int statusCode = response.statusCode();
        Assertions.assertEquals(statusCode, 200);
    }
}
