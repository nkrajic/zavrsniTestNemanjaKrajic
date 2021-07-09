package test;

import base.baseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import page.heroLoginPage;
import page.heroSuccessLoginPage;
import page.utility;

public class heroTest extends baseTest {

    heroLoginPage HerologinPage;
    heroSuccessLoginPage HeroSuccessLoginPage;
    utility Utility;

    @Before
    public void setUpTest(){
        HerologinPage = new heroLoginPage();
        HeroSuccessLoginPage = new heroSuccessLoginPage();
        Utility = new utility();
    }

    @Test
    //Wrong Username Wrong Password
    public void testCase1(){
        Assert.assertEquals("Login Page",HerologinPage.verifyLoginText());
        Assert.assertEquals("This is where you can log into the secure area. Enter tomsmith for the username and" +
                " SuperSecretPassword! for the password. " +
                "If the information is wrong you should see error messages.",HerologinPage.verifyInfoText());
        Assert.assertTrue(Utility.checkImg());
        Assert.assertEquals("Powered by Elemental Selenium",Utility.verifyFoterMessage());
        HerologinPage.inputUsername("dkjbckjsdbc");
        HerologinPage.inputPassword("jksajbfkjas");
        HerologinPage.clickLoginBtn();
        Assert.assertEquals("Your username is invalid!\n" + "×", HerologinPage.verifyPopUpErrorMessage());
        Utility.popUpCloseBtn();

    }

    @Test
    //Actual username Actual password
    public void testCase2(){
        Assert.assertEquals("Login Page",HerologinPage.verifyLoginText());
        Assert.assertEquals("This is where you can log into the secure area. Enter tomsmith for the username and" +
                " SuperSecretPassword! for the password. " +
                "If the information is wrong you should see error messages.",HerologinPage.verifyInfoText());
        Assert.assertTrue(Utility.checkImg());
        Assert.assertEquals("Powered by Elemental Selenium",Utility.verifyFoterMessage());
        HerologinPage.inputUsername("tomsmith");
        HerologinPage.inputPassword("SuperSecretPassword!");
        HerologinPage.clickLoginBtn();
        Utility.popUpCloseBtn();
        Assert.assertEquals("You logged into a secure area!\n" + "×",HeroSuccessLoginPage.verifySuccessLoginPopUpText());
        Utility.popUpCloseBtn();
        Assert.assertEquals("Secure Area",HeroSuccessLoginPage.verifyHeaderText());
        Assert.assertEquals("Welcome to the Secure Area. When you are done click logout below.", HeroSuccessLoginPage.verifySubHeaderText());
        Utility.clickImgGitHub();
        driver.navigate().back();
        HeroSuccessLoginPage.clickLogoutBtn();
        Assert.assertEquals("You logged out of the secure area!\n" + "×" , HerologinPage.verifyPopUpSuccessLogout());

    }
    @Test
    //Wrong Username Actual Password
    public void testCase3(){
        Assert.assertEquals("Login Page",HerologinPage.verifyLoginText());
        Assert.assertEquals("This is where you can log into the secure area. Enter tomsmith for the username and" +
                " SuperSecretPassword! for the password. " +
                "If the information is wrong you should see error messages.",HerologinPage.verifyInfoText());
        Assert.assertTrue(Utility.checkImg());
        Assert.assertEquals("Powered by Elemental Selenium",Utility.verifyFoterMessage());
        HerologinPage.inputUsername("neca");
        HerologinPage.inputPassword("SuperSecretPassword!");
        HerologinPage.clickLoginBtn();
        Assert.assertEquals("Your username is invalid!\n" + "×", HerologinPage.verifyPopUpErrorMessage());
        Utility.popUpCloseBtn();

    }

    @Test
    //Actual Username Wrong Password
    public void testCase4(){
        Assert.assertEquals("Login Page",HerologinPage.verifyLoginText());
        Assert.assertEquals("This is where you can log into the secure area. Enter tomsmith for the username and" +
                " SuperSecretPassword! for the password. " +
                "If the information is wrong you should see error messages.",HerologinPage.verifyInfoText());
        Assert.assertTrue(Utility.checkImg());
        Assert.assertEquals("Powered by Elemental Selenium",Utility.verifyFoterMessage());
        HerologinPage.inputUsername("tomsmith");
        HerologinPage.inputPassword("uperSecretPassword!");
        HerologinPage.clickLoginBtn();
        Assert.assertEquals("Your password is invalid!\n" + "×", HerologinPage.verifyPopUpErrorMessage());
        Utility.popUpCloseBtn();

    }








}
