package temp;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import utility.Browsers;
import utility.Driver;

public class TempPage {

    WebDriver driver;

    @Test
    public void test1(){
        driver = Driver.getDriver();
        driver.get("https://google.com");

        driver = Driver.getDriver(Browsers.EDGE);
        driver.get("https://yahoo.com");

        //driver.quit();

    }
}
