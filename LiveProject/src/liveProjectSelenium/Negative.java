package liveProjectSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Negative {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/home/prabhat/Documents/Selenium/chromedriver_linux64/chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("http://newtours.demoaut.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		//1. Successful registration with valid data
		driver.findElement(By.linkText("SIGN-ON")).click();
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("PrabhatBooking");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("prabhat123");
		driver.findElement(By.name("login")).click();
		//book the flight with same departure and same arrival 
		
		driver.findElement(By.linkText("Flights")).click();
		driver.findElement(By.xpath("//input[@value='roundtrip']")).click();
		Select passenger=new Select(driver.findElement(By.name("passCount")));
		passenger.selectByVisibleText("1");
		Select fromPort=new Select(driver.findElement(By.name("fromPort")));
		fromPort.selectByVisibleText("New York");
		Select fromMonth=new Select(driver.findElement(By.name("fromMonth")));
		fromMonth.selectByVisibleText("April");
		Select fromDay=new Select(driver.findElement(By.name("fromDay")));
		fromDay.selectByVisibleText("25");
		Select toPort=new Select(driver.findElement(By.name("toPort")));
		toPort.selectByVisibleText("New York");
		Select toMonth=new Select(driver.findElement(By.name("toMonth")));
		toMonth.selectByVisibleText("April");
	
		//Arriving date is before the departure date
		Select toDay=new Select(driver.findElement(By.name("toDay")));
		toDay.selectByVisibleText("20");
		driver.findElement(By.xpath("//input[@value='Business']")).click();
		Select preference=new Select(driver.findElement(By.name("airline")));
		preference.selectByVisibleText("Blue Skies Airlines");
		driver.findElement(By.name("findFlights")).click();
		
		driver.findElement(By.xpath("(//input[@name='outFlight'])[2]")).click();
		driver.findElement(By.xpath("(//input[@name='inFlight'])[2]")).click();
		
		//Continue without passenger details
		driver.findElement(By.name("reserveFlights")).click();
		driver.findElement(By.name("buyFlights")).click();	
		
		
		
		
	}

}
