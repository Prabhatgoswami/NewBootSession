package liveProjectSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Register {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/home/prabhat/Documents/Selenium/chromedriver_linux64/chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("http://newtours.demoaut.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		//1. Successful registration with valid data
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.name("firstName")).sendKeys("Prabhat");
		driver.findElement(By.name("lastName")).sendKeys("Goswami");
		driver.findElement(By.name("phone")).sendKeys("9876567898");
		driver.findElement(By.id("userName")).sendKeys("prabhat@gmail.com");
		driver.findElement(By.name("address1")).sendKeys("Nawada");
		driver.findElement(By.name("address2")).sendKeys("Uttam NAagar");
		driver.findElement(By.name("city")).sendKeys("Delhi");
		driver.findElement(By.name("state")).sendKeys("Delhi");
		driver.findElement(By.name("postalCode")).sendKeys("110059");
		Select country=new Select(driver.findElement(By.name("country")));
		country.selectByVisibleText("INDIA");
		driver.findElement(By.id("email")).sendKeys("PrabhatBooking");
		driver.findElement(By.name("password")).sendKeys("prabhat123");
		driver.findElement(By.name("confirmPassword")).sendKeys("prabhat123");
	driver.findElement(By.name("register")).click();
	//2.Log in with a registered user in above step and book the flight with checking the Itinerary (End to End)
	driver.findElement(By.linkText("sign-in")).click();
	driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("PrabhatBooking");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("prabhat123");
	driver.findElement(By.name("login")).click();
	//book the flight
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
	toPort.selectByVisibleText("Paris");
	Select toMonth=new Select(driver.findElement(By.name("toMonth")));
	toMonth.selectByVisibleText("April");
	Select toDay=new Select(driver.findElement(By.name("toDay")));
	toDay.selectByVisibleText("30");
	driver.findElement(By.xpath("//input[@value='Business']")).click();
	Select preference=new Select(driver.findElement(By.name("airline")));
	preference.selectByVisibleText("Blue Skies Airlines");
	driver.findElement(By.name("findFlights")).click();

	driver.findElement(By.xpath("(//input[@name='outFlight'])[2]")).click();
	driver.findElement(By.xpath("(//input[@name='inFlight'])[2]")).click();
	driver.findElement(By.name("reserveFlights")).click();
	//book flight
	driver.findElement(By.name("passFirst0")).sendKeys("ABC");
	driver.findElement(By.name("passLast0")).sendKeys("DEF");
	Select meal1=new Select(driver.findElement(By.name("pass.0.meal")));
	meal1.selectByVisibleText("Vegetarian");
	Select cardType=new Select(driver.findElement(By.name("creditCard")));
	cardType.selectByVisibleText("Visa");
	driver.findElement(By.name("creditnumber")).sendKeys("12345");
	Select expirymonth=new Select(driver.findElement(By.name("cc_exp_dt_mn")));
	expirymonth.selectByVisibleText("06");
	Select expiryyear=new Select(driver.findElement(By.name("cc_exp_dt_yr")));
	expiryyear.selectByVisibleText("2002");
	driver.findElement(By.name("cc_frst_name")).sendKeys("ABCD");
	driver.findElement(By.name("cc_last_name")).sendKeys("DEFG");
	driver.findElement(By.name("ticketLess")).click();
	driver.findElement(By.name("buyFlights")).click();	
	}
	

}
