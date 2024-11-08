package pages;

import base.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;

public class ProductPage extends BaseTest {

    public void viewProductClick(){
        driver.findElement(By.cssSelector("[href='/product_details/5']")).click();
        screenshot();

    }

    public void quantity(){
        driver.findElement(By.cssSelector("#quantity")).click();
    }

    public void addCartClick(){
        driver.findElement(By.cssSelector(".cart")).click();
    }

    public void continueShop(){
        driver.findElement(By.cssSelector(".btn-success")).click();
    }

    public void cart(){
        driver.findElement(By.cssSelector(".navbar-nav [href='/view_cart']")).click();
    }

    public void addToCartControl(String value){

        String text = driver.findElement(By.cssSelector("tbody > tr:nth-of-type(1) > .cart_description > p")).getText();
        Assert.assertEquals(text,value);
    }
}
