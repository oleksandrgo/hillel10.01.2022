import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    WebDriver driver = new ChromeDriver();
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
    }
}
