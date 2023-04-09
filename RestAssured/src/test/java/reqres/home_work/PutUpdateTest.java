package reqres.home_work;

import api.models.CreateUserPayload;
import api.steps.home_work.PutReqresStep;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

public class PutUpdateTest {

    private final PutReqresStep putReqresStep = new PutReqresStep();

    @Test
    public void successfulUpdateUser(){
        CreateUserPayload payload = new CreateUserPayload("morpheus","zion resident");
        Response response = putReqresStep.putUpdateUser(payload);
        putReqresStep.checkUpdateUser(response, payload);

    }

    @Test
    public void unsuccessfulUpdateUser(){
        CreateUserPayload payload = new CreateUserPayload("morpheus","zion resident");
        Response response = putReqresStep.putUpdateUser(payload);
        putReqresStep.checkUpdateUser2(response, payload);

    }



}
