package com.practice.SeleniumTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SampleSelTest {
	
	@Test
	public void Auto() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		WebDriver wd=new ChromeDriver();
		Thread.sleep(3000);
		wd.get("https://www.google.co.in");
		Thread.sleep(3000);
		wd.findElement(By.name("q")).sendKeys("gmail");
		Thread.sleep(3000);
		List <WebElement> list=wd.findElements(By.className("sbl1"));
		Thread.sleep(3000);
		
		for (WebElement suggest : list) {
			if(suggest.getText().equalsIgnoreCase("gmail sign up")) {
				suggest.click();
				break;
			}//if
		}//for
		Thread.sleep(3000);
		wd.findElement(By.xpath("//*[@id='rso']/div[1]/div/div/div/div/div[1]/a/h3")).click();
		Thread.sleep(2000);
		wd.findElement(By.name("identifier")).sendKeys("ravi123");
		Thread.sleep(2000);
		wd.findElement(By.className("CwaK9")).click();
	}

}
