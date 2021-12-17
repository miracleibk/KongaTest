import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class KongaWebSignupTest {
    //Import the Konga WebDriver
    private WebDriver driver;

    @Test
    public void setup() throws InterruptedException {
        //locate where the chrome driver is
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        //1. open a new driver
        driver = new  ChromeDriver();
        //2.input your konga Demo page URL(https://www.konga.com)
        driver.get("https://www.konga.com");

        //3.maximize the window
        driver.manage().window().maximize();
        //4. get the page title
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //5 click on the sign in/log in button
        driver.findElement(By.xpath("//*[@id=\"app-content-wrapper\"]/div[3]/nav/div[2]/div/div/div[4]/a")).click();
        Thread.sleep(5000);
        //6.input your email address
        driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("miracleosuji2@gmail.com");
        //7.input your password
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("1955@4");
        //8.click on the sign in/login/continue button
        driver.findElement(By.xpath("//*[@id=\"app-content-wrapper\"]/div[4]/section/section/aside/div[2]/div/form/div[3]/button")).click();
         Thread.sleep(5000);

        //9.logout from the account
        driver.findElement(By.xpath("//*[@id=\"app-content-wrapper\"]/div[3]/nav/div[2]/div/div/div[4]/div/a/span")).click();

        driver.findElement(By.xpath("//*[@id=\"app-content-wrapper\"]/div[3]/nav/div[2]/div/div/div[4]/div/ul/li[7]/a")).click();

    }

        @AfterTest
                public void closebrowser(){
            //10.quit the browser
        driver.quit();
        }





    }


