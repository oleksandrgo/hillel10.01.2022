import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Main {
    WebDriver driver;

    @BeforeClass
    public static void setupDriver () {
        final String Path = String.format("%s/bin/chromedriver.exe",
                System.getProperty("user.dir"));
        System.setProperty("webdriver.chrome.driver", Path);
    }

    @Before
    public void precondition () {
        driver = new ChromeDriver();
    }
    @Test
    public void HW17 () {
        driver.get("https://guest:welcome2qauto@qauto.forstudy.space/");
        driver.findElement(By.cssSelector(".hero-descriptor_btn")).click();
        String name = "Oleksii";
        driver.findElement(By.id("signupName")).sendKeys(name);
        String lastName = "Kotov";
        driver.findElement(By.id("signupLastName")).sendKeys(lastName);
        String email = "test" + Math.floor(Math.random() * 100000) + "@test.com";
        driver.findElement(By.id("signupEmail")).sendKeys(email);
        String password = "Test12345";
        driver.findElement(By.id("signupPassword")).sendKeys(password);
        driver.findElement(By.id("signupRepeatPassword")).sendKeys(password);
        driver.findElement(By.cssSelector(".modal-footer button")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(By.cssSelector(".header_inner button")).click();
        driver.findElement(By.cssSelector(".user-nav_menu div a")).click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(By.cssSelector(".btn")).click();
        driver.findElement(By.cssSelector(".btn-primary")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Select Brand = new Select(driver.findElement(By.name("carBrandId")));
        Brand.selectByVisibleText("Porsche");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Select Model = new Select(driver.findElement(By.name("carModelId")));
        Model.selectByVisibleText("911");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(By.id("addCarMileage")).sendKeys("50");
        driver.findElement(By.cssSelector(".modal-footer button:nth-child(2)")).click();
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(By.cssSelector(".car_actions")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(By.cssSelector(".car_add-expense")).click();
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(By.id("addExpenseMileage")).sendKeys("0");
        driver.findElement(By.id("addExpenseLiters")).sendKeys("10");
        driver.findElement(By.id("addExpenseTotalCost")).sendKeys("500");
        driver.findElement(By.cssSelector(".modal-footer button:nth-child(2)")).click();
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(By.cssSelector(".header_inner button")).click();
        driver.findElement(By.cssSelector(".user-nav_menu div a:nth-child(3)")).click();
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(By.cssSelector(".btn-danger-bg")).click();
        driver.findElement(By.cssSelector(".btn-danger")).click();
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    @After
    public void closeBrowser(){
        driver.close();
    }

}


