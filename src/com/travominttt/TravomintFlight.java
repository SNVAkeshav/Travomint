package com.travominttt;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
@SuppressWarnings("unused")
public class TravomintFlight {
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

//        System.out.println("Enter from and To destinations: ");
//
//        driver.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/div/div/div[2]/div[2]/div[1]/div[1]/div[2]")).click();
//        driver.findElement(By.xpath("//*[@id=\"from\"]")).sendKeys("BLR");
//        Thread.sleep(2000);
//        //select from detail
//        driver.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/div/div/div[2]/div[2]/div[1]/div[1]/div[3]/div/div/div[2]/p[2]")).click();
//        //enter the "to" details
//        driver.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/div/div/div[2]/div[2]/div[2]/div/div[2]")).click();
//        driver.findElement(By.cssSelector("#__next > div > div > div.book-flight-engine.bgengine > div > div > div.chflight > div.row-chflight.g-3.row > div:nth-child(2) > div > div.calenderbx-site.fromcda-menusb > input")).sendKeys("DELHI");
//        Thread.sleep(2000);
//        //select "to" details
//        driver.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/div/div/div[2]/div[2]/div[2]/div/div[3]/div/div/div[2]/p[2]")).click();
//        //search flight
//
//        System.out.println("Search flight successfully");
//
//        driver.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/div/div/div[2]/div[2]/div[4]/div/div[2]/button")).click();
//        Thread.sleep(20000);
//
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,200)", "");
//        Thread.sleep(2000);
//
//
//        driver.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/div/div[2]/div[2]/div[4]/div[1]/div[1]/div[3]/div[2]/div/a")).click();
//        Thread.sleep(10000);
//        //user email id and phone number
//
//        System.out.println("Enter user E-mail ID and contact number: ");
//        driver.findElement(By.cssSelector("#\\:r7\\:")).sendKeys("keshav@snva.com");
//        driver.findElement(By.xpath("//*[@id=\":r9:\"]")).sendKeys("8929659752");
//        Actions at = new Actions(driver);
//        at.sendKeys(Keys.PAGE_DOWN).build().perform();
//        //Click on continue details
//        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div[1]/div[4]/div[1]/div[2]/div/form/div[2]/input")).submit();
//        Actions att = new Actions(driver);
//        at.sendKeys(Keys.PAGE_DOWN).build().perform();
//
//        //User Data
//
//        driver.findElement(By.xpath("//*[@id=\":ra:\"]")).sendKeys("Keshav");
//        driver.findElement(By.xpath("//*[@id=\":rc:\"]")).sendKeys("Test");
//
//        JavascriptExecutor jss = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,250)", "");
//
//        driver.findElement(By.cssSelector("#\\:rd\\:")).click();
//        driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/div/div[1]/div/div[2]/div/div[2]/div/div[2]/button[3]")).click();
//        Thread.sleep(20000);
//        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div[1]/div[4]/div[2]/div[2]/div/form/ol/div/div/button")).click();
//
//        JavascriptExecutor jsss = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,250)", "");
//        Thread.sleep(5000);
//
//        driver.findElement(By.xpath("/html/body/div/div/div/div/div/div[1]/div[4]/div[3]/div[2]/div/div[3]/div[2]/ul/li[2]/div/div/div/div[1]")).click();
//        driver.findElement(By.xpath("/html/body/div/div/div/div/div/div[1]/div[4]/div[3]/div[2]/div/div[3]/div[3]/button")).click();
//        Thread.sleep(9000);
//
//        driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[1]/div/div[1]/i/small")).click();
//        driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div/div/div/div/div/div[2]/button[1]")).click();
//        Thread.sleep(15000);
//
//        driver.quit();
//        System.out.println("Booking is Successful");
    }

}
