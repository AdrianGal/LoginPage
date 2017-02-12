package web;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test05_LoginPage {
     public static void main(String[] args) throws Exception {
    	 WebDriver driver;
    	 System.setProperty("webdriver.chrome.driver", "ChromeWebdriver/chromedriver.exe");
    	 driver =new ChromeDriver();
		 driver.get("http://the-internet.herokuapp.com/login");

            WebElement Password = driver.findElement(By.id("password"));
            
            Password.sendKeys("SuperSecretPassword!");
            
            if (Password.getAttribute("type").equals("password"))
            	{
            		System.out.println("Test05_Login is Passed. The entered passwords WILL BE masked");
            			}
            else 
            	{
            		System.out.println("Test05_Login is Failed. The entered passwords WILL NOT BE masked");
            			}
            
            driver.close();
            
     }
            
}