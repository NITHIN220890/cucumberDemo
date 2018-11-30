package stepFunction;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import junit.framework.Assert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.PendingException;
import cucumber.api.java.en.*;

public class step {
WebDriver driver;
 static String Chrome_driver_path = "C:\\Users\\user\\Downloads\\chromedriver.exe";

@Given("^: User is already available on login page$")
public void user_is_already_available_on_login_page() throws Throwable {
	
		System.setProperty("webdriver.chrome.driver",Chrome_driver_path);
		 driver = new ChromeDriver();
		 driver.manage().deleteAllCookies();
	 driver.get("https://www.freecrm.com/index.html");
    
    
}

@When("^: Title of login page is Free Crm$")
public void title_of_login_page_is_Free_Crm() throws Throwable {

	 String title = driver.getTitle();
	 System.out.println(title);
	 System.out.println("into the title testing module");
		/* Assert.assertEquals("#1 Free CRM for Any Business: Online Customer Relationship Software", title);*/
    
}

@Then("^: user enters username$")
public void user_enters_username() throws Throwable {

		 driver.findElement(By.xpath("//*[@id='loginForm']/div/input[1]")).sendKeys("niti22");

   
}

@Then("^: user enters password$")
public void user_enters_password() throws Throwable {
	 driver.findElement(By.xpath("//*[@id='loginForm']/div/input[2]")).sendKeys("123456");
}

@Then("^: user clicks on login button$")
public void user_clicks_on_login_button() throws Throwable {
	WebElement loginBtn =
			 driver.findElement(By.xpath("//input[@type='submit']"));
			 JavascriptExecutor js = (JavascriptExecutor)driver;
			 js.executeScript("arguments[0].click();", loginBtn);
		 
		 System.out.println("done");
}

@Then("^:user is on home page$")
public void user_is_on_home_page() throws Throwable {
    System.out.println("user s in the home page");
   
}

@Then("^: user Logs out$")
public void user_Logs_out() throws Throwable {
	String title = driver.getTitle();
	 System.out.println("Home Page title ::"+ title);
	 
    
}

@Then("^: user back in the login page$")
public void user_back_in_the_login_page() throws Throwable {
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	driver.switchTo().frame("mainpanel");
	Actions action = new Actions(driver);
	action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Logout')]"))).build().perform();
	driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
	   System.out.println("complete cycle has been executed");
}



}
