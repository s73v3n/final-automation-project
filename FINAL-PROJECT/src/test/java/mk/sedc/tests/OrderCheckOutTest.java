package mk.sedc.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class OrderCheckOutTest extends BaseTest {

    String website = "http://automationpractice.com/index.php";

    @Test
    public void zavrsuvanjeNaNaracka() {
        orderCheckOut.goTo(website);
        orderCheckOut.setClickSignIn();
        orderCheckOut.setEnterEmail("johnatahan.forest@example.com");
        orderCheckOut.setEnterPassword("JoHn123FoR789");
        Assert.assertFalse(orderCheckOut.ReturnEmail(0).contains("johnatahan.forest5@example.com"));
        Assert.assertFalse(orderCheckOut.ReturnPassword(0).contains("JoHn123FoR789"));
        orderCheckOut.setSignInBtn();
        orderCheckOut.setBestSellers();
        Assert.assertFalse(orderCheckOut.ReturnBestSellers().contains("Best sellers"));
        js.executeScript("window.scrollBy(0,1000)");
        orderCheckOut.setSelectProduct();
        orderCheckOut.setProductQuantity();
        orderCheckOut.setProductSize(2);
        Assert.assertEquals(orderCheckOut.ReturnSize(2),"L");
        orderCheckOut.setProductColor();
        Assert.assertTrue(orderCheckOut.ReturnColor(0).contains("Pink"));
        orderCheckOut.setAddToCart();
        orderCheckOut.setProceedToCheckOut();
        js.executeScript("window.scrollBy(0,1000)");
        orderCheckOut.setProceedToCheckOut2();
        js.executeScript("window.scrollBy(0,1000)");
        orderCheckOut.setAddComment("Please notify me when product is delivered \nThanks");
        Assert.assertTrue(orderCheckOut.ReturnComment(0).contains("Please notify me when product is delivered \nThanks"));
        orderCheckOut.setProceedToCheckOut3();
        orderCheckOut.setAgreeBtn();
        orderCheckOut.setProceedToCheckOut4();
        js.executeScript("window.scrollBy(0,1000)");
        orderCheckOut.setPaymentMethod();
        orderCheckOut.setConfirmMyOrder();
        orderCheckOut.setSignOutBtn();
        sleep(2000);

    }

}
