package day04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Odev1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(2000);
          /*
            1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
            2- Add Element butonuna basin
            3- 10 kez Add element butonuna basildigini test edini
            4- Delete butonu gorunmeyene kadar basiniz
            5- Delete butonunun gorunmedigini test ediniz
            6- Sayfayi Kapatiniz
          */

        // 1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        Thread.sleep(2000);
        // 2- Add Element butonuna 10 kez basin
        WebElement addElementButton = driver.findElement(By.xpath("//*[@onclick='addElement()']"));
        for (int i = 1; i <= 10; i++) {
            addElementButton.click();
            Thread.sleep(500);
        }
        // 3- 10 kez Add element butonuna basildigini test ediniz
        List<WebElement> list=driver.findElements(By.xpath("//*[@class='added-manually']"));
        if (list.size()==10){
            System.out.println("Add Butonuna 10 Sefer Basildi");
        }else {
            System.out.println("Add Butonuna 10 sefer Basilmadi");
        }
        // 4- Delete butonu gorunmeyene kadar basiniz
        //WebElement deleteButton=driver.findElement(By.xpath("//*[@class='added-manually']"));
        for (int i = 0; i < 10; i++) {
            driver.findElement(By.xpath("//*[@class='added-manually']")).click();
            Thread.sleep(500);
        }
        // 5- Delete butonunun gorunmedigini test ediniz
        try {
            System.out.println("Delete Buttton : "
                    + driver.findElement(By.xpath("//*[@class='added-manually']")).isDisplayed());
        } catch (Exception e) {
            System.out.println("Delete Buttton : Passed");
        }
        // 6- Sayfayi Kapatiniz
        driver.close();
    }
}
