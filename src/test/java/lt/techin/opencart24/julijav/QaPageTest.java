package lt.techin.opencart24.julijav;

import ch.qos.logback.classic.Logger;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

public class QaPageTest extends BasePageTest {

    QaPage qaPage;
    MainPage mainPage;
    private final Logger log = (Logger) LoggerFactory.getLogger(QaPageTest.class);


    @Test
    public void qaPageItemsInTheListChecking() {

        qaPage = new QaPage(driver);
        mainPage = new MainPage(driver);
        mainPage.clickQaButton();
        qaPage.clickListButton();

        assertEquals("Code Confusion Raccoon", qaPage.getRacoonItemText(), " Racoon item in the list should have 'Code Confusion Raccoon' name!!! ");
        log.info("Code Confusion Raccoon is in the list!");
        assertEquals("Debug Duck", qaPage.getDebugDuckItemText(), " Debug duck item in the list should have 'Debug Duck' name!!! ");
        log.info("Debug Duck is in the list!");
        assertEquals("Java Genius Duck", qaPage.getJavaGeniusDuckItemText(), " Java duck item in the list should have 'Java Genius Duck' name!!! ");
        log.info("Java Genius Duck is in the list!");
        assertEquals("Code Calm pills", qaPage.getCodeCalmPillsText(), " Calm pills item in the list should have 'Code Calm pills' name!!! ");
        log.info("Code Calm pills is in the list!");


//        @ParameterizedTest
//        @CsvFileSource(resources = "/productsFile.csv", numLinesToSkip = 1)
//        void itemsListCheckWithCsvFile (String productNameCsv, String productCodeCsv, String productPriceCsv){
//
//            qaPage.clickListButton();
//        }

    }
}

