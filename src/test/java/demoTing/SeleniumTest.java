package demoTing;

import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SeleniumTest {

    private static BrowserGetter browserGetter = new BrowserGetter();
    private static WebDriver driver;

    @BeforeAll
    public void beforeAll() {
        driver = browserGetter.getChromeDriver();
    }

    @Test
    public void openThePageAndCheckTheTitle() {
        String expectedTitle = "Google";
        driver.get("https://www.google.com");
        assertEquals(expectedTitle, driver.getTitle());
    }

    @Test
    public void openThePageAndCheckTheTitle2() {
        String expectedTitle = "Bing";
        driver.get("https://www.bing.com");
        assertEquals(expectedTitle, driver.getTitle());
    }

    @AfterAll
    static void afterAll() {

        driver.quit();
    }

}
