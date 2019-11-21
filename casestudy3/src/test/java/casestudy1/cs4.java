package casestudy1;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class cs4 {
	WebDriver driver;
	boolean cartavail;
	@Given("Login page will open")
	public void login_page_will_open() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Training_b6b.01.03\\Desktop\\kgf2\\chromedriver_win32\\chromedriver.exe");
		   driver=new ChromeDriver();
		   String url="http://10.232.237.143:443/TestMeApp/fetchcat.htm";
		   driver.get(url);
		   driver.manage().window().maximize();
		   driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
			
	}
	@When("user enters lalitha as username and password{int} as password and click on Login")
	public void user_enters_lalitha_as_username_and_password_as_password_and_click_on_Login(Integer int1) {
		driver.findElement(By.id("userName")).sendKeys("Lalitha");
		  driver.findElement(By.id("password")).sendKeys("password123");
		  driver.findElement(By.name("Login")).click();
		
	}
	@When("search the product")
	public void search_the_product() {
		driver.findElement(By.id("myInput")).sendKeys("head");
		 driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
	}

	@When("proceed to pay without adding to cart")
	public void proceed_to_pay_without_adding_to_cart() {
		// driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
		 String cart="Cart";
		 try
		 {
			 WebElement e=driver.findElement(By.partialLinkText(cart));
			 e.click();
			 cartavail=true;
			 
		 }
		 catch(org.openqa.selenium.NoSuchElementException|StaleElementReferenceException e){
			 e.printStackTrace();
		 }
		 }
	
	

	@Then("error message is displayed")
	public void error_message_is_displayed() {
		Assert.assertTrue(!cartavail);
	}

}
