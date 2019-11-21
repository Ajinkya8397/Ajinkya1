package casestudy1;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class cs1 {
	WebDriver driver;
	@Given("the Signup page is opened")
	public void the_Signup_page_is_opened() {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Training_b6b.01.03\\Desktop\\kgf2\\chromedriver_win32\\chromedriver.exe");
		   driver=new ChromeDriver();
		   String url="http://10.232.237.143:443/TestMeApp/fetchcat.htm";
		   driver.get(url);
		   driver.manage().window().maximize();
		   driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[2]/a")).click();
	}

	@When("user enters Ajinkya{int} as username")
	public void user_enters_Ajinkya_as_username(Integer int1) {
		 driver.findElement(By.id("userName")).sendKeys("Ajinkya10");
	}

	@When("user enters Ajinkya as First Name")
	public void user_enters_Ajinkya_as_First_Name() {
		 driver.findElement(By.id("firstName")).sendKeys("Ajinkya");
	}

	@When("user enters Patil as Last Name")
	public void user_enters_Patil_as_Last_Name() {
		driver.findElement(By.id("lastName")).sendKeys("Patil");
	}

	@When("user enters Patil@{int} as password")
	public void user_enters_Patil_as_password(Integer int1) {
		driver.findElement(By.id("password")).sendKeys("Patil123");
	}

	@When("user enters Patil@{int} as confirm password")
	public void user_enters_Patil_as_confirm_password(Integer int1) {
		driver.findElement(By.id("pass_confirmation")).sendKeys("Patil123");
	}

	@When("user select gender as male")
	public void user_select_gender_as_male() {
		driver.findElement(By.xpath("//input[@value='Male']")).click();
	}

	@When("user enters ajinkyapatil{int}@gmail.com as E-Mail")
	public void user_enters_ajinkyapatil_gmail_com_as_E_Mail(Integer int1) {
		driver.findElement(By.id("emailAddress")).sendKeys("ajinkyapatil55@gmail.com");
	}

	@When("user enters {string} as Mobile Number")
	public void user_enters_as_Mobile_Number(String string) {
		driver.findElement(By.xpath("//*[@id='mobileNumber']")).sendKeys("7894563210");
	}

	@When("User enters {string} as DOB")
	public void user_enters_as_DOB(String string) {
		driver.findElement(By.id("dob")).sendKeys("04/08/1997");
	}
	
	
	@When("user enters Pune as Address")
	public void user_enters_Pune_as_Address() {
		driver.findElement(By.id("address")).sendKeys("Pune");
	}

	@When("User select What is Your Birth Place? as Security Question")
	public void user_select_What_is_Your_Birth_Place_as_Security_Question() {
		 Select ques = new Select (driver.findElement(By.id("securityQuestion")));
		  ques.selectByIndex(0);
	}

	@When("user enters Nasik as Answer")
	public void user_enters_Nasik_as_Answer() {
		driver.findElement(By.id("answer")).sendKeys("Nasik");
	}

	@When("user clicks on Register Button")
	public void user_clicks_on_Register_Button() {
		  driver.findElement(By.xpath("//input[@value='Register']")).click();
	}

	@Then("user will Finds a testmeapp homepage")
	public void user_will_Finds_a_testmeapp_homepage() {
		System.out.println("the page title is:"+driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Home"));
	}


}
