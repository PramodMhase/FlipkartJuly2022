package utility;

import java.util.Hashtable;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import cucumbermap.ConfigReader;

public class SeleniumOperations 
{
		public static WebDriver driver=null;
		public static ConfigReader config;
		public static Hashtable<String, Object> outputparameters= new Hashtable<String, Object>();
		public static Hashtable<String, Object> BrowserLaunch(Object[]inputParameters)
		{
			try 
			{
				String strBrowserName=(String)inputParameters[0];
				if(strBrowserName.equalsIgnoreCase("Chrome"))
				{
				config =new ConfigReader();
				System.setProperty("webdriver.chrome.driver", config.getDriverPathChrome());
				driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);
				}
				
				else if (strBrowserName.equalsIgnoreCase("FF"))
				{
					System.setProperty("webdriver.gecko.driver", config.getDriverPathFF());
					driver=new FirefoxDriver();
					driver.manage().window().maximize();
					driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);
				}
				outputparameters.put("STATUS", "PASS");
				outputparameters.put("MESSAGE", "Action:BrowserLaunch, Input:"+inputParameters[0].toString());
				
			}
			catch(Exception e)
			{
				outputparameters.put("STATUS", "FAIL");
				outputparameters.put("MESSAGE", "Action:BrowserLaunch, Input:"+inputParameters[0].toString());
			}
			return outputparameters;
		}
		
		public static Hashtable<String, Object> OpenApplication()
		{
			try
			{
				driver.get(config.getApplicationUrl());
				driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);
				outputparameters.put("STATUS", "PASS");
				outputparameters.put("MESSAGE", "Action:OpenApplication, Input:"+config.getApplicationUrl().toString());
			}
			catch(Exception e)
			{
				outputparameters.put("STATUS", "FAIL");
				outputparameters.put("MESSAGE", "Action:OpenApplication, Input:"+config.getApplicationUrl().toString());
			}
			return outputparameters;
		}
		
		public static Hashtable<String, Object> ClickOnElement(Object[]inputParameters)
		{
			try 
			{
				String path = (String)inputParameters[0];
				driver.findElement(By.xpath(path)).click();
				driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);
				outputparameters.put("STATUS", "PASS");
				outputparameters.put("MESSAGE", "Action:ClickOnElement, Input:"+inputParameters[0].toString());
			}
			catch(Exception e)
			{
				outputparameters.put("STATUS", "FAIL");
				outputparameters.put("MESSAGE", "Action:ClickOnElement, Input:"+inputParameters[0].toString());

			}
			return outputparameters;
		}
		
		public static Hashtable<String, Object> MoveToElement(Object[]inputParameters)
		{
			try
			{
				String path = (String)inputParameters[0];
				Actions act = new Actions(driver);
				WebElement a = driver.findElement(By.xpath(path));
				act.moveToElement(a).build().perform();
				driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);
				outputparameters.put("STATUS", "PASS");
				outputparameters.put("MESSAGE", "Action:MoveToElement, Input:"+inputParameters[0].toString());

			}
			catch(Exception e)
			{
				outputparameters.put("STATUS", "FAIL");
				outputparameters.put("MESSAGE", "Action:MoveToElement, Input:"+inputParameters[0].toString());
			}
			return outputparameters;
		}
		
		public static Hashtable<String, Object> SendTextOnUI(Object[]inputParameters)
		{
			try 
				{
					String path = (String)inputParameters[0];
					String value=(String)inputParameters[1];
					driver.findElement(By.xpath(path)).sendKeys(value);
					driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);
					outputparameters.put("STATUS", "PASS");
					outputparameters.put("MESSAGE", "Action:SendTextOnUI, Input:"+inputParameters[1].toString());

				}
			catch(Exception e)
			{
				outputparameters.put("STATUS", "FAIL");
				outputparameters.put("MESSAGE", "Action:SendTextOnUI, Input:"+inputParameters[1].toString());
			}
			return outputparameters;
		}
		public static Hashtable<String, Object> ValidationByGetText(Object[]inputParameters)
		{
			try 
				{
					String actualtext=(String)inputParameters[0];
					String locator=(String)inputParameters[1];
					String capturedtext = driver.findElement(By.xpath(locator)).getText();
					
					
					if(actualtext.equalsIgnoreCase(capturedtext))
					{
						System.out.println("Test case pass");
					}
					else
					{
						System.out.println("Test case fail");
					}
					driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);
					outputparameters.put("STATUS", "PASS");
					outputparameters.put("MESSAGE", "Action:ValidationByGetText, Input:"+inputParameters[1].toString());

				}
			
				catch(Exception e)
				{
					outputparameters.put("STATUS", "FAIL");
					outputparameters.put("MESSAGE", "Action:ValidationByGetText, Input:"+inputParameters[1].toString());
				}		
			return outputparameters;
		}
	
		public static void main(String[] args) throws Throwable
		{
			//BrowserLaunch
						Object[] input = new Object[1];
						input[0]="webdriver.chrome.driver";
						SeleniumOperations.BrowserLaunch(input);
						Thread.sleep(3000);
			//OpenApplication
						SeleniumOperations.OpenApplication();
						
			//ClickOnElement
						Object[] input2 = new Object[1];
						input2[0]="//*[@class='_2KpZ6l _2doB4z']";
						SeleniumOperations.ClickOnElement(input2);
						
			//MoveToElement
						Object[] input3 = new Object[1];
						input3[0]="//*[@class='_1_3w1N']";
						SeleniumOperations.MoveToElement(input3);

			//ClickOnElement
						Object[] input4 = new Object[1];
						input4[0]="//*[text()='My Profile']";
						SeleniumOperations.ClickOnElement(input4);
						Thread.sleep(3000);
						
			//SendTextOnUI
						Object[] input5 = new Object[2];
						input5[0]="(//*[@type='text'])[2]";
						input5[1]="mhasepramod44@gmail.com";
						SeleniumOperations.SendTextOnUI(input5);
			
			//SendTextOnUI
						Object[] input6 = new Object[2];
						input6[0]="//*[@type='password']";
						input6[1]="Pramod@250587";
						SeleniumOperations.SendTextOnUI(input6);
						Thread.sleep(3000);
						

			//ClickOnElement
						Object[] input7 = new Object[1];
						input7[0]="//*[@class='_2KpZ6l _2HKlqd _3AWRsL']";
						SeleniumOperations.ClickOnElement(input7);
						Thread.sleep(4000);
				
			//LoginSuccessfully
						Object[] input8 = new Object[2];
						input8[0]="PRAMOD MHASE";
						input8[1]="//*[text()='PRAMOD MHASE']";	
						SeleniumOperations.ValidationByGetText(input8);
						Thread.sleep(3000);	
		}
	}