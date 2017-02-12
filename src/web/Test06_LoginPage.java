package web;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test06_LoginPage {
     public static void main(String[] args) throws Exception {
    	 WebDriver driver;
    	 System.setProperty("webdriver.chrome.driver", "ChromeWebdriver/chromedriver.exe");
    	 driver =new ChromeDriver();
		 driver.get("http://the-internet.herokuapp.com/login");

            WebElement username = driver.findElement(By.id("username"));
            WebElement button = driver.findElement(By.xpath("//button[@type='submit']"));
            
            username.sendKeys("tomsmith");
            button.click();
            
            if(driver.getPageSource().contains("Your password is invalid!"))
            {
              System.out.println("Test06_Login is Passed. If no password is entered the'Your password is invalid!' error message is displayed");
            }
          else
            {
              System.out.println("Test06_Login is Failed. The expected error message is not displayed");
            }
            
            driver.close();
            
     }
            
}