package web;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test04_LoginPage {
     public static void main(String[] args) throws Exception {
    	 WebDriver driver;
    	 System.setProperty("webdriver.chrome.driver", "ChromeWebdriver/chromedriver.exe");
    	 driver =new ChromeDriver();
		 driver.get("http://the-internet.herokuapp.com/login");

            WebElement button = driver.findElement(By.xpath("//button[@type='submit']"));
           
            button.click();
            
            if(driver.getPageSource().contains("Your username is invalid!"))
            {
              System.out.println("Test04_Login is Passed. If no user name or password are typed the error message 'Your username is invalid!' is displayed");
            }
          else
            {
              System.out.println("Test04_Login is Failed. The expected error message is not displayed");
            }
            
            driver.close();
            
     }
            
}