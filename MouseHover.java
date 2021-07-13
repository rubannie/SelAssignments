package week4.assignment.day2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
	    ChromeDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://www.leafground.com/pages/mouseOver.html");
	    
	    WebElement testLeafCourses = driver.findElement(By.linkText("TestLeaf Courses"));
	    
	    Actions builder = new Actions(driver);
	    builder.moveToElement(testLeafCourses).perform();
	    
	    String hover = driver.findElementByXPath("//li/a[contains(text(),'TestLeaf Courses')]/following::ul").getText();
	    System.out.println(hover);
	    driver.findElementByXPath("//a[contains(text(),'Selenium')]").click();
	  
	    Alert alerts = driver.switchTo().alert();
	    String alertText = alerts.getText();
	    System.out.println(alertText);
	    
	    
	    alerts.accept();
	    
	}

}
