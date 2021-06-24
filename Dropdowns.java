package week2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;



public class Dropdowns {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
	    ChromeDriver driver = new ChromeDriver();
	    driver.get("http://leafground.com/pages/Edit.html");
	    driver.manage().window().maximize();
	    driver.findElement(By.id("email")).sendKeys("abc");
	    driver.findElement(By.xpath("//input[@value='Append ']")).sendKeys("abc");
	    driver.findElement(By.name("username")).clear();
	    boolean enabledOrNot = driver.findElementByXPath("//label[text()='Confirm that edit field is disabled']/following-sibling::input").isEnabled();
	    if(enabledOrNot==false) {
	    	System.out.println("Field is disabled");
	    }else {
	    	System.out.println("Field is enabled");
	    }
		
		

	}

}
