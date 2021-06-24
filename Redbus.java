package week2.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Redbus {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
	    ChromeDriver driver = new ChromeDriver();
	    driver.get("https://www.redbus.in/");
	    driver.manage().window().maximize();
	 
	    driver.findElementByXPath("//input[@data-message='Please enter a source city']").sendKeys("Chennai");
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.findElementByXPath("//input[@data-message='Please enter a source city']").sendKeys("",Keys.TAB);
	  
	    driver.findElementByXPath("//input[@data-message='Please enter a destination city']").sendKeys("Bangalore");
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.findElementByXPath("//input[@data-message='Please enter a source city']").sendKeys("",Keys.TAB);
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.findElementByXPath("//input[@id='onward_cal']").click();
	    driver.findElementByXPath("//td[text()='28']").click();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    int a = driver.findElements(By.id("search_btn")).size();
	    System.out.println(a);
	    driver.findElement(By.id("search_btn")).click();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    String filteredcount = driver.findElementByXPath("//span[@class='f-bold busFound']").getText();
	    System.out.println(filteredcount);
	    int slpResultsCount = driver.findElementsByXPath("//div[contains(text(),'Sleeper (2+2)')]").size();
	    System.out.println("Sleeper Buses Counts are"+slpResultsCount);
	    int acResultscount = driver.findElementsByXPath("//div[contains(text(),'A/C')]").size();
	    System.out.println("AC Bus Counts are"+acResultscount);
	 //   int coun = 0;
	  //  for (int i = 0; i < resultscount; i++) {
	    //	String sleeprbus = driver.findElementByXPath("//div[@class='bus-type f-12 m-top-16 l-color']").getText();
	    //	if (sleeprbus.contains("Sleeper")) {
				//coun = coun+1;
			//} else {

			}
			
		
	    
	}


