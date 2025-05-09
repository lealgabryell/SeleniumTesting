package part2.com.saucedemo.base;

import com.saucedemo.pages.BasePage;
import com.saucedemo.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    protected WebDriver driver;
    protected BasePage basePage;
    protected LoginPage loginPage;
    private String url = "https://www.saucedemo.com";

    @BeforeClass //testng annotation
    public void setup(){
        driver = new ChromeDriver(); //usa driver do chrome
        driver.manage().window().maximize(); //maximiza a janela
        driver.get(url); //driver acessa url
        basePage = new BasePage(); //instancia BasePage
        basePage.setDriver(driver); //usa o metodo da BasePage para setar driver
        loginPage = new LoginPage(); //instancia LoginPage
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
