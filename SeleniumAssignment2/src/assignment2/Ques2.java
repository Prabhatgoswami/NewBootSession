/*
 * Q2- https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html
1) Validate that Multi-Select List Demo is a multiple dropdown.
2) Fetch all the dropdown options
3) Select New Jersey>New York>Texas then fetch first selected option & all selected options.
4) Deselect all the selected options.

 */

package assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ques2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"/home/prabhat/Documents/Selenium/geckodriver-v0.26.0-linux64/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		Select dropdown = new Select(driver.findElement(By.id("multi-select")));

		// 1) Validate that Multi-Select List Demo is a multiple dropdown.
		Assert.assertTrue(dropdown.isMultiple()); //for Validation
		System.out.println("Validate that Multi-Select List Demo is a multiple dropdown. : "+dropdown.isMultiple()); // for printing in console
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebDriverWait wait = new WebDriverWait(driver,20);
		js.executeScript("return arguments[0].scrollIntoView(true)", new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Multi Select List Demo']"))));

		// 2) Fetch all the dropdown options
		System.out.println("Data in the Dropdown : ");
		List<WebElement> dd = dropdown.getOptions();
		for (int j = 0; j < dd.size(); j++) {
			System.out.println(dd.get(j).getText());
		}
		
		
		// 3) Select New Jersey>New York>Texas then fetch first selected option & all
		
		WebElement newjersey = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='multi-select']//option[@value='New Jersey']")));
		WebElement newyork = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='multi-select']//option[@value='New York']")));
		WebElement texas = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='multi-select']//option[@value='Texas']")));

		// Performing Click on selected Text from dropdown using Actions
		new Actions(driver).moveToElement(newjersey).click().build().perform();
		new Actions(driver).keyDown(Keys.CONTROL).click(newyork).build().perform();
		new Actions(driver).keyDown(Keys.CONTROL).click(texas).keyUp(Keys.CONTROL).build().perform();
			
		// To Click on buttons and validate the selection
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='printMe']"))).click();
		WebElement FirstSelected = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='getall-selected']")));
		System.out.println(FirstSelected.getText());
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='printAll']"))).click();
		WebElement AllSelected = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='getall-selected']")));
		System.out.println(AllSelected.getText());

		// 4) Deselect all the selected options.
		dropdown.deselectAll();

	}
}
