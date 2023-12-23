package tests;

import dto.UserDTOLombok;
import manager.ApplicationManager;
import manager.LoginHelper;
import manager.RegistrationHelper;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
    LoginHelper loginHelper = new LoginHelper();
    RegistrationHelper registrationHelper = new RegistrationHelper();
    UserDTOLombok user = UserDTOLombok.builder().email("gol0va@gmail.com").password("Bol12345#").build();
    @BeforeSuite (alwaysRun = true)
    public void preConditions (){
        ApplicationManager.init();
    }
    @AfterSuite (alwaysRun = true)
    public void postConditions (){
ApplicationManager.Teardown();
    }
}
