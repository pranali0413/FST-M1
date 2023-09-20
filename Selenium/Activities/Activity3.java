package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {

    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();

        FirefoxDriver driver = new FirefoxDriver();

        driver.get("https://v1.training-support.net/");

        String pageTitle = driver.getTitle();
        System.out.println("Title is :" + pageTitle);

        //driver.findElement(By.linkText("About Us")).click();
        driver.findElement(By.xpath("//*[@id=\"about-link\"]")).click();
        String pageTitle1 = driver.getTitle();
        System.out.println("Title is :" + pageTitle1);


//Used Navigate to..
        driver.navigate().to("https://v1.training-support.net/selenium/login-form");

        System.out.println("Home Page title is : " + driver.getTitle());


        driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("admin");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password");
        driver.findElement(By.xpath("//button[text()='Log in']")).click();
        String msg = driver.findElement(By.id("action-confirmation")).getText();
        System.out.println("Message: " + msg);

        driver.quit();

    }
}
//OUTPUT:
//        Title is :Training Support
//        Title is :About Training Support
//        Home Page title is : Login Form
//        Message: Welcome Back, admin
//
//        Process finished with exit code 0