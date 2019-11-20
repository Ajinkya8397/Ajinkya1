package pom1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageClass {
	WebDriver driver;
	By lnc=By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a");
	By uname=By.name("Email");
	By pwd=By.name("Password");
	By link=By.xpath("//input[@value='Log in']");
	
	public PageClass(WebDriver driver)
	{
		this.driver=driver;
	}
	public void clicklink()
	{
		driver.findElement(lnc).click();
	}
	public void typeuname(String username)
	{
		driver.findElement(uname).sendKeys("aravind.guggilla57@gmail.com");
	}
	public void typepassword(String password)
	{
		driver.findElement(pwd).sendKeys("aravind");
		
	}
	public void clicklogin()
	{
		driver.findElement(link).click();
	}
}
