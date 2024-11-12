package QCPackage;
import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
@SuppressWarnings("unused")
public class TravomintHotel {
	public static void main(String[] args) throws InterruptedException {
		//System Firefox driver
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SNVA\\Desktop\\geckodriver-v0.32.2-win-aarch64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		
		System.out.println("Open the travomint URL");
		driver.get("https://www.travomint.com/hotels");
	
		System.out.println("Maximize the currect window");
		driver.manage().window().maximize();
		Thread.sleep(15000);
		
		String title = driver.getTitle();
		System.out.println("The title of the wensite is "+title);
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div[2]/div/div/div/div[1]/div/div/div[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"from\"]")).sendKeys("mumbai");
		Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div[2]/div/div/div/div[1]/div/div/div[3]/div/div/div[2]")).click();
		
//select the check in and check out date
   System.out.println("select the check in and check out date");
	    driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div[2]/div/div/div/div[2]/div/div[1]/div/div[1]")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div[2]/div/div/div/div[2]/div[1]/div/div[2]/table/tbody/tr[3]/td[4]")).click();
	driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div[2]/div/div/div/div[2]/div[1]/div/div[2]/table/tbody/tr[4]/td[3]")).click();
		
//select the number of guests
	    System.out.println("select the number of guests");
		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div[2]/div/div/div/div[3]/div/div/div[1]/div")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div[2]/div/div/div/div[3]/div/div[2]/div[1]/div/div[2]/div[2]/div/div[2]/div[3]/button")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div[2]/div/div/div/div[3]/div/div[2]/div[2]/button")).click();
		// click on  search button
		System.out.println(" click on  search button ");
		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div[2]/div/div/div/div[4]/button")).click();
		Thread.sleep(20000);
		
		System.out.println("listing page");		
//listing page
						
	    driver.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/div/div/div[2]/div[3]/div[1]/div/div[1]/div/div[2]/div[1]/h5")).click();
		Thread.sleep(12000);
		  driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div[2]/div/div/div/div[3]/div/div/div[1]")).click();
		  System.out.println(" open the guest widget ");
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div[2]/div/div/div/div[3]/div/div[2]/div[1]/div/div[2]/div[2]/div/div[2]/div[1]/button")).click();
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div[2]/div/div/div/div[3]/div/div[2]/div[2]/button")).click();
			Thread.sleep(5000);
			
			 ArrayList<String> wid = new ArrayList<String>(driver.getWindowHandles());
			 driver.switchTo().window(wid.get(1));
			 System.out.println("The title of the website is "+driver.getTitle());
		
		js.executeScript("window.scrollBy(0,2000)", "");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[4]/div/div/div/div[3]/div/div/div/div/div/div[1]/div/div/div[2]/button")).click();
		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"title\"]")).click();
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul/li[1]")).click();
		
	driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("Neeraj");
		driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys("SNVA");
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div[2]/div[2]/form/div[1]/div/div[2]/div/div[2]/div[4]/div/div/div/div/button")).click();
	driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div/div[2]/div/div/div[2]/div/div[1]/button[1]")).click();
		
		js.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(2000);
		System.out.println(" enter mobile number and email id ");
		
	driver.findElement(By.xpath("//*[@id=\"mobilePhone\"]")).sendKeys("9999999999");
	driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("neeraj@w2c.co.in");
	js.executeScript("window.scrollBy(0,500)", "");
	Thread.sleep(2000);
	
	System.out.println(" payment gateway ");
	
	 driver.findElement(By.cssSelector(".count-nm")).click();
	driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div[2]/div[2]/form/div[4]/button")).submit();
	Thread.sleep(8000);
	driver.findElement(By.cssSelector(".ptm-go-back-btn")).click();
	driver.findElement(By.xpath("/html/body/div[2]/div/div/div[4]/div/div[2]/div/div[5]/div/button[2]")).click();
				
}
}









