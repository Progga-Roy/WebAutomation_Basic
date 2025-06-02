package javas.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.time.Duration;

public class HandleWebIframeElement extends DriverSetUp {
    @Test
    public void webIframeElement() throws InterruptedException {
        driver.get("https://rahulshettyacademy.com/AutomationPractice");
        //iframe can locate with name/id/index/passing web element.
        //with id
//        driver.switchTo().frame("courses-iframe");
        //with name
        driver.switchTo().frame("iframe-name");
        // passing web element
//        WebElement iFrame = driver.findElement(By.id("courses-iframe"));
//        driver.switchTo().frame(iFrame);
//        with index
//        driver.switchTo().frame(0);
        driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();
        driver.switchTo().defaultContent();
        driver.findElement(By.xpath("//legend[normalize-space()='iFrame Example']")).click();

        }

    }

