package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Driver {

    private static WebDriver webDriver;

    private Driver() {}

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
}
