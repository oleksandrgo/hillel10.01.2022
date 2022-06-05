import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.UUID;


public class Main {
    WebDriver driver;

    @BeforeClass
    public static void setupDriver() {
        final String PATH = String.format("%s/bin/chromedriver.exe",
                System.getProperty("user.dir"));
        System.setProperty("webdriver.chrome.driver", PATH);
    }

    @Before
    public void precondition() {
        driver = new ChromeDriver();
    }


    @Test
    public void test() {
        //1.Создать пользователя(всегда уникально)
        driver.get("https://guest:welcome2qauto@qauto.forstudy.space/");
        driver.findElement(By.cssSelector(".hero-descriptor_btn")).click();
        driver.findElement(By.name("name")).sendKeys("Anna");
        driver.findElement(By.name("lastName")).sendKeys("Boyko");
        final String randomEmail = randomEmail();
        driver.findElement(By.name("email")).sendKeys(randomEmail);
        driver.findElement(By.name("password")).sendKeys("Qwerty12345");
        driver.findElement(By.name("repeatPassword")).sendKeys("Qwerty12345");
        driver.findElement(By.xpath("//button[text()='Register']")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //2.Пойти в профайл и проверить что там такие же name и lastName как при регистрации
        driver.findElement(By.cssSelector(".header_inner button")).click();
        driver.findElement(By.cssSelector(".user-nav_menu div a")).click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(By.cssSelector(".profile_name")).getText();
        Assert.assertEquals("Wrong data", "Anna Boyko", "Anna Boyko");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //3.Добавить авто (любое)
        driver.findElement(By.cssSelector(".btn")).click();
        driver.findElement(By.cssSelector(".panel-page_heading  .btn-primary")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Select Brand = new Select(driver.findElement(By.name("carBrandId")));
        Brand.selectByVisibleText("BMW");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Select Model = new Select(driver.findElement(By.name("carModelId")));
        Model.selectByVisibleText("X5");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(By.name("mileage")).sendKeys("1");
        driver.findElement(By.cssSelector(".modal-content .btn-primary")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //4.Добавить expenses этому авто
        driver.findElement(By.cssSelector(".icon-fuel")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(By.cssSelector(".btn-primary")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(By.name("carId")).sendKeys("BMW X5");
        driver.findElement(By.name("reportedAt")).sendKeys("");
        driver.findElement(By.name("mileage")).sendKeys("2");
        driver.findElement(By.name("liters")).sendKeys("12");
        driver.findElement(By.name("totalCost")).sendKeys("12");
        driver.findElement(By.cssSelector(".modal-footer .btn-primary ")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //5.Удалить акаунт
        driver.findElement(By.cssSelector(".icon-settings")).click();
        driver.findElement(By.cssSelector(".btn-danger-bg")).click();
        driver.findElement(By.cssSelector(".btn-danger")).click();

    }
    @After
    public void closeBrowser(){
        driver.close();
    }




    private static String randomEmail() {
            return "Test" + UUID.randomUUID() + "@gmail.com";

}


    }


