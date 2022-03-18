package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Shop {


    WebDriver driver;
    @FindBy(xpath = "//a[contains(text(),'Shop')]")
    WebElement shopTab;
    @FindBy(xpath = "//h1[contains(text(),'Shop')]")
    WebElement shopTitle;
    @FindBy(className = "orderby")
    WebElement sorting;
    @FindBy(xpath ="//h2[contains(text(),'Black trousers')]")
    WebElement lowestPriceProduct;
    @FindBy(className = "header-search-input")
    WebElement searchField;
    @FindBy(className = "fa-search")
    WebElement searchIcon;
    @FindBy(xpath = "//h1[contains(text(),'Oldies')]")
    WebElement modernWatch;
    @FindBy(xpath = "//p[contains(text(),'No products were found matching your selection.')]")
    WebElement noProductFound;
    @FindBy(className = "orderby")
    WebElement dropDown;

    public Shop(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void selectterm(){
        shopTab.click();
        Select select=new Select(dropDown);
        select.selectByValue("popularity");



    }

    public void clickShopTab() {
        shopTab.click();
        String title = shopTitle.getText();
        Assert.assertTrue(title.contains("Shop"));
    }

    public void sortByPrice(){
        shopTab.click();
        Select select = new Select(sorting);
        select.selectByValue("price");
        String lowPrice = lowestPriceProduct.getText();
        Assert.assertTrue(lowPrice.contains("Black trousers"));
    }
    public void searchByName(){
        shopTab.click();
        searchField.sendKeys("Oldies" );
        searchIcon.click();
        String watch = modernWatch.getText();
        Assert.assertTrue(watch.contains("Oldies"));
    }

    public void searchByUnavailableProduct(){
        shopTab.click();
        searchField.sendKeys("Jwellary");
        searchIcon.click();
        String invProduct = noProductFound.getText();
        Assert.assertTrue(invProduct.contains("No products were found matching your selection."));
    }
}
