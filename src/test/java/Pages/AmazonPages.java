package Pages;

import Util.ElementHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AmazonPages {
    static WebDriver driver;
    static ElementHelper elementHelper;
    WebDriverWait wait;

    static By accept = By.id("sp-cc-accept");
    static By search = By.id("twotabsearchtextbox");

    static By searchButton = By.id("nav-search-submit-button");

    static By amazonFilter = By.cssSelector(".a-spacing-micro[aria-label='Gönderim'] .a-checkbox .a-icon");

    static By appleFilter = By.cssSelector("[aria-label='Apple'] .a-checkbox");

    static By firstProduct = By.cssSelector("[alt='Apple AirPods (3. nesil) ve Lightning Şarj Kutusu \u200B\u200B\u200B\u200B\u200B\u200B\u200B']");

    static By add = By.id("add-to-cart-button");
    static By cart = By.cssSelector(".nav-line-2[aria-hidden='true']");
    static By check = By.cssSelector(".a-truncate-cut");
    public AmazonPages(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        this.elementHelper = new ElementHelper(driver);

    }

    public static void HomePage() {
    }

    public static void acceptCookie() {
        elementHelper.click(accept);
    }

    public static void clickSearch() {
        elementHelper.click(search);
    }

    public static void writeProduct() {
        elementHelper.sendKey(search, "airpods");
    }

    public static void searchButton() {
        elementHelper.click(searchButton);
    }

    public static void filterAmazon() {
        elementHelper.click(amazonFilter);
    }

    public static void filterApple() {
        elementHelper.click(appleFilter);
    }

    public static void firstProduct() {
        elementHelper.click(firstProduct);
    }

    public static void addCart() {
        elementHelper.click(add);
        elementHelper.click(cart);
    }

    public static void checkCart() {
        elementHelper.checkVisible(check);
    }
}
