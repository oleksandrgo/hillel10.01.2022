import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
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
        driver.get("https://guest:welcome2qauto@qauto.forstudy.space/");
     driver.findElement(By.cssSelector("body > app-root > app-global-layout > div > div > app-header > header > div > div > div.header_right.d-flex.align-items-center > button.btn.btn-outline-white.header_signin")).click();
     driver.findElement(By.cssSelector("body > ngb-modal-window > div > div > app-signin-modal > div.modal-footer.d-flex.justify-content-between > button.btn.btn-link")).click();
     driver.findElement(By.name("name")).sendKeys("Olga");
     driver.findElement(By.name("lastName")).sendKeys("Potapenko");
     String email = "afafaf"+ Math.floor(Math.random()+100000)+"@gmail.com";
     driver.findElement(By.id("signupEmail")).sendKeys(email);
     driver.findElement(By.id("signupPassword")).sendKeys("Potapenko1");
     driver.findElement(By.id("signupRepeatPassword")).sendKeys("Potapenko1");
     driver.findElement(By.cssSelector("body > ngb-modal-window > div > div > app-signup-modal > div.modal-footer > button\n" +
             "\n")).click();
     try {
         Thread.sleep(3000);
     }catch (InterruptedException e){
         throw new RuntimeException(e);
     }
     driver.findElement(By.cssSelector(".header_inner button")).click();
     driver.findElement(By.cssSelector(".user-nav_menu div a")).click();
        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
        driver.findElement(By.cssSelector("body > app-root > app-global-layout > div > div > app-header > header > div > div > div > nav > a:nth-child(1)")).click();
        driver.findElement(By.cssSelector("body > app-root > app-global-layout > div > div > div > app-panel-layout > div > div > div > div.col-lg-9.main-wrapper > div > app-garage > div > div.panel-page_heading.d-flex.justify-content-between > button")).click();
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
        driver.findElement(By.name("mileage")).sendKeys("5");
        driver.findElement(By.cssSelector("body > ngb-modal-window > div > div > app-add-car-modal > div.modal-footer.d-flex.justify-content-end > button.btn.btn-primary")).click();
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);}
        driver.findElement(By.cssSelector("button.car_add-expense.btn.btn-success")).click();
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);}
        driver.findElement(By.name("mileage")).sendKeys("0");
        driver.findElement(By.name("liters")).sendKeys("15");
        driver.findElement(By.name("totalCost")).sendKeys("20");
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);}
        driver.findElement(By.cssSelector("body > ngb-modal-window > div > div > app-add-expense-modal > div.modal-footer.d-flex.justify-content-end > button.btn.btn-primary")).click();
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);}
        driver.findElement(By.cssSelector(".header_inner button")).click();
        driver.findElement(By.cssSelector("body > app-root > app-global-layout > div > div > app-header > header > div > div > app-user-nav > div > nav > div.user-nav_menu-group > a:nth-child(3)")).click();
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);}
        driver.findElement(By.cssSelector("body > app-root > app-global-layout > div > div > div > app-panel-layout > div > div > div > div.col-lg-9.main-wrapper > div > app-settings > div > div.panel-page_content > div > div.user-settings_item.-form.-remove-account > div > button")).click();
        driver.findElement(By.cssSelector("body > ngb-modal-window > div > div > app-remove-account-modal > div.modal-footer.d-flex.justify-content-end > button.btn.btn-danger")).click();
        }
}
