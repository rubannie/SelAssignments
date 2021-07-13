package week4.assignment.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
	    ChromeDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://leaftaps.com/opentaps/control/main");
	    driver.findElement(By.xpath("//input[@name='USERNAME']")).sendKeys("demosalesmanager");
	    driver.findElement(By.xpath("(//input[@class='inputLogin'])[2]")).sendKeys("crmsfa");
	    driver.findElementByXPath("//input[@class='decorativeSubmit']").click();
	    driver.findElementByLinkText("CRM/SFA").click();
	    driver.findElement(By.linkText("Leads")).click();;
	    driver.findElement(By.linkText("Merge Leads")).click();
	    driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
	    
	   Set<String> windowHandles = driver.getWindowHandles();
	   List<String> listhandles = new ArrayList<String>(windowHandles);
	   driver.switchTo().window(listhandles.get(1));
	   driver.findElementByName("id").sendKeys("123");
	   driver.findElementById("ext-gen114").click();
	   driver.findElementByXPath("(//a[contains(text(),'10123')])[1]").click();
	   driver.switchTo().window(listhandles.get(0));
	   
	  driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
	  driver.switchTo().window(listhandles.get(1));
	   driver.findElementByName("id").sendKeys("123");
	   driver.findElementById("ext-gen114").click();
	   driver.switchTo().window(listhandles.get(0));
	   driver.findElement(By.linkText("Merge"));
	    Alert alerts = driver.switchTo().alert();
	    alerts.accept();
	  driver.findElementByLinkText("Find Leads").click();
	  driver.findElementById("id").click();
	  driver.findElementByXPath("//button[text()='Find Leads']").click();
	  driver.findElement(By.name("id")).sendKeys("10123");
	  driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	  String norecords = driver.findElement(By.className("x-paging-info")).getText();
	   if (norecords.equalsIgnoreCase("No records to display")) {
		   System.out.println("Leads were successfully merged");
	   }
	   else
	   {
		   System.out.println("Leads were not successfully merged");
	   }
	   }
	  
	  


	}


