package lt.techin.opencart24.julijav;

import ch.qos.logback.classic.Logger;
import org.junit.jupiter.api.Test;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainPageTest extends BasePageTest {
    MainPage mainPage;
    QaPage qaPage;
    private final Logger log = (Logger) LoggerFactory.getLogger(MainPageTest.class);

    @Test
    public void selectQaButton() {
        mainPage = new MainPage(driver);
        qaPage = new QaPage(driver);
        mainPage.clickQaButton();
        assertEquals("QA", qaPage.getDisplayedQaElementText(), "Qa element should include 'QA' text ");
        log.info("User entered 'QA' button");
    }
}
