package demoTing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserGetter {

    public WebDriver getChromeDriver() {

        WebDriver driver = new ChromeDriver();

        return driver;
    }


    public WebDriver getFirefoxDriver() {

        WebDriver driver = new FirefoxDriver();

        return driver;

    }


    public WebDriver getEdgeDriver() {

        WebDriver driver = new EdgeDriver();

        return driver;

    }


}

