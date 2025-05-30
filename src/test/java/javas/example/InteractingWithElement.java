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
        Thread.sleep(2000);
        driver.findElement(By.id("checkBoxOption3")).click();
        Thread.sleep(2000);
        WebElement textField_2 = driver.findElement(By.id("name"));
        textField_2.sendKeys("SQA-Batch_31,2025");
        Thread.sleep(2000);
        String placeholderText = textField_2.getAttribute("placeholder");
        System.out.println("Placeholder text :" + placeholderText);
        String name = textField_2.getAttribute("name");
        System.out.println("Name :" + name);
        Thread.sleep(2000);
        textField_2.clear();
        WebElement switchTabColor = driver.findElement(By.cssSelector(".switch-tab"));
        String getBgColor =  switchTabColor.getCssValue("background-color");
        System.out.println("Background-color : " + getBgColor);
        String textColor =  switchTabColor.getCssValue("color");
        System.out.println("Color: " + textColor);
        String getPadding =  switchTabColor.getCssValue("padding");
        System.out.println("Padding: " + getPadding);
        String getMargin=  switchTabColor.getCssValue("margin");
        System.out.println("Margin: " + getMargin);
        String radius =  switchTabColor.getCssValue("border-radius");
        System.out.println("Border Radius: " + radius);
        WebElement openWindowProperties = driver.findElement(By.id("openwindow"));
        String bgColor = openWindowProperties.getCssValue("background-color");
        System.out.println( "Bg-Color : " + bgColor);
        String color = openWindowProperties.getCssValue("color");
        System.out.println( "Text color : " + color);
        String fontSize = openWindowProperties.getCssValue("font-size");
        System.out.println( "Font size : " + fontSize);
        String fontFamily = openWindowProperties.getCssValue("font-family");
        System.out.println("Font family : " + fontFamily);

    }
}
