import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    WebDriver driver;

   @BeforeClass
   public static void setupDriver(){
       final String PATH = String.format("%s/bin/chromedriver.exe",
               System.getProperty("user.dir"));
        System.setProperty("webdriver.chrome.driver",PATH);
   }
   @Before
   public void precondition(){
       driver = new ChromeDriver();
   }
    @Test
    public void test(){
        driver.get("https://www.google.com.ua/");
        driver.findElement(By.cssSelector(".gLFyf")).sendKeys("Hillel", Keys.ENTER);
        WebElement search = driver.findElement(By.cssSelector(".gLFyf"));
    }

    @After
    public void closeBrowser(){
       driver.quit();

    }
}
