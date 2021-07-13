package week4.assignment.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selectable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
	    ChromeDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://www.leafground.com/pages/selectable.html");
	    
	    WebElement source1 = driver.findElement(By.xpath("//li[text()[normalize-space()='Item 1']]"));
	    WebElement target1 = driver.findElement(By.xpath("//li[text()[normalize-space()='Item 7']]"));
	    
	    Actions builder = new Actions(driver);
	    builder.moveToElement(target1).perform();
	}

}
