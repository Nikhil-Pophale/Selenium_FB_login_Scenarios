package org.Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class V {
    public static void main(String[] args) {
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://app.vwo.com/#/login");
//        WebElement start_free_trial_button= driver.findElement();
        WebElement email= driver.findElement(By.name("email"));
        email.sendKeys("nikpofale@gmail.com");
        WebElement create_button= driver.findElement(By.className("button W(100%) btn-modal-form-submit"));
        email.sendKeys("nikpofale@gmail.com");
        WebElement firstname= driver.findElement(By.id("page-v1-fname"));
        email.sendKeys("nikpofale@gmail.com");
        WebElement lastname= driver.findElement(By.id("page-v1-lname"));
        email.sendKeys("nikpofale@gmail.com");
        WebElement phone_number= driver.findElement(By.id("page-v1-pnumber"));
        email.sendKeys("nikpofale@gmail.com");
        WebElement password= driver.findElement(By.id("page-v1-pwd"));
        email.sendKeys("nikpofale@gmail.com");

    }
}
