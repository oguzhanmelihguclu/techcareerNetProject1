import base.BaseTest;
import base.TestData;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.RegisterPage;

public class RegisterTest extends BaseTest {

    RegisterPage registerPage = new RegisterPage();
    TestData testData = new TestData();

    HomePage homePage = new HomePage();

    @Test
    public void registerSuccessFullControl() {

        registerPage.singUpLogin();
        registerPage.userName(userName);
        registerPage.singUpMail(singUpMail);
        registerPage.singUpButton();
        registerPage.manOrWoman();
        registerPage.password(password);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        registerPage.dateDay(dayIndex);
        registerPage.dateMonth(textMoth);
        registerPage.dateYears(textYears);
        registerPage.firstName(firstName);
        registerPage.lastName(lastName);
        registerPage.WorkCompany(company);
        js.executeScript("window.scrollBy(0,500)");
        registerPage.adress1(adress1);
        registerPage.adress2(adress2);
        registerPage.contry(contry);
        registerPage.state(state);
        registerPage.city(city);
        registerPage.zipCode(zipCode);
        registerPage.mobileNumber(mobileNumber);
        js.executeScript("window.scrollBy(0,500)");
        registerPage.registerClick();

        homePage.registerControl("ACCOUNT CREATED!");
    }
}



