package mmt_rail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class mmt_rail {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver","E:\\selenium\\msedgedriver.exe");
        WebDriver driver=new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.makemytrip.com/railways/");
        String expt_month="November 2023";
        String expt_date="21";
        String to="Rudrapur";
        String frr="Jalandhar Cantt. Railway Station";
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        //if(driver.findElement(By.xpath("//span[@class='commonModal__close']")).isDisplayed())
        //{
            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//span[@class='commonModal__close']")))).click();
        //}*/
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//input[@id='fromCity']")))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='From']")));
        WebElement from=driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div/input"));
        from.sendKeys(frr);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[normalize-space()='"+frr+"']"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div[2]/div/div[2]/div[1]/div/div/div/input"))).sendKeys(to);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='"+to+"']"))).click();
        while(!driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[1]/div")).getText().contains(expt_month)) {
            driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[1]/span[2]")).click();
        }
        driver.findElement(By.xpath("//div[@aria-label='Thu Nov 16 2023']")).click();
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div[2]/div/div[4]/ul/li[1]")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Search']")).click();
        driver.findElement(By.xpath("//div[contains(text(),'Available')]")).click();
        Thread.sleep(3000);
        if(driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[3]")).isDisplayed()){
            driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[3]")).click();
        }
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='appendBottom50']//li[2]//div[1]//span[1]//label[1]"))).click();
        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/section[1]/div[3]/div[2]/div/a/span[1]")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='name']"))).sendKeys("Bhoomanyu Jyala");
        driver.findElement(By.xpath("//*[@id=\"age\"]")).sendKeys("20");
        driver.findElement(By.xpath("//div[@class='formField genderField makeFlex column appendRight20']//p[@class='selectedQuota close cursorPointer latoBold font12 makeFlex']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"mmt-rails-add-traveller\"]/div/li/div[3]/div[2]/div/form/div[3]/div/ul/li[1]/span[1]")).click();
        driver.findElement(By.xpath("/html/body/div[5]/div/div/div/li/div[3]/div[2]/div/form/div[5]/div")).click();
        driver.findElement(By.xpath("/html/body/div[5]/div/div/div/li/div[3]/div[2]/div/form/div[5]/div/ul/li[2]")).click();
        driver.findElement(By.xpath("//button[normalize-space()='Add']")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"irctcUserName\"]"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"IRCTCUserName\"]"))).sendKeys("***********");
        driver.findElement(By.xpath("//*[@id=\"mmt-irctc-modal\"]/div[1]/div[2]/button/span")).click();
        driver.findElement(By.xpath("//input[@id='contactEmail']")).sendKeys("************");
        driver.findElement(By.xpath("//*[@id=\"mobileNumber\"]")).sendKeys("**********");
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/section[1]/div[7]/div/div[2]/ul/li[1]/div/span[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/section[1]/div[7]/div/div[3]/ul/li[2]/div/span/label")).click();
        driver.findElement(By.xpath("//input[@id='pincode_gst_info']")).clear();
        driver.findElement(By.xpath("//input[@id='pincode_gst_info']")).sendKeys("262308");
        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/section[1]/div[8]/div[3]/div/span/b")).click();
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/section[1]/div[8]/div[2]/div[2]/div/span")).click();
        //driver.findElement(By.xpath("//li[normalize-space()='Uttarakhand']")).click();
        driver.findElement(By.xpath("//a[@class='paymentBtn whiteText latoBlack font16 capText']")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='inputVpa']"))).click();
        driver.findElement(By.xpath("//input[@id='inputVpa']")).sendKeys("***********");
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/main/div[1]/div[3]/div[2]/div[1]/div[1]/div[3]/div/button")).click();

    }
}
