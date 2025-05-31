package javas.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class HandleWebAlert extends DriverSetUp {
    @Test
    public void interactWithAlert() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
        Thread.sleep(3000);

        Alert alert1 = driver.switchTo().alert();
        String text = alert1.getText();
        System.out.println(text);
        alert1.accept();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
        Alert alert2 = driver.switchTo().alert();
        String alertText = alert2.getText();
        System.out.println(alertText);
        Thread.sleep(2000);
//        alert2.accept();
//        Thread.sleep(2000);
        alert2.dismiss();
        Thread.sleep(2000);

     WebElement  alertBtn =  driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']"));
        alertBtn.click();
        Alert alert3 = driver.switchTo().alert();
        System.out.println(alert3.getText());
        Thread.sleep(2000);
        alert3.sendKeys("Js Alert, Hello!!");
        Thread.sleep(2000);
        alert3.accept();
        Thread.sleep(2000);

        System.out.println(alertBtn.getCssValue("background-color"));
        System.out.println(alertBtn.getCssValue("color"));
        System.out.println(alertBtn.getCssValue("width"));
        System.out.println(alertBtn.getCssValue("height"));


        }





    }

