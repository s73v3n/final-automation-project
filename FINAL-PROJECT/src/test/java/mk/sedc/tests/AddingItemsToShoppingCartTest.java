package mk.sedc.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AddingItemsToShoppingCartTest extends BaseTest {

    String website = "http://automationpractice.com/index.php";

    @Test
    public void dodavanjeProduktiVoKosnicka() {
        addingItemsToShoppingCart.goTo(website);
        addingItemsToShoppingCart.setSearchBar("casual");
        Assert.assertFalse(addingItemsToShoppingCart.ReturnSearchWord().contains("casual"));
        addingItemsToShoppingCart.setSearchBtn();
        addingItemsToShoppingCart.setProduct1();
        Assert.assertFalse(addingItemsToShoppingCart.ReturnSearchWord().contains("casual"));
        addingItemsToShoppingCart.setProduct1Color();
        Assert.assertTrue(addingItemsToShoppingCart.ReturnColorP1(0).contains("Blue"));
        addingItemsToShoppingCart.setProduct1Add();
        addingItemsToShoppingCart.setProduct1Continue();
        addingItemsToShoppingCart.setProduct1Back();
        addingItemsToShoppingCart.setProduct2();
        addingItemsToShoppingCart.setProduct2Quantity();
        addingItemsToShoppingCart.setProduct2Size(2);
        Assert.assertEquals(addingItemsToShoppingCart.ReturnSizeP2(2),"L");
        addingItemsToShoppingCart.setProduct2Add();
        addingItemsToShoppingCart.setProduct2Continue();
        addingItemsToShoppingCart.setProduct2Back();
        addingItemsToShoppingCart.setProduct3();
        addingItemsToShoppingCart.setProduct3Quantity();
        addingItemsToShoppingCart.setProduct3Quantity();
        addingItemsToShoppingCart.setProduct3Size(1);
        Assert.assertEquals(addingItemsToShoppingCart.ReturnSizeP3(1),"M");
        addingItemsToShoppingCart.setProduct3Color();
        Assert.assertFalse(addingItemsToShoppingCart.ReturnColorP3().contains("White"));
        addingItemsToShoppingCart.setProduct3Add();
        addingItemsToShoppingCart.setProduct3Continue();
        addingItemsToShoppingCart.setProduct3Back();
        js.executeScript("window.scrollBy(0,700)");
        addingItemsToShoppingCart.setProduct4();
        addingItemsToShoppingCart.setProduct4Quantity1();
        addingItemsToShoppingCart.setProduct4Quantity2();
        addingItemsToShoppingCart.setProduct4Size(1);
        addingItemsToShoppingCart.setProduct4Size(2);
        Assert.assertEquals(addingItemsToShoppingCart.returnSizeP4(2),"L");
        addingItemsToShoppingCart.setProduct4Add();
        addingItemsToShoppingCart.setProduct4Size(2);
        addingItemsToShoppingCart.setProduct4Continue();
        sleep(3000);
    }

}
