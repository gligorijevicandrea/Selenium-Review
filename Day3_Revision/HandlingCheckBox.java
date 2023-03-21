package Day3_Revision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandlingCheckBox {
    public static void main(String[] args) {

        ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver=new ChromeDriver(options);

        // click one check box Monday
        driver.get("https://itera-qa.azurewebsites.net/home/automation");
        driver.findElement(By.xpath("//input[@id='monday']")).click();









    }
}
