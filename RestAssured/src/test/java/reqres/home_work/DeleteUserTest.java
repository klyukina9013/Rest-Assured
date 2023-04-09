package reqres.home_work;

import api.models.UserResponse;
import api.steps.home_work.DeleteReqresStep;
import io.restassured.response.Response;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class DeleteUserTest {

    private final DeleteReqresStep deleteReqresStep = new DeleteReqresStep();

    @ParameterizedTest
    @ValueSource(strings = {"1", "2"})
    public void successfulDelUser(String id){
        Response response = deleteReqresStep.deleteUser(id);
        deleteReqresStep.check204(response);

    }

    //Я только не поняла, почему он удаляет по таким id, если они с 1 по 12

    @ParameterizedTest
    @ValueSource(strings = {"31", "202"})
    public void unsuccessfulDelUser(String id){
        Response response = deleteReqresStep.deleteUser(id);
        deleteReqresStep.checkStatusCode(response);

    }
}
