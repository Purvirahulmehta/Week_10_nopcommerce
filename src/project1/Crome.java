package project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Crome {
    public static void main(String[] args) {
        String baseUrl ="https://demo.nopcommerce.com/login?returnUrl=%2F";
        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        //Launch the Url
        driver.get(baseUrl);
        //Maximise the window
        driver.manage().window().maximize();
        //Implict time to the driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //Get the title of the website
        String title=driver.getTitle();
        System.out.println("Title of the webpage =" + title);//It will print the whole messsage
        //or sout(title);which only print the title in the console
        //Get the current Url
        String obj2 =driver.getCurrentUrl();
        System.out.println("Current URL:"+ obj2);//it will print whole message
        //or sout("Current URL = "driver.getCurrentUrl()); will replace the line no 24 and 25
        //Page source
        String obj1=driver.getPageSource();
        System.out.println("Page source of given Url is :" + obj1);
        //find the email field element
        WebElement emailField=driver.findElement(By.id("Email"));
        //sending Email to email field
        emailField.sendKeys("Testing123@gmail.com");
        //find the password field element
        WebElement passwordField =driver.findElement(By.name("Password"));
        //sending Password to password field
        passwordField.sendKeys("Prime1234");
        //Closing the webpage
       // driver.close();

    }

}
