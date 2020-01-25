package testhomepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTestCases {
    //declaring base url
    final static  String amazonurl="https://www.amazon.com/";

    //create object for WebDiver interface
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        openBrowserChrome(amazonurl);

    }

    public static void openBrowserChrome(String str){
        System.setProperty("webdriver.chrome.driver", "BroswerDriver/chromedriver");
        // create a object for chromeDriver
        WebDriver driver = new ChromeDriver();
        driver.navigate().to(str);
    }
}
