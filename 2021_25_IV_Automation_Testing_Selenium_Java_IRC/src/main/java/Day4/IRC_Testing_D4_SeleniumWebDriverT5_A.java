package Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IRC_Testing_D4_SeleniumWebDriverT5_A {
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

        // Get url of the home page
        String currentURL = driver.getCurrentUrl();
        String checkURL = "https://j2store.net/free/";

        // Validate url of the home page
        if (checkURL.equals(currentURL)) {
            System.out.println("Correct URL");
        } else {
            System.out.println("Wrong URL");
        }

        // Scroll the page
        Thread.sleep(3000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 1000)");

        // Click on Clothing
        WebElement clothingLink = driver.findElement(By.linkText("Clothing (5)"));
        clothingLink.click();

        // Get url of the clothing page
        currentURL = driver.getCurrentUrl();
        checkURL = "https://j2store.net/free/index.php/shop?filter_catid=11";

        // Validate url of the clothing page
        if (checkURL.equals(currentURL)) {
            System.out.println("Correct URL");
        } else {
            System.out.println("Wrong URL");
        }
        // Close the browser
        driver.quit();
    }
}