package Yocket_University.NewProject;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import resourse.Screenshot;

public class MainTest {
	WebDriver driver;
	
	@BeforeMethod(alwaysRun = true)
	public void initializeBrowser() throws IOException, InterruptedException
	{	
		System. setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		// Initialize browser.
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://yocket.in/");
		waitForPageToLoad(driver);
		Screenshot obj = new Screenshot(driver);
		obj.takescreenshot("After opeing the Web-Link");
		
	}
	
	@Test
	public void mainFunction() throws IOException, InterruptedException {
		
		SignUp object = new SignUp(driver);
		//Sign up
		object.signUpFunction("Dorendro", "leimapokam", "Dorendro12345@gmail.com", "8414094605", "bachelors", "*****");
		
		// Log in
		LogIn obj2 = new LogIn(driver);
		obj2.loginFunction("70005123456","****");
		// Log out
		
		Signout object3= new Signout(driver);
		object3.signoutFunction();
		
	}
	
	@AfterMethod(alwaysRun = true)
	public void closeBroswer()
	{
		//driver.quit();
	}
	
	public void waitForPageToLoad(WebDriver driver) {
		WebDriverWait wait= new WebDriverWait(driver, 1000);
		wait.until( d -> ((JavascriptExecutor) d).executeScript("return document.readyState").equals("complete"));
	}
	
}