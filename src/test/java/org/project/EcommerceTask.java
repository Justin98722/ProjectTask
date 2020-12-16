package org.project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class EcommerceTask {
	
	public static WebDriver driver;
	@BeforeMethod
	private void launch() {
          System.setProperty("webdriver.chrome.driver","C:\\Users\\Ruby\\eclipse-workspace\\ProjectTask\\Driver\\chromedriver.exe");
          driver=new ChromeDriver();
         driver.get("https://www.amazon.in/");
        		  
	}
	
	@Test
	public void sourceCode1() throws InterruptedException {
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("lenovo laptop");
	driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
    List<WebElement> sum = driver.findElements(By.xpath("//span[contains(text(),'Lenovo')]"));   
	for (WebElement abc : sum) {
		String allLink = abc.getText();
		System.out.println(allLink);
	}
		driver.findElement(By.xpath("(//span[contains(text(),'3')])[4]")).click();
       List<WebElement> rate = driver.findElements(By.xpath("(//span[contains(text(),'₹3')])"));
       
	for (WebElement efg : rate) {
		String text = efg.getText();
		System.out.println(text);
	}
	
	
	}
	

	
	

	}
