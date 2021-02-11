package Haben;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class US005_TC002 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://qa.trycloud.net/index.php/login?clear=1");
        driver.findElement(By.id("user")).sendKeys("User23");
driver.findElement(By.id("password")).sendKeys("Userpass123");
driver.findElement(By.id("submit-form")).click();
driver.findElement(By.id("contactsmenu")).click();
driver.close();





    }

}
