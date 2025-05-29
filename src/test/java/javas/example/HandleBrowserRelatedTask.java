package javas.example;

import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

import java.awt.*;
import java.util.ArrayList;
import java.util.Set;

public class HandleBrowserRelatedTask extends DriverSetUp {

   @Test
    public void testBrowserTask () throws InterruptedException {
     driver.get("https://www.google.com");
     String title = driver.getTitle();
       System.out.println("Title : " + title);
       String url = driver.getCurrentUrl();
       System.out.println("Url : " + url);
       Thread.sleep(3000);
       driver.manage().window().fullscreen();
       Thread.sleep(3000);
       driver.manage().window().maximize();
       Thread.sleep(3000);
//       driver.manage().window().minimize();
//       Thread.sleep(3000);
       driver.navigate().to("https://www.facebook.com");
       Thread.sleep(1000);
       driver.navigate().back();
       Thread.sleep(1000);
       driver.navigate().forward();
       Thread.sleep(1000);
       driver.navigate().refresh();
       Thread.sleep(3000);
       driver.switchTo().newWindow(WindowType.TAB);
       driver.get("https://www.whatsapp.com");
       driver.switchTo().newWindow(WindowType.WINDOW);
       driver.get("https://www.instagram.com");
       Thread.sleep(3000);
// Find current tab ID :
       String currentTabId = driver.getWindowHandle();
       System.out.println("Insta Id : " + currentTabId);
//List all the ID and print all.
     ArrayList<String> handles = new ArrayList<>(driver.getWindowHandles());
     System.out.println("All Id's : " );
     for(String handle : handles){
       System.out.println(handle);

     }
     //Switch particular link by using Index.
     System.out.println("Before switching : " + driver.getCurrentUrl());
     driver.switchTo().window(handles.get(0));
     System.out.println("After switching : " + driver.getCurrentUrl());

     driver.close();
     Thread.sleep(3000);
    }
}
