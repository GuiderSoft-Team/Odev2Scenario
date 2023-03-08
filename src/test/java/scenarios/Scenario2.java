package scenarios;

import basetest.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import utility.Driver;

public class Scenario2 extends BaseTest {

    WebDriver driver = Driver.getDriver();
    //WebDriver driver = Driver.getDriver(Browsers.FIREFOX);

    By lProdName = By.cssSelector(".product-title");
    By lProdPrice = By.cssSelector(".prices");

    By lProdNameInDetail = By.cssSelector(".product-name");
    By lProdPriceDetail = By.cssSelector(".product-price");

    @Test
    public void scenario2() {
        /*
            1.  https://demowebshop.tricentis.com/  sayfasina gidin
            2.  login olun, (isterseniz HomePage class'ini kullanabilirsiniz)
            3.  "desktop" aratin
            4.  isminde "Elite" olanin fiyatini ve tam ismini kaydedin
            5.  Ürüne tiklayip etaylarini görüntüleyin.
            6.  Detay sayfasindaki fiyat ve ismin kaydettiginiz ile ayni oldugunu assert edin

         */

    }

}
