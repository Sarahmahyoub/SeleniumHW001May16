package HWClass01May16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW2 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();


        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");

        driver.manage().window().maximize();

        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");

        String title= driver.getTitle();

        if (title.equals("Web Orders Login")){
            System.out.println(title+" is the correct title");

        }else{

            System.out.println("The title is incorrect");
        }

        Thread.sleep(5000);
        driver.quit();

    }

}
