package com.automationtest.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WorkOrderPage extends PreventiveMaintenancePage {
    public static String WorkOrderNumber;
    @FindBy(xpath = "//a[@id='m4326cf1d-tab_anchor']")
    WebElement WorkTab;
    @FindBy(xpath = "//img[@id='m6dfccb0d_tdrow_[C:0]_tgdet-ti[R:0]_img']")
    WebElement ExpandWorkOrderList;
    @FindBy(xpath = "//input[@id='mf2d9df82-tb']")
    static WebElement WOnumber;
    static String WOFILE = " C:\\Users\\dmarella\\IdeaProjects\\UAT-Workflows\\WO.txt";
    @FindBy(xpath = "//input[@id='input_39']")
    static
    WebElement WorkOrderField;
    @FindBy(xpath = "//input[@id='quicksearch']")
    static
    WebElement FindWO;
    @FindBy(xpath = "//input[@id='quicksearchQSImage']")
    static
    WebElement Searchbutton;
    @FindBy(xpath = "//input[@id='m6a7dfd2f_tfrow_[C:1]_txt-tb']")
    static
    WebElement WOfield;
    @FindBy(css = "#m9a787af-tb")
    static
    WebElement BillBatchWorkOderField;
    @FindBy(xpath = "//img[@id='m6a7dfd2f-ti2_img']")
    static
    WebElement WOsearchButton;
    @FindBy(xpath = "//span[@id='m6a7dfd2f_tdrow_[C:1]_ttxt-lb[R:0]']")
    static
    WebElement ClickonWOlink;
    @FindBy(xpath = "//input[@id='m6271c2a9-tb']")
    WebElement ActualStartDateField;
    @FindBy(xpath = "//input[@id='mfb789313-tb']")
    WebElement ActualFinishDateField;
    @FindBy(xpath = "//*[@id='m15b88ed6-cb_img']")
    WebElement MobileOverRideCheckbox;
    @FindBy(xpath = "//*[@id='mddc79f39-tb']")
    WebElement MobileOverRideReason;
    @FindBy(xpath = "//img[@id='toolactions_SAVE-tbb_image']")
    WebElement Savebutton;
    @FindBy(xpath = "//button[@id='m37917b04-pb']")
    WebElement OKbutton;
   // @FindBy(xpath = "//img[@id='ROUTEWF_MEUWO_-tbb_image']")
    @FindBy(xpath = "//img[@role='button' and @alt='Route Workflow']")
    WebElement WorkflowButton;
    @FindBy(xpath = "//input[@id='mad3161b5-tb2']")
    WebElement LongDescription;
    @FindBy(css = "#m1e2cbe37-tb")
    WebElement DocumentcheckStatus;
    @FindBy(xpath = "//input[@id='m5cd7ac0f-tb']")
    WebElement VendorField;

    public WorkOrderPage() {
        PageFactory.initElements(driver, this);

    }

    public void ClickonWorkTab() {
        //WorkTab.click();
    }

    public void ClickonExpandWorkOrder() {
        ExpandWorkOrderList.click();
    }

    /*public static String CopyWorkOrderNumber() {
        WorkOrderNumber = WOnumber.getText();
        System.out.println(WorkOrderNumber);

        return WorkOrderNumber;*/
    public static String CopyWorkOrderNumber() throws IOException {
        WorkOrderNumber = WOnumber.getAttribute("value");
        System.out.println("WorkOrderNumber is :" + WorkOrderNumber);
        File FC = new File("C:\\Users\\dmarella\\IdeaProjects\\UAT-Workflows\\WO.txt");
        FC.createNewFile();
        // Writing in to File
        FileWriter FW = new FileWriter("C:\\Users\\dmarella\\IdeaProjects\\UAT-Workflows\\WO.txt");
        BufferedWriter BW = new BufferedWriter(FW);
        BW.write(WorkOrderNumber); // Writing In To File.
        BW.close();
        return WorkOrderNumber;

    }

    public void readWorkOrderNumber() throws IOException {
       /* FileReader FR = new FileReader(WOFILE);
        BufferedReader BR = new BufferedReader(FR);
        String Content = "";
       // while ((Content = BR.readLine()) != null);
        System.out.println("wo"+FR);*/
        System.out.println(WorkOrderNumber);
    }

    public static void searchWO(String[] args) {
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.elementToBeClickable(WorkOrderField)).sendKeys(WorkOrderNumber);


    }
    public static void entertheWorkOrderNumber(String[] args){
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.elementToBeClickable(BillBatchWorkOderField)).sendKeys(WorkOrderNumber);
    }

    public static void searchandClickonWO(String[] args) {
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.elementToBeClickable(WOfield)).sendKeys(WorkOrderNumber);
        WOsearchButton.click();
        ClickonWOlink.click();

    }

    public void enterLongDescription() {
        LongDescription.click();
        LongDescription.sendKeys("TEST");
    }

    public void enterActualStartDate() throws InterruptedException {
        ActualStartDateField.clear();
        Actions actions = new Actions(driver);
        actions.sendKeys(ActualStartDateField, "5/1/2020 03:00 PM").perform();
       /*String val = "5/1/2020 03:00 PM";
        WebElement element = ActualStartDateField;
        element.clear();
        for (int i = 0; i < val.length(); i++) {
            char c = val.charAt(i);
            String s = new StringBuilder().append(c).toString();
            element.sendKeys(s);*/
    }

    public void enterActualFinishDate() throws InterruptedException {
        ActualFinishDateField.clear();
        Actions actions = new Actions(driver);
        actions.sendKeys(ActualFinishDateField, "5/1/2020 03:30 PM").perform();

       /* String val1 = "5/1/2020 03:30 PM";
        WebElement element1 = ActualFinishDateField;
        element1.clear();

        for (int i = 0; i < val1.length(); i++){
            char c = val1.charAt(i);
            String s = new StringBuilder().append(c).toString();
            element1.sendKeys(s);*/
    }

    public void checkMobileOverRideCheckbox() {
        if (!MobileOverRideCheckbox.isSelected())
            MobileOverRideCheckbox.click();
    }

    public void entertheMobileOverrideReason() {
        MobileOverRideReason.click();
        MobileOverRideReason.sendKeys("Testing");
    }

    public void clickonSavebutton() {
        //Savebutton.click();
        WebElement element = Savebutton;
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);
    }

    public void clickonOKbutton() throws InterruptedException {
        Thread.sleep(1000);
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.elementToBeClickable(OKbutton)).click();
    }

    public void clickonWorkflowButton() throws InterruptedException {
        Thread.sleep(2000);
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.elementToBeClickable(WorkflowButton)).click();

    }

    public void enterDocumentRequired() throws InterruptedException {
        Thread.sleep(2000);
        String status = "COMPLETE";
        WebElement element = DocumentcheckStatus;
        element.clear();
        for (int i = 0; i < status.length(); i++) {
            char c = status.charAt(i);
            String s = new StringBuilder().append(c).toString();
            element.sendKeys(s);
            Thread.sleep(1000);

        }
    }

    public void searchandClickonPOWO() {
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.elementToBeClickable(WOfield)).sendKeys(WorkOrderNumber);
        WOsearchButton.click();
        ClickonWOlink.click();
    }

    public  void AddVendorDetails() throws InterruptedException {
        Thread.sleep(3000);
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.elementToBeClickable(VendorField)).sendKeys("V1002136");
    }

    public  void ClickonCloseButton() throws InterruptedException {
        driver.navigate().refresh();
        driver.switchTo().alert().accept();
        Thread.sleep(5000);
    }
}







