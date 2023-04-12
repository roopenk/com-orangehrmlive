import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowserTest {
    static String browser = "Chrome";
    static WebDriver driver;

    public static void main(String[] args) { // Allocating the equivalent browser driver
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("FireFox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("Wrong Browser Name");
        }
        driver.manage().window().maximize(); // Maximizing the browser window
        driver.get("https://opensource-demo.orangehrmlive.com/"); // Opening the browser window
        // Applying the implicit wait to the driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        System.out.println("The Page Title : " + driver.getTitle()); // Getting the page title
        System.out.println("The Current URL : " + driver.getCurrentUrl()); // Getting the page URL
        System.out.println("The Page Source : " + driver.getPageSource()); // Getting the page source
        driver.findElement(By.name("username")).sendKeys("Admin"); // Sending the value to Username field
        driver.findElement(By.name("password")).sendKeys("admin123"); // Sending value to password field
        driver.close(); // Closing the browser window


    }
}