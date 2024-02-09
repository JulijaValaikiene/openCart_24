package lt.techin.opencart24.julijav;

import ch.qos.logback.classic.Logger;
import lt.techin.opencart24.julijav.utils.TestUtils;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

public class ProductPageTest extends BasePageTest {
    ProductPage productPage;
    MainPage mainPage;
    QaPage qaPage;
    ProductBasket productBasket;
    String productName = "Code Confusion Raccoon";
    private final Logger log = (Logger) LoggerFactory.getLogger(MainPageTest.class);

    @Test
    public void selectRacoonProduct() {
        productPage = new ProductPage(driver);
        mainPage = new MainPage(driver);
        qaPage = new QaPage(driver);
        mainPage.clickQaButton();
        qaPage.clickListButton();
        qaPage.clickRacoonProductButton();
        assertEquals("Product Code: Racoon", productPage.getRacoonProductCodeText(), "Product code should have this text 'Product Code: Racoon'!!!");
        log.info("Entered into Racoon Product page is successful!");


    }

    @Test
    public void selectRandomProductQty() {
        productPage = new ProductPage(driver);
        mainPage = new MainPage(driver);
        qaPage = new QaPage(driver);
        productBasket = new ProductBasket(driver);
        mainPage.clickQaButton();
        qaPage.clickListButton();
        qaPage.clickRacoonProductButton();
        assertTrue(productPage.checkDescriptionButton());
        String randomNumber = TestUtils.getRandomNumber();
        productPage.setRacoonProductQty(randomNumber);
        productPage.clickAddToChat();
        assertTrue(productPage.visibleAlertMessageButton());
        productPage.clickAlertMessageButton();
        log.info("Product added to the basket!");
    }

    @Test
    public void checkInfoMessageText() {
        productPage = new ProductPage(driver);
        mainPage = new MainPage(driver);
        qaPage = new QaPage(driver);
        productBasket = new ProductBasket(driver);
        mainPage.clickQaButton();
        qaPage.clickListButton();
        qaPage.clickRacoonProductButton();
        assertTrue(productPage.checkDescriptionButton());
        String randomNumber = TestUtils.getRandomNumber();
        productPage.setRacoonProductQty(randomNumber);
        productPage.clickAddToChat();
//        assertEquals("Success: You have added Code Confusion Raccoon to your shopping cart!", productPage.getAlertMessageText(), "Alert message should contain 'Success: You have added <product name> to your shopping cart!' ");
        assertEquals("Success: You have added " + productName + " to your shopping cart!", productPage.getAlertMessageText(), "Alert message should contain 'Success: You have added <product name> to your shopping cart!' ");
        log.info("Alert message is Displayed!");
    }
}
