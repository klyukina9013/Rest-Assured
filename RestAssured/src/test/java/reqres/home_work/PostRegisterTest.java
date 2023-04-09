package reqres.home_work;

import api.models.RegisterUser;
import api.steps.home_work.PostReqresStep;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

public class PostRegisterTest {

    private final PostReqresStep postReqresStep = new PostReqresStep();

    @Test
    public void successfulRegUser(){
        RegisterUser newUser = new RegisterUser("eve.holt@reqres.in","pistol");
        Response response = postReqresStep.postRegisterUser(newUser);
        postReqresStep.check200(response);
    }

    @Test
    public void unsuccessfulRegUser(){
        RegisterUser newUser = new RegisterUser("eve.holt@reqres.in","pistol");
        Response response = postReqresStep.postRegisterUser(newUser);
        postReqresStep.checkToken(response);
    }


}
