package StepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class OdSsLogin {
    @Given("user is on OD Self serve login page")
    public void ss_login_page(){
        System.out.println("User is on login page");
    }
    @When("user enters the Mobile no")
    public void enter_Mob_No(){
        System.out.println("User entered Mobile number");
    }
    @When("user enters the PAN")
    public void enter_PAN(){
        System.out.print(" User Entered PAN no");
    }
    @When("User clicks on the send OTP button")
    public void click_send_OTP(){
        System.out.print(" User clicked on Send OTP");
    }
    @When("OTP field will be displayed")
    public void enter_otp_found(){
        System.out.print(" System displayed OTP Box");
    }
    @When("User enters the OTP")
    public void enter_otp(){
        System.out.print(" User entered OTP as 123456");
    }
    @When("User clicks on the Submit Otp Button")
    public void click_submit_otp(){
        System.out.println(" User clicked on Submit OTP button");
    }
    @Then("User lands on Sourcing page")
    public void sourcing_page_found(){
        System.out.print(" User landed on Sourcing page");
    }

}
