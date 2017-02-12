package web;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test02_LoginPage {
     public static void main(String[] args) throws Exception {
    	 WebDriver driver;
    	 System.setProperty("webdriver.chrome.driver", "ChromeWebdriver/chromedriver.exe");
    	 driver =new ChromeDriver();
		 driver.get("http://the-internet.herokuapp.com/login");

            WebElement username = driver.findElement(By.id("username"));
            WebElement password = driver.findElement(By.id("password"));
            WebElement button = driver.findElement(By.xpath("//button[@type='submit']"));
            
            username.sendKeys("franklampard");
            password.sendKeys("love4chelsea");
            button.click();
            
            if(driver.getPageSource().contains("Your username is invalid!"))
            {
              System.out.println("Test02_Login is Passed. Log in was unsuccessful and the 'Your username is invalid!' error message is displayed");
            }
          else
            {
              System.out.println("Test02_Login is Failed. Log in was successfull and the expected error message was not displayed");
            }
            
            driver.close();
            
     }
            
}