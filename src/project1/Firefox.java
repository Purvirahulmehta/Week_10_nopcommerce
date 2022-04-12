package project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {
    public static void main(String[] args) {
        String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        System.setProperty("webdriver.gecko.driver", "driver/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();//CREATING THE DRIVER OBJECT
        //open Url
        driver.get(baseUrl);
        //title of the page
        String titleOfUrl = driver.getTitle();
        System.out.println("Title of given URL: " + titleOfUrl);
        //write the cuurent url
        String obj = driver.getCurrentUrl();
        System.out.println("Curreent Url Tittle" + obj);
        //page source
        String obj1 = driver.getPageSource();
        //  System.out.println("Page source of given URL is : "pageSouce);
        //email to Email field
        WebElement emailField = driver.findElement(By.name("user[email]"));
        emailField.sendKeys("Test@firefox.com");
        //password to Password field
        WebElement passWordField = driver.findElement(By.name("user[password]"));
        passWordField.sendKeys("Password12345");
        //Closing the webpage
        driver.close();

    }
}
