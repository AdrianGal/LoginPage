package web;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test01_LoginPage {
     public static void main(String[] args) throws Exception {
    	 
    	 WebDriver driver;
    	 System.setProperty("webdriver.chrome.driver", "ChromeWebdriver/chromedriver.exe");
    	 driver =new ChromeDriver();
		 driver.get("http://the-internet.herokuapp.com/login");
			
            WebElement username = driver.findElement(By.id("username"));
            WebElement password = driver.findElement(By.id("password"));
            WebElement button = driver.findElement(By.xpath("//button[@type='submit']"));
            
            username.sendKeys("tomsmith");
            password.sendKeys("SuperSecretPassword!");
            button.click();
            
            if(driver.getPageSource().contains("You logged into a secure area!"))
            {
              System.out.println("Test01_LoginPage is Passed. Login was successful and the 'You logged into a secure area!' message is displayed");
            }
          else
            {
              System.out.println("Test01_LoginPage Failed. Login was unsuccessful");
            }
            
            driver.close();
            
     }
            
}