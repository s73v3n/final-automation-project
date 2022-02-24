package mk.sedc.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrderCheckOut {

    private WebDriver driver;
    private WebDriverWait wait;

    private By clickSignIn = By.className("login");
    private By enterEmail = By.id("email");
    private By enterPassword = By.id("passwd");
    private By signInBtn = By.id("SubmitLogin");
    private By bestSellers = By.linkText("Best sellers");
    private By selectProduct = By.xpath("//*[contains(@class,'ajax_block_product col-xs-12 col-sm-6 col-md-4 first-in-line last-line first-item-of-tablet-line first-item-of-mobile-line last-mobile-line')]");
    private By productQuantity = By.className("icon-plus");
    private By productSize = By.xpath("//*[@id='group_1']/option");
    private By productColor = By.id("color_24");
    private By addToCart = By.name("Submit");
    private By proceedToCheckOut = By.linkText("Proceed to checkout");
    private By proceedToCheckOut2 = By.linkText("Proceed to checkout");
    private By addComment = By.name("message");
    private By proceedToCheckOut3 = By.name("processAddress");
    private By agreeBtn = By.id("uniform-cgv");
    private By proceedToCheckOut4 = By.name("processCarrier");
    private By paymentMethod = By.className("bankwire");
    private By confirmMyOrder = By.xpath("//*[contains(@class,'button btn btn-default button-medium')]");
    private By signOutBtn = By.className("logout");


    public OrderCheckOut(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void goTo(String website) {
        driver.get(website);
    }

    public void setClickSignIn() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickSignIn)).click();
    }

    public void setEnterEmail(String email) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(enterEmail)).sendKeys(email);
    }

    public void setEnterPassword(String password) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(enterPassword)).sendKeys(password);
    }

    public void setSignInBtn() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(signInBtn)).click();
    }

    public void setBestSellers() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(bestSellers)).click();
    }

    public void setSelectProduct() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(selectProduct)).click();
    }

    public void setProductQuantity() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(productQuantity)).click();
    }

    public void setProductSize(int size) {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(productSize)).get(size).click();
    }

    public void setProductColor() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(productColor)).click();
    }

    public void setAddToCart() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(addToCart)).click();
    }

    public void setProceedToCheckOut() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(proceedToCheckOut)).click();
    }

    public void setProceedToCheckOut2() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(proceedToCheckOut2)).click();
    }

    public void setAddComment(String comment) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(addComment)).sendKeys(comment);
    }

    public void setProceedToCheckOut3() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(proceedToCheckOut3)).click();
    }

    public void setAgreeBtn() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(agreeBtn)).click();
    }

    public void setProceedToCheckOut4() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(proceedToCheckOut4)).click();
    }

    public void setPaymentMethod() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(paymentMethod)).click();
    }

    public void setConfirmMyOrder() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(confirmMyOrder)).click();
    }

    public void setSignOutBtn() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(signOutBtn)).click();
    }

    public String ReturnEmail(int email) {
        return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(enterEmail)).get(email).getAttribute("value");
    }

    public String ReturnPassword(int password) {
        return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(enterEmail)).get(password).getAttribute("value");
    }

    public String ReturnBestSellers() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(bestSellers)).getAttribute("name");
    }

    public String  ReturnSize(int size){
        return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(productSize)).get(size).getAttribute("title");
    }

    public String  ReturnColor(int color){
        return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(productColor)).get(color).getAttribute("name");
    }

    public String ReturnComment(int comment) {
        return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(addComment)).get(comment).getAttribute("value");
    }
}
