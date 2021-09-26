package LoginAutomation;

import BrowserConfig.BrowserConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginAutomation extends BrowserConfig {
    public static void RunURL(String URL){
        driver.get(URL);
    }
    public static void LoginPage(){
        WebElement bankMenu=driver.findElement(By.cssSelector("#navbar-brand-centered > ul > li:nth-child(5) > a"));
        bankMenu.click();
    }
    public static void Login(){
        WebElement userID=driver.findElement(By.cssSelector("body > form > table > tbody > tr:nth-child(1) > td:nth-child(2) > input[type=text]"));
        userID.clear();
        userID.sendKeys("mngr355667");

        WebElement userPass=driver.findElement(By.cssSelector("body > form > table > tbody > tr:nth-child(2) > td:nth-child(2) > input[type=password]"));
        userPass.clear();
        userPass.sendKeys("erUmUbe");

        WebElement loginbtn=driver.findElement(By.cssSelector("body > form > table > tbody > tr:nth-child(3) > td:nth-child(2) > input[type=submit]:nth-child(1)"));
        loginbtn.click();
    }
}
