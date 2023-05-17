package HWClass01May16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {


    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();


        driver.get("https://parabank.parasoft.com/parabank/register.htm");

        driver.manage().window().maximize();

        driver.findElement(By.id("customer.firstName")).sendKeys("Sarah");
        driver.findElement(By.id("customer.lastName")).sendKeys("Mahyoub");
        driver.findElement(By.id("customer.address.street")).sendKeys("4555 Madison St");
        driver.findElement(By.id("customer.address.city")).sendKeys("Fairfax");
        driver.findElement(By.id("customer.address.state")).sendKeys("VA");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("22030");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("571-333-3333");
        driver.findElement(By.id("customer.ssn")).sendKeys("222-22-2222");

        driver.findElement(By.name("customer.username")).sendKeys("smahyoub");
        driver.findElement(By.name("customer.password")).sendKeys("smahy@1234");
        driver.findElement(By.name("repeatedPassword")).sendKeys("smahy@1234");


        Thread.sleep(5000);
        driver.quit();
    }
}