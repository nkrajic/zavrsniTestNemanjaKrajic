package page;

import base.baseTest;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class heroLoginPage extends baseTest {
    public heroLoginPage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy (id = "username")
    WebElement userName;

    @FindBy (id = "password")
    WebElement passWord;

    @FindBy (className = "radius")
    WebElement loginBtn;

    @FindBy (xpath = "//h2[contains(text(),\"Login Page\")]")
    WebElement loginPageText;

    @FindBy (xpath = "//h4")
    WebElement infoText;

    @FindBy (css = ".flash.error")
    WebElement errorPopUp;

    @FindBy (css = ".flash.success")
    WebElement successLogout;



    public String verifyLoginText(){
        wdwait.until(ExpectedConditions.visibilityOf(loginPageText));
        return loginPageText.getText();
    }

    public String verifyInfoText(){
        wdwait.until(ExpectedConditions.visibilityOf(infoText));
        return infoText.getText();
    }

    public void inputUsername(String username){
        wdwait.until(ExpectedConditions.visibilityOf(userName));
        userName.clear();
        userName.sendKeys(username);
    }

    public void inputPassword(String password){
        wdwait.until(ExpectedConditions.visibilityOf(passWord));
        passWord.clear();
        passWord.sendKeys(password);
    }

    public void clickLoginBtn(){
        wdwait.until(ExpectedConditions.visibilityOf(loginBtn));
        loginBtn.click();
    }

    public void enterLoginBtn(){
        wdwait.until(ExpectedConditions.visibilityOf(loginBtn));
        loginBtn.sendKeys(Keys.ENTER);
    }

    public String verifyPopUpErrorMessage(){
        wdwait.until(ExpectedConditions.visibilityOf(errorPopUp));
        return errorPopUp.getText();
    }

    public String verifyPopUpSuccessLogout(){
        wdwait.until(ExpectedConditions.visibilityOf(successLogout));
        return successLogout.getText();
    }

}
