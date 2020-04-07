/*
 * Q7- https://www.myntra.com/
Mouse hover on the Home & Living tab then click clock, now validate that navigated URL is for clock section.

*/
package assignment2;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

public class Ques7 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/home/prabhat/Documents/Selenium/chromedriver_linux64/chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		WebElement hover=  driver.findElement(By.xpath("//a[@data-group='home-&-living']"));
		Actions action=new Actions(driver);
		action.moveToElement(hover).build().perform();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
	     // Click on " Clocks " link
	     driver.findElement(By.linkText("Clocks")).click();
	     
	     System.out.println("URL of Clock is : "+driver.getCurrentUrl()); // for Priniting answer in console
	     Assert.assertEquals("https://www.myntra.com/clocks",driver.getCurrentUrl()); // for Validation
		
		

	}

}
