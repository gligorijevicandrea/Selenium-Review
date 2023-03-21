package Day4_Revision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FileUpload {

    public static void main(String[] args) throws InterruptedException {


        ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");  //
        WebDriver driver=new ChromeDriver(options);

        driver.get("http://nervgh.github.io/pages/angular-file-upload/examples/simple/");

        Thread.sleep(2000);

        // *** file upload ***
        // this will work only when tag name is input and type is file
        // this is the only way where on the button we are going to use SEND KEYS to UPLOAD THE FILE
        driver.findElement(By.xpath("//input[@multiple]")).sendKeys("/Users/andreagligorijevic/Downloads/Notes.txt");













    }

}
