package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Array;
import java.util.Arrays;
import java.util.List;

public class AmazonSearchTest {
    public static void main(String[] args) throws InterruptedException {
        /*
          1. Bir class oluşturun : AmazonSearchTest
          2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
          a. web sayfasına gidin. https://www. amazon.com/
          b. Search(ara) “city bike”
          c. Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
          d. Sonra karşınıza çıkan ilk sonucun resmine tıklayın
        */

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(3000);

        // a. web sayfasına gidin. https://www. amazon.com/
        driver.get("https://www.amazon.com");
        // b. Search(ara) “city bike”
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("city bike", Keys.ENTER);
        // c. Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
        List<WebElement> aramaKutusu= driver.findElements(By.className("sg-col-inner"));
        System.out.println(aramaKutusu.get(0).getText());
        // d Sadece sonuc sayısını yazdırınız
        String [] sonucYazısıArr=aramaKutusu.get(0).getText().split(" ");
        System.out.println("City Bike Sonucu : "+sonucYazısıArr[2]);
        /*--------------------------------------------------*/
        System.out.print("Lambda ile cozumu Sonuc Sayısı : ");
        Arrays.stream(aramaKutusu.get(0).getText().split(" ")).limit(3).skip(2).forEach(System.out::println);
        // d. Sonra karşınıza çıkan ilk sonucun resmine tıklayın
        List<WebElement> ilkResim= driver.findElements(By.className("s-image"));
        ilkResim.get(0).click();  // ilk resmi tıklar
        // e Sayfayı Kapatalım
        driver.close();
    }
}
