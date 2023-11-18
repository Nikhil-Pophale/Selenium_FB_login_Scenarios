package org.Scripts.ParaBanking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ParaBanking_Reg {

    ChromeDriver driver;

    @BeforeTest
    public void openBrowser() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
        driver.manage().window().maximize();
        Thread.sleep(1000);

    }
    @Test
    public void test_ParaBanking() throws InterruptedException {
        faker faker=new faker();

        WebElement reg_btn=driver.findElement(By.linkText("Register"));
        reg_btn.click();

        Thread.sleep(1000);

        WebElement firstName=driver.findElement(By.id("customer.firstName"));
        firstName.sendKeys(faker.fname());

        WebElement lastName=driver.findElement(By.id("customer.lastName"));
        lastName.sendKeys(faker.lname());

        WebElement address=driver.findElement(By.id("customer.address.street"));
        address.sendKeys(faker.address());

        WebElement cityy=driver.findElement(By.id("customer.address.city"));
        cityy.sendKeys(faker.city());

        WebElement state=driver.findElement(By.id("customer.address.state"));
        state.sendKeys(faker.state());

        WebElement zipCode=driver.findElement(By.id("customer.address.zipCode"));
        zipCode.sendKeys("443404");

        WebElement phoneNumber=driver.findElement(By.id("customer.phoneNumber"));
        phoneNumber.sendKeys("7768875888");

        WebElement ssn=driver.findElement(By.id("customer.ssn"));
        ssn.sendKeys("123456987");

        WebElement username=driver.findElement(By.id("customer.username"));
        username.sendKeys(faker.username());

        WebElement password=driver.findElement(By.id("customer.password"));
        password.sendKeys("thisispassword");

        WebElement repeatedPassword=driver.findElement(By.id("repeatedPassword"));
        repeatedPassword.sendKeys("thisispassword");

        WebElement Register=driver.findElement(By.xpath("//*[@id=\"customerForm\"]/table/tbody/tr[13]/td[2]/input"));
        Register.click();

        WebElement Reg_Confirmation=driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/p"));
        Assert.assertEquals(Reg_Confirmation.getText(),"Your account was created successfully. You are now logged in.");

        System.out.println(Reg_Confirmation.getText());

    }
    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }

}
