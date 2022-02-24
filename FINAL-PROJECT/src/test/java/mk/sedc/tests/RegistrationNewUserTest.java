package mk.sedc.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationNewUserTest extends BaseTest {

    String website = "http://automationpractice.com/index.php";

    @Test
    public void registracijaNaNovKorisnik() {
        registrationNewUser.goTo(website);
        registrationNewUser.setClickSignIn();
        registrationNewUser.setEnterEmail("johnatahan10.forest@example.com");
        Assert.assertFalse(registrationNewUser.ReturnEmail(0).contains("johnatahan10.forest@example.com"));
        registrationNewUser.setClickCreateAcc();
        registrationNewUser.setSelectGender();
        Assert.assertTrue(registrationNewUser.ReturnGender(0).contains("checked"));
        registrationNewUser.setEnterFirstName("Johnathan Jr.");
        Assert.assertTrue(registrationNewUser.ReturnPersonalInfo(0).contains("Johnathan Jr."));
        registrationNewUser.setEnterLastName("Forest");
        Assert.assertTrue(registrationNewUser.ReturnPersonalInfo(1).contains("Forest"));
        registrationNewUser.setEnterPassword("JoHn123FoR789");
        Assert.assertTrue(registrationNewUser.ReturnPersonalInfo(3).contains("JoHn123FoR789"));
        js.executeScript("window.scrollBy(0,500)");
        registrationNewUser.setSelectDay(15);
        registrationNewUser.setSelectMonth(6);
        registrationNewUser.setSelectYear(35);
        Assert.assertTrue(registrationNewUser.ReturnCalendar(0).contains("15"));
        Assert.assertTrue(registrationNewUser.ReturnCalendar(1).contains("June"));
        Assert.assertTrue(registrationNewUser.ReturnCalendar(2).contains("1987"));
        registrationNewUser.setNewsletterInfo();
        registrationNewUser.setOffersFromPartners();
        Assert.assertTrue(registrationNewUser.ReturnNewsletterOffers(0).contains("checked"));
        Assert.assertTrue(registrationNewUser.ReturnNewsletterOffers(1).contains("checked"));
        js.executeScript("window.scrollBy(0,500)");
        registrationNewUser.setEnterCompany("Jack Daniel Distillery");
        Assert.assertTrue(registrationNewUser.ReturnCompany(0).contains("Jack Daniel Distillery"));
        registrationNewUser.setAddressLine1("Street with no name 77C");
        Assert.assertTrue(registrationNewUser.ReturnAddressLine1(0).contains("Street with no name 77C"));
        registrationNewUser.setAddressLine2("Whiskey River");
        Assert.assertTrue(registrationNewUser.ReturnAddressLine2(0).contains("Whiskey River"));
        registrationNewUser.setEnterCity("Pigeon Forge");
        Assert.assertTrue(registrationNewUser.ReturnCity(0).contains("Pigeon Forge"));
        registrationNewUser.setSelectState(44);
        registrationNewUser.setEnterZipCode("37000");
        Assert.assertTrue(registrationNewUser.ReturnZipCode(0).contains("37000"));
        js.executeScript("window.scrollBy(0,500)");
        registrationNewUser.setEnterAddInfo("PO Box 5X56");
        Assert.assertTrue(registrationNewUser.ReturnAdditionalInfo(0).contains("PO Box 5X56"));
        registrationNewUser.setEnterHomePhone("987 654 3210");
        Assert.assertTrue(registrationNewUser.ReturnHomePhone(0).contains("987 654 3210"));
        registrationNewUser.setEnterMobilePhone("012 345 6789");
        Assert.assertTrue(registrationNewUser.ReturnMobilePhone(0).contains("012 345 6789"));
        registrationNewUser.setEnterAliasAddress("Single Malt Street 33");
        Assert.assertTrue(registrationNewUser.ReturnAliasAddress(0).contains("Single Malt Street 33"));
        sleep(3000);
        registrationNewUser.setRegisterBtn();
    }
}
