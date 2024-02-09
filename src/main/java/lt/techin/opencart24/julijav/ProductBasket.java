package lt.techin.opencart24.julijav;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductBasket extends BasePage {
    public ProductBasket(WebDriver driver) {
        super(driver);
    }


    @FindBy(css = ".text-start > a")
    WebElement basketProductName;

    //    @FindBy(xpath = "//div[@id='header-cart']//td[3]")
//    WebElement basketButton;
    @FindBy(css = ".btn-inverse")
    WebElement basketButton;

    @FindBy(css = "td:nth-of-type(3)")
    WebElement basketProductQty;

    public String getBasketProductNameText() {
        return basketProductName.getText();
    }

    public void clickBasketButton() {
        basketButton.click();
    }

    public String getBasketProductQtyText() {
        return basketProductQty.getText();
    }

}

