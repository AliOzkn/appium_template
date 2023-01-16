package pageobjects;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static testcomponents.BaseTest.driver;


public abstract class Helper {

    WebDriverWait wait;


    public Helper(){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    public void wait(WebElement el){
        wait.until(ExpectedConditions.visibilityOf(el));
    }



}