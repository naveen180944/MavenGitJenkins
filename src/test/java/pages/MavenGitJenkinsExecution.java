package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MavenGitJenkinsExecution {

	WebDriver driver;
	
	public void samplegoogleTest() {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println(driver.findElement(By.id("APjFqb")).getAttribute("maxlength"));
		System.out.println(driver.getTitle());
		
	}
	
	
	
}
