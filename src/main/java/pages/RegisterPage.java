package pages;

import base.BaseTest;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage extends BaseTest {


    @Step("SingUp Tıklandı")
    public void singUpLogin(){
        driver.findElement(By.cssSelector("[class=\"fa fa-lock\"]")).click();
    }

    @Step("UserName alani doldurulur ")
    public void userName(String Username){
        driver.findElement(By.cssSelector("[name='name']")).sendKeys(Username);
    }

    @Step("Email alanı doldurulur")
    public void singUpMail(String email){
        driver.findElement(By.cssSelector("[data-qa='signup-email']")).sendKeys(email);
    }

    @Step("Kayit ol butonuna basilir")
    public void singUpButton(){
        driver.findElement(By.cssSelector("[data-qa='signup-button']")).click();
    }

    @Step("Cinsiyet secilir")
    public void manOrWoman(){
        driver.findElement(By.id("id_gender1")).click();
    }

    @Step("Password girilir")
    public void password(String password){
        driver.findElement(By.id("password")).sendKeys(password);
    }

    @Step("Dogum tarihi için gun girilir")
    public void dateDay(int dayIndex){
        WebElement webElement1 = driver.findElement(By.cssSelector("#days"));
        Select select1 = new Select(webElement1);
        select1.selectByIndex(dayIndex);
    }

    @Step("Dogum tarihi için ay girilir")
    public void dateMonth(String textMonth){
        WebElement webElement2 = driver.findElement(By.cssSelector("#months"));
        Select select2 = new Select(webElement2);
        select2.selectByVisibleText(textMonth);
        screenshot();
    }

    @Step("Dogum tarihi için yil girilir")
    public void dateYears(String textYears){
        WebElement webElement3 = driver.findElement(By.cssSelector("#years"));
        Select select3 = new Select(webElement3);
        select3.selectByVisibleText(textYears);
    }

    @Step("Firstname alani doldurulur")
    public void firstName(String firstName){
        driver.findElement(By.cssSelector("#first_name")).sendKeys(firstName);
    }

    @Step("Lastname alani doldurulur")
    public void lastName(String lastName){
        driver.findElement(By.cssSelector("#last_name")).sendKeys(lastName);
        screenshot();
    }

    @Step("Sirket ismi alani doldurulur ")
    public void WorkCompany(String company){
        driver.findElement(By.cssSelector("#company")).sendKeys(company);
    }

    @Step("Adress1 alani doldurulur ")
    public void adress1(String adress1){
        driver.findElement(By.cssSelector("[data-qa='address']")).sendKeys(adress1);
    }

    @Step("Adress2 alani doldurulur ")
    public void adress2(String adress2){
        driver.findElement(By.cssSelector("[data-qa='address2']")).sendKeys(adress2);
    }

    @Step("Ulke alani doldurulur ")
    public void contry(int textContry){
        WebElement webElement4 = driver.findElement(By.cssSelector("#country"));
        Select select4 = new Select(webElement4);
        select4.selectByIndex(textContry);
    }

    @Step("State alani doldurulur ")
    public void state(String state){
        driver.findElement(By.cssSelector("#state")).sendKeys(state);
    }

    @Step("City alani doldurulur ")
    public void city(String city){
        driver.findElement(By.cssSelector("#city")).sendKeys(city);
    }

    @Step("ZipCode alani doldurulur ")
    public void zipCode(String zipCode){
        driver.findElement(By.cssSelector("#zipcode")).sendKeys(zipCode);
    }

    @Step("Numara alani doldurulur ")
    public void mobileNumber(String number){
        driver.findElement(By.cssSelector("#mobile_number")).sendKeys(number);
    }

    @Step("Kayit olusturma alanina tiklanir ")
    public void registerClick(){
        driver.findElement(By.cssSelector("[data-qa='create-account']")).click();
        screenshot();
    }



}
