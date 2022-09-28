package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethodlari {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize(); // Sayfaya git ve tam ekran yap
        // Amazon sayfasına gidiniz
        driver.get("https://amazon.com");
        // Kaynak kodlarının içinde "Gateway" kelimesinin oldugunu test ediniz
        // System.out.println(driver.getPageSource());
        String istenenKelime="Gateway";
        if (driver.getPageSource().contains(istenenKelime)){
            System.out.println("PageSource testi PASSED");
        }else {
            System.out.println("PageSource testi FAILED");
        }

        driver.close(); // Sayfayı kapatır.
        //driver.quit(); // Birden fazla sayfa varsa hepsini kapatır.


    }
}
