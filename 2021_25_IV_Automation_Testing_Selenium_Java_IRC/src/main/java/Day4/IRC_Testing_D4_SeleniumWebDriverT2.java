package Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IRC_Testing_D4_SeleniumWebDriverT2 {
    public static void main(String[] args) throws InterruptedException {

        // Driver setup
    	WebDriver driver;
    	WebDriverManager.edgedriver().setup();
  	    driver=new EdgeDriver();

        // URL to open
        String url = "https://demo.opencart.com/index.php?route=account/register&language=en-gb";

        // Open the URL
        driver.get(url);

        // Maximize
        driver.manage().window().maximize();

        // Scrolling
        Thread.sleep(3000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 500)");

        // First Name
        WebElement firstName = driver.findElement(By.id("input-firstname"));
        firstName.sendKeys("Klaus");

        // Last Name
        WebElement lastName = driver.findElement(By.id("input-lastname"));
        lastName.sendKeys("Mikaelson");

        // Email
        WebElement email = driver.findElement(By.id("input-email"));
        email.sendKeys("thehybrid@hotmail.com");

        // Password
        WebElement password = driver.findElement(By.id("input-password"));
        password.sendKeys("password");

        // Sometimes the item is not visible on the screeen so we need to scroll to it
        // we have scrolled down in Line 29

        // Subscribe
        WebElement subscribe = driver.findElement(By.id("input-newsletter-yes"));
        subscribe.click();

        // Doesnt work because the class name is compound (i.e.) it has a space in it
        // WebElement cont = driver.findElement(By.className("btn btn-primary"));
        // cont.click();

        // Close the browser
        driver.quit();
    }
}