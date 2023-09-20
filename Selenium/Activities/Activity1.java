package Activities;

        import com.sun.jna.WString;
        import io.github.bonigarcia.wdm.WebDriverManager;
        import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1 {

    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();

        FirefoxDriver driver = new FirefoxDriver();

        driver.get("https://v1.training-support.net/");

        String pageTitle = driver.getTitle();
        System.out.println("Title is :"+pageTitle);

        //driver.findElement(By.linkText("About Us")).click();
        driver.findElement(By.id("about-link")).click();
        String pageTitle1 = driver.getTitle();
        System.out.println("Title is :"+pageTitle1);

        driver.quit();
    }
}

//OUTPUT:
//        Title is :Training Support
//        Title is :About Training Support
//
//        Process finished with exit code 0


