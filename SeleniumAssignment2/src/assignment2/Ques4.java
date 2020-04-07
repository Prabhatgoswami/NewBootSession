/*
 Q4- http://demo.automationtesting.in/Frames.html
       Enter the value in the filed under single Iframe as well as Iframe within an Iframe in a single script.

 */
package assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ques4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"/home/prabhat/Documents/Selenium/geckodriver-v0.26.0-linux64/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.switchTo().frame("SingleFrame");
		String text="Hey Prabhat";
		driver.findElement(By.xpath("//html//body//section//div//div//div//input")).sendKeys(text);
		Thread.sleep(2000);
		driver.switchTo().defaultContent(); //pass the control to the browser
		driver.findElement(By.xpath("//a[@href=\"#Multiple\"]")).click();
		//Nested Frames
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[src='MultipleFrames.html']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[src='SingleFrame.html']")));
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys(text);

	}

}
