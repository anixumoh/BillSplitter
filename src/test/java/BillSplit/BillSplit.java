package BillSplit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;




public class BillSplit {

    static WebDriver driver;

    @BeforeMethod

    public void setup(){

        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Drivers/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void billSplit() throws InterruptedException {

        driver.get("https://bill-spitter-app.herokuapp.com/splash");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//div[contains(text(),'Login')]")).click();
        driver.findElement(By.xpath("//input[@placeholder='Email']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("anixumoh7@gmail.com");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("123456");
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div[2]/div/div[2]/div/div/div/div[1]/div/div[2]/div/div/div")).click();
        Thread.sleep(5000);

        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div[3]/div/div[2]/div/div/div/div[1]/div/div[2]/div/div/div")).click();
        driver.findElement(By.xpath("//input[@placeholder='Group name']")).sendKeys("ReachZone");
        driver.findElement(By.xpath("//div[contains(text(),'Create')]")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//div[contains(text(),'Youtube')]")).click();
        driver.findElement(By.xpath("//div[contains(text(),'Add an Expense')]")).click();
        driver.findElement(By.xpath("//input[@placeholder='Expense Title']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='Expense Title']")).sendKeys("Yam sauce");
        driver.findElement(By.xpath("//input[@placeholder='0.0']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='0.0']")).sendKeys("1000");
        driver.findElement(By.xpath("//div[contains(text(),'Add Bill')]")).click();

    }

    @AfterMethod
    public void teardown() throws InterruptedException  {
        Thread.sleep(5000);
        driver.close();

    }

}
