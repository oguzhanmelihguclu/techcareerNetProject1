package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BaseTest extends BaseLibrary{


    @BeforeMethod  // Tüm test ve methodlardan önce calisir
    public void openBrowser(){
        driver = new EdgeDriver();
        driver.get("https://www.automationexercise.com/");
        driver.manage().window().maximize();

    }

    @AfterMethod // Tüm test ve methodlardan sonra calisir
    public void teardown(){
        driver.quit();
    }


}
