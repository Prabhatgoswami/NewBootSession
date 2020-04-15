
/*
 * Q2- Write an automation script for filling all fields of the registration page. (Registration.html)
But make sure that test data should be provided from a properties file.

 */
import java.io.FileInputStream;

import java.io.IOException;

import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Ques2 {

	public static void main(String[] args) throws IOException, InterruptedException {
		// Getting Properties File
		FileInputStream file = new FileInputStream("/home/prabhat/eclipse-workspace/Selenium3/Data.properties");
		Properties prop = new Properties();
		prop.load(file);

		System.setProperty("webdriver.gecko.driver",
				"/home/prabhat/Documents/Selenium/geckodriver-v0.26.0-linux64/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys(prop.getProperty("firstname"));

		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(prop.getProperty("lastname"));
		driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys(prop.getProperty("address"));
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys(prop.getProperty("email"));
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys(prop.getProperty("phone"));

		// Selecting Language
		WebElement lanugauge = driver.findElement(By.xpath("//div[@id='msdd']"));
		Actions a = new Actions(driver);
		a.moveToElement(lanugauge).click().build().perform();
		WebElement english = driver.findElement(By.xpath(
				"//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content ui-corner-all'] //li[8]"));
		// Checking language from properties file
		if (english.getText().equalsIgnoreCase(prop.getProperty("language1"))) {
			english.click();
		}

		WebElement hindi = driver.findElement(By.xpath(
				"//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content ui-corner-all'] //li[16]"));

		if (hindi.getText().equalsIgnoreCase(prop.getProperty("language2"))) {
			hindi.click();
		}

		driver.findElement(By.xpath("//input[@value='Male']")).click();
		WebElement hobby = driver.findElement(By.xpath("//input[@id='checkbox2']//following::label[1]"));
		if (hobby.getText().equalsIgnoreCase(prop.getProperty("hobbies"))) {
			driver.findElement(By.xpath("//input[@id='checkbox2']")).click();
		}

		// Getting Skills from properties file
		Select skills = new Select(driver.findElement(By.id("Skills")));
		skills.selectByValue(prop.getProperty("skills"));

		// selecting country
		Select count1 = new Select(driver.findElement(By.id("countries")));
		String s_count = prop.getProperty("country");
		count1.selectByValue(s_count);

		// Selecting country for "select the country" field
		driver.findElement(By.xpath("//span[@role='combobox']")).click();
		WebElement country = driver.findElement(By.xpath("//input[@type='search']"));
		country.sendKeys(s_count, Keys.ENTER);

		// Selecting year from properties File
		Select year = new Select(driver.findElement(By.id("yearbox")));
		year.selectByValue(prop.getProperty("year"));

		// Selecting Month from Properties file
		Select month = new Select(driver.findElement(By.xpath("//select[@placeholder='Month']")));
		month.selectByValue(prop.getProperty("month"));

		// Selecting Date From Properties File
		Select day = new Select(driver.findElement(By.id("daybox")));
		day.selectByValue(prop.getProperty("date"));

		String password = prop.getProperty("password");
		driver.findElement(By.id("firstpassword")).sendKeys(password);
		driver.findElement(By.id("secondpassword")).sendKeys(password);
		driver.findElement(By.id("submitbtn")).click();

	}

}
