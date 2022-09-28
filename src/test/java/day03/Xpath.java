package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
    public static void main(String[] args) throws InterruptedException {
         /*
           1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
           2- Add Element butonuna basin
           3- Delete butonu’nun gorunur oldugunu test edin
           4- Delete tusuna basin
           5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin
         */

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(2000);
        // 1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        // 2- Add Element butonuna basin
        Thread.sleep(2000);
        //driver.findElement(By.xpath("//*[text()='Add Element']")).click();
        driver.findElement(By.xpath("//button[@onclick='addElement()']")).click();
        Thread.sleep(3000);
        // 3- Delete butonu’nun gorunur oldugunu test edin
        WebElement delete=driver.findElement(By.xpath("//*[text()='Delete']"));
        if (delete.isDisplayed()){
            System.out.println("Delete Testi PASSED");
        }else {
            System.out.println("Delete Testi FAILED");
        }
        // 4- Delete tusuna basin
        driver.findElement(By.xpath("//*[text()='Delete']")).click();
        Thread.sleep(3000);
        // 5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin
        WebElement addRemoveElement=driver.findElement(By.xpath("//*[text()='Add/Remove Elements']"));
        if (addRemoveElement.isDisplayed()){
            System.out.println("Add Remove Elemnt Testi PASSED");
        }else {
            System.out.println("Add Remove Element Testi FAILED");

            /* //*[@] */
        }

    }
}
