package manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
static WebDriver driver;

public static void init (){
driver = new ChromeDriver();
driver.navigate().to("https://telranedu.web.app/home");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

}
    public static WebDriver getDriver(){
        return driver;
    }
public static void Teardown(){
    driver.quit();
}

}
