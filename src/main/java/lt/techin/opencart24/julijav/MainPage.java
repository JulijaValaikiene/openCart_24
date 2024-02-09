package lt.techin.opencart24.julijav;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage {

    public MainPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//ul[@class='nav navbar-nav']//a[ text()='QA']")
//    @FindBy(xpath = "//a[ text()='QA']")
    WebElement qaButton;


    public void clickQaButton() {
        qaButton.click();

    }

}
