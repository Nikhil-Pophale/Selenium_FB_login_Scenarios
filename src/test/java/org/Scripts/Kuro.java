package org.Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Kuro {
    public static void main(String[] args) {
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        WebElement make_app_button=driver.findElement(By.xpath("//a[contains(@id,\"appointment\")]"));


//        If here we are getting more than one elements we can click them by indexs as . ..
//        Simultenously not possible
//        List<WebElement> make_app_button2=driver.findElements(By.xpath("//a[contains(@id,\"appointment\")]"));
//        make_app_button2.get(0).click();
//        make_app_button2.get(1).click();


//        List<WebElement> make_app_button3=driver.findElements(By.xpath("//a[starts-with(@id,"btn")]"));
//        make_app_button3.get(0).click();






    }
}
