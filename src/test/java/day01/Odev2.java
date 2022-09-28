package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Odev2 {
    public static void main(String[] args) throws InterruptedException {

        /*
         Youtube ana sayfasina gidelim .
         Sayfayı tam ekran yapalım
         Github soyfasina gidelim.
         Tekrar YouTube’sayfasina donelim
         Yeniden Github sayfasina gidelim
         Sayfayi Refresh(yenile) yapalim
         Sayfayi kapatalim / Tum sayfalari kapatalim
        */

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        // 1-) Youtube ana sayfasina gidelim.
        driver.navigate().to("https://www.youtube.com");
        // 2-) Sayfayı tam ekran yapalım.
        driver.manage().window().maximize();
        Thread.sleep(3000);
        // 3-) GitHub soyfasina gidelim.
        driver.navigate().to("https://www.github.com");
        Thread.sleep(3000);
        // 4-) Tekrar YouTube’sayfasina donelim
        driver.navigate().back();
        Thread.sleep(3000);
        // 5-) Yeniden GitHub sayfasina gidelim
        driver.navigate().forward();
        Thread.sleep(3000);
        // 6-) Sayfayi Refresh(yenile) yapalim
        driver.navigate().refresh();
        Thread.sleep(3000);
        // 7-) Sayfayi kapatalim / Tum sayfalari kapatalim.
        driver.quit();
    }
}
