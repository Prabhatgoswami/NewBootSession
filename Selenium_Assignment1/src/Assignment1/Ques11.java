/* Q11.  Write an automation script for filling all fields of the registration page. (Registration.html)
   a- Validate that Refresh button is disabled.
   b- Validate that your respective gender is selected or not.
   c- Validate that header of the registration page is Automation Demo Site. 
   d- Validate that title of the page is Register.
*/
package Assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques11 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/home/prabhat/Documents/Selenium/chromedriver_linux64/chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		boolean enable=driver.findElement(By.id("Button1")).isEnabled();
	
		System.out.println(" a) Validate that Refresh Button is Disabled :"+!enable);
		
		
		System.out.println(" b) Validate that your respective gender is selected or not.");
		WebElement male= driver.findElement(By.xpath("//input[@value='Male']"));
		male.click();
		if(male.isSelected()) {
			System.out.println("\tGender Male is selected");
		}
		else {
				System.out.println("Gender Male is Not Selected");
		}
		
		
		System.out.println(" c)  Validate that header of the registration page is Automation Demo Site: "
				+driver.findElement(By.xpath("//h1[contains(text(),'Automation Demo Site')]")).isDisplayed());
	
		System.out.println(" d) Validate of Title of the 'Register' page is:  "+ driver.getTitle());
	
		
	}

}
