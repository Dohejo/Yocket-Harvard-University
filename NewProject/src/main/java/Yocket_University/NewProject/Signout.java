package Yocket_University.NewProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Signout {
	WebDriver driver;
	
	By userprofile= By.xpath("//*[contains(text(),'user profile')]");
	By logout = By.xpath("//*[contains(text(),'Log out')]");
	public Signout(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	public void signoutFunction() {
		driver.findElement(userprofile).click();
		driver.findElement(logout);
	}
	
	
}
