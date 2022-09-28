package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class FirstClass {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        // 1) https://www.gmibank.com/ adresine gidiniz
        driver.get("https://www.gmibank.com");
        //2)sign in butonuna tikla
        driver.findElement(By.xpath("(//*[@class='dropdown-toggle nav-link'])[2]")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("login-item")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@name='username']")).sendKeys("Batch81");
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@name='password']")).sendKeys("Batch81+", Keys.ENTER);
        Thread.sleep(500);
    }
}
