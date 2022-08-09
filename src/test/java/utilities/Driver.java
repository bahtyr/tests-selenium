package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Driver {

    private static WebDriver webDriver;

    private Driver() {
    }

    public static WebDriver get() {
        if (webDriver != null) {
            return webDriver;
        }

        String browser = ""; //read config
        switch (browser) {
            default:
            case "chrome":
                WebDriverManager.chromedriver().setup();
                webDriver = new ChromeDriver();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                webDriver = new FirefoxDriver();
                break;
            case "ie":
                WebDriverManager.iedriver().setup();
                webDriver = new InternetExplorerDriver();
                break;
        }
        webDriver.manage().window().maximize();
        return webDriver;
    }

    public static void close() {
        if (webDriver != null) {
            webDriver.quit();
            webDriver = null;
        }
    }

    public static void wait(int secs) {
        try {
            Thread.sleep( (long) 1000 * secs);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static WebDriverWait waiter(int seconds) {
        return new WebDriverWait(Driver.get(), Duration.ofSeconds(seconds));
    }
}
