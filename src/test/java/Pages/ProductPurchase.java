package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class ProductPurchase {
    WebDriver driver;
    @FindBy(css="img")
    List<WebElement> imageProducts;
    @FindBy(name="add-to-cart")
    WebElement btnAddCart;
    @FindBy(xpath = "//a[contains(text(),\"View cart\")]")
    List<WebElement> viewCart;
    @FindBy(xpath = "//a[contains(text(),\"Proceed to checkout\")]")
    WebElement btnCheckOut;
    @FindBy(name="product_cat")
    WebElement dropDown;
   @FindBy(className="fa-search")
    WebElement searchIcon;

    public ProductPurchase(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void selectProduct() throws InterruptedException {
        imageProducts.get(1).click();
        Thread.sleep(2000);
        Select selcet=new Select(dropDown);
        selcet.selectByIndex(3);
        searchIcon.click();
        Thread.sleep(2000);
        imageProducts.get(1).click();


    }
    public void addCart() throws InterruptedException {
        Thread.sleep(2000);
        btnAddCart.click();
        Thread.sleep(2000);
        viewCart.get(2).click();
        btnCheckOut.click();

    }
}







