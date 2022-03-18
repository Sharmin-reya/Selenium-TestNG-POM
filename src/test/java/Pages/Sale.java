package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class Sale {
    @FindBy(xpath = "//a[contains(text(),'Sale')]")
    List<WebElement> saleTab;
    @FindBy(xpath = "//h1[contains(text(),'Sale')]")
    WebElement saleTitle;
    @FindBy(css = "img")
    List<WebElement> product;
    @FindBy(xpath = "//h1[contains(text(),'Single Shirt')]")
    WebElement productTitle;
    @FindBy(css = "img")
    List<WebElement> productImg;
    @FindBy(className = "price")
    List<WebElement> price;
    @FindBy(className = "onsale")
    List<WebElement> saleTag;

    WebDriver driver;

    public Sale(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickSaleTab() {
        saleTab.get(1).click();
        String title = saleTitle.getText();
        Assert.assertEquals(title, "SALE");
    }

    public void productTitle() {
        saleTab.get(1).click();
        product.get(1).click();
        String titleText = productTitle.getText();
        Assert.assertTrue(titleText.contains("Single Shirt"));
    }
    public void verifySalesTag() {
        saleTab.get(1).click();
        int tag = price.size();
        int tag1= saleTag.size();
        Assert.assertEquals(tag ,tag1);
    }

}


