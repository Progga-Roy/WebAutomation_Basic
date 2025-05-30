package javas.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class InteractingWithElement extends DriverSetUp{
    @Test
    public void ExtractDifferentTypeOfElement() throws InterruptedException {
        driver.get("https://rahulshettyacademy.com/AutomationPractice");
       WebElement title = driver.findElement(By.xpath("//h1[normalize-space()='Practice Page']"));
        System.out.println("Title : " + title.getText());
        WebElement radioBtn2 = driver.findElement(By.cssSelector("input[value='radio2']"));
        radioBtn2.click();
        WebElement inputField = driver.findElement(By.id("autocomplete"));
        inputField.sendKeys("Bangladesh");
        Thread.sleep(2000);
        inputField.clear();
        Thread.sleep(2000);
        WebElement dropDown =   driver.findElement(By.id("dropdown-class-example"));
        dropDown.click();
        WebElement selectOption =  driver.findElement(By.xpath("//option[@value='option3']"));
        selectOption.click();


    }
}
