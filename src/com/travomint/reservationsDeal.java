package com.travomint;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class reservationsDeal {

	@SuppressWarnings("unused")
	private static final WebElement DropDownElementLocator = null;

	public static void main(String[] args) throws InterruptedException {
		//System Firefox driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SNVA\\Desktop\\geckodriver-v0.32.2-win-aarch64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		System.out.println("Enter the reservation deal URL");
		driver.get("https://www.reservationsdeal.com/");
		//Maximize current window
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println("The title of the website is => "+title);
		Thread.sleep(4000);
		System.out.println("Enter the From and To destination ");
		driver.findElement(By.cssSelector("html body div.main_body div div div.banner.book-cheapfl-1 div.container div.search-engine div.tab-content.tabbanner-1 div#trpC_flights_tab.tab-pane.active form#searchForm div div div.srch_outpnl div.search-en div div.mobile_eng.mobiling div.col-md-6.col-xs-12.padding_zero div.col-xs-12.col-lg-6.col-md-6.Efl_update_orig div.depart_left div#mobile_top_search_origin.mobile_top_search div.mobile_top_search_area input#froCity.ui-autocomplete-input")).clear();
		driver.findElement(By.xpath("//*[@id=\"froCity\"]")).sendKeys("NYC");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"ui-id-6\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"toCity\"]")).sendKeys("BOS");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/ul[2]/li[1]/a/strong[2]")).click();
		
		driver.findElement(By.xpath("/html/body/div[7]/div[1]/table/tbody/tr[3]/td[5]/a")).click();
		driver.findElement(By.xpath("/html/body/div[7]/div[1]/table/tbody/tr[4]/td[3]/a")).click();
		
		driver.findElement(By.xpath("/html/body/div[2]/div[5]/div/div/div/div/div/div[2]/form/div/div/div/div/div/div[2]/div[4]/button")).click();
		Thread.sleep(5000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("div.rsltBox:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)")).click();
	
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,400)", "");
		System.out.println("Enter travellers details: ");
		
		driver.findElement(By.xpath("//*[@id=\"passengerDetails0.firstName\"]")).sendKeys("Keshav");
		driver.findElement(By.xpath("//*[@id=\"passengerDetails0.lastName\"]")).sendKeys("Test");
		
		Select Gender = new Select(driver.findElement(By.xpath("/html/body/main/form/div/div/div/div/div[1]/div[2]/div[2]/div/div/div[3]/div[2]/div/div[4]/div/span/select")));
		
		// Select the option using the visible text
		Gender.selectByVisibleText("Male");
		
		Select Day = new Select(driver.findElement(By.xpath("//*[@id=\"paxdob0\"]")));
		
		// Select the option using the visible text
		Day.selectByVisibleText("5");
		
		Select Month = new Select(driver.findElement(By.xpath("//*[@id=\"paxdom0\"]")));
		
		// Select the option using the visible text
		Month.selectByVisibleText("Mar");
		
		Select Year = new Select(driver.findElement(By.xpath("//*[@id=\"paxdoy0\"]")));
		
		// Select the option using the visible text
		Year.selectByVisibleText("2006");
		
		js.executeScript("window.scrollBy(0,400)", "");
		
		Select Card = new Select(driver.findElement(By.xpath("//*[@id=\"paymentDetails-cardCode\"]")));
		
		// Select the option using the visible text
		System.out.println("Enter card details: ");
		Card.selectByVisibleText("Visa");
		
		driver.findElement(By.xpath("//*[@id=\"paymentDetails_MaskCardNumber\"]")).sendKeys("4111111111111111");
		driver.findElement(By.xpath("//*[@id=\"paymentDetails_cardHolderName\"]")).sendKeys("Test");
		
		Select CardMonth = new Select(driver.findElement(By.xpath("//*[@id=\"paymentDetails_ExpiryMonth\"]")));
		
		// Select the option using the visible text
		CardMonth.selectByVisibleText("May");
		
		Select CardYear = new Select(driver.findElement(By.xpath("//*[@id=\"paymentDetails_ExpiryYear\"]")));
		
		// Select the option using the visible text
		CardYear.selectByVisibleText("2027");
		
		driver.findElement(By.xpath("//*[@id=\"paymentDetails_CvvNo\"]")).sendKeys("123");
		
		js.executeScript("window.scrollBy(0,400)", "");
		System.out.println("Contact Info: ");
		driver.findElement(By.xpath("//*[@id=\"phoneNo\"]")).sendKeys("8989898978");
		driver.findElement(By.xpath("//*[@id=\"emailID\"]")).sendKeys("keshav@snva.com");
		driver.findElement(By.xpath("//*[@id=\"emailID1\"]")).sendKeys("keshav@snva.com");
		
		js.executeScript("window.scrollBy(0,200)", "");
		System.out.println("Contact Address");
		driver.findElement(By.xpath("//*[@id=\"paymentDetails_address1\"]")).sendKeys("B 28 29");
		driver.findElement(By.xpath("//*[@id=\"paymentDetails_city\"]")).sendKeys("Noida");
		
		Select selCountry = new Select(driver.findElement(By.xpath("//*[@id=\"paymentDetails_Country\"]")));
		
		// Select the option using the visible text
		selCountry.selectByVisibleText("India");
		
		Select selState = new Select(driver.findElement(By.xpath("//*[@id=\"paymentDetails_state2\"]")));
		
		// Select the option using the visible text
		selState.selectByVisibleText("UP-Uttar Pradesh");
		
		driver.findElement(By.xpath("//*[@id=\"paymentDetails_postalCode\"]")).sendKeys("201301");
		
		js.executeScript("window.scrollBy(0,200)", "");
		
		driver.findElement(By.xpath("//*[@id=\"agree\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"submitBooking\"]")).click();
		System.out.println("Ticket Successfully Booked. ");
		driver.quit();
	}
	} 
		