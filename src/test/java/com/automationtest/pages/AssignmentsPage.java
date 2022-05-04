package com.automationtest.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AssignmentsPage extends PreventiveMaintenancePage {
    @FindBy(xpath = "//a[@id='m308a50dd-tab_anchor' and @title='Assignments']")
    WebElement AssigmentsTab;

    public AssignmentsPage() {
        PageFactory.initElements(driver, this);

    }
    public void clickonAssignmentsTab(){
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.elementToBeClickable(AssigmentsTab));
    }

}



