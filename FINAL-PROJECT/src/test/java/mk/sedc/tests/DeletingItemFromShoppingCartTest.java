package mk.sedc.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DeletingItemFromShoppingCartTest extends BaseTest {

    String website = "http://automationpractice.com/index.php";

    @Test
    public void brisenjeProduktOdKosnicka() {
        deletingItemFromShoppingCart.goTo(website);
        deletingItemFromShoppingCart.setClickWomen();
        Assert.assertFalse(deletingItemFromShoppingCart.ReturnWomen().contains("Women"));
        js.executeScript("window.scrollBy(0,200)");
        deletingItemFromShoppingCart.setClickDresses();
        Assert.assertFalse(deletingItemFromShoppingCart.ReturnDresses().contains("Dresses"));
        js.executeScript("window.scrollBy(0,1000)");
        deletingItemFromShoppingCart.setSelectProduct1();
        deletingItemFromShoppingCart.setChangeColor();
        Assert.assertTrue(deletingItemFromShoppingCart.ReturnColor(0).contains("White"));
        deletingItemFromShoppingCart.setAddToCart();
        Assert.assertFalse(deletingItemFromShoppingCart.ReturnAddToCart().contains("Submit"));
        deletingItemFromShoppingCart.setProceedToCheckOut();
        Assert.assertFalse(deletingItemFromShoppingCart.ReturnAddToCart().contains("Proceed to checkout"));
        deletingItemFromShoppingCart.setDeleteProduct();
        sleep(2000);
    }
}