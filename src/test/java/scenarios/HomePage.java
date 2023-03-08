package scenarios;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utility.Browsers;
import utility.Driver;

import java.text.MessageFormat;
import java.time.Duration;

public class HomePage {
    private WebDriver driver;
    private WebDriverWait wait;

    public HomePage() {
        this(Browsers.CHROME);
    }

    public HomePage(Browsers browser) {
        this.driver = Driver.getDriver(browser);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }


    String url = "https://demowebshop.tricentis.com/";
    String myUsername = "abc123@aa.com";
    String myPassword = "123456";

    String sMainMenuLinks = "//div[@class=\"header-links\"]//a[contains(.,\"{0}\")]";
    By lLoginFormUsername = By.id("Email");
    By lLoginFormPassword = By.id("Password");
    By lLoginSubmitButton = By.cssSelector("input[value='Log in']");


    // hint, 123
    public void open() {
        driver.get(url);
    }

    public By getLocatorMenuOf(String text) {
        return By.xpath("//div[@class='header-links']//a[contains(.,'" + text + "')]");
        //return By.xpath(MessageFormat.format(sMainMenuLinks, text));
    }


    public boolean login(String username, String password) {
        By menuLocator = getLocatorMenuOf("Log in");
        click(menuLocator);


        return false;
    }

    public void clickMenu(String menuText) {
        //Menu locator bulunur
        By menuLocator = getLocatorMenuOf(menuText);
        click(menuLocator);
    }

    public void click(By locator) {
        wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
    }

    public void sendKeys(By locator, String textToSend){
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).sendKeys(textToSend);
    }

    public int search(String textToSearch) {
        return 0;
    }

    public int search(String textToSearch, String productText) {
        return 0;
    }

    public void scrollIntoView(WebElement element) {

    }


    public void pressEnter() {

    }
}
