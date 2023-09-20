package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();

        FirefoxDriver driver = new FirefoxDriver();

        driver.get("https://v1.training-support.net/selenium/target-practice");

        String pageTitle = driver.getTitle();
        System.out.println("Title is :" + pageTitle);


        String third_header = driver.findElement(By.xpath("//*[@id=\"third-header\"]")).getText();
        System.out.println("Third Header is : " + third_header );

        String fifth_header = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[1]/h5")).getCssValue("color");
        System.out.println("5th Header is : " + fifth_header );

        String violet_button = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[2]/button[3]")).getAttribute("class");
        System.out.println("Classes of Violet Button are : " + violet_button );

        String grey_button = driver.findElement(By.xpath("//button[text()='Grey']")).getText();
        System.out.println("Grey button text is "+ grey_button);

        driver.quit();

    }

}
//OUTPUT:
//        Title is :Target Practice
//        Third Header is : Third header
//        5th Header is : rgb(33, 186, 69)
//        Classes of Violet Button are : ui violet button
//        Grey button text is Grey
