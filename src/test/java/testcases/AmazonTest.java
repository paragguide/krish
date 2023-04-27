package testcases;

import org.testng.annotations.Test;

import core.Page;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;

public class AmazonTest extends Page
{
  @Test(dataProvider = "dp")
  public void test(String s) 
  {
	  // read xpath
	String sign =  p.getProperty("signin");
	String id = p.getProperty("uid");
	String ctn = p.getProperty("btn");
	
	driver.findElement(By.xpath(sign)).click();
	
	driver.findElement(By.xpath(id)).sendKeys(s);
	driver.findElement(By.xpath(ctn)).click();
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "a" },
      new Object[] { "b" },
    };
  }
}
