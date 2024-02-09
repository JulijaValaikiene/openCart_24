package lt.techin.opencart24.julijav;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage{
    public ProductPage(WebDriver driver) {
        super(driver);
    }



    @FindBy(xpath = "//li[.='Product Code: Racoon']")
    WebElement racoonProductCode;

    @FindBy(id = "input-quantity")
    WebElement racoonProductQty;

    @FindBy(id = "button-cart")
    WebElement addToChatButton;

    @FindBy(css = ".btn-inverse")
    WebElement basketButton;

    @FindBy(xpath = "//div[@id='alert']//button[@type='button']")
    WebElement alertMessageButton;

    public String getRacoonProductCodeText(){
       return racoonProductCode.getText();
    }

    public void setRacoonProductQty(String randomNumber){
        racoonProductQty.sendKeys(randomNumber);
    }

    public void clickAddToChat(){
        addToChatButton.click();
    }
    public void clickBasketButton(){
        basketButton.click();
    }
    public boolean visibleAlertMessageButton(){
        alertMessageButton.isDisplayed();
        return true;
    }
    public void clickAlertMessageButton(){
        alertMessageButton.click();
    }
}
