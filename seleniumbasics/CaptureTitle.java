package seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureTitle {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        // when we have get , then navigate it will print for the Title the second one
        driver.get("https://www.google.com/");
        driver.navigate().to("https://www.facebook.com/");

        // capture the title of the page
        String pageTitle=driver.getTitle(); // it's returning a String value so that's why we are storing it in String variable
        System.out.println("The title of the page is : "+pageTitle);













    }
}
