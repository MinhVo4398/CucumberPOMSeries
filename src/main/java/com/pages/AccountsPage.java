package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class AccountsPage {
    private WebDriver driver;

    private By accountSections = By.cssSelector("div#center_column span");

    // Create constructor
    public AccountsPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getAccountPageTitle() {
        return driver.getTitle();
    }

    public int getAccountsSectionCount() {
        return driver.findElements(accountSections).size() ;
    }

    public List<String> getAccountsSectionsList() {
        List<String> accountList = new ArrayList<>();

        List<WebElement> accountsHeaderList = driver.findElements(accountSections);
        for (WebElement element : accountsHeaderList) {
            String text = element.getText();
            System.out.println(text);
            accountList.add(text);
        }
        return accountList;
    }

}
