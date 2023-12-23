package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest{
@Test
    public void positiveLoginTest() throws InterruptedException {
loginHelper.login(user);
Assert.assertTrue(loginHelper.validateTextAddContactExist());
}

}
