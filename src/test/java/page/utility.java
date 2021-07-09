package page;

import base.baseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class utility extends baseTest {
    public utility(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//img")
    WebElement imageGitHub;

    @FindBy (css = ".large-4.large-centered.columns")
    WebElement poweredBySelenium;

    @FindBy (xpath = "//a[contains(text(),\"Elemental Selenium\")]")
    WebElement elementalSeleniumLink;

    @FindBy (className = "close")
    WebElement closeBtn;


    public boolean checkImg(){
        wdwait.until(ExpectedConditions.visibilityOf(imageGitHub));
        return imageGitHub.isDisplayed();
    }

    public void clickImgGitHub(){
        wdwait.until(ExpectedConditions.visibilityOf(imageGitHub));
        imageGitHub.click();
    }

    public String verifyFoterMessage(){
        wdwait.until(ExpectedConditions.visibilityOf(poweredBySelenium));
        return poweredBySelenium.getText();
    }

    public void clickElementalSeleniumLink(){
        wdwait.until(ExpectedConditions.visibilityOf(elementalSeleniumLink));
        elementalSeleniumLink.click();
    }

    public void popUpCloseBtn(){
        wdwait.until(ExpectedConditions.visibilityOf(closeBtn));
        closeBtn.click();
    }








}
