package Page;

import Config.DriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class SS_Landing_Page extends DriverConfig {
    public String PageTitle=driver.getTitle();
    WebElement MobileNo= driver.findElement(By.xpath("//div/input[@name=\"custMobNo\"]"));
    WebElement PanNo= driver.findElement(By.xpath("//div/input[@name=\"panNumber\"]"));
    WebElement FirstCheckBox= driver.findElement(By.xpath("//div/input[@id=\"mat-checkbox-1-input\"]"));
    WebElement SecondCheckBox= driver.findElement(By.xpath("//div/input[@id=\"mat-checkbox-2-input\"]"));
    WebElement ThirdCheckBox= driver.findElement(By.xpath("//div/input[@id=\"mat-checkbox-3-input\"]"));
    WebElement ReceiveOtp= driver.findElement(By.xpath("//div/button[@id=\"demo43\"]"));
    WebElement FullName= driver.findElement(By.xpath("//div/input[@name=\"fullName\"]"));


    public void Enter_Mobile_No(String Number){
        MobileNo.sendKeys(Number);
    }
    public void Enter_Pan(String Pan){
        PanNo.sendKeys(Pan);
    }
    public void CheckFirstCheckBox(){
        FirstCheckBox.click();
    }
    public void CheckSecondCheckBox(){
        SecondCheckBox.click();
    }
    public void CheckThirdCheckBox(){
        ThirdCheckBox.click();
    }

    public void ClickReceiveOtp(){
        ReceiveOtp.click();
    }

    public void EnterFullName(String FName){
        FullName.sendKeys(FName);
    }

    public void CheckAllCheckBoxes(){
        FirstCheckBox.click();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        SecondCheckBox.click();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        ThirdCheckBox.click();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
    }







}
