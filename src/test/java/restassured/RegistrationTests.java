package restassured;

import dto.AuthRequestDTO;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;
import utils.RandomDataForReg;

import static org.hamcrest.Matchers.anything;

public class RegistrationTests {
    @Test
    public void positiveRegistration (){
        AuthRequestDTO registrationBody = AuthRequestDTO.builder()
                .username(RandomDataForReg.generateRandomEmail())
                .password(RandomDataForReg.generateRandomPassword())
                .build();
        String login_URI = "http://contactapp-telran-backend.herokuapp.com/v1/user/registration/usernamepassword";
        RestAssured
                .given()
                .log().all()
                .when()
                .contentType(ContentType.JSON)
                .body(registrationBody)
                .post(login_URI)
                .then()
                .log().all()
                .statusCode(200)
                .assertThat() .body("token",anything());
    }
}
