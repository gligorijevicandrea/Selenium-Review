package seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CapturePageSource {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();

        // capture page Source
        driver.get("https://www.facebook.com/");
        String pageSource=driver.getPageSource(); // return type is String so that's where we are storing it
        System.out.println("The page source is : "+pageSource);





    }
}
