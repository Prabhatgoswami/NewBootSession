//Q12. Write an automation script for filling FirstName, LastName & Email address field with the help of name locator. (Registration.html)
//NOTE. There is No name locator on the site itself so I did it with the help of xpath
package Assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques12 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/home/prabhat/Documents/Selenium/chromedriver_linux64/chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
	
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Prabhat");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Goswami");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("prabhat@tothenew.com");
	}

}
