package page;

import base.baseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class heroSuccessLoginPage extends baseTest {
    public heroSuccessLoginPage(){
        PageFactory.initElements(driver, this);
    }


    @FindBy (id = "flash-messages")
    WebElement successLoginPopUp;

    @FindBy (xpath = "//h2")
    WebElement headerText;

    @FindBy (className = "subheader")
    WebElement subHeaderText;

    @FindBy (css = ".button.secondary.radius")
    WebElement logoutBtn;


    public String verifySuccessLoginPopUpText(){
        wdwait.until(ExpectedConditions.visibilityOf(successLoginPopUp));
        return successLoginPopUp.getText();
    }

    public String verifyHeaderText(){
        wdwait.until(ExpectedConditions.visibilityOf(headerText));
        return headerText.getText();
    }

    public String verifySubHeaderText(){
        wdwait.until(ExpectedConditions.visibilityOf(subHeaderText));
        return subHeaderText.getText();
    }

    public void clickLogoutBtn(){
        wdwait.until(ExpectedConditions.visibilityOf(logoutBtn));
        logoutBtn.click();
    }







}
