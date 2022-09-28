package day04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01 {
    public static void main(String[] args) throws InterruptedException {
          /*
            1 ) Bir class oluşturun : Locators_css
            2)Main method oluşturun ve aşağıdaki görevi tamamlayın.
            a. Verilen web sayfasına gidin. http://a.testaddressbook.com/sign_in
            b. Locate email textbox
            c. Locate password textbox ve
            d. Locate signin button
            e. Asagidaki kullanıcı adını ve şifreyi girin ve sign in düğmesini
            tıklayın
            i. Username : testtechproed@gmail.com
            ii. Password : Test1234!
            NOT: cssSelector kullanarak elementleri locate ediniz.
          */
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(1000);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        // 1 ) Bir class oluşturun C02 : Locators_css
        // 2) Main method oluşturun ve aşağıdaki görevi tamamlayın.
        // a. Verilen web sayfasına gidin. http://a.testaddressbook.com
        driver.get("https://a.testaddressbook.com");
        Thread.sleep(1000);
        driver.findElement(By.id("sign-in")).click();
        // b. Locate email textbox
        WebElement emailTexbox= driver.findElement(By.cssSelector("session_email"));
        // c. Locate password textbox
        WebElement passwordTexbox= driver.findElement(By.cssSelector("session_password"));
        // d. Locate signin button
        WebElement sigin= driver.findElement(By.cssSelector("input[name='commit']"));
        // e. Asagidaki kullanıcı adını ve şifreyi girin ve sign in düğmesini tıklayın
        // i. Username : testtechproed@gmail.com
        // ii. Password : Test1234!
        emailTexbox.sendKeys("testtechproed@gmail.com");
        Thread.sleep(1000);
        passwordTexbox.sendKeys("Test1234!");
        Thread.sleep(1000);
        sigin.click();
        Thread.sleep(1000);
        driver.close();
        // NOT: cssSelector kullanarak elementleri locate ediniz.

    }
}
