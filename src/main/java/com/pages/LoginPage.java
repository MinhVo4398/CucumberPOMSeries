package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage {

    private WebDriver driver;

    // 1. By Locators
    private By emailId = By.id("email");
    private By password = By.id("passwd");
    private By signInButton = By.id("SubmitLogin");
    private By forgotPasswordLink = By.xpath("//a[text()='Forgot your password?']");

    //2. Constructor of the page class:

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    //3. page actions: feature (behaviour) of the page form of methods:
    public String getLoginPageTitle() {
       return driver.getTitle();
    }

    public boolean isForgotPasswordLinkExist() {
      return  driver.findElement(forgotPasswordLink).isDisplayed();
    }

    public void enterUserName(String userName) {
        driver.findElement(emailId).sendKeys(userName);
    }

    public void enterPassword(String pwd) {
        driver.findElement(password).sendKeys(pwd);
    }
    public void clickOnLogin() {
        driver.findElement(signInButton).click();
    }

    public AccountsPage doLogin(String un, String pwd) {
        System.out.println("Login with: " + un + " and " + pwd);
        driver.findElement(emailId).sendKeys(un);
        driver.findElement(password).sendKeys(pwd);
        driver.findElement(signInButton).click();

        // click Login qua trang Account -> khoi tao
        return new AccountsPage(driver);
    }
}
