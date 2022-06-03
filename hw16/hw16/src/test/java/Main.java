import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.SecureRandomSpi;

public class Main {
    WebDriver driver;

@BeforeClass
public static void setupDriver () {
    final String PATH = String.format("%s/bin/chromedriver", System.getProperty("user.dir"));
System.setProperty("webdriver.chrome.driver", "/Users/anastasiaphomenko/Documents/git_homework/hillel10.01.2022/hw16/hw16/bin/chromedriver");
}
@Before
public void precondition () {
    driver = new ChromeDriver();
    driver.manage().window().maximize();

}
    @Test
    public void test () {
        driver.get("https://guest:welcome2qauto@qauto.forstudy.space/");
        //1.Создать пользователя(всегда уникального)
        driver.findElement(By.className("hero-descriptor_btn")).sendKeys(Keys.ENTER);
        driver.findElement(By.className("form-control")).sendKeys("Nastya");
        driver.findElement(By.id("signupLastName")).sendKeys("Ryndia");
        String email = "qwerty" + Math.floor(Math.random() * 100000) + "@gmail.com";
        driver.findElement(By.id("signupEmail")).sendKeys(email);
        driver.findElement(By.id("signupPassword")).sendKeys("Nastya1992");
        driver.findElement(By.id("signupRepeatPassword")).sendKeys("Nastya1992");
        driver.findElement(By.cssSelector(".modal-footer button")).sendKeys(Keys.ENTER);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //2.Пойти в профайл и проверить что там такие же name и lastName как при регистрации
        driver.findElement(By.cssSelector(".header_inner button")).sendKeys(Keys.RETURN);
        driver.findElement(By.cssSelector(".user-nav_menu div a")).sendKeys(Keys.ENTER);
        driver.findElement(By.cssSelector(".header_inner button")).sendKeys(Keys.RETURN);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println((driver.findElement(By.cssSelector(".app-content p")).getText()) + ( " = Nastya Ryndia"));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //3.Добавить авто (любое)
        driver.findElement(By.cssSelector(".sidebar a")).sendKeys(Keys.ENTER);
        driver.findElement(By.cssSelector("app-garage button")).sendKeys(Keys.ENTER);
        driver.findElement(By.cssSelector("app-add-car-modal form input")).sendKeys("20");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(By.cssSelector(".modal-footer button:nth-child(2)")).sendKeys(Keys.ENTER);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //4.Добавить expenses этому авто
        driver.findElement(By.className("car_add-expense")).sendKeys(Keys.ENTER);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.findElement(By.id("addExpenseMileage")).sendKeys("15");
        driver.findElement(By.id("addExpenseLiters")).sendKeys("15");
        driver.findElement(By.id("addExpenseTotalCost")).sendKeys("500");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(By.cssSelector(".modal-footer button:nth-child(2)")).sendKeys(Keys.ENTER);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
       //5.Удалить аккаунт
        driver.findElement(By.cssSelector(".sidebar_btn-group a:nth-child(2)")).sendKeys(Keys.ENTER);
        driver.findElement(By.cssSelector(".panel-page div:nth-child(5) button")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(By.cssSelector("app-remove-account-modal div:nth-child(3) button:nth-child(2)")).click();
    }


@After
public void closeBrowser () {
  driver.quit();
} }