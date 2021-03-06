package Yocket_University.NewProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogIn {
	WebDriver driver;
	By login = By.xpath("//div[@class='flex items-center justify-end space-x-3']");
	By phoneNumber=By.xpath("//input[@id='phone']");
	By otp=By.xpath("//input[@name='otp']");
	By submitButton=By.xpath("//button[@type='submit']");
	
	public LogIn(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	public void loginFunction(String phnNumber, String optNumber) {
		
		driver.get("https://yocket.in/");
		driver.findElement(login);
		driver.findElement(phoneNumber).sendKeys(phnNumber);
		driver.findElement(submitButton);
		
		driver.findElement(otp).sendKeys(optNumber);
		driver.findElement(submitButton);
		
	}
}

