package pages;

import base.BaseTest;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class LoginPage extends BaseTest{

    @Step("Login Tıklandı")
    public void login(){
        driver.findElement(By.cssSelector("[class=\"fa fa-lock\"]")).click();
    }

    @Step("Login email alanı doldurulur")
    public void loginEmail(String loginMail){
        driver.findElement(By.cssSelector("[data-qa='login-email']")).sendKeys(loginMail);
    }

    @Step("Login Password alanı doldurulur")
    public void loginPassword(String loginPass){
        driver.findElement(By.cssSelector("[name='password']")).sendKeys(loginPass);
    }

    @Step("Login giris butonuna basilir")
    public void loginButton(){
        driver.findElement(By.cssSelector("[data-qa='login-button']")).click();
    }

}
