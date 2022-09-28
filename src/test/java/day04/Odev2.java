package day04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Odev2 {
    public static void main(String[] args) throws InterruptedException {
        /*
        1- C01_TekrarTesti isimli bir class olusturun
        2- https://www.amazon.com/ adresine gidin
        3- Browseri tam sayfa yapin
        4- Sayfayi “refresh” yapin
        5- Sayfa basliginin “Spend less” ifadesi icerdigini test edin
        6- Gift Cards sekmesine basin
        7- Birthday butonuna basin
        8- Best Seller bolumunden ilk urunu tiklayin
        9- Gift card details’den 25 $’i secin
       10- Urun ucretinin 25$ oldugunu test edin
       11- Sayfayi kapatin
       */
        // 1- C01_TekrarTesti isimli bir class olusturun
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        Thread.sleep(2000);
        // 2- https://www.amazon.com/ adresine gidin
        driver.get("https://www.amazon.com");
        Thread.sleep(1000);
        // 3- Browseri tam sayfa yapin
        driver.manage().window().maximize();
        // 4- Sayfayi “refresh” yapin
        driver.navigate().refresh();
        Thread.sleep(1000);
        // 5- Sayfa basliginin “Spend less” ifadesi icerdigini test edin
        String actualTitle=driver.getTitle();
        String istenen="Spend less";
        if (actualTitle.contains(istenen)){
            System.out.println("Title Testi PASSED");
        }else {
            System.out.println("Title Testi FAILED");
        }
        Thread.sleep(4000);
        // 6- Gift Cards sekmesine basin
        driver.findElement(By.xpath("(//*[@class='nav-a  '])[4]")).click();
        Thread.sleep(1000);
        // 7- Birthday butonuna basin
        driver.findElement(By.xpath("//*[@alt='Birthday gift cards']")).click();
        Thread.sleep(1000);
        // 8- Best Seller bolumunden ilk urunu tiklayin
        driver.findElement(By.xpath("(//*[@alt='Amazon.com eGift Card'])[1]")).click();
        Thread.sleep(1000);
        // 9- Gift card details’den 25 $’i secin
        driver.findElement(By.xpath("(//*[@id='gc-mini-picker-amount-1'])[1]")).click();
        Thread.sleep(2000);
        // 10- Urun ucretinin 25$ oldugunu test edin
        String fiyat=driver.findElement(By.xpath("(//*[text()='$25.00'])[1]")).getText();
        String ucret="$25.00";
        if (fiyat.equals(ucret)){
            System.out.println("Fiyat Testi PASSED");
        }else {
            System.out.println("Fiyat Testi FAILED");
        }
        Thread.sleep(2000);
        // 11- Sayfayi kapatin
        driver.close();
    }
}
