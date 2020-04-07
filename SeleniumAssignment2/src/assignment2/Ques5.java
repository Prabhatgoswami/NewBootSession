/*
 * Q5- http://demo.automationtesting.in/Frames.html
1) Print the count of frames on this application.
2) Click on Sample content link & Then validate the header text as Acid-free paper for the digital age.

 * */

package assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ques5 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver",
				"/home/prabhat/Documents/Selenium/geckodriver-v0.26.0-linux64/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Frames.html");
		System.out.println("Total Frames are : "+driver.findElements(By.tagName("iframe")).size());
	}

}
