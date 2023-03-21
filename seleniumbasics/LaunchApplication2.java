package seleniumbasics;


import org.openqa.selenium.WebDriver;   // we can see everything from this folder from selenium git hub public

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;




public class LaunchApplication2 {
    public static void main(String[] args) {

       // WebDriver driver=new ChromeDriver();

        // when we have problems because of using the latest selenium version until it's fixed and we want to open google
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver=new ChromeDriver(options);

//      driver.get("https://www.google.com/");
        driver.navigate().to("https://www.google.com/"); // use navigate to go back and forward

        String pageTitle=driver.getTitle();
        System.out.println(pageTitle);












    }
}
