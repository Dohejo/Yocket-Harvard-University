package resourse;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {
	private WebDriver driver;
	
	public Screenshot(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	public void takescreenshot(String name) throws IOException, InterruptedException{
	// To take screen shot
	Thread.sleep(1000);
	TakesScreenshot scrShot = ((TakesScreenshot) driver);
	File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
	File DestFile = new File("D:\\Eclipse\\eclipse\\Yocket harvard University\\Screenshot\\" + name+ ".png");
	FileUtils.copyFile(SrcFile, DestFile);
	
	}
}