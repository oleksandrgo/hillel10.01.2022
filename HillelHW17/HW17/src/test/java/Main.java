import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.security.SecureRandom;
import java.util.Random;
import java.util.concurrent.TimeUnit;


public class Main {

    WebDriver driver;
    String testName = "TestFirstName";
    String testLastName = "TestLastName";
    static String testEmail;
    static String testPassword;


    public String randomString(int len) {
        int leftLimit = 48; // numeral '0'
        int rightLimit = 122; // letter 'z'
        Random random = new Random();

        int k = 0;
        String generatedString = "";

        while (k == 0) {
            generatedString = random.ints(leftLimit, rightLimit + 1)
                    .filter(i -> (i <= 57 || i >= 65) && (i <= 90 || i >= 97))
                    .limit(len)
                    .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                    .toString();

            for (int i = 0; i < generatedString.length(); i++) {
                if (Character.isDigit(generatedString.charAt(i))) {
                    k = 1;
                    break;
                }
            }
        }

        System.out.println(generatedString);

        return generatedString;
    }

    @BeforeClass
    public static void setupDriver(){
        final String PATH = String.format("%s/bin/chromedriver.exe", System.getProperty("user.dir"));
        System.setProperty("webdriver.chrome.driver", PATH);
    }

    @Before
    public void precondition(){
        driver = new ChromeDriver();

        //Set implicit wait:
        //wait for WebElement - не работает хз почему
        driver.manage().timeouts().implicitlyWait(5000,
                TimeUnit.MILLISECONDS);

        //wait for loading page - не работает хз почему
        driver.manage().timeouts().pageLoadTimeout(10000,
                TimeUnit.MILLISECONDS);
    }

    @Test
    public void test() throws InterruptedException {

        testEmail = randomString(10) + "@gmail.com";
        testPassword = randomString(12);

        //go to hillelauto
        driver.get("https://guest:welcome2qauto@qauto.forstudy.space/");
        //Open SignUp form
        driver.findElement(By.cssSelector(".hero-descriptor_btn")).click();

        //fill SignUp form
        driver.findElement(By.id("signupName")).sendKeys(testName, Keys.ENTER);
        driver.findElement(By.id("signupLastName")).sendKeys(testLastName, Keys.ENTER);
        driver.findElement(By.id("signupEmail")).sendKeys(testEmail, Keys.ENTER);
        driver.findElement(By.id("signupPassword")).sendKeys(testPassword, Keys.ENTER);
        driver.findElement(By.id("signupRepeatPassword")).sendKeys(testPassword, Keys.ENTER);
        driver.findElement(By.cssSelector(".modal-content .btn-primary")).click();


        //Слип, потому что по другому не работает
        Thread.sleep(2000);
        //go to profile
        driver.findElement(By.tagName("button")).click();
        driver.findElement(By.xpath(" //a[contains(text(),'Profile') ] ")).click();
        //Слип, потому что по другому не работает
        Thread.sleep(1000);
        //check profile Name value
        String expectedResultProfile = testName + " " + testLastName;
        String actualResultProfile = driver.findElement(By.cssSelector(".profile .profile_name")).getText();
        //System.out.println(actualResultProfile);
        Assert.assertEquals("Actual Name result isn't equal to expected result",expectedResultProfile,actualResultProfile);

        //Слип, потому что по другому не работает
        Thread.sleep(2000);
        //go to garage
        driver.findElement(By.tagName("button")).click();
        driver.findElement(By.xpath(" //a[contains(text(),'Garage') ] ")).click();

        //Слип, потому что по другому не работает
        Thread.sleep(1000);
        //go to profile
        driver.findElement(By.cssSelector(".panel-page_heading .btn-primary")).click();
        Thread.sleep(1000);
        driver.findElement(By.tagName("input")).sendKeys("10");
        driver.findElement(By.cssSelector(".modal-content .btn-primary")).click();

        //Слип, потому что по другому не работает
        Thread.sleep(2000);
        //go to garage
        driver.findElement(By.tagName("button")).click();
        driver.findElement(By.xpath(" //a[contains(text(),'Fuel expenses') ] ")).click();
        //Слип, потому что по другому не работает
        Thread.sleep(1000);
        //go to profile
        driver.findElement(By.cssSelector(".panel-page_heading .btn-primary")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("addExpenseMileage")).sendKeys("0");
        driver.findElement(By.id("addExpenseLiters")).sendKeys("10");
        driver.findElement(By.id("addExpenseTotalCost")).sendKeys("50");
        driver.findElement(By.cssSelector(".modal-content .btn-primary")).click();

        //Слип, потому что по другому не работает
        Thread.sleep(1000);
        //go to settings...
        driver.findElement(By.tagName("button")).click();
        driver.findElement(By.xpath(" //a[contains(text(),'Settings') ] ")).click();
        //...and delete account
        driver.findElement(By.cssSelector(".btn-danger-bg")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(".modal-footer .btn-danger")).click();
        Thread.sleep(2000);
    }

    @After
    public void closeBrowser(){
        driver.quit();
    }
}
