package com.automationtest.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class ActualsPage extends PreventiveMaintenancePage {
    @FindBy(xpath = "//*[@id='m272f5640-tab_anchor' and @title='Actuals']")
    WebElement ActualsTab;
    @FindBy(css = "#m4dfd8aef_bg_button_addrow-pb")
    WebElement Newrow;
    @FindBy(css = "#m71551ec4-tb")
    WebElement Worktype;
    @FindBy(css = "#mef50ddba-tb")
    WebElement LabourField;
    @FindBy(css = "#mf3329b8e-tb")
    WebElement StartDateField;
    @FindBy(css = "#m89f2c8ee-tb")
    WebElement FinishDateField;
    @FindBy(css = "#m5df1446b-tb")
    WebElement StartTimeField;
    @FindBy(css = "#m6d560e2d-tb")
    WebElement FinishTimeField;
    @FindBy(css = "#toolactions_SAVE-tbb_image")
    WebElement SaveButton;

    public ActualsPage() {
        PageFactory.initElements(driver, this);

    }

    public void clickonActualsTab() {
        WebElement element = ActualsTab;
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);
    }

    public void clickonNewRow() {
        driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
        WebElement element = Newrow;
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);
    }

    public void enterLaborNumber() {
        LabourField.sendKeys("404320");
    }

    public void enterStartDate() {
        DateFormat dateFormat = new SimpleDateFormat("d/M/yyyy");
        Date date = new Date();
        String date2 = dateFormat.format(date).trim();
        //WebDriverWait wait = new WebDriverWait(driver, 100);
        //wait.until(ExpectedConditions.elementToBeClickable(StartDateField)).sendKeys(date2);
        WebElement Start = StartDateField;
        Start.clear();
        for (int i = 0; i < date2.length(); i++) {
            char c = date2.charAt(i);
            String s = new StringBuilder().append(c).toString();
            Start.sendKeys(s);

        }
    }

    public void enterFinishDate() {
        DateFormat dateFormat = new SimpleDateFormat("d/M/yyyy");
        Date date = new Date();
        String date1 = dateFormat.format(date).trim();
        //WebDriverWait wait = new WebDriverWait(driver, 100);
        //wait.until(ExpectedConditions.elementToBeClickable(FinishDateField)).sendKeys(date1);
        WebElement Finish = FinishDateField;
        Finish.clear();
        for (int i = 0; i < date1.length(); i++) {
            char c = date1.charAt(i);
            String s = new StringBuilder().append(c).toString();
            Finish.sendKeys(s);
        }


    }

    public void enterStartTimeforTravel() {
        StartTimeField.sendKeys("09:00 AM");

    }

    public void enterEndTimeforTravel() {
        FinishTimeField.sendKeys("09:15 AM");

    }

    public void enterStartTimeforOnsite() {
        StartTimeField.sendKeys("9:15 AM");


    }

    public void enterEndTimeforOnsite() {
        FinishTimeField.sendKeys("09:30 AM");
    }

    public void enterStartTimeforWork() {
        StartTimeField.sendKeys("9:30 AM");


    }

    public void enterEndTimeforWork() {
        FinishTimeField.sendKeys("09:45 AM");
    }

    public void enterStartTimeforWoComp() {
        StartTimeField.sendKeys("9:45 AM");


    }

    public void enterEndTimeforWoComp() {
        FinishTimeField.sendKeys("10:00 AM");
    }

    public void selectTravelType() throws InterruptedException {
        Thread.sleep(2000);
        Worktype.clear();
        Worktype.sendKeys("TRAVEL");
    }

    public void selectWorkType() throws InterruptedException {
        Thread.sleep(2000);
        Worktype.clear();
        Worktype.sendKeys("WORK");


    }

    public void selectonsiteType() throws InterruptedException {
        Thread.sleep(2000);
        Worktype.clear();
        Worktype.sendKeys("ONSITE");
    }

    public void selectwocompType() throws InterruptedException {
        Thread.sleep(2000);
        Worktype.clear();
        Worktype.sendKeys("WOCOMP");
    }

    public void clickonSaveButton() throws InterruptedException {
        WebElement element = SaveButton;
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);
        Thread.sleep(1000);
    }


}





