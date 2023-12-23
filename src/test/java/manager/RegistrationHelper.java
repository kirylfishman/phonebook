package manager;

import org.openqa.selenium.By;
import utils.RandomDataForReg;
public class RegistrationHelper extends BaseHelper{
    By btnLoginMainPage = By.xpath("//a[normalize-space()='LOGIN']");
    By inputEmail = By.xpath("//input[@placeholder='Email']");
    By inputPassword = By.xpath("//input[@placeholder='Password']");
    By btnResistrationForRegistrOnPage = By.xpath("//button[@name='registration']");
    By validateTextSignOutOnPageExist = By.xpath("//button[normalize-space()='Sign Out']");
    public boolean validateTextSignOutOnPageExist(){ return isTextActualEqualToExpected(validateTextSignOutOnPageExist,"Sign out");}
    public void registration () throws InterruptedException {
clickBase(btnLoginMainPage);
        RandomDataForReg randomDataForReg = new RandomDataForReg();
        sendKeys(inputEmail, randomDataForReg.generateRandomEmail());
        Thread.sleep(1000);
        sendKeys(inputPassword, randomDataForReg.generateRandomPassword());
        Thread.sleep(1000);
        clickBase(btnResistrationForRegistrOnPage);
        Thread.sleep(1000);
    }
}
