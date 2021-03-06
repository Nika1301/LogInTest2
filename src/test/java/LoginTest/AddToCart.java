package LoginTest;

import mainobjects.ShoppingCart;
import mainobjects.HomePageAndRegistratin;
import org.junit.After;

import org.junit.Before;
import org.junit.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCart {

    private WebDriver driver;

    @Before
    public void SetUp() throws Exception {
        driver = new ChromeDriver();

    }

    @Test
    public void AdToCart() throws Exception {
        HomePageAndRegistratin homePage = new HomePageAndRegistratin(driver);
        ShoppingCart buyBook = new ShoppingCart(driver);
        driver.manage().window().maximize();
        driver.get("http://sharelane.com/cgi-bin/main.py");
        homePage.sendkeysLogEmail();


        homePage.sendkeysLogPassword();

        homePage.clickButtonLogin();
        Thread.sleep(1000);
        homePage.sendkeysSearch();
        homePage.clickbtnSearch();
        buyBook.clickaddTocart();
        homePage.clickshoppingCart();

        Thread.sleep(1000);

        driver.close();

    }

    @After
    public void tearDown() throws Exception {

        driver.quit();
    }
}



