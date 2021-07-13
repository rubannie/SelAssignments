package week4.assignment.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sortable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
	    ChromeDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://www.leafground.com/pages/sortable.html");
	    
	    WebElement source1 = driver.findElement(By.xpath("//li[text()[normalize-space()='Item 1']]"));
	    WebElement target1 = driver.findElement(By.xpath("//li[text()[normalize-space()='Item 4']]"));
	    
	    Actions builder = new Actions(driver);
	    builder.dragAndDrop(source1, target1).perform();
	}

}
