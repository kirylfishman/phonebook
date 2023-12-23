package tests;
import org.testng.Assert;
import org.testng.annotations.Test;


public class RegistrationTest extends BaseTest {
    @Test
public void positiveRegistrationTest() throws InterruptedException {
       registrationHelper.registration();
        Assert.assertTrue(registrationHelper.validateTextSignOutOnPageExist());

}
}
