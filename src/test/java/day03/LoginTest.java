package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class LoginTest {
    public static void main(String[] args) throws InterruptedException {
        /*
          1- http://a.testaddressbook.com adresine gidiniz.
          2- Sign in butonuna basin
          3- email textbox,password textbox, and signin button elementlerini locate ediniz..
          4- Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
             Username : testtechproed@gmail.com
             Password : Test1234!
          5- Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
          6- “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).
          7- Sayfada kac tane link oldugunu bulun.
        */


        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(3000);
       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        // 1- http://a.testaddressbook.com adresine gidiniz.
        driver.get("http://a.testaddressbook.com");
        Thread.sleep(3000);
        // 2- Sign in butonuna basin
        driver.findElement(By.id("sign-in")).click();
        Thread.sleep(3000);
        // 3- email textbox,password textbox, and signin button elementlerini locate ediniz..
        WebElement emailTexbox=driver.findElement(By.id("session_email"));
        WebElement passwordTextbox=driver.findElement(By.id("session_password"));
        WebElement signin=driver.findElement(By.name("commit"));
        // 4- Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
        //    Username : testtechproed@gmail.com
        //    Password : Test1234!
        emailTexbox.sendKeys("testtechproed@gmail.com");
        Thread.sleep(3000);
        passwordTextbox.sendKeys("Test1234!");
        Thread.sleep(3000);
        signin.click();

        // 5- Expected user id nin testtechproed@gmail.com oldugunu dogrulayin
        WebElement expectedUser=driver.findElement(By.className("navbar-text"));
        if (expectedUser.isDisplayed()){
            System.out.println("Expected User Testi PASSED "+expectedUser.getText());
        }else {
            System.out.println("Expected User Testi FAILED");
        }
        //------------------------//
        //2.Yol
        String expectedUserYazisi="testtechproed@gmail.com";
        String actualUser=expectedUser.getText();
        if (actualUser.equals(expectedUserYazisi)){
            System.out.println("Test PASSED");
        }else {
            System.out.println("Test FAILED");
        }
        // 6- “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin
        WebElement addresses=driver.findElement(By.linkText("Addresses"));
        WebElement signOut= driver.findElement(By.linkText("Sign out"));
        /* Addressed icin */
        if (addresses.isDisplayed()){
            System.out.println("Addresses Testi PASSED");
        }else {
            System.out.println("Addresses Testi FAILED");
        }
        /* signout icin */
        if (signOut.isDisplayed()){
            System.out.println("Sign Out Testi PASSED");
        }else {
            System.out.println("Sign Out Testi FAILED");
        }
        // 7- Sayfada kac tane link oldugunu bulun.
        List<WebElement> links=driver.findElements(By.tagName("a"));
        System.out.println("Link sayısı : "+links.size());
        // 8- Linkleri yazdırınız
        for (WebElement each:links
             ) {
            System.out.println(each.getText());
        }
        System.out.println("2.Yol Lamda ile yazdırma");
        links.forEach(t-> System.out.println(t.getText()));

        // 9- Sayfadan cıkıs yapalım ve kapatalım
        driver.close();



    }
}
