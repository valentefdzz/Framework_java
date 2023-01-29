package pages;

import Base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage extends Base {

    By title_xp = By.xpath('//html//head//title');
    // si no funciona intentar con comillas simples
    By here_xp = By.xpath('//div//div[1]//div//div[4]//p//a');
    public MainPage(WebDriver driver){
        super(driver);
    }

    public MainPage_is_displayed(){
        actual_title = (getText(title_xp);
        expected_title = )


    }

}
