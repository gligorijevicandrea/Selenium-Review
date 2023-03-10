package seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageRefresh {
    public static void main(String[] args) {


        WebDriver driver=new ChromeDriver();
        // to refresh the page
        driver.get("https://www.facebook.com/");
        driver.navigate().refresh();






    }
}
