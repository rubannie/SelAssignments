package week4.assignment;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
	    ChromeDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
	    
	    driver.switchTo().frame("frame1");
	    driver.switchTo().frame("frame3");
	    
	    driver.findElementById("a").click();
	    driver.switchTo().defaultContent();
	    driver.switchTo().frame("frame2");
	    WebElement dropdown = driver.findElementById("animals");
	    Select drop = new Select(dropdown);
	    drop.selectByVisibleText("Baby Cat");
	    
	    driver.switchTo().defaultContent();
	    driver.switchTo().frame("frame1");
	    driver.switchTo().frame("frame3");
	    
	    driver.findElementById("a").click();
	    
	    
	    
	    
	    
	}

}
