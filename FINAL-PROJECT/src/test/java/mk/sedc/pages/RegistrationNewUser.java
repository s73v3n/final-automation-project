package mk.sedc.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegistrationNewUser {

    private WebDriver driver;
    private WebDriverWait wait;

    private By clickSignIn = By.className("login");
    private By enterEmail = By.id("email_create");
    private By returnEmail = By.xpath("//*[@class='is_required validate account_input form-control']");
    private By clickCreateAcc = By.id("SubmitCreate");
    private By selectGender = By.id("id_gender1");
    private By returnGender = By.xpath("//*[@class='radio']/span");
    private By enterFirstName = By.id("customer_firstname");
    private By enterLastName = By.id("customer_lastname");
    private By enterPassword = By.id("passwd");
    private By returnPersonalInfo = By.xpath("//*[@class='is_required validate form-control']");
    private By selectDay = By.xpath("//*[@id='days']/option");
    private By selectMonth = By.xpath("//*[@id='months']/option");
    private By selectYear = By.xpath("//*[@id='years']/option");
    private By returnCalendar = By.xpath("//*[@class='col-xs-4']/div/span");
    private By newsletterInfo = By.id("uniform-newsletter");
    private By offersFromPartners = By.id("uniform-optin");
    private By returnNewslettersOffers = By.xpath("//*[@class='checkbox']/div/span");
    private By enterCompany = By.id("company");
    private By addressLine1 = By.id("address1");
    private By addressLine2 = By.id("address2");
    private By enterCity = By.id("city");
    private By selectState = By.xpath("//*[@id='id_state']/option");
    private By enterZipCode = By.id("postcode");
    private By enterAddInfo = By.id("other");
    private By enterHomePhone = By.id("phone");
    private By enterMobilePhone = By.id("phone_mobile");
    private By enterAliasAddress = By.id("alias");
    private By registerBtn = By.id ("submitAccount");

    public RegistrationNewUser(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void goTo(String website) {
        driver.get(website);
    }

    public void setClickSignIn() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickSignIn)).click();
    }

    public void setEnterEmail(String typeEmail) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(enterEmail)).sendKeys(typeEmail);
    }

    public void setClickCreateAcc() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickCreateAcc)).click();
    }

    public void setSelectGender() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(selectGender)).click();
    }

    public void setEnterFirstName(String fName) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(enterFirstName)).sendKeys(fName);
    }

    public void setEnterLastName(String lName) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(enterLastName)).sendKeys(lName);
    }


    public void setEnterPassword(String typePassword) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(enterPassword)).sendKeys(typePassword);
    }

    public void setSelectDay(int day){
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(selectDay)).get(day).click();
    }

    public void setSelectMonth(int month){
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(selectMonth)).get(month).click();
    }

    public void setSelectYear(int year){
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(selectYear)).get(year).click();
    }

    public void setNewsletterInfo() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(newsletterInfo)).click();
    }

    public void setOffersFromPartners() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(offersFromPartners)).click();
    }


    public void setEnterCompany (String companyName) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(enterCompany)).sendKeys(companyName);
    }

    public void setAddressLine1 (String address1) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(addressLine1)).sendKeys(address1);
    }

    public void setAddressLine2 (String address2) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(addressLine2)).sendKeys(address2);
    }

    public void setEnterCity (String city) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(enterCity)).sendKeys(city);
    }

    public void setSelectState(int state){
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(selectState)).get(state).click();
    }

    public void setEnterZipCode(String zipCode){
        wait.until(ExpectedConditions.visibilityOfElementLocated(enterZipCode)).sendKeys(zipCode);
    }

    public void setEnterAddInfo(String additionalInfo){
        wait.until(ExpectedConditions.visibilityOfElementLocated(enterAddInfo)).sendKeys(additionalInfo);
    }

    public void setEnterHomePhone(String homePhone){
        wait.until(ExpectedConditions.visibilityOfElementLocated(enterHomePhone)).sendKeys(homePhone);
    }

    public void setEnterMobilePhone(String mobilePhone){
        wait.until(ExpectedConditions.visibilityOfElementLocated(enterMobilePhone)).sendKeys(mobilePhone);
    }

    public void setEnterAliasAddress(String aliasAddress){
        wait.until(ExpectedConditions.visibilityOfElementLocated(enterAliasAddress)).sendKeys(aliasAddress);
    }

    public void setRegisterBtn() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(registerBtn)).click();
    }

    public String ReturnPersonalInfo(int infoLines) {
        return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(returnPersonalInfo)).get(infoLines).getAttribute("value");
    }

    public String ReturnGender(int gender) {
        return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(returnGender)).get(gender).getAttribute("class");
    }

    public String ReturnEmail(int email) {
        return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(returnEmail)).get(email).getText();
    }

    public String ReturnCalendar(int calendar) {
        return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(returnCalendar)).get(calendar).getText();
    }

    public String ReturnNewsletterOffers(int newsOffers) {
        return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(returnNewslettersOffers)).get(newsOffers).getAttribute("class");
    }

    public String ReturnCompany(int company) {
        return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(enterCompany)).get(company).getAttribute("value");
    }

    public String ReturnAddressLine1(int address1) {
        return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(addressLine1)).get(address1).getAttribute("value");
    }

    public String ReturnAddressLine2(int address2) {
        return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(addressLine2)).get(address2).getAttribute("value");
    }

    public String ReturnCity(int city) {
        return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(enterCity)).get(city).getAttribute("value");
    }

    public String ReturnZipCode(int zipCode) {
        return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(enterZipCode)).get(zipCode).getAttribute("value");
    }

    public String ReturnAdditionalInfo(int additionalInfo) {
        return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(enterAddInfo)).get(additionalInfo).getAttribute("value");
    }

    public String ReturnHomePhone(int homePhone) {
        return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(enterHomePhone)).get(homePhone).getAttribute("value");
    }

    public String ReturnMobilePhone(int mobilePhone) {
        return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(enterMobilePhone)).get(mobilePhone).getAttribute("value");
    }

    public String ReturnAliasAddress(int aliasAddress) {
        return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(enterAliasAddress)).get(aliasAddress).getAttribute("value");
    }


}
