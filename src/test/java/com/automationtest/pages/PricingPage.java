package com.automationtest.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PricingPage extends ForwardMainteananceRegisterPage {
    @FindBy(xpath = "//li[@id='ma58b6faf-tab']")
    WebElement PricingTab;
    @FindBy(xpath = "//img[@id='m4dc56a0-img']")
    WebElement QuoteTypeField;
    @FindBy(xpath = "//span[@id='lookup_page1_tdrow_[C:0]_ttxt-lb[R:0]']")
    WebElement Fixed;
    @FindBy(xpath = "//input[@id='m8248240e-tb']")
    WebElement ProposedStartDate;
    @FindBy(xpath = "//input[@id='mf54f1498-tb']")
    WebElement ProposedFinishDate;
    @FindBy(xpath = "//input[@id='m65f00909-tb']")
    WebElement ApprovalRequiredDate;
    @FindBy(xpath = "//input[@id='m1eb61c58-tb']")
    WebElement SubmitQuoteMemo;
    @FindBy(xpath = "//button[@id='m37917b04-pb']")
    WebElement okbutton;
    @FindBy(xpath = "//button[@id='m88dbf6ce-pb']")
    WebElement OK;
    @FindBy(xpath = "//*[@id='msgbox-co2_1']")
    WebElement QuoteWONumber;
    @FindBy(xpath = "//img[@title='Maximize Calculation Percentages Section']")
    WebElement CalculationPercentages;
    @FindBy(xpath = "//input[@id='m1d18e660-tb']")
    WebElement RiskPercentage;
    @FindBy(xpath = "//input[@id='m9b8c94ce-tb']")
    WebElement OverheadPercentage;
    @FindBy(xpath = "//input[@id='m50d0476b-tb']")
    WebElement ProfitPercentage;
    @FindBy(xpath = "//input[@id='md4dc2669-tb']")
    WebElement TaxPercentage;
    @FindBy(xpath = "//button[@id='m156a5014_bg_button_addrow-pb']")
    WebElement PricingNewrow;
    @FindBy(xpath = "//input[@id='m156a5014_tdrow_[C:0]_txt-tb[R:0]']")
    WebElement Year;
    @FindBy(xpath = "//input[@id='m156a5014_tdrow_[C:1]_txt-tb[R:0]']")
    WebElement PrelimCost;
    @FindBy(xpath = "//input[@id='m156a5014_tdrow_[C:2]_txt-tb[R:0]']")
    WebElement DesignCost;
    @FindBy(xpath = "//input[@id='m156a5014_tdrow_[C:3]_txt-tb[R:0]']")
    WebElement ContractorCost;
    @FindBy(xpath = "//input[@id='m156a5014_tdrow_[C:4]_txt-tb[R:0]']")
    WebElement InternalDeliveryCost;
    @FindBy(xpath = "//input[@id='m156a5014_tdrow_[C:5]_txt-tb[R:0]']")
    WebElement ProjectManagmentCost;
    @FindBy(xpath = "//*[@id='mc1493e00-rb']")
    WebElement PlaceonFMRbutton;
    @FindBy(xpath = "//*[@id='m1c2cb1ad-tb']")
    WebElement StatusField;
    @FindBy(xpath = "//input[@id='m2f475f2c-rb' and @tabindex='-1']")
    WebElement RejectQuote;
    @FindBy(xpath = "//*[@id='toolactions_SAVE-tbb_image']")
    WebElement SaveButton;


    ForwardMainteananceRegisterPage forwardMainteananceRegisterPage;
    public PricingPage() {
        PageFactory.initElements(driver, this);

    }

    public void ClickonPricingTab() throws InterruptedException {
        Thread.sleep(2000);
        Actions act = new Actions(driver);
        act.moveToElement(PricingTab).click().build().perform();
        Thread.sleep(2000);

    }

    public void FillthePricingSection() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.elementToBeClickable(QuoteTypeField));
        QuoteTypeField.click();
        WebDriverWait wait1 = new WebDriverWait(driver, 60);
        wait1.until(ExpectedConditions.elementToBeClickable(QuoteTypeField));
        Fixed.click();
        Thread.sleep(2000);

    }

    public void FilltheDates() throws InterruptedException {
       /* DateFormat dateFormat = new SimpleDateFormat("d/M/yy");
        Date date = new Date();
        String date1 = dateFormat.format(date);
        //System.out.println(date1);
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.elementToBeClickable(ProposedStartDate));
        Thread.sleep(1000);
        ProposedStartDate.sendKeys(date1);*/
       ProposedStartDate.sendKeys("26/08/21");
    }

    public void ApprovalRequiredDate() throws InterruptedException {
        /*DateFormat dateFormat = new SimpleDateFormat("d/M/yy");
        Date date = new Date();
        String date1 = dateFormat.format(date);
        WebDriverWait wait2 = new WebDriverWait(driver, 60);
        wait2.until(ExpectedConditions.elementToBeClickable(ApprovalRequiredDate));
        Thread.sleep(1000);
        ApprovalRequiredDate.sendKeys(date1);*/
        WebElement element = ApprovalRequiredDate;
        //element.clear();
        String ApprovalDate = "25/06/21";
        for (int i = 0; i < ApprovalDate.length(); i++) {
            char c = ApprovalDate.charAt(i);
            String s = new StringBuilder().append(c).toString();
            element.sendKeys(s);

        }
    }
    public void PropsedFinishDate() throws InterruptedException {
        /*DateFormat dateFormat = new SimpleDateFormat("d/M/yy");
        Date date = new Date();
        String date1 = dateFormat.format(date);
        WebDriverWait wait1 = new WebDriverWait(driver, 60);
        wait1.until(ExpectedConditions.elementToBeClickable(ProposedFinishDate));
        ProposedFinishDate.sendKeys(date1);*/
       ProposedFinishDate.sendKeys("01/09/21");
    }

    public void SubmitQuote() throws InterruptedException {
        Thread.sleep(1000);
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.elementToBeClickable(SubmitQuoteMemo));
        SubmitQuoteMemo.sendKeys("submit");
        okbutton.click();


    }

    public void ApproveQuote() {
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.elementToBeClickable(SubmitQuoteMemo));
        SubmitQuoteMemo.sendKeys("Approved");
        okbutton.click();

    }
    public void PlaceonFMR() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", PlaceonFMRbutton);
        PlaceonFMRbutton.click();
        SubmitQuoteMemo.sendKeys("Quote Move to FMR");
        okbutton.click();
        Thread.sleep(1000);
        OK.click();

    }


    public void CopyQuoteWorkOrderNumber() throws InterruptedException {
        Thread.sleep(2000);
        String QuoteWorkOrderNumber = QuoteWONumber.getText();
        System.out.println(QuoteWorkOrderNumber);
        String[] QuoteWorkOrderNumber1 = QuoteWorkOrderNumber.split(" ");
        String WONumber = QuoteWorkOrderNumber1[5];
        System.out.println("QuoteWorkOrderNumber is :" + WONumber);
        OK.click();

    }

    public void EnterCalculationPercentageDetails() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", CalculationPercentages);
        RiskPercentage.sendKeys("10.00");
        OverheadPercentage.sendKeys("10.00");
        ProfitPercentage.sendKeys("10.00");
        TaxPercentage.sendKeys("20.00");

    }

    public void EnterPricingDetials() throws InterruptedException {
        Thread.sleep(1000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", PricingNewrow);
        Thread.sleep(1000);
        Year.sendKeys("2020");
        PrelimCost.clear();
        PrelimCost.sendKeys("1234");
        DesignCost.clear();
        DesignCost.sendKeys("2134");
        Thread.sleep(1000);
        ContractorCost.clear();
        ContractorCost.sendKeys("45666");
        InternalDeliveryCost.clear();
        Thread.sleep(1000);
        InternalDeliveryCost.sendKeys("120");
        Thread.sleep(1000);
        ProjectManagmentCost.clear();
        ProjectManagmentCost.sendKeys("123548");

    }
    public void ClickonSave(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", SaveButton);
    }

    public void VerifytheFMRStatusClosed (){
       String Status = StatusField.getText();
       System.out.println(Status);
      //Assert.assertEquals(Status , " ");

    }


    public void RejectQuote() throws InterruptedException {
        /*List<WebElement> checkbox = (List<WebElement>) InputRadioButton;
        ((WebElement) checkbox.get(3)).click();*/
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", RejectQuote);
        RejectQuote.click();
        Thread.sleep(3000);
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.elementToBeClickable(SubmitQuoteMemo));
        SubmitQuoteMemo.sendKeys("Rejected");
        okbutton.click();
    }
}


