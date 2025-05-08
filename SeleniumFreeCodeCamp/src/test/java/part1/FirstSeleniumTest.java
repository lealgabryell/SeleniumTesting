package part1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FirstSeleniumTest {

    WebDriver driver;

    @BeforeClass
    public void setUp() {

        driver = new ChromeDriver(); //instancia o ChromeDriver
        driver.manage().window().maximize(); //maximiza a janela chrome
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); //carrega a pagina do link

    }

    @AfterClass
    public void tearDown() {
        //driver.quit(); //fecha o browser assim que a classe executar o teste
    }

    @Test
    public void testLoggingIntoApplication() throws InterruptedException {
        Thread.sleep(2000);

        WebElement username = driver.findElement(By.name("username")); //localiza elemento web a partir da classe By do Selenium
        username.sendKeys("Admin"); //envia informacao para o elemento especificado

        var password = driver.findElement(By.name("password"));
        password.sendKeys("admin123");

        driver.findElement(By.tagName("button")).click(); //na arvore DOM da aplicaco, o boto de login no tem um nome ou id, apenas uma tag

        Thread.sleep(2000); //Apenas para demonstracao


        String actualResult = driver.findElement(By.tagName("h6")).getText(); //o que o teste vai ter como resultado
        String expectedResult = "Dashboard"; //o que o teste espera
        Assert.assertEquals(actualResult, expectedResult);

    }
}
