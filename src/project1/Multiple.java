package project1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Scanner;

public class Multiple {

       // String baseUrl="https://demo.nopcommerce.com/login?returnUrl=%2F";
        //WebDriver driver;
    public static void main(String[] args) {
        String baseUrl="https://demo.nopcommerce.com/login?returnUrl=%2F";
        //WebDriver driver;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Browser Name(1=firefox,2=chrome,3=edge):");
        int a=scanner.nextInt();
        if(a==1){
            System.out.println("FireFox");
            System.setProperty("webdriver.gecko.driver","driver/geckodriver.exe");
            WebDriver driver=new FirefoxDriver();
            driver.get(baseUrl);
        } else if(a==2){
            System.out.println("Chrome");
            System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
            WebDriver driver=new ChromeDriver();
            driver.get(baseUrl);
        }else {
            System.out.println("Edge");
            System.setProperty("webdriver.edge.driver","driver/msedgedriver.exe");
            WebDriver driver=new EdgeDriver();
            driver.get(baseUrl);
        }

    }
}
