package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethodlari {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        /*
          1- Amazon sayfasına gidiniz
          2- Arama kutusunu locate ediniz
          3- Arama kutusunun tagName'inin input olduğunu test ediniz
          4- Arama kutusunun name atributu'nun değerinin field-keywords olduğunu test ediniz
          5- Sayfayı kapatınız
        */

        // 1- Amazon sayfasına gidiniz
        driver.get("https://www.amazon.com");
        Thread.sleep(2000);
        // 2- Arama kutusunu locate ediniz
        WebElement aramaKutusu= driver.findElement(By.id("twotabsearchtextbox"));
        // 3- Arama kutusunun tagName'inin input olduğunu test ediniz
        String expectedTagName="input";
        String actualTagName=aramaKutusu.getTagName();
        if (actualTagName.equals(expectedTagName)){
            System.out.println("TagName Testi PASSED");
        }else {
            System.out.println("TagName Testi FAILED "+ actualTagName);
        }
        Thread.sleep(1000);
        // 4- Arama kutusunun name atributu'nun değerinin field-keywords olduğunu test ediniz
        String expectedAttributu="field-keywords";
        String actualAttributuName=aramaKutusu.getAttribute("name");
        if (actualAttributuName.equals(expectedAttributu)){
            System.out.println("Attributu Testi PASSED");
        }else {
            System.out.println("Attributu Testi FAILED "+ actualAttributuName);
        }
        Thread.sleep(1000);
        // 5- Arama Kutusunun konumu yazdırın
        /*?*/
        // 5- Sayfayı kapatınız
        driver.close();



        /*
        Arama kutusunun tagName'inin input olduğunu test ediniz
        String expectedTagName = "input";
        String actualTagName = aramaKutusu.getTagName();
        if (actualTagName.equals(expectedTagName)) {
            System.out.println("TagName testi PASSED");
        } else System.out.println("TagName testi FAILED");

        Arama kutusunun name atributu'nun değerinin field-keywords olduğunu test ediniz
        String expectedAtributeName = "field-keywords";
        String actualAtributeName = aramaKutusu.getAttribute("name");
        if (actualAtributeName.equals(expectedAtributeName)) {
            System.out.println("Name Attribute degeri field-keywords - PASSED");
        } else System.out.println("Name Attribute degeri baska - FAILED");
        Arama kutusunun konumunu yazdiriniz
        System.out.println("Arama kutusu konumu " + aramaKutusu.getLocation());
        HTML dersinde gorduk
        TAGNAME Her webelementin ilk siradaki ismidir ÖRNEK =INPUT
        ATRIBUTE ISE --->  id   ----value name --  dir --class--
        bunlarin icinde olanlar ise   atribute degerleridir .
         */


    }
}
