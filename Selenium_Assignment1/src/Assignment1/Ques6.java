//Q6.  Write a script to get the url of the "Contact Us' page.
package Assignment1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques6 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/home/prabhat/Documents/Selenium/chromedriver_linux64/chromedriver");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.tothenew.com/contact-us");

		System.out.println(driver.getCurrentUrl());
		

	}

}
