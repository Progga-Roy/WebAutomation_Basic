package javas.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class HandleDropDownWithSelector extends DriverSetUp {
    @Test
    public void interactWitheDropDown() throws InterruptedException {
        driver.get("https://rahulshettyacademy.com/AutomationPractice");
        WebElement selectOption =  driver.findElement(By.id("dropdown-class-example"));
        Select select = new Select(selectOption);
        selectOption.click();
        select.selectByIndex(2);
        Thread.sleep(3000);
        select.selectByVisibleText("Option3");
        Thread.sleep(3000);
        select.selectByValue("option1");
        Thread.sleep(3000);


        WebElement selected_option = select.getFirstSelectedOption();
        System.out.println(selected_option.getText());
        List<WebElement> allOptions = select.getOptions();
        System.out.println(allOptions.size());
        for(WebElement options : allOptions){
            System.out.println(options.getText());

        }

//   select.deselectByVisibleText("Option3");
//        Thread.sleep(3000);



    }
}
