package week4.assignment;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment3Lenskart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
	    ChromeDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.lenskart.com");
	    
	    WebElement computerGlass = driver.findElementByXPath("//a[contains(text(),'Computer Glasses')]");
	    Actions builder = new Actions(driver);
	    builder.moveToElement(computerGlass).perform();
	    
	    WebElement menFashion = driver.findElementByXPath("(//span[text()='men'])[2]");
	   Actions menfas = new Actions(driver);
	   menfas.moveToElement(menFashion).perform();
	   
	   WebElement premiumValue = driver.findElementByXPath("(//span[text()='men'])[2]");
	   Actions premval = new Actions(driver);
	   premval.moveToElement(premiumValue).perform();
	   
	   driver.findElementByXPath("//span[text()='Round']").click();
	   
	    int abc = driver.findElementsByXPath(" //div[contains(text(),'FRAME COLOR')]/following::ul").size();
	   
	   for (int i = 0; i < abc; i++) {
		String string = args[i];
		
	}
	   String framecolor = driver.findElementByXPath(" //div[contains(text(),'FRAME COLOR')]/following-sibling::ul/li/div/label/span").getText();
	   
	 //div[contains(text(),'FRAME COLOR')]/following-sibling::ul
	   
	    
	    

	}

}
