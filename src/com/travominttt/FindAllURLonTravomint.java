package com.travominttt;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import java.util.Iterator; 
@SuppressWarnings("unused")
public class FindAllURLonTravomint {
    public static void main(String[] args) throws InterruptedException {
        //System Firefox driver
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SNVA\\Desktop\\geckodriver-v0.32.2-win-aarch64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        System.out.println("Open the travomint URL");
        driver.get("https://www.travomint.com/");
        //Maximize current window
        System.out.println("Maximize the currect window");
        driver.manage().window().maximize();
        Thread.sleep(12000);
        String title = driver.getTitle();
        System.out.println("The title of the website is "+title);
        String url="";
        List<WebElement> allURLs = driver.findElements(By.tagName("a"));
        System.out.println("Total links on the Travomint Page: " + allURLs.size());
        
        Iterator<WebElement> iterator = allURLs.iterator();
        while (iterator.hasNext()) {
      	  url = iterator.next().getText();
      	  System.out.println(url);
        }
        
       //Close the browser session
        driver.quit();
  }

}