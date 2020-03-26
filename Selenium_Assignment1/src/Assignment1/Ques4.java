//Q4: Write a script to open http://www.tothenew.com/  and then navigate to the contact us page using 1) XPath 2) ID

package Assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/home/prabhat/Documents/Selenium/chromedriver_linux64/chromedriver");
		WebDriver driver= new ChromeDriver();
		

		driver.get("https://www.tothenew.com");
		//navigate through xpath so I used absolute path without using ID
		driver.findElement(By.xpath("/html/body/div[1]/div/header[2]/div/div/nav/div[2]/ul/li[8]/a")).click();

		// to Navigate through ID, I used Xpath locator using ID attribute.
		driver.findElement(By.xpath("(//a[@id='h-contact-us'])[2]")).click();
		
		
		 
	}

}
