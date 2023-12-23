package manager;


import dto.UserDTOLombok;
import org.openqa.selenium.By;


public class LoginHelper extends BaseHelper{

By btnLoginMainPage = By.xpath("//a[normalize-space()='LOGIN']");

By inputEmail = By.xpath("//input[@placeholder='Email']");
By inputPassword = By.xpath("//input[@placeholder='Password']");
By btnLoginForOpenPage = By.xpath("//button[@name='login']");
    By validateTextAddContactExist = By.xpath("//a[normalize-space()='ADD']");
public boolean validateTextAddContactExist(){ return isTextActualEqualToExpected(validateTextAddContactExist,"ADD");}



    public void login (UserDTOLombok user) throws InterruptedException {
clickBase(btnLoginMainPage);

sendKeys(inputEmail, user.getEmail());

sendKeys(inputPassword, user.getPassword());
clickBase(btnLoginForOpenPage);
Thread.sleep(5000);
}

}
