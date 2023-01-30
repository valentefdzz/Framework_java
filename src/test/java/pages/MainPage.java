package pages;


import Base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage extends Base {

    By title_xp = By.xpath("//html//head//title");
    By here_xp = By.xpath("//div//div[1]//div//div[4]//p//a");

    public MainPage(WebDriver driver){
        super(driver);
    }

    public String actual_title(){
        String title = driver.getTitle();
        return title;
    }

    public String expected_title(){
        String title = "User Inyerface - A worst-practice UI experiment";
        return title;
    }
    public void click_here(){
        click(here_xp);
    }

}
