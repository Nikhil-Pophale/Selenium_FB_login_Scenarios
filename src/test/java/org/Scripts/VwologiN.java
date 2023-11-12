package org.Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;


public class VwologiN {

    WebDriver driver;

    @BeforeTest(alwaysRun = true)
    public void openBrowser(){
        driver=new ChromeDriver();
        driver.get("https://app.vwo.com");
    }
    @Test
    public void vwologinNegative() throws InterruptedException {

        driver.manage().window().fullscreen();
        WebElement username = driver.findElement(By.id("login-username"));
        username.sendKeys("inValidemail@gmail.com");

        WebElement password = driver.findElement(By.id("login-password"));
        password.sendKeys("blah . . blahh");

        WebElement buttom = driver.findElement(By.id("js-login-btn"));
        buttom.click();

        Thread.sleep(3000);

        WebElement errormsg = driver.findElement(By.id("js-notification-box-msg"));
        System.out.println(errormsg.getText());
        Assert.assertEquals(errormsg.getText(), "Your email, password, IP address or location did not match");
//        driver.quit();
    }
    @Test
    public void vwologinPositive() throws InterruptedException {


        WebElement username = driver.findElement(By.id("login-username"));
        username.clear();
        // add valid username or email
        username.sendKeys("Validemail@gmail.com");

        // add valid password
        WebElement password = driver.findElement(By.id("login-password"));
        password.clear();
        password.sendKeys("blah . . blahh");

        WebElement buttom = driver.findElement(By.id("js-login-btn"));
        buttom.click();
    }

    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }
}
