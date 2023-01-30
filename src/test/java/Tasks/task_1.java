package Tasks;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.GamePage;
import pages.MainPage;

public class task_1 {
    private WebDriver driver;
    MainPage mainPage;
    GamePage gamePage;

    @Before
    public void setUp() throws Exception {
        mainPage = new MainPage(driver);
        driver = mainPage.chromeDriverConnection();
        gamePage = new GamePage(driver);
        mainPage.open("https://userinyerface.com");

    }

    @After
    public void tearDown()throws Exception{
        driver.quit();
    }
    @Test
    public void test() throws InterruptedException {
        assertEquals(mainPage.expected_title(), mainPage.actual_title());
        System.out.println("Main page is displayed");
        mainPage.click_here();
        assertTrue(gamePage.GamePage_is_displayed());
        System.out.println("Game page is displayed");
        assertTrue(gamePage.help_response_is_displayed());
        System.out.println("Help response is displayed");
    }
}




