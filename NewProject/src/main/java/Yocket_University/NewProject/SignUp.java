package Yocket_University.NewProject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignUp {
	WebDriver driver;
	public SignUp(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	By login = By.xpath("//div[@class='flex items-center justify-end space-x-3']");
	By createOne= By.xpath("//div[@class='w-full']//p//small[contains(@class,'text-sm')]");
	By firstname=By.xpath("//input[@id='first_name']");
	By lastname=By.xpath("//input[@id='last_name']");
	By primaryEmail=By.xpath("//input[@id='primary_email']");
	By countryCode=By.xpath("//span[@class='vs__selected']");
	By phoneNumber=By.xpath("//input[@id='phone']");
	By bachelors=By.xpath("//div[@class='flex space-x-4']//p[contains(text(),'Bachelors')]");
	By master=By.xpath("//div[@class='flex space-x-4']//p[contains(text(),'Masters')]");
	By otp=By.xpath("//input[@name='otp']");
	By submitButton=By.xpath("//button[@type='submit']");
	
	public void signUpFunction(String Fstname,String last, String Email,String phnNo,String typeOfDegree, String otpNumber) {
		
		driver.findElement(login).click();
		driver.findElement(createOne).click();
		driver.findElement(firstname).sendKeys(Fstname);
		driver.findElement(lastname).sendKeys(last);
		driver.findElement(primaryEmail).sendKeys(Email);
		driver.findElement(phoneNumber).sendKeys(phnNo);
		if(typeOfDegree=="Bachelors") {
			driver.findElement(bachelors).click();
		}else {
			driver.findElement(master).click();
		}
		driver.findElement(submitButton).click();
		
		//2nd page
		waitForPageToLoad(driver);
		driver.findElement(otp).sendKeys(otpNumber);
		driver.findElement(submitButton).click();
	}
	
	public void waitForPageToLoad(WebDriver driver) {
		WebDriverWait wait= new WebDriverWait(driver, 3000);
		wait.until( d -> ((JavascriptExecutor) d).executeScript("return document.readyState").equals("complete"));
	}
}
