package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class c {
    WebElement Email_Confirm1 (WebDriver driver){
        WebElement els = driver.findElement(By.id("email_create"));
        return els;
    }
    WebElement Click(WebDriver driver){
        WebElement elm = driver.findElement(By.id("SubmitCreate"));
        return elm;
    }
}
