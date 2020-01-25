package homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.lang.*;

public class homepage {
    static String url = "https://www.amazon.com/";

    //Search item for test cases
    static String emptySearchBar = " " ;
    static String searchItem1 = "iPhone XR";
    static String searchItem2 = "iPhone X";
    static String searchItem3 = "iPhone XMAX";
    static String searchItem4 = "iPhone 5s";
    static String searchItem5 = "iPhone 6s";
    static String searchItem6 = "iPhone 7";
    static String searchItem7 = "iPhone 7 Plus";
    static String searchItem8 = "iPhone 8";
    static String searchItem9 = "iPhone 8 Plus";
    static String searchItem10 = "iPhone X Cover";

    //xPath id's
    static String latestDealLink = "//*[@id=\"nav-xshop\"]/a[1]";
    static String bestSellerLink = "//*[@id=\"nav-xshop\"]/a[2]";
    static String customerServiceLink = "//*[@id=\"nav-xshop\"]/a[3]";
    static String findAGiftLink = "//*[@id=\"nav-xshop\"]/a[4]";
    static String newReleasesLink = "//*[@id=\"nav-xshop\"]/a[5]";
    static String registryLink = "//*[@id=\"nav-xshop\"]/a[6]";
    static String signInOptionLink = "//*[@id=\"nav-flyout-ya-signin\"]/a/span";
    static String signInLink = "//*[@id=\"hmenu-content\"]/ul[34]/li[46]/a";
    static String burgerbuttonPath="//*[@id=\"nav-hamburger-menu\"]";
    static String primeVideo = "//*[@id=\"hmenu-content\"]/ul[34]/li[2]";

    //static String giftCardsLink = "//*[@id=\"nav-xshop\"]/a[7]";


    static String typeInSearchBox = "//*[@id=\"twotabsearchtextbox\"]";
    static String pressSearchButton = "//input[@value=\"Go\"]";



    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "BroswerDriver/chromedriver");
        WebDriver driver = new ChromeDriver();

        //Navigation test cases
        urlNavigator(url,driver,latestDealLink);
        urlSideNavigator(driver,signInOptionLink);
        urlSideNavigator(driver,bestSellerLink);
        urlSideNavigator(driver,customerServiceLink);
        urlSideNavigator(driver,findAGiftLink);
        urlSideNavigator(driver,newReleasesLink);
        urlSideNavigator(driver,registryLink);
        urlSideNavigator(driver,burgerbuttonPath);
        urlSideNavigator(driver,primeVideo);


        //Search 10 items Test cases.
        SearchBoxNavigator(driver,searchItem1);
        PressSearchButton(driver);
        clearSearchBar(driver);

        SearchBoxNavigator(driver,searchItem2);
        PressSearchButton(driver);
        clearSearchBar(driver);

        SearchBoxNavigator(driver,searchItem3);
        PressSearchButton(driver);
        clearSearchBar(driver);

        SearchBoxNavigator(driver,searchItem4);
        PressSearchButton(driver);
        clearSearchBar(driver);

        SearchBoxNavigator(driver,searchItem5);
        PressSearchButton(driver);
        clearSearchBar(driver);

        SearchBoxNavigator(driver,searchItem6);
        PressSearchButton(driver);
        clearSearchBar(driver);

        SearchBoxNavigator(driver,searchItem7);
        PressSearchButton(driver);
        clearSearchBar(driver);

        SearchBoxNavigator(driver,searchItem8);
        PressSearchButton(driver);
        clearSearchBar(driver);

        SearchBoxNavigator(driver,searchItem9);
        PressSearchButton(driver);
        clearSearchBar(driver);

        SearchBoxNavigator(driver,searchItem10);
        PressSearchButton(driver);
        clearSearchBar(driver);

        //Closing the browser
        driver.close();
    }

    private static void urlNavigator(String url,WebDriver driver,String linkURL) throws InterruptedException{
        driver.navigate().to(url);
        driver.findElement(By.xpath(linkURL)).click();
        Thread.sleep(3000);
    }

    private static void urlSideNavigator(WebDriver driver,String linkURL) throws InterruptedException {
        //driver.navigate().to(url);
        driver.findElement(By.xpath(linkURL)).click();
        Thread.sleep(3000);
    }

    private static void SearchBoxNavigator(WebDriver driver,String searchItem) throws InterruptedException{
        driver.findElement(By.xpath(typeInSearchBox)).sendKeys(searchItem);
        Thread.sleep(3000);
    }

    private static void PressSearchButton(WebDriver driver) throws InterruptedException{
       driver.findElement(By.xpath(pressSearchButton)).click();
        Thread.sleep(2000);
    }

    private static void clearSearchBar(WebDriver driver) throws InterruptedException{
        driver.findElement(By.xpath(typeInSearchBox)).clear();
        Thread.sleep(3000);
    }


}
