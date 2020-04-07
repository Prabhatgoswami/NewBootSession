/*
Q1- Launch Firefox browser & navigate to https://www.seleniumeasy.com/test/javascript-alert-box-demo.html
1) Try to Fetch the alert popup text.
2) Try to Dismiss the popup.
3) Try to enter some data on an alert popup.
4) Try to accept the popup.
*/

package assignment2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ques1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver",
				"/home/prabhat/Documents/Selenium/geckodriver-v0.26.0-linux64/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        
		//1) Try to Fetch the alert popup text.
		driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']")).click();
		String Popup_Text = driver.switchTo().alert().getText();
		System.out.println(Popup_Text);
		driver.switchTo().alert().accept();

		// 2) Try to Dismiss the popup.
		driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']")).click();
		driver.switchTo().alert().dismiss();

		// 3) Try to enter some data on an alert popup.
		driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']")).click();
		driver.switchTo().alert().sendKeys("Prabhat");
		
		// 4) Try to accept the popup.
		driver.switchTo().alert().accept();

	}

}
