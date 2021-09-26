package NewCustomer;

import LoginAutomation.LoginAutomation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class NewCustomer extends LoginAutomation {

    public static void NewCustomer(){
        WebElement newCustomer=driver.findElement(By.cssSelector("body > div:nth-child(3) > div > ul > li:nth-child(2) > a"));
        newCustomer.click();
    }
    public static void TC1(){
        WebElement CName=driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(4) > td:nth-child(2) > input[type=text]"));
        CName.clear();
        CName.sendKeys("KamrulIslam");

        WebElement CGender=driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(5) > td:nth-child(2) > input[type=radio]:nth-child(1)"));
        CGender.click();

        WebElement CDate=driver.findElement(By.cssSelector("#dob"));
        CDate.clear();
        CDate.sendKeys("05/15/2001");

        WebElement CAddress=driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(7) > td:nth-child(2) > textarea"));
        CAddress.clear();
        CAddress.sendKeys("2 Ishakha Ave, Sector 6, Uttara");

        WebElement CCity=driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(8) > td:nth-child(2) > input[type=text]"));
        CCity.clear();
        CCity.sendKeys("Dhaka");

        WebElement CState=driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(9) > td:nth-child(2) > input[type=text]"));
        CState.clear();
        CState.sendKeys("Uttara");

        WebElement CPin=driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(10) > td:nth-child(2) > input[type=text]"));
        CPin.clear();
        CPin.sendKeys("123456");

        WebElement CPhone=driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(11) > td:nth-child(2) > input[type=text]"));
        CPhone.clear();
        CPhone.sendKeys("01710000000");

        WebElement CEmail=driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(12) > td:nth-child(2) > input[type=text]"));
        CEmail.clear();
        CEmail.sendKeys("kamrul.rezu1@gmail.com");

        WebElement CSubmit=driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(13) > td:nth-child(2) > input[type=submit]:nth-child(1)"));
        CSubmit.click();

        String expected="http://demo.guru99.com/V1/html/insrtCustomer.php";
        String actual=driver.getCurrentUrl();

        if(expected.equals(actual)){
            System.out.println("Passed");
        }
        else {
            System.out.println("Failed");
        }
    }

}
