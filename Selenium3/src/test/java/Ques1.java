/*
 * Q1- https://www.ultimateqa.com/simple-html-elements-for-automation/
Fetch "Quality Assurance Engineer" Salary from the table under "HTML Table with no id".

 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ques1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver",
				"/home/prabhat/Documents/Selenium/geckodriver-v0.26.0-linux64/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://ultimateqa.com/simple-html-elements-for-automation/");
		String jobTitle = "Quality Assurance Engineer";
		String qaTitle = driver.findElement(By.xpath("(//div[@class='et_pb_text_inner'])[3]/table/tbody/tr[4]")).getText();
		if(qaTitle.contains(jobTitle)) {
			String salary = driver.findElement(By.xpath("(//div[@class='et_pb_text_inner'])[3]/table/tbody/tr[4]/td[3]")).getText();
			System.out.println("Salary of Quality Assurance Engineer is: "+salary);
		}
	}


	}


