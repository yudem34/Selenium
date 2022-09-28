package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05_NavigateMethodlari {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://www.amazon.com");
        //driver.navigate().to() methodu sayfada ileri geri yapıcaksak kullanılır
        //driver.get() methodu gibi bizi istediğimiz Url'e götürür
        driver.navigate().to("https://techproeducation.com");

        // Tekrar amazon sayfasına donelim
        Thread.sleep(3000);
        driver.navigate().back();
        // Tekrar Techpro ya git
        Thread.sleep(3000);
        driver.navigate().forward();
        // Techproed Sayfasını yeniyelim
        Thread.sleep(3000);
        driver.navigate().refresh();
        // son olarak sayfayı kapat
        driver.close();

    }
}
