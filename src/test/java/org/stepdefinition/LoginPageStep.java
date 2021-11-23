package org.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPageStep {
	WebDriver driver;
	@Given("Launcing Browser")
	public void launcing_Browser() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.
	}

	@When("User Login with {string} and {string}")
	public void user_Login_with_and(String string, String string2) {
		driver.findElement(By.id("username")).sendKeys(string);
		driver.findElement(By.id("password")).sendKeys(string2);
		driver.findElement(By.id("login")).click();
	}

	@When("User Searching Hotel {string},{string},{string},{string},{string},{string},{string}and{string}")
	public void user_Searching_Hotel_and(String location, String hotel, String roomtype, String numofrooms, String checkindate, String checkoutdate, String adults, String child) {
		
		Select s2 = new Select(driver.findElement(By.id("location")));
		s2.selectByVisibleText(location);
		
		Select s1 = new Select(driver.findElement(By.id("hotels")));
		s1.selectByVisibleText(hotel);
		
		Select s3 = new Select(driver.findElement(By.id("room_type")));
		s3.selectByVisibleText(roomtype);
		
		Select s4 = new Select(driver.findElement(By.id("room_nos")));
		s4.selectByVisibleText(numofrooms);
		
		driver.findElement(By.id("datepick_in")).sendKeys(checkindate);
		
		driver.findElement(By.id("datepick_out")).sendKeys(checkoutdate);
		
		Select s7 = new Select(driver.findElement(By.id("adult_room")));
		s7.selectByVisibleText(adults);
		
		Select s8 = new Select(driver.findElement(By.id("child_room")));
		s8.selectByVisibleText(child);
		
		driver.findElement(By.id("Submit")).click();
	}

	@When("User Selecting Hotel")
	public void user_Selecting_Hotel() {
		driver.findElement(By.id("radiobutton_0")).click();
		driver.findElement(By.id("continue")).click();
	}

	@When("User Booking Hotel {string},{string},{string},{string},{string},{string},{string} and {string}")
	public void user_Booking_Hotel_and(String firstname, String lastname, String address, String ccnum, String cctype, String month, String year, String cvvnum) throws InterruptedException {
		driver.findElement(By.id("first_name")).sendKeys(firstname);
		driver.findElement(By.id("last_name")).sendKeys(lastname);
		driver.findElement(By.id("address")).sendKeys(address);
		driver.findElement(By.id("cc_num")).sendKeys(ccnum);
		Select s1 = new Select(driver.findElement(By.id("cc_type")));
		s1.selectByVisibleText(cctype);
		Select s2 = new Select(driver.findElement(By.id("cc_exp_month")));
		s2.selectByVisibleText(month);
		Select s3 = new Select(driver.findElement(By.id("cc_exp_year")));
		s3.selectByVisibleText(year);
		driver.findElement(By.id("cc_cvv")).sendKeys(cvvnum);
		//Thread.sleep(2000);
		driver.findElement(By.id("book_now")).click();
		
		
	}

	@When("Order Number Generated")
	public void order_Number_Generated() {
	   WebElement findElement = driver.findElement(By.id("order_no"));
	   String attribute = findElement.getAttribute("value");
	   System.out.println("Booking Confirmation Order Id : "+ attribute);
	}

	@Then("User Successfully Booked Ticket")
	public void user_Successfully_Booked_Ticket() {
	  driver.close();
	}

}
