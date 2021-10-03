package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class loginTest {

    public static WebDriver driver;

    @BeforeSuite
    public static void RunChrome(){
        System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.opencart.com/index.php?route=account/login");
    }
    @AfterSuite
    public static void closeChrome(){
        driver.quit();
    }

    @Test(priority = 1)
    public static void TC1(){

        WebElement email=driver.findElement(By.id("input-email"));
        email.clear();
        email.sendKeys("kamrul.rezu@gmail.com");

        WebElement pass=driver.findElement(By.id("input-password"));
        pass.clear();
        pass.sendKeys("12345678");

        WebElement loginBtn=driver.findElement(By.cssSelector("#content > div > div:nth-child(2) > div > form > input"));
        loginBtn.click();

        String expected="My Account";
        String actual=driver.getTitle();

        if(expected.equals(actual)){
            System.out.println("TC1 Passed");
        }
        else {
            System.out.println("TC1 Failed");
        }

        WebElement logout=driver.findElement(By.linkText("Logout"));
        logout.click();

        WebElement login=driver.findElement(By.linkText("Login"));
        login.click();
    }
    @Test(priority = 2)
    public static void TC2(){

        WebElement email=driver.findElement(By.id("input-email"));
        email.clear();
        email.sendKeys("test@gmail.com");

        WebElement pass=driver.findElement(By.id("input-password"));
        pass.clear();
        pass.sendKeys("12345678");

        WebElement loginBtn=driver.findElement(By.cssSelector("#content > div > div:nth-child(2) > div > form > input"));
        loginBtn.click();

        String expected="Account Login";
        String actual=driver.getTitle();

        if(expected.equals(actual)){
            System.out.println("TC2 Passed");
        }
        else {
            System.out.println("TC2 Failed");
        }
    }
    @Test(priority = 3)
    public static void TC3(){

        WebElement email=driver.findElement(By.id("input-email"));
        email.clear();
        email.sendKeys("kamrul.rezu@gmail.com");

        WebElement pass=driver.findElement(By.id("input-password"));
        pass.clear();
        pass.sendKeys("12345629");

        WebElement loginBtn=driver.findElement(By.cssSelector("#content > div > div:nth-child(2) > div > form > input"));
        loginBtn.click();

        String expected="Account Login";
        String actual=driver.getTitle();

        if(expected.equals(actual)){
            System.out.println("TC3 Passed");
        }
        else {
            System.out.println("TC3 Failed");
        }
    }
    @Test(priority = 4)
    public static void TC4(){

        WebElement email=driver.findElement(By.id("input-email"));
        email.clear();
        email.sendKeys("test@gmail.com");

        WebElement pass=driver.findElement(By.id("input-password"));
        pass.clear();
        pass.sendKeys("1234123");

        WebElement loginBtn=driver.findElement(By.cssSelector("#content > div > div:nth-child(2) > div > form > input"));
        loginBtn.click();

        String expected="Account Login";
        String actual=driver.getTitle();

        if(expected.equals(actual)){
            System.out.println("TC4 Passed");
        }
        else {
            System.out.println("TC4 Failed");
        }
    }




}
