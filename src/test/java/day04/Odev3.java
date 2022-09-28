package day04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Odev3 {
    public static void main(String[] args) throws InterruptedException {


        // 1.  Tarayıcıyı başlatın
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(1000);
        // 2.  'http://automationexercise.com' url'sine gidin
        driver.get("http://automationexercise.com");
        // 3.  Ana sayfanın başarılı bir şekilde görünür olduğunu doğrulayın
        WebElement home=driver.findElement(By.xpath("//a[normalize-space()='Home']"));
        if (home.isDisplayed()){
            System.out.println("Home Testi PASSED");
        }else {
            System.out.println("Home Testi FAILED");
        }
        // 4.  'Signup / Login' düğmesine tıklayın
        driver.findElement(By.xpath("//a[normalize-space()='Signup / Login']")).click();
        // 5.  'New User Signup!' bolumunu doğrulayın! görünür
        WebElement newUser= driver.findElement(By.xpath("//*[text()='New User Signup!']"));
        if (newUser.isDisplayed()){
            System.out.println("New User Signup! Testi PASSED");
        }else {
            System.out.println("New User Signup! Testi FAILED");
        }
        // 6.  Name ve email adresini girin
        WebElement nameBox=driver.findElement(By.xpath("//*[@name='name']"));
        WebElement emailBox= driver.findElement(By.xpath("(//*[@name='email'])[2]"));
        nameBox.sendKeys("Yusuff");
        emailBox.sendKeys("yusufdem123@gmail.com");
        Thread.sleep(1000);
        // 7.  'Sign' düğmesini tıklayın
        driver.findElement(By.xpath("(//*[@class='btn btn-default'])[2]")).click();
        // 8.  'ENTER ACCOUNT INFORMATION' ifadesinin görünür olduğunu doğrulayın
        WebElement enter=driver.findElement(By.xpath("//*[text()='Enter Account Information']"));
        if (enter.isDisplayed()){
            System.out.println("ENTER ACCOUNT INFORMATION Testi PASSED");
        }else {
            System.out.println("ENTER ACCOUNT INFORMATION Testi FAILED");
        }
        Thread.sleep(1000);
        // 9.  Doldurma ayrıntıları: Unvan, Ad, E-posta, Şifre, Doğum tarihi
        driver.findElement(By.id("id_gender1")).click();
        WebElement passwordBox= driver.findElement(By.xpath("//*[@id='password']"));
        passwordBox.sendKeys("Slm21dd.");
        Thread.sleep(1000);
        //Dogum tarihinizi giriniz
        driver.findElement(By.xpath("(//*[@value='15'])[1]")).click();
        driver.findElement(By.xpath("//*[text()='September']")).click();
        driver.findElement(By.xpath("//*[text()='1989']")).click();
        // 10. 'Sign up for our newsletter!' onay kutusunu seçin.
        driver.findElement(By.xpath("//*[text()='Sign up for our newsletter!']")).click();
        Thread.sleep(500);
        // 11. 'Receive special offers from our partners!' onay kutusunu seçin.
        driver.findElement(By.xpath("//*[text()='Receive special offers from our partners!']")).click();
        Thread.sleep(500);
        // 12. Doldurma ayrıntıları: Ad, Soyadı, Şirket, Adres, Adres2, Ülke, Eyalet, Şehir, Posta Kodu, Cep Numarası
        driver.findElement(By.xpath("//*[@id='first_name']")).sendKeys("Yusuf");
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id='last_name']")).sendKeys("Demir");
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id='address1']")).sendKeys("Gross-Gerau");
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id='country']")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[text()='Australia']")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id='state']")).sendKeys("Dammacker");
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id='city']")).sendKeys("Riestadt");
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id='zipcode']")).sendKeys("2601");
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id='mobile_number']")).sendKeys("012345678");
        Thread.sleep(500);
        // 13. 'Hesap Oluştur düğmesini' tıklayın
        driver.findElement(By.xpath("(//*[@class='btn btn-default'])[1]")).click();
        // 14. 'ACCOUNT CREATED!' görünür
        WebElement accountCreated=driver.findElement(By.xpath("//*[text()='Account Created!']"));
        if (accountCreated.isDisplayed()){
            System.out.println("Account Test PASSED");
        }else {
            System.out.println("Account Test FAILED");
        }
        // 15. 'Devam' düğmesini tıklayın
        driver.findElement(By.xpath("//*[@class='btn btn-primary']")).click();
        // 16. 'Kullanıcı adı olarak oturum açıldı' ifadesinin görünür olduğunu doğrulayın
        System.out.println("Logged in as "+driver.findElement(By.xpath("//*[text()='yusuf']")).isDisplayed());
        // 17. 'Hesabı Sil' düğmesini tıklayın
        driver.findElement(By.xpath("//*[text()=' Delete Account']")).click();
        // 18. 'HESAP SİLİNDİ!' görünür ve 'Devam' düğmesini tıklayın
        //driver.findElement(By.xpath("//*[@class='btn btn-danger']")).click();
        // 19. Sayfayı Kapatın
        Thread.sleep(1000);
        driver.close();
    }
}
