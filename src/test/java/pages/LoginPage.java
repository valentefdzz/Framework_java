package pages;
import Base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class LoginPage extends Base {

    By cancel_button_xp = By.xpath("//div//div[1]//div[2]//div[4]//div//div[1]//div//div[3]//form//div[3]//div[2]//button");
    By password_field_xp = By.xpath("//html//body//div//div[1]//div[2]//div[4]//div//div[1]//div//div[3]//form//div[1]//div[2]//input");
    By email_field_xp = By.xpath("//html//body//div//div[1]//div[2]//div[4]//div//div[1]//div//div[3]//form//div[1]//div[3]//div[1]//input");
    By domain_field_xp = By.xpath("//html//body//div//div[1]//div[2]//div[4]//div//div[1]//div//div[3]//form//div[1]//div[3]//div[3]//input");
    By email_other_field_xp = By.xpath("/html/body/div/div[1]/div[2]/div[4]/div/div[1]/div/div[3]/form/div[1]/div[3]/div[4]/div/div[1]/div[2]/span");
    By next_button_n = By.linkText("Next");
    By terms_button_xp = By.xpath("//html//body//div//div[1]//div[2]//div[4]//div//div[1]//div//div[3]//form//div[2]//span//label//span//span");
    By avatar_box_xp = By.xpath("//html//body//div//div[1]//div[2]//div[4]//div//div[1]//div//div[2]//div//div[1]//div");
    By com_button = By.xpath("//html//body//div//div[1]//div[2]//div[4]//div//div[1]//div//div[3]//form//div[1]//div[3]//div[4]//div//div[2]//div[9]");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void clear_all() {
        clear(password_field_xp);
        clear(email_field_xp);
        clear(domain_field_xp);
    }

    public void valid_signup() throws InterruptedException {
        Thread.sleep(2000);
        if (isDisplayed(cancel_button_xp)) {
            type("Validpassword1", password_field_xp);
            type("validemail", email_field_xp);
            type("@gmail", domain_field_xp);
            click(email_other_field_xp);
            TimeUnit.SECONDS.sleep(2);
            click(com_button);
            click(terms_button_xp);
            click(next_button_n);
        } else {
            System.out.println("Could not sign up");
        }
    }

    public void invalid_signup () throws InterruptedException {
        Thread.sleep(2000);
        if (isDisplayed(cancel_button_xp)) {
            type("invalidpassword", password_field_xp);
            type("validemail", email_field_xp);
            type("@gmail", domain_field_xp);
            click(email_other_field_xp);
            TimeUnit.SECONDS.sleep(2);
            click(com_button);
            click(terms_button_xp);
            click(next_button_n);
        } else {
            System.out.println("Could not sign up");
        }
    }

    public boolean next_card_is_displayed(){
        return isDisplayed(avatar_box_xp);
    }
}
