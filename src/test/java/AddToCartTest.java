import base.BaseTest;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import pages.ProductPage;

public class AddToCartTest extends BaseTest {

    ProductPage productPage = new ProductPage();

    @Test
    public void addShopping(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
        productPage.viewProductClick();
        productPage.quantity();
        productPage.addCartClick();
        driver.navigate().refresh();
        productPage.cart();
        productPage.addToCartControl("Women > Tops");
//

    }
}
