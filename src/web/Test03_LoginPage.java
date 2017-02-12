package web;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test03_LoginPage {
     public static void main(String[] args) throws Exception {
    	 WebDriver driver;
    	 System.setProperty("webdriver.chrome.driver", "ChromeWebdriver/chromedriver.exe");
    	 driver =new ChromeDriver();
		 driver.get("http://the-internet.herokuapp.com/login");
			
            WebElement username = driver.findElement(By.id("username"));
            WebElement password = driver.findElement(By.id("password"));
            WebElement buttonLogin = driver.findElement(By.xpath("//button[@type='submit']"));
            
            username.sendKeys("tomsmith");
            password.sendKeys("SuperSecretPassword!");
            buttonLogin.click();
            WebElement buttonLogout = driver.findElement(By.cssSelector("a[href*='logout']"));
            buttonLogout.click();
            
            if(driver.getPageSource().contains("You logged out of the secure area!"))
            {
              System.out.println("Test03_Login is Passed. The log out was performed successfully and the 'You logged out of the secure area!' message is displayed");
            }
          else
            {
              System.out.println("Test03_Login is Failed. The log out was unsuccessful");
            }
            
            driver.close();
            
     }
            
}