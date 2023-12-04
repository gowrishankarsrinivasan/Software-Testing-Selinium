package IRC_Testing_D9_TestNGListeners;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IRC_Testing_D9_TestNGListenersT4 {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  Thread.sleep(1000);
	  WebElement frname = driver.findElement(By.name("username"));
	  frname.sendKeys("Admin");
	  WebElement password = driver.findElement(By.name("password"));
	  password.sendKeys("admin123");
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).submit();
      String title1="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
      String title2=driver.getCurrentUrl();
      Assert.assertEquals(title1, title2);
  }
  @Parameters("browser")
  @BeforeMethod
  public void beforeMethod(String b1) 
  {
	  if(b1.equals("chrome"))
	  {
	  WebDriverManager.chromedriver().setup();
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		driver.get(url);
		driver.manage().window().maximize();
  }
	  else if(b1.equals("edge"))
	  {		WebDriverManager.edgedriver().setup();
		  	driver=new EdgeDriver();
			driver.manage().window().maximize();
			String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
			driver.get(url);
			driver.manage().window().maximize();  
	  }
}

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
