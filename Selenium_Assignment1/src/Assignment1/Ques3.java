//Q3: Write a script to search the “To The New” string in google
package Assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/home/prabhat/Documents/Selenium/chromedriver_linux64/chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.get("https://google.com");
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("To The New");
		driver.findElement(By.xpath("//input[@value='Google Search']")).submit();
	}

}
