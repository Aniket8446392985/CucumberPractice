package StepDefinations;


import Page.SS_Landing_Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SD_OdSsLogin extends SS_Landing_Page  {
    @Given("user is on OD Self serve login page")
    public void ss_login_page(){
        LaunchBrowser("https://ssgqa.serviceurl.in/eSign/#/hdfc/verify");
        //ImpWait(5000);
        Assert.assertTrue(PageTitle.equalsIgnoreCase("E-Sign"));
        System.out.println("User is on login page");
    }
    @When("user enters the Mobile no")
    public void enter_Mob_No(){
        Enter_Mobile_No("844639298");
        System.out.println("User entered Mobile number");
    }
    @And("user enters the PAN")
    public void enter_PAN(){
        Enter_Pan("CPRPD8321P");
        System.out.print(" User Entered PAN no");
    }
    @And("User clicks on the send OTP button")
    public void click_send_OTP(){
        ClickReceiveOtp();
        System.out.print(" User clicked on Send OTP");
    }
    @And("OTP field will be displayed")
    public void enter_otp_found(){
        System.out.print(" System displayed OTP Box");
    }
    @And("User enters the OTP")
    public void enter_otp(){
        System.out.print(" User entered OTP as 123456");
    }
    @And("User clicks on the Submit Otp Button")
    public void click_submit_otp(){
        System.out.println(" User clicked on Submit OTP button");
    }
    @Then("User lands on Sourcing page")
    public void sourcing_page_found(){
        //  driver.quit();
        System.out.print(" User landed on Sourcing page");
    }

}
