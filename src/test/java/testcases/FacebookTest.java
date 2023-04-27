package testcases;

import org.testng.annotations.Test;

import core.Page;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;

public class FacebookTest extends Page
{
  @Test(dataProvider = "loginData")
  public void test(String id, String pwd) 
  {
	  // reading xpath from properties
	 String uid =  p.getProperty("userid");
	 String pw = p.getProperty("password");
	 String sub =p.getProperty("submit");
	 
	 driver.findElement(By.xpath(uid)).sendKeys(id);
	 driver.findElement(By.xpath(pw)).sendKeys(pwd);
	 driver.findElement(By.xpath(sub)).click();
  }

  @DataProvider
  public Object[][] loginData() throws Exception 
  {
    return utility.POIConfig.getData("C:\\core\\selenium\\Book3.xls", "Sheet1");
  }
}
