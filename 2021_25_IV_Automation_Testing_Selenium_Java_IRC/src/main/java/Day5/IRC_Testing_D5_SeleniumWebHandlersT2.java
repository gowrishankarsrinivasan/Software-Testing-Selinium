package Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IRC_Testing_D5_SeleniumWebHandlersT2 {
    public static void main(String[] args) throws InterruptedException {

        // Driver setup
    	WebDriver driver;
    	WebDriverManager.edgedriver().setup();
  	    driver=new EdgeDriver();


        // URL to open
        String url = "https://jqueryui.com/droppable/";

        // Open the URL
        driver.get(url);

        // Maximize
        driver.manage().window().maximize();

        // Switch to frame
        driver.switchTo().frame(0);

        // Create an Actions object
        Actions a = new Actions(driver);

        // Get the draggable and droppable elements
        WebElement draggable = driver.findElement(By.id("draggable"));
        WebElement droppable = driver.findElement(By.id("droppable"));

        // Drag and drop with clickhold command
        a.clickAndHold(draggable).release(droppable).build().perform();

        Thread.sleep(3000);

        // Close the browser
        driver.quit();
    }
}