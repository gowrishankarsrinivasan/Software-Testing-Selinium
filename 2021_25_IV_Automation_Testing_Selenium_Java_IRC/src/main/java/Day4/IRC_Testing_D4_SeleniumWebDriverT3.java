package Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IRC_Testing_D4_SeleniumWebDriverT3 {
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
        WebElement firstName = driver.findElement(By.xpath("//*[@id=\"input-firstname\"]"));
        firstName.sendKeys("Klaus");

        // Last Name
        WebElement lastName = driver.findElement(By.xpath("//*[@id=\"input-lastname\"]"));
        lastName.sendKeys("Mikaelson");

        // Email
        WebElement email = driver.findElement(By.xpath("//*[@id=\"input-email\"]"));
        email.sendKeys("thehybrid@hotmail.com");

        // Password
        WebElement password = driver.findElement(By.xpath("//*[@id=\"input-password\"]"));
        password.sendKeys("password");

        // Subscribe
        WebElement subscribe = driver.findElement(By.xpath("//*[@id=\"input-newsletter-yes\"]"));
        subscribe.click();

    }
}