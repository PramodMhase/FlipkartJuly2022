package trial;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TempAddToCart 
{
	public static void main(String[] args) throws InterruptedException 
	{
		//Launch browser
		System.setProperty("webdriver.chrome.driver", "F:\\Automation Support\\Browsers\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		//Open Application
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		
		//Cancel Login Window
		driver.findElement(By.xpath("//*[@class='_2KpZ6l _2doB4z']")).click();
		
		//Navigate on login
		Actions act = new Actions(driver);
		WebElement a = driver.findElement(By.xpath("//*[@class='_1_3w1N']"));
		act.moveToElement(a).build().perform();
		
		
		//Click on my profile
		driver.findElement(By.xpath("//*[text()='My Profile']")).click();
		
		//Provide Username
		driver.findElement(By.xpath("(//*[@autocomplete='off'])[2]")).sendKeys("9834923994");
		
		//Provide password
		driver.findElement(By.xpath("//*[@class='_2IX_2- _3mctLh VJZDxU']")).sendKeys("Pramod@250587");
		
		//Click on login button
		driver.findElement(By.xpath("//*[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
		Thread.sleep(5000);
		//Navigate to Electronics
		Actions act1 = new Actions(driver);
		WebElement b = driver.findElement(By.xpath("//*[text()='Electronics']"));
		act1.moveToElement(b).build().perform();
		Thread.sleep(3000);
		
		//Click on OPPO link
		driver.findElement(By.xpath("//*[text()='OPPO']")).click();
		Thread.sleep(3000);		
		
		//Click on Required mobile link
		driver.findElement(By.xpath("(//*[@class='s1Q9rs'])[3]")).click();
		
		//Switch to window
		Set<String> ids =driver.getWindowHandles();
		Iterator<String> itr=ids.iterator();
				String CT1 =itr.next();
				String CT2 = itr.next();
		driver.switchTo().window(CT2);
		Thread.sleep(3000);
		
		//Click on Add To Cart
		driver.findElement(By.xpath("//*[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
		
		
	}
}
