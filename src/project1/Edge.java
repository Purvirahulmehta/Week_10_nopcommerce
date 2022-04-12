package project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class Edge {
    public static void main(String[] args) {
        String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        System.setProperty("webdriver.edge.driver", "driver/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        //Launch the URL
        driver.get(baseUrl);
        //providing implict time to the driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        String title = driver.getTitle();//get the website of the title
        System.out.println(title);//it will print the title of the website on the console
        //or System.out.println("Title of the webpage =" + title);//It will print the whole messsage
        String curreentUrl = driver.getCurrentUrl();
        System.out.println(curreentUrl);//it will print the current url
        //or sout("Current URL = "driver.getCurrentUrl()); will print whole msg

        WebElement emailField = driver.findElement(By.id("Email"));//find the Email to email field
        emailField.sendKeys("Testing123@yahoo.com");//entering the email field data
        WebElement passwordField = driver.findElement(By.name("Password"));//finding the Password to password field
        passwordField.sendKeys("Prime1234");
        driver.close();


    }
}
