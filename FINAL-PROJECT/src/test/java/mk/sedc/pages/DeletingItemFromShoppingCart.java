package mk.sedc.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DeletingItemFromShoppingCart {

    private WebDriver driver;
    private WebDriverWait wait;

    private By clickWomen = By.linkText("Women");
    private By clickDresses = By.linkText("Dresses");
    private By selectProduct = By.xpath("//*[contains(@class,'ajax_block_product col-xs-12 col-sm-6 col-md-4 first-in-line last-line last-item-of-tablet-line first-item-of-mobile-line last-mobile-line')]");
    private By changeColor = By.id("color_8");
    private By addToCart = By.name("Submit");
    private By proceedToCheckOut = By.linkText("Proceed to checkout");
    private By deleteProduct = By.className("icon-trash");

    public DeletingItemFromShoppingCart (WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void goTo(String website) {
        driver.get(website);
    }

    public void setClickWomen() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickWomen)).click();
    }

    public void setClickDresses() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickDresses)).click();
    }

    public void setSelectProduct1() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(selectProduct)).click();
    }

    public void setChangeColor() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(changeColor)).click();
    }

    public void setAddToCart() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(addToCart)).click();
    }

    public void setProceedToCheckOut() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(proceedToCheckOut)).click();
    }

    public void setDeleteProduct() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(deleteProduct)).click();
    }

    public String  ReturnColor(int color){
        return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(changeColor)).get(color).getAttribute("name");
    }

    public String ReturnWomen() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(clickWomen)).getAttribute("name");
    }

    public String ReturnDresses() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(clickWomen)).getAttribute("name");
    }

    public String ReturnAddToCart() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(clickWomen)).getAttribute("name");
    }

    public String ReturnProceed() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(proceedToCheckOut)).getAttribute("name");
    }

}
