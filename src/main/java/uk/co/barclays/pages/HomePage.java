package uk.co.barclays.pages;

import com.cucumber.listener.Reporter;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uk.co.barclays.utility.Utility;

/*
Created By Bhavesh
*/
public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());


    @FindBy(xpath ="//a[@class='login btn btn-primary btn-sm']" )
    WebElement _loginBtn;

    @FindBy(xpath = "//a[@class='btn-none']")
    WebElement _registerLink;

    public void clickOnLoginButton() {
 Reporter.addStepLog("clicking on login button : "+ _loginBtn.toString());
        clickOnElement(_loginBtn);
        log.info ("clicking on login button : "+_loginBtn.toString());
    }

    public void clickOnRegisterLink() {
Reporter.addStepLog("clicking on register link : "+ _registerLink.toString());
        clickOnElement(_registerLink);
        log.info("clicking on register link : "+ _registerLink.toString());
    }


}
