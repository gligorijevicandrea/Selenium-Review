package seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserClose {
    public static void main(String[] args) {


        WebDriver driver=new ChromeDriver();
        // close the browser
        driver.get("https://www.facebook.com/");
         driver.close(); // closes only current tab
        //     driver.quit();  closes all tabs and windows that are open







    }
}
