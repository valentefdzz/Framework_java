package pages;
import Base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class GamePage extends Base {

    By title_xp = By.xpath("//html//head//title");
    By cancel_button_xp = By.xpath("//div//div[1]//div[2]//div[4]//div//div[1]//div//div[3]//form//div[3]//div[2]//button");
    By help_button_n = By.className("help-form__help-button");
    By help_reponse_xp = By.xpath("//div//div[1]//div[4]//div//div[2]");
    By timer_n = By.className("timer");
    public GamePage(WebDriver driver) {
        super(driver);
    }

    public boolean GamePage_is_displayed() {
        isLoaded(cancel_button_xp);
        try {
            return isDisplayed(cancel_button_xp);
        }catch (Exception e){
            return false;
        }
    }
   public void click_help(){
        click(help_button_n);
    }

    public boolean help_response_is_displayed() {
        try {
            return isDisplayed(help_reponse_xp);
        } catch (Exception e) {
            return false;
        }
    }

    public String timer_actual_time(){
        String time = getText(findElement(timer_n));
        return time;
    }
    public String timer_expected_time(){
        String time = "00:00:00";
        return time;
    }
}
