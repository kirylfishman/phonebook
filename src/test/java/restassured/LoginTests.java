package restassured;

import dto.AuthRequestDTO;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static org.hamcrest.Matchers.anything;

public class LoginTests {
    @Test
    public void positiveLogin() {
        AuthRequestDTO loginBody = AuthRequestDTO.builder()
                .username("gol0va@gmail.com")
                .password("Bol12345#")
                .build();
        String login_URI = "http://contactapp-telran-backend.herokuapp.com/v1/user/login/usernamepassword";
        RestAssured
                .given()
                .log().all()
                .when()
                .contentType(ContentType.JSON)
                .body(loginBody)
                .post(login_URI)
                .then()
                .log().all()
                .statusCode(200)
                .assertThat() .body("token",anything());
    }
}