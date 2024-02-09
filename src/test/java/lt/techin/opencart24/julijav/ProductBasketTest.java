package lt.techin.opencart24.julijav;

import ch.qos.logback.classic.Logger;
import org.junit.jupiter.api.Test;
import org.slf4j.LoggerFactory;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ProductBasketTest extends BasePageTest {
    ProductPage productPage;
    MainPage mainPage;
    QaPage qaPage;
    ProductBasket productBasket;
    String productName = "Code Confusion Raccoon";
    String productNumber = "2";
    private final Logger log = (Logger) LoggerFactory.getLogger(MainPageTest.class);

    @Test
    public void checkProductInTheBasketName() {
        productPage = new ProductPage(driver);
        mainPage = new MainPage(driver);
        qaPage = new QaPage(driver);
        productBasket = new ProductBasket(driver);
        mainPage.clickQaButton();
        qaPage.clickListButton();
        qaPage.clickRacoonProductButton();
        assertTrue(productPage.checkDescriptionButton());
        productPage.setRacoonProductQty(productNumber);
        productPage.clickAddToChat();
        assertTrue(productPage.visibleAlertMessageButton());
        productPage.clickAlertMessageButton();
        productBasket.clickBasketButton();
        assertEquals("Code Confusion Raccoon", productBasket.getBasketProductNameText(), "Basket Product name should be 'Code Confusion Raccoon' ");
        log.info("Product basket include selected product Name!");
        String productQnt = productBasket.getBasketProductQtyText();
        assertEquals("x " + productNumber, productQnt, "Basket Product name should be added NUMBER!");
        log.info("Product basket include selected product Quantity!");


        log.info("ACIU DESTYTOJAU UZ DARBA SU NUOSTABIU MESKENU!");

    }
}
