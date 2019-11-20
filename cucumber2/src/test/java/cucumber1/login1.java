package cucumber1;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login1 {
	WebDriver driver=null;
	@Given("User is open the application")
	public void user_is_open_the_application() {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Training_b6b.01.03\\Desktop\\kgf2\\chromedriver_win32\\chromedriver.exe");
		   driver=new ChromeDriver();
		   String url="http://10.232.237.143:443/TestMeApp/fetchcat.htm";
		   driver.get(url);
		   driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
	}

	@When("user enters {string} and {string}")
	public void user_enters_and(String username, String password) {
		 driver.findElement(By.id("userName")).sendKeys(username);
		 driver.findElement(By.id("password")).sendKeys(password);
		 driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();
	}

	@Then("Message displayed Login Successfully")
	public void message_displayed_Login_Successfully() {
		 System.out.println("the page title is:"+driver.getTitle());
			Assert.assertTrue(driver.getTitle().contains("Home"));
			driver.close();
	}

}
