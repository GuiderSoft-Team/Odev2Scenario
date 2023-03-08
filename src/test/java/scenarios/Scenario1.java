package scenarios;

import basetest.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import utility.Browsers;
import utility.Driver;

public class Scenario1 extends BaseTest{

    WebDriver driver;
    //WebDriver driver = Driver.getDriver(Browsers.EDGE);

    @Test
    public void scenario1(){
        /*

            2.  HomePage class'ini kullanarak login olun

                HomePage homePage = new HomePage(driver);
                homePage.login("username", "password");
                homePage.search("mac");
                gibi
            3.  desktop aratin ve 6 ürün listelendigini assert edin
            4.  "Add to Cart" olan 4 ürün oldugunu assert edin.
                Burada "Add to Cart" iceren ürün sayisini veren güzel bir xpath yazmalisiniz
         */

        driver = Driver.getDriver(Browsers.EDGE);

        // 1.  https://demowebshop.tricentis.com/  sayfasina gidin
        HomePage homePage = new HomePage();
        homePage.open();



    }



}
