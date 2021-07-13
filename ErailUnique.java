package week4.assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ErailUnique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
	    ChromeDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://erail.in/");
	    
	    driver.findElement(By.id("chkSelectDateOnly")).click();
	    
	    driver.findElementById("txtStationFrom").clear();
	    driver.findElementById("txtStationFrom").sendKeys("Mgr Chennai Ctr");
	    driver.findElementById("txtStationFrom").sendKeys("",Keys.TAB);
	    driver.findElementByXPath("//input[@placeholder='To Station']").clear();
	    driver.findElementByXPath("//input[@placeholder='To Station']").sendKeys("New Delhi");
	    driver.findElementByXPath("//input[@placeholder='To Station']").sendKeys("",Keys.TAB);
	    driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
	    WebElement trainTable = driver.findElementByXPath("//table[contains(@class,'DataTable TrainList TrainListHeader')]");
	    List<WebElement> trainRows = trainTable.findElements(By.tagName("tr"));
	    int rowsize = trainRows.size();
	    
	    for (int i = 0; i < rowsize; i++) {
	    	WebElement rowText = trainRows.get(i);
			List<WebElement> columnData = rowText.findElements(By.tagName("td"));
			String trainsnames= columnData.get(1).getText();
			ArrayList<String> trains  = new ArrayList<String>();
			trains.add(trainsnames);
			int traisize = trains.size();
			System.out.println(traisize);
			
			
		}
	}

}
