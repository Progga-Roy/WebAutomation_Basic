package javas.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class Locators extends DriverSetUp {
    @Test
    // In web automation, particularly with tools like Selenium, there are eight primary web
//element locators: ID, Name, Class Name, Link Text, Partial Link Text, Tag Name, CSS Selector, and XPath.
    public void taskLocators () throws InterruptedException {
        driver.get("https://www.google.com");
//        Thread.sleep(3000);
        WebElement searchArea;
//       searchArea =  driver.findElement(By.id("APjFqb"));
//         searchArea = driver.findElement(By.name("q"));
//        searchArea = driver.findElement(By.tagName("textarea"));
//        searchArea = driver.findElement(By.className("gLFyf"));
//        searchArea.sendKeys("Basic Automation code");
//        Thread.sleep(3000);

        WebElement searchField = driver.findElement(By.cssSelector("textarea[name=\"q\"]"));
        Thread.sleep(3000);
        searchField.sendKeys("kola bagan");
        searchField.clear();
//
//
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.whatsapp.com");
        Thread.sleep(2000);
////        String currentBrowser = driver.getWindowHandle();
////        System.out.println(currentBrowser);
        ArrayList<String> find = new ArrayList<>(driver.getWindowHandles());
          for(String finds : find){
              System.out.println(finds);
          }
        System.out.println("Before switch : " + driver.getCurrentUrl());
        driver.switchTo().window(find.get(0));
        System.out.println("After switch : " + driver.getCurrentUrl());
        Thread.sleep(3000);

//        WebElement closeBtn = driver.findElement(By.xpath("//div[@class='vOY7J M2vV3']//svg"));
//        closeBtn.click();
//        closeBtn.clear();

        driver.manage().window().maximize();
        Thread.sleep(2000);
//        WebElement closeBtn = driver.findElement(By.cssSelector("div[class=\"BKRPef\"]"));
//        WebElement closeBtn = driver.findElement(By.cssSelector("ExCKkf"));
//
//        WebElement searchField2 = driver.findElement(By.xpath("//textarea[@name=\"q\"]"));
        WebElement search = driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
        search.sendKeys("Manual testing basic code");
        Thread.sleep(3000);
////driver.findElement(By.linkText("Gmail")).click();
driver.findElement(By.partialLinkText("il")).click();
driver.navigate().back();
driver.findElement(By.partialLinkText("সার্চ কীভাবে কাজ করে")).click();

driver.navigate().back();
// driver.findElement(By.cssSelector("#SIvCob > a")).click();
// driver.findElement(By.xpath("//div[@id='SIvCob']")).click();
// driver.findElement(By.xpath("//div[@id='SIvCob']/a")).click();
 driver.findElement(By.xpath("//div[@id='SIvCob']/a")).click();
        Thread.sleep(2000);
        System.out.println("Switch language");
//find direct child with xpath
 List<WebElement> childes  = driver.findElements(By.xpath("//div[@class='KxwPGc AghGtd']/a"));
// find direct child with cssSelector
// List<WebElement> childes  = driver.findElements(By.cssSelector("div[class='KxwPGc AghGtd']>a"));
        System.out.println("Print the texts : ");
 for(WebElement child : childes){
     System.out.println(child.getText());

 }

// WebElement getSingleLink= driver.findElement(By.cssSelector("div.KxwPGc.AghGtd > a:nth-of-type(1)"));
//        System.out.println(getSingleLink.getText());
WebElement getSingleText = driver.findElement(By.xpath("//div[@class='KxwPGc AghGtd']/a[last()]"));
        System.out.println(getSingleText.getText());

        WebElement printText = driver.findElement(By.xpath("//a[text()=\"Terms\"]"));
        System.out.println(printText.getText());
        WebElement printText2 = driver.findElement(By.xpath("//a[contains(text(),'rms')]"));
        System.out.println(printText2.getText());
        WebElement extractText3 = driver.findElement(By.xpath("//a[contains(text(),'Terms')]/parent::div"));
        System.out.println("parent div : " +  extractText3.getText());
        extractText3.click();
        driver.navigate().back();
        WebElement extractText = driver.findElement(By.xpath("//div[text()='Settings']"));
        System.out.println("Using text() : " + extractText.getText());
        WebElement extractText2 =driver.findElement(By.xpath("//div[contains(text(),'ings')]"));
        System.out.println("Using contains() : " +  extractText2.getText());
        WebElement extractText4 =driver.findElement(By.xpath("//a[text()='Business']/preceding-sibling::a"));
        System.out.println("Proceeding sibling : " +  extractText4.getText());
        WebElement extractText5 =driver.findElement(By.xpath("//a[text()='Business']/preceding-sibling::a[1]"));
        System.out.println("Proceeding sibling use Indexing : " +  extractText5.getText());
        WebElement extractText6 =driver.findElement(By.xpath("//a[text()='Business']/following-sibling::a"));
        System.out.println("Following-sibling use Indexing : " +  extractText6.getText());
//        WebElement extractText7 = driver.findElement(By.xpath("//input[@class='RNmpXc' and @name='btnI']"));
//        extractText7.click();
        WebElement extractText7 = driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@name='btnI']"));
        extractText7.click();
        driver.navigate().back();





    }
}

