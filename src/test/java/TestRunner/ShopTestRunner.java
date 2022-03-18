package TestRunner;

import Pages.Shop;
import Setup.Setup;
import org.testng.annotations.Test;

public class ShopTestRunner extends Setup {
   @Test(priority = 0,description = "Visit shop tab")
    public void shopTab() {
        driver.get("https://envothemes.com/envo-ecommerce");
        Shop shop = new Shop(driver);
        shop.clickShopTab();
    }
    @Test(priority = 1,description = "Show item by selected category")
    public void selectCategory(){
        driver.get("https://envothemes.com/envo-ecommerce");
        Shop shop = new Shop(driver);
        shop.selectterm();

    }


    @Test(priority = 2,description = "Showing the product sort by price")
    public void sortProducts() {
        driver.get("https://envothemes.com/envo-ecommerce");
        Shop shop = new Shop(driver);
        shop.sortByPrice();
    }
    @Test(priority = 3,description = "Showing the product search by name")
    public void searchProduct() {
        driver.get("https://envothemes.com/envo-ecommerce");
        Shop shop = new Shop(driver);
        shop.searchByName();
    }

    @Test(priority = 4,description = "Respone for invalid product search")
    public void invalidProductFound() {
        driver.get("https://envothemes.com/envo-ecommerce");
        Shop shop = new Shop(driver);
        shop.searchByUnavailableProduct();
    }

}
