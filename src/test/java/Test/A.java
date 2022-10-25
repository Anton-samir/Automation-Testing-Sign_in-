package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class A {



    WebElement id_gender2 (WebDriver driver){
        WebElement ele = driver.findElement(By.id("id_gender2"));
        return ele;
    }
    WebElement First_Name (WebDriver driver){
        WebElement ele = driver.findElement(By.id("customer_firstname"));
        return ele;
    }
    WebElement Last_Name (WebDriver driver){
        WebElement ele = driver.findElement(By.id("customer_lastname"));
        return ele;
    }
    WebElement First_Name1 (WebDriver driver){
        WebElement ele = driver.findElement(By.id("customer_firstname"));
        return ele;
    }
    WebElement Last_Name1 (WebDriver driver){
        WebElement ele = driver.findElement(By.id("customer_lastname"));
        return ele;
    }
    WebElement Email (WebDriver driver){
        WebElement els = driver.findElement(By.id("email"));
        return els;
    }
    WebElement Password_Confirm (WebDriver driver){
        WebElement els = driver.findElement(By.id("passwd"));
        return els;
    }
    WebElement Company_Address (WebDriver driver){
        WebElement els = driver.findElement(By.id("company"));
        return els;
    }
    WebElement Address_Address (WebDriver driver){
        WebElement els = driver.findElement(By.id("address1"));
        return els;
    }
    WebElement Address_Line (WebDriver driver){
        WebElement els = driver.findElement(By.id("address2"));
        return els;
    }
    WebElement City_Address (WebDriver driver){
        WebElement els = driver.findElement(By.id("city"));
        return els;
    }
    WebElement Postal_Code (WebDriver driver){
        WebElement els = driver.findElement(By.id("postcode"));
        return els;
    }
    WebElement Additional_information (WebDriver driver){
        WebElement els = driver.findElement(By.id("other"));
        return els;
    }
    WebElement Home_phone (WebDriver driver){
        WebElement els = driver.findElement(By.id("phone"));
        return els;
    }
    WebElement Mobile_phone (WebDriver driver){
        WebElement els = driver.findElement(By.id("phone_mobile"));
        return els;
    }
    WebElement Assign_an (WebDriver driver){
        WebElement els = driver.findElement(By.id("alias"));
        return els;
    }
    WebElement Register (WebDriver driver){
        WebElement els = driver.findElement(By.id("submitAccount"));
        return els;
    }
    WebElement days (WebDriver driver){
        WebElement els = driver.findElement(By.id("days"));
        return els;
    }
    WebElement month (WebDriver driver){
        WebElement els = driver.findElement(By.id("months"));
        return els;
    }
    WebElement Years (WebDriver driver){
        WebElement els = driver.findElement(By.id("years"));
        return els;
    }
    WebElement State (WebDriver driver){
        WebElement els = driver.findElement(By.id("id_state"));
        return els;
    }
    WebElement United_States (WebDriver driver){
        WebElement els = driver.findElement(By.id("id_country"));
        return els;
    }
    WebElement button1 (WebDriver driver){
        WebElement ele = driver.findElement(By.id("uniform-newsletter"));
        return ele;
    }
    WebElement button2 (WebDriver driver){
        WebElement ele = driver.findElement(By.id("optin"));
        return ele;
    }
    WebElement Alert (WebDriver driver){
        WebElement ele = driver.findElement(By.className("lnk_wishlist"));
        return ele;
    }
    WebElement Alert1 (WebDriver driver){
        WebElement ele = driver.findElement(By.className("alert"));
        return ele;
    }
}
