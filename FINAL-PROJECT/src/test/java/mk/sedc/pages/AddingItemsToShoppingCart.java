package mk.sedc.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddingItemsToShoppingCart {

    private WebDriver driver;
    private WebDriverWait wait;

    private By searchBar = By.id("search_query_top");
    private By searchBtn = By.name("submit_search");
    private By product1 = By.xpath("//*[contains(@class,'ajax_block_product col-xs-12 col-sm-6 col-md-4 first-in-line')]");
    private By product1Color = By.id("color_14");
    private By product1Add = By.name("Submit");
    private By product1Continue = By.xpath("//*[@class='continue btn btn-default button exclusive-medium']");
    private By product1Back = By.name("back");
    private By product2 = By.xpath("//*[contains(@class,'ajax_block_product col-xs-12 col-sm-6 col-md-4 last-item-of-tablet-line')]");
    private By product2Quantity = By.className("icon-plus");
    private By product2Size = By.xpath("//*[@id='group_1']/option");
    private By product2Add = By.name("Submit");
    private By product2Continue = By.xpath("//*[@class='continue btn btn-default button exclusive-medium']");
    private By product2Back = By.name("back");
    private By product3 = By.xpath("//*[contains(@class,'ajax_block_product col-xs-12 col-sm-6 col-md-4 last-in-line first-item-of-tablet-line last-item-of-mobile-line')]");
    private By product3Quantity = By.className("icon-plus");
    private By product3Size = By.xpath("//*[@id='group_1']/option");
    private By product3Color = By.id("color_8");
    private By product3Add = By.name("Submit");
    private By product3Continue = By.xpath("//*[@class='continue btn btn-default button exclusive-medium']");
    private By product3Back = By.name("back");
    private By product4 = By.linkText("Printed Dress");
    private By product4Quantity1 = By.className("icon-plus");
    private By product4Quantity2 = By.className("icon-minus");
    private By product4Size = By.xpath("//*[@id='group_1']/option");
    private By product4Add = By.name("Submit");
    private By product4Continue = By.xpath("//*[@class='continue btn btn-default button exclusive-medium']");

    public AddingItemsToShoppingCart(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void goTo(String website) {
        driver.get(website);
    }

    public void setSearchBar(String searchItem) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(searchBar)).sendKeys(searchItem);
    }

    public void setSearchBtn() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(searchBtn)).click();
    }

    public void setProduct1() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(product1)).click();
    }

    public void setProduct1Color() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(product1Color)).click();
    }

    public void setProduct1Add() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(product1Add)).click();
    }

    public void setProduct1Continue() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(product1Continue)).click();
    }

    public void setProduct1Back() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(product1Back)).click();
    }

    public void setProduct2() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(product2)).click();
    }

    public void setProduct2Quantity() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(product2Quantity)).click();
    }

    public void setProduct2Size(int size) {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(product2Size)).get(size).click();
    }

    public void setProduct2Add() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(product2Add)).click();
    }

    public void setProduct2Continue() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(product2Continue)).click();
    }

    public void setProduct2Back() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(product2Back)).click();
    }

    public void setProduct3() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(product3)).click();
    }

    public void setProduct3Quantity() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(product3Quantity)).click();
    }

    public void setProduct3Size(int size) {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(product3Size)).get(size).click();
    }

    public void setProduct3Color() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(product3Color)).click();
    }

    public void setProduct3Add() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(product3Add)).click();
    }

    public void setProduct3Continue() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(product3Continue)).click();
    }

    public void setProduct3Back() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(product3Back)).click();
    }

    public void setProduct4() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(product4)).click();
    }

    public void setProduct4Quantity1() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(product4Quantity1)).click();
    }

    public void setProduct4Quantity2() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(product4Quantity2)).click();
    }

    public void setProduct4Size(int size) {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(product4Size)).get(size).click();
    }

    public void setProduct4Add() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(product4Add)).click();
    }

    public void setProduct4Continue() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(product4Continue)).click();
    }

    public String ReturnSearchWord() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(searchBtn)).getAttribute("value");
    }

    public String  ReturnColorP1(int colorP1){
        return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(product1Color)).get(colorP1).getAttribute("name");
    }

    public String  ReturnSizeP2(int sizeP2){
        return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(product2Size)).get(sizeP2).getAttribute("title");
    }

    public String  ReturnSizeP3(int sizeP3){
        return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(product3Size)).get(sizeP3).getAttribute("title");
    }


    public String ReturnColorP3() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(searchBtn)).getAttribute("name");
    }

    public String  returnSizeP4(int sizeP4){
        return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(product4Size)).get(sizeP4).getAttribute("title");
    }







}
