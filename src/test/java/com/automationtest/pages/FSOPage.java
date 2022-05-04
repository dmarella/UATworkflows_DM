package com.automationtest.pages;

import com.automationtest.base.Testbase;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.automationtest.pages.WorkOrderPage.WorkOrderNumber;

public class FSOPage extends Testbase {
    @FindBy(name = "username")
    WebElement FSOUsernameField;
    @FindBy(name = "password")
    WebElement FSOPasswordField;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement FSOLoginButton;
    @FindBy(xpath = "//*[@id='toolbar-div']/md-toolbar/div/button/ng-md-icon")
    WebElement Menu;
    @FindBy(xpath = "//*[@id='select_value_label_16']/span[2]")
    WebElement Expandbutton;
    @FindBy(xpath = "//*[@id='select_option_23]/div[1]")
    WebElement Bristol;
    @FindBy(css = "#toolbar-div > md-toolbar > div > fso-toolbar-tabs > md-tabs > md-tabs-wrapper > md-tabs-canvas > md-pagination-wrapper > md-tab-item:nth-child(2)")
    WebElement Jobs;
    @FindBy(xpath = "//input[@id='input_39']")
    WebElement WorkOrderField;
    @FindBy(xpath = "//*[@id='jobs-md-table-container']/table/tbody/tr/td[1]/md-checkbox/div[1]")
    WebElement WorkOrderLink;
    @FindBy(xpath = "//*[@id='job-details-assign-button']/span")
    WebElement AssignJobLink;
    @FindBy(css = "#save-assignment-btn > span")
    WebElement SaveButton;
    @FindBy(css = "#dialogContent_164 > div:nth-child(1) > md-checkbox > div.md-container.md-ink-ripple")
    WebElement Checkbox;
    @FindBy(css = "body > div.md-dialog-container > md-dialog > form > md-dialog-actions > button:nth-child(2)")
    WebElement Save;

    public FSOPage() {
        PageFactory.initElements(driver, this);
    }

    public void EnterFSOUserName(String FSOUsername) {
        FSOUsernameField.sendKeys(FSOUsername);

    }

    public void EnterFSOPassword(String FSOPassword) {
        FSOPasswordField.sendKeys(FSOPassword);

    }

    public HomePage FSOlogin() {
        FSOLoginButton.click();
        return new HomePage();

    }

    public void ChangethelocationtoBristol() throws InterruptedException {
        /*Thread.sleep(1000);
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.elementToBeClickable(Menu)).click();
        WebDriverWait wait1 = new WebDriverWait(driver, 60);
        wait1.until(ExpectedConditions.elementToBeClickable(Expandbutton)).click();
        WebDriverWait wait2 = new WebDriverWait(driver, 60);
        wait2.until(ExpectedConditions.elementToBeClickable(Bristol)).click();*/
        Jobs.click();

    }

    public void searchforWorkOrder() {
        WorkOrderField.sendKeys(WorkOrderNumber);


    }

    public void clickonWorkOrderLink() {
        WebDriverWait wait1 = new WebDriverWait(driver, 30);
        wait1.until(ExpectedConditions.elementToBeClickable(WorkOrderLink)).click();

    }

    public void clickonAssignJobLink() {
        WebDriverWait wait1 = new WebDriverWait(driver, 30);
        wait1.until(ExpectedConditions.elementToBeClickable(AssignJobLink)).click();

    }

    public void assignjobandSave() {
        WebElement element = SaveButton;
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);
        SaveButton.click();
        Checkbox.click();
        Save.click();
    }


}
