package trial;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tempt 
{

	public static void main(String[] args) throws Exception 
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
				
				//Validation
				Thread.sleep(4000);
							//Edit Personal Information
				driver.findElement(By.xpath("(//*[text()='Edit'])[1]")).click();
				WebElement double1 = driver.findElement(By.xpath("//*[@name='firstName']"));
				act.doubleClick(double1).build().perform();
				Thread.sleep(3000);
				double1.sendKeys("PRAMOD");
				WebElement double2 = driver.findElement(By.xpath("//*[@name='lastName']"));
				
				act.doubleClick(double2).build().perform();
				Thread.sleep(3000);
				double2.sendKeys("MHASE");
				driver.findElement(By.xpath("(//*[@type='submit'])[2]")).click();
				
				driver.findElement(By.xpath("(//*[@class='_3memBI _14Me7y'])[1]")).click();
				Thread.sleep(3000);
				WebElement double3 = driver.findElement(By.xpath("(//*[@class='_1w3ZZo _2mFmU7'])"));
				Thread.sleep(3000);
				act.doubleClick(double3).sendKeys(Keys.DELETE).build().perform();
				Thread.sleep(3000);
				act.click(double3).sendKeys(Keys.BACK_SPACE).build().perform();
				act.click(double3).sendKeys(Keys.BACK_SPACE).build().perform();
				act.click(double3).sendKeys(Keys.BACK_SPACE).build().perform();
				act.click(double3).sendKeys(Keys.BACK_SPACE).build().perform();
				Thread.sleep(3000);
				act.doubleClick(double3).sendKeys(Keys.DELETE).build().perform();
				Thread.sleep(3000);
				act.doubleClick(double3).sendKeys(Keys.DELETE).build().perform();
				Thread.sleep(3000);
				act.sendKeys("mhasepramod44@gmail.com").build().perform();
				//click on cancel
				driver.findElement(By.xpath("(//*[@class='_3memBI _14Me7y'])[1]")).click();
					//Mobile Number Field
				driver.findElement(By.xpath("(//*[@class='_3memBI _14Me7y'])[2]")).click();
				WebElement Mob = driver.findElement(By.xpath("//*[@class='_1w3ZZo _2mFmU7']"));
				Thread.sleep(3000);
				act.doubleClick(Mob).sendKeys("9834923994").build().perform();
				driver.findElement(By.xpath("//*[@class='_2KpZ6l _25vsmg _1-iOO7']")).click();
				driver.findElement(By.xpath("(//*[@class='_3memBI _14Me7y'])[2]")).click();
				
				//Manage Address
				driver.findElement(By.xpath("(//*[@class='NS64GK'])[1]")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@class='_1QhEVk']")).click();
				//Add a new Address
				WebElement name = driver.findElement(By.xpath("(//*[@class='_1w3ZZo _2mFmU7'])[1]"));
				name.sendKeys("PRAMOD MHASE");
				WebElement num = driver.findElement(By.xpath("(//*[@class='_1w3ZZo _2mFmU7'])[2]"));
				num.sendKeys("9834923994");
				driver.findElement(By.xpath("(//*[@class='_1w3ZZo _2mFmU7'])[3]")).sendKeys("413737");
				driver.findElement(By.xpath("(//*[@class='_1w3ZZo _2mFmU7'])[4]")).sendKeys("Gaothan");
				driver.findElement(By.xpath("//*[@name='addressLine1']")).sendKeys("Tambewadi Road");
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[text()='Home']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@tabindex='10']")).click();
	}
}