package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_IlkTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        /*
        1 Amazon Sayfasına gidiniz
        2 Baslıgın amazon icerdigini test ediniz
        3 Url'nin amazon icerdigini test edin
          sonra sayfayı kapatın
        */

        // 1 Amazon Sayfasına gidiniz
        driver.get("https://amazon.com");

        // 2 Baslıgın amazon icerdigini test ediniz
        String actualTitle= driver.getTitle();
        String istenenKelime="Amazon";

        if (actualTitle.contains(istenenKelime)){
            System.out.println("Title testi PASSED"); // "Title testi PASSED"
        }else {
            System.out.println("Title testi FAILED");
        }

        // 3 Url'nin amazon icerdigini test edin
        String actualUrl= driver.getCurrentUrl();
        String istenenKelime2="amazon";
        if (actualUrl.contains(istenenKelime2)){
            System.out.println("Url testi PASSED"); // "Url testi PASSED"
        }else {
            System.out.println("Url testi FAILED");
        }

        // Sayfayı kapat
        driver.close();
    }
}
