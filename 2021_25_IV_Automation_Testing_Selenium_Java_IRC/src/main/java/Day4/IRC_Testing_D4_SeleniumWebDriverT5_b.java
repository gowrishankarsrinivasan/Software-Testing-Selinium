package Day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IRC_Testing_D4_SeleniumWebDriverT5_b {
    public static void main(String[] args) throws InterruptedException {

        // Driver setup
    	WebDriver driver;
    	WebDriverManager.edgedriver().setup();
  	    driver=new EdgeDriver();

        // URL to open
        String url = "https://j2store.net/free/";

        // Open the URL
        driver.get(url);

        // Maximize
        driver.manage().window().maximize();

        // Scroll the page
        Thread.sleep(3000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 1000)");

        // Click on Clothing
        WebElement clothingLink = driver.findElement(By.linkText("Clothing (5)"));
        clothingLink.click();

        // Get the elements in the page
        // we can use custom xPath
        // Format : //tagname[@attribute='value']
        List<WebElement> tiltleElements = driver.findElements(By.xpath("//h2[@class='product-title']"));

        // Print the titles
        for (WebElement titleElement : tiltleElements) {
            System.out.println(titleElement.getText());
        }

        // Close the browser
        driver.quit();
    }
}