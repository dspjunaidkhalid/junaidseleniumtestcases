package homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.lang.*;

public class homepage {
    static String url = "https://www.amazon.com/";

    //xPath id's
    static String latestDealLink = "//*[@id=\"nav-xshop\"]/a[1]";
    static String typeInSearchBox = "//*[@id=\"twotabsearchtextbox\"]";
    static String pressSearchButton = "//input[@value=\"Go\"]";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "BroswerDriver/chromedriver");
        WebDriver driver = new ChromeDriver();

        //test cases
        latestDealsNavigator(url,driver);
        SearchBoxNavigator(driver);
        PressSearchButton(driver);

        //Closing the browser
        driver.close();
    }

    private static void latestDealsNavigator(String url,WebDriver driver) throws InterruptedException{
        driver.navigate().to(url);
        driver.findElement(By.xpath(latestDealLink)).click();
        Thread.sleep(3000);
    }

    private static void SearchBoxNavigator(WebDriver driver) throws InterruptedException{
        driver.findElement(By.xpath(typeInSearchBox)).sendKeys("iPhone XR");
        Thread.sleep(3000);
    }

    private static void PressSearchButton(WebDriver driver) throws InterruptedException{
       driver.findElement(By.xpath(pressSearchButton)).click();
        Thread.sleep(2000);
    }


}
