package scenarios;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utility.Driver;

import java.text.MessageFormat;
import java.time.Duration;

public class HomePage {
    private WebDriver driver;
    private WebDriverWait wait;

    public HomePage(){
        driver = Driver.getDriver();
    }

    public HomePage(WebDriver driver){
        this.driver = driver;
    }


    String url = "https://demowebshop.tricentis.com/";
    String myUsername = "abc123@aa.com";
    String myPassword = "123456";

    String sMainMenuLinks = "//div[@class=\"header-links\"]//a[contains(.,\"{0}\")]";

    // hint
    public void open(){
        driver.get(url);


        driver.findElement(getLocatorMenuOf("Log in")).click();

        driver.findElement(getLocatorMenuOf("Register")).click();
        driver.findElement(getLocatorMenuOf("Wish")).click();
        driver.findElement(getLocatorMenuOf("Shop")).click();
    }

    public By getLocatorMenuOf(String text){
        return By.xpath("//div[@class='header-links']//a[contains(.,'" + text + "')]");
        //return By.xpath(MessageFormat.format(sMainMenuLinks, text));
    }


    public boolean login(String username, String password){
       return false;
    }

    public void clickMenu(String menuText){

    }

    //TODO bu method search islemini yapmali ve
    // en az bir ürünün listelendigini assert etmeli
    // ve listelenen ürün sayisini return etmelidir
    public int search(String textToSearch){
        return 0;
    }

    public int search(String textToSearch, String productText){
        return 0;
    }

    public void scrollIntoView(WebElement element){

    }
    public void click(By locator){

    }

    public void sendKeys(By locator, String text){

    }

    public void pressEnter(){

    }
}
