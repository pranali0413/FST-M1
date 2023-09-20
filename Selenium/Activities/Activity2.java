package Activities;

import com.sun.jna.WString;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {

    public static void main(String[] args) {

        WebDriverManager.firefoxdriver().setup();

        WebDriver driver = new FirefoxDriver();


        driver.get("https://v1.training-support.net/selenium/login-form");

        System.out.println("Home Page title is : " + driver.getTitle());


        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.id("password")).sendKeys("password");
        driver.findElement(By.xpath("//button[text()='Log in']")).click();
        String msg = driver.findElement(By.id("action-confirmation")).getText();
        System.out.println("Message: " + msg);


        driver.close();
    }
}

//OUTPUT:

//        Home Page title is : Login Form
//        Message: Welcome Back, admin
//
//        Process finished with exit code 0


