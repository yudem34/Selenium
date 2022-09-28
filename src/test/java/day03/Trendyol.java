package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.lang.model.element.Element;
import java.util.List;

public class Trendyol {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(1000);
        driver.get("http://www.trendyol.com");
        Thread.sleep(2000);
        driver.findElement(By.className("selected-country-flag")).click();
        Thread.sleep(2000);
        driver.findElement(By.className("select-header")).click();
        Thread.sleep(2000);
        List<WebElement> list=driver.findElements(By.className("dropdown-item"));
        list.get(0).click();
        driver.findElement(By.className("submit")).click();
        Thread.sleep(2000);
        driver.close();
    }
}
