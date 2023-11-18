package org.Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Katloan_Cura_Book_Appointment {

    ChromeDriver driver;

    @BeforeTest
    public void openBrowser() {
        driver = new ChromeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/#appointment");
        driver.manage().window().maximize();

    }

    @Test
    public void test_Book_Appointment() throws InterruptedException {

        WebElement make_App_btn = driver.findElement(By.xpath("//*[@id=\"btn-make-appointment\"]"));
        make_App_btn.click();

        WebElement username = driver.findElement(By.id("txt-username"));
        username.sendKeys("John Doe");

        WebElement password = driver.findElement(By.id("txt-password"));
        password.sendKeys("ThisIsNotAPassword");

        WebElement lgn_btn = driver.findElement(By.id("btn-login"));
        lgn_btn.click();

        Thread.sleep(1000);

        WebElement select_facility = driver.findElement(By.id("combo_facility"));
        select_facility.click();

        WebElement select_facility_op = driver.findElement(By.xpath("//*[@id=\"combo_facility\"]/option[1]"));
        select_facility_op.click();

        WebElement visit_date = driver.findElement(By.id("txt_visit_date"));
        visit_date.sendKeys("20/12/2023");

        WebElement commnet = driver.findElement(By.id("txt_comment"));
        commnet.sendKeys("Routin check-up");

        WebElement bk_app_btn = driver.findElement(By.id("btn-book-appointment"));
        bk_app_btn.click();

        WebElement Confirmation_txt = driver.findElement(By.xpath("//*[@id=\"summary\"]/div/div/div[1]"));
        System.out.println(Confirmation_txt.getText());;
    }

    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }

}
