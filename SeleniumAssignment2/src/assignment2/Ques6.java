/*Q6- https://www.toolsqa.com/automation-practice-switch-windows/
	Click on New Browser Tab then click on Blog Tab in the newly opened window.
*/
package assignment2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ques6 {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver",
				"/home/prabhat/Documents/Selenium/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		 driver.get("https://www.google.com");
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_T);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_T);
	
		Set<String> ids = driver.getWindowHandles(); 
		Iterator<String> it = ids.iterator();
		String Parentid = it.next();
		String Childid = it.next();
		

		driver.switchTo().window(Childid);
		
		// Launch URL in the new tab
		driver.get("https://www.toolsqa.com/automation-practice-switch-windows/");
		driver.findElement(By.xpath("//nav[@class='navigation']/ul[@id='primary-menu']/li[5]")).click();

	}

}
