package org.Scripts;

import static org.junit.Assert.assertTrue;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

public class FaceBookLogin {

    WebDriver driver;

    @BeforeTest
    public void openBrowser() {
        // Create Session via the API and Session ID is generated
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
    }
    @Test
    public  void test_LoginNegative() throws InterruptedException {

        driver.manage().window().maximize();

        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("mInvalidEmail@gmail.com");
        WebElement password = driver.findElement(By.id("pass"));
        password.sendKeys("123456thisandthat");
        WebElement button = driver.findElement(By.name("login"));
        button.click();

        Thread.sleep(3000);

        WebElement errormsg = driver.findElement(By.className("_9ay7"));

        Assert.assertEquals(errormsg.getText(), "The email address you entered isn't connected to an account. Find your account and log in.");
        System.out.println(errormsg.getText());


    }
    @Test(dependsOnMethods = "test_LoginNegative")
    public  void test_LoginPositive() throws InterruptedException {

        WebElement email = driver.findElement(By.id("email"));
        email.clear();
        email.sendKeys("ValidEmail@gmail.com");

        WebElement password = driver.findElement(By.id("pass"));
        password.clear();
        password.sendKeys("7878198nik");

        WebElement button = driver.findElement(By.name("login"));
        button.click();
    }

    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }
}
