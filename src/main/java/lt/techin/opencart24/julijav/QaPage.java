package lt.techin.opencart24.julijav;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class QaPage extends BasePage {

    public QaPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#content > h2")
    WebElement qaElement;

    @FindBy(id = "button-list")
    WebElement listButton;
    @FindBy(xpath = "//a[text()='Code Confusion Raccoon']")
    WebElement racoonItem;

    @FindBy(xpath = "//a[text()='Debug Duck']")
    WebElement debugDuckItem;

    @FindBy(xpath = "//a[text()='Java Genius Duck']")
    WebElement javaGeniusDuckItem;
    @FindBy(xpath = "//a[text()='Code Calm pills']")
    WebElement codeCalmPills;

    @FindBy(xpath = "//div[@id='product-list']//a[text()='Code Confusion Raccoon']")
    WebElement raccoonProduct;

    public String getDisplayedQaElementText() {
        return qaElement.getText();
    }

    public void clickListButton() {
        listButton.click();
    }

    public String getRacoonItemText() {
        return racoonItem.getText();
    }

    public String getDebugDuckItemText() {
        return debugDuckItem.getText();
    }

    public String getJavaGeniusDuckItemText() {
        return javaGeniusDuckItem.getText();
    }

    public String getCodeCalmPillsText() {
        return codeCalmPills.getText();
    }

    public void clickRacoonProductButton() {
        raccoonProduct.click();
    }
}
