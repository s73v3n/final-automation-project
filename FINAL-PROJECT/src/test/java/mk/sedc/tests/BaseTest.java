package mk.sedc.tests;

import mk.sedc.pages.AddingItemsToShoppingCart;
import mk.sedc.pages.DeletingItemFromShoppingCart;
import mk.sedc.pages.OrderCheckOut;
import mk.sedc.pages.RegistrationNewUser;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BaseTest {

    public String browser = "Chrome";
    public static final int TIMEOUT = 10;
    public WebDriver driver = null;
    public WebDriverWait wait = null;
    public JavascriptExecutor js;
    public RegistrationNewUser registrationNewUser;
    public AddingItemsToShoppingCart addingItemsToShoppingCart;
    public DeletingItemFromShoppingCart deletingItemFromShoppingCart;
    public OrderCheckOut orderCheckOut;

    @BeforeMethod
    public void set_up() {

        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "src/test/resources/drivers/geckodriver.exe");
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("edge")) {
            System.setProperty("webdriver.edge.driver", "src/test/resources/drivers/edgedriver.exe");
            driver = new EdgeDriver();
        } else {
            System.out.println("Browser not supported");
        }
        wait = new WebDriverWait(driver, TIMEOUT);

        registrationNewUser = new RegistrationNewUser(driver, wait);
        addingItemsToShoppingCart = new AddingItemsToShoppingCart(driver, wait);
        deletingItemFromShoppingCart = new DeletingItemFromShoppingCart(driver, wait);
        orderCheckOut = new OrderCheckOut(driver, wait);

        js = (JavascriptExecutor) driver;

        driver.manage().window().maximize();

    }

    @AfterMethod
    public void tear_down() {
        driver.quit();
    }

    @Test
    public void test1() {
        System.out.println("succesfull test");}

        public void sleep(int time) {
            try {
                Thread.sleep(time);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }



