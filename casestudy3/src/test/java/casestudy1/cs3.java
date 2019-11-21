package casestudy1;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class cs3 {
	WebDriver driver;
	@Given("login page is opened")
	public void login_page_is_opened() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Training_b6b.01.03\\Desktop\\kgf2\\chromedriver_win32\\chromedriver.exe");
		   driver=new ChromeDriver();
		   String url="http://10.232.237.143:443/TestMeApp/fetchcat.htm";
		   driver.get(url);
		   driver.manage().window().maximize();
		   driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
	}

	@When("user enters lalitha as username and password{int} as password")
	public void user_enters_lalitha_as_username_and_password_as_password(Integer int1) {
		driver.findElement(By.id("userName")).sendKeys("Lalitha");
		  driver.findElement(By.id("password")).sendKeys("password123");
		  driver.findElement(By.name("Login")).click();
	}

	@When("searches for headphones in search field")
	public void searches_for_headphones_in_search_field() {
	driver.findElement(By.id("myInput")).sendKeys("head");
	}

	@Then("user is able to purchase headphones")
	public void user_is_able_to_purchase_headphones() {
		 driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
		 System.out.println("the page title is:"+driver.getTitle());
		 driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
		 driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]")).click();
		 driver.findElement(By.xpath("//*[@id=\"cart\"]/tfoot/tr[2]/td[5]/a")).click();
		 driver.findElement(By.xpath("/html/body/b/div/div/div[1]/div/div[2]/div[3]/div/form[2]/input")).click();
		  WebDriverWait w = new WebDriverWait(driver,20);
		  w.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//label[contains(text(),'Andhra Bank')]")));
		 driver.findElement(By.xpath("//label[contains(text(),'Andhra Bank')]")).click();
		 driver.findElement(By.xpath("//*[@id=\"btn\"]")).click();
		 driver.findElement(By.name("username")).sendKeys("123456");;
		 driver.findElement(By.name("password")).sendKeys("Pass@456");;
		 driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
		 driver.findElement(By.name("transpwd")).sendKeys("Trans@456");;
		 driver.findElement(By.xpath("//input[@value='PayNow']")).click();
			Assert.assertTrue(driver.getTitle().contains("Search"));
			
	    
	}

}
