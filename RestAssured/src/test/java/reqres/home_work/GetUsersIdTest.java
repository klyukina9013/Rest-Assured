package reqres.home_work;

import api.models.UserResponse;
import api.steps.home_work.GetReqresStep;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class GetUsersIdTest {

    private final GetReqresStep getReqresStep = new GetReqresStep();

    @ParameterizedTest
    @ValueSource(strings = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"})
    public void successfulCheckText(String id){
        UserResponse response = getReqresStep.getUserIdSuccess(id);
        getReqresStep.checkText(response);

    }

    @Test
    public void unsuccessfulCheckEMail(){
        UserResponse response = getReqresStep.getUserIdUnsuccess();
        getReqresStep.checkEMail(response);

    }

}
