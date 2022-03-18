package TestRunner;

import Pages.Sale;
import Setup.Setup;
import org.testng.annotations.Test;

public class SaleTestRunner extends Setup {
    @Test(priority = 0,description = "Go to sale tab")
    public void visitSaleTab() {
        driver.get("https://envothemes.com/envo-ecommerce");
        Sale sale = new Sale(driver);
        sale.clickSaleTab();

    }
    @Test(priority = 1,description = "Get title")
    public void viewTitle() {
        driver.get("https://envothemes.com/envo-ecommerce");
        Sale sales = new Sale(driver);
        sales.productTitle();
    }
    @Test(priority = 2,description = "Check sale tag on sale item")
    public void checkSalesTag() {
        driver.get("https://envothemes.com/envo-ecommerce");
        Sale sales = new Sale(driver);
        sales.verifySalesTag();
    }
}




