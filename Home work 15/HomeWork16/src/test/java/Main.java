import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

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
        driver.get("https://guest:welcome2qauto@qauto.forstudy.space/");
        //1. Создать пользователя (всегда уникального)
        driver.findElement(By.cssSelector(".hero-descriptor_btn")).click();  //Click on the button "Sign Up"
        String name = "Nikolay";
        driver.findElement(By.id("signupName")).sendKeys(name);  //Name
        String lastName = "Oleinik";
        driver.findElement(By.id("signupLastName")).sendKeys(lastName);  //lastName
        // уникальный емейл
        String email = "hghfg" + Math.floor(Math.random() * 100000) + "@gmail.com";
        driver.findElement(By.id("signupEmail")).sendKeys(email);  //Email
        String password = "qwertyU654";
        driver.findElement(By.id("signupPassword")).sendKeys(password);  //Password
        driver.findElement(By.id("signupRepeatPassword")).sendKeys(password);  //repeatPassword
        driver.findElement(By.cssSelector(".modal-footer button")).click();  //Click on the button "Register"
        //делаем паузу,чтобы страничка загрузилась
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //2.Пойти в профайл и проверить что там такие же name и lastName как при регистрации
        driver.findElement(By.cssSelector(".header_inner button")).click();
        driver.findElement(By.cssSelector(".user-nav_menu div a")).click();
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //помещаем Name и LastName из профайла в перменную, и вытягиваем текст
        WebElement nameAndLastName = driver.findElement(By.cssSelector(".profile_name.display-4"));
        String expectedR = name + " " +lastName;//то что было при регистрации
        String actualR = nameAndLastName.getText();//то что в профайле
        //проверяем ,что в профайле те же Name и LastName как при регистрации
        Assert.assertEquals("Данные не совпадают", expectedR, actualR);

        //3.Добавить авто (любое)
        driver.findElement(By.cssSelector(".sidebar a")).click(); // Go to the "Garage"
        driver.findElement(By.cssSelector(".panel-page button")).click();  // click on the button "Add car"
        WebElement brand = driver.findElement(By.cssSelector(".form-group select"));
        brand.click();  //открываем дропдавн лист с брендами
        try{  //добавляем паузу т.к. он не успевает
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Select s = new Select(brand);
        s.selectByValue("3: 4");  // выбираем brand Porshe

        WebElement model = driver.findElement(By.id("addCarModel"));
        model.click();  //открываем дропдавн лист с моделями
        try{  //пауза
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Select x = new Select(model);
        x.selectByValue("6: 17");  // выбираем модель Cayenne
        driver.findElement(By.id("addCarMileage")).sendKeys("10");  //добавляем Миледж
        driver.findElement(By.cssSelector(".modal-footer button:nth-child(2)")).click(); // Click on the button "Add"
        try{  //пауза
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // 4.Добавить expenses этому авто
        driver.findElement(By.cssSelector(".car_add-expense")).click();
        try{  //пауза
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(By.id("addExpenseMileage")).sendKeys("30");
        try{  //пауза
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(By.id("addExpenseLiters")).sendKeys("20");
        driver.findElement(By.id("addExpenseTotalCost")).sendKeys("300");
        driver.findElement(By.cssSelector(".modal-footer button:nth-child(2)")).click();
        try{  //пауза
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // 5.Удалить акаунт
        driver.findElement(By.cssSelector(".header_inner button")).click();
        driver.findElement(By.cssSelector(".user-nav_menu div a:nth-child(3)")).click(); // click on the button "Settings"
        try{  //пауза
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(By.cssSelector(".user-settings_form button.btn.btn-danger-bg")).click(); // "Remove"
        driver.findElement(By.cssSelector(".modal-footer button:nth-child(2)")).click(); // "Yes"
    }
        @After
        public void closeBrowser(){
            driver.quit();
        }
    }


