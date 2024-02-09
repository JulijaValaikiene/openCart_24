package lt.techin.opencart24.julijav;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage {
    public ProductPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "//li[.='Product Code: Racoon']")
    WebElement racoonProductCode;

    @FindBy(id = "input-quantity")
    WebElement racoonProductQty;

    @FindBy(id = "button-cart")
    WebElement addToChatButton;

    @FindBy(xpath = "//div[@id='alert']//button[@type='button']")
    WebElement alertMessageButton;

    @FindBy(xpath = "//div[@id='alert']/div")
    WebElement alertMessage;
    @FindBy(xpath = "//div[@id='content']//a[text()='Description']")
//    @FindBy(xpath = "//a[text()='Description']")
    WebElement descriptionButton;

    public String getRacoonProductCodeText() {
        return racoonProductCode.getText();
    }

    public void setRacoonProductQty(String randomNumber) {

        racoonProductQty.clear();
        racoonProductQty.sendKeys(randomNumber);
    }

    public void clickAddToChat() {
        addToChatButton.click();
    }

    public boolean visibleAlertMessageButton() {
        alertMessageButton.isDisplayed();
        return true;
    }

    public void clickAlertMessageButton() {
        alertMessageButton.click();
    }

    public boolean checkDescriptionButton() {
        descriptionButton.isDisplayed();
        return true;
    }

    public String getAlertMessageText() {
        return alertMessage.getText();
    }
}
