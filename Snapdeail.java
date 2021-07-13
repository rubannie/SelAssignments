package week4.assignment.day2;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Snapdeail {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
	    ChromeDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.snapdeal.com/");
	    driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	    ChromeOptions options = new ChromeOptions();
	    options.addArguments("--disable-notifications");
	    
	    
	    WebElement mensFashion = driver.findElement(By.xpath("//div[@id='leftNavMenuRevamp']/div[1]/div[2]/ul[1]/li[7]/a[1]/span[1]"));
	    WebElement sportsShoes = driver.findElement(By.xpath("//span[text()='Sports Shoes']"));
	    
	    Actions builder = new Actions(driver);
	    builder.moveToElement(mensFashion);
	    builder.moveToElement(sportsShoes);
	    sportsShoes.click();
	    
	    String sportShoescount = driver.findElement(By.className("category-count")).getText();
	    
	    WebElement trainingShoes = driver.findElement(By.xpath("(//div[@class='child-cat-name '])[2]"));
	    
	    WebElement popularity = driver.findElement(By.className("sort-selected"));
	    
	    Select price = new Select(popularity);
	    price.selectByVisibleText("Price Low To High");
	    
	    String rs = driver.findElement(By.xpath("//span[@class='lfloat product-price']")).getText();
	    String rs1 = driver.findElement(By.xpath("(//span[@class='lfloat product-price'])[3]")).getText();
	    
	  String lowestPrice = rs.replace("Rs.","");
	  String lowestPrice2 = rs1.replace("Rs", "");
	  
	  int lowestP = Integer.parseInt(lowestPrice);
	  int lowestP2 = Integer.parseInt(lowestPrice2);
	  
	  int compare = Integer.compare(lowestP, lowestP2);
	  
	  if(compare == 0) {
		  System.out.println("values are sorted correctly");
	  }
	  else {
		  System.out.println("values are not sorted correctly");
	  }
	  
	  WebElement jAGROONGYMTRAINING = driver.findElement(By.xpath("//p[@class='product-title']"));
	  Actions shoesBrand = new Actions(driver);
	  shoesBrand.moveToElement(jAGROONGYMTRAINING);
	  
	  driver.findElement(By.xpath("//div[@pogid='644667958875']")).click();
	  
	  String percent = driver.findElement(By.className("percent-desc ")).getText();
	  String priceShoe = driver.findElement(By.className("payBlkBig")).getText();
	  System.out.println(percent+" "+priceShoe); 
	  
	  File source = driver.getScreenshotAs(OutputType.FILE);
	  File target = new File("./snaps/snapdeal.png");
	  FileUtils.copyFile(source, target);
	  driver.findElementByXPath("(//i[@class='sd-icon sd-icon-delete-sign'])[3]").click();
	  driver.close();
	  
	    

	}
       
	}


