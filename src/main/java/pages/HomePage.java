package pages;

import base.BaseTest;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.testng.Assert;

public class HomePage extends BaseTest {

    @Step("Kullanici dogru olusturma kontrolu")

    public void registerControl(String value){
        String text =  driver.findElement(By.cssSelector("b")).getText();
        System.out.println(text);

        Assert.assertEquals(value ,text);
    }

    public void loginControl(String message){
        String text = driver.findElement(By.cssSelector("b")).getText();
        System.out.println(message);
        Assert.assertEquals(message,text);
    }
}
