package temp;

import basetest.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utility.Browsers;
import utility.Driver;

import java.util.List;

public class HoverMenus extends BaseTest {

    @Test
    public void hoverMenu(){
        setDriver(Driver.getDriver(Browsers.EDGE));

        driver.get("http://opencart.abstracta.us/");
        List<WebElement> mainMenuslinks = driver.findElements(By.cssSelector(".nav > li"));
        for (WebElement mainMenuslink : mainMenuslinks) {
            hover(mainMenuslink);
            if (mainMenuslink.findElements(By.cssSelector("ul")).size()>0){
                List<WebElement> subMenuLinks = mainMenuslink.findElements(By.cssSelector("ul>li"));
                for (WebElement subMenuLink : subMenuLinks) {
                    hover(subMenuLink);
                }
            }
        }

        driver.quit();


    }
}
