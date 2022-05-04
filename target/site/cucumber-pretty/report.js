$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("UATworkflowsTest/UAT5-Flow6[Reject a Quote].feature");
formatter.feature({
  "line": 2,
  "name": "UAT_Workflow",
  "description": "",
  "id": "uat-workflow",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@UAT5-Flow6"
    }
  ]
});
formatter.scenario({
  "comments": [
    {
      "line": 3,
      "value": "#Notes: E2E scenario covered  , Need to write coding for reject checkbox"
    }
  ],
  "line": 4,
  "name": "Creating an new ServiceRequest",
  "description": "",
  "id": "uat-workflow;creating-an-new-servicerequest",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user log in to Maximo System",
  "keyword": "Given "
});
formatter.step({
  "comments": [
    {
      "line": 6,
      "value": "#Given user log in to PreProduction Maximo System"
    }
  ],
  "line": 7,
  "name": "user clicks on \u0027GOTO\u0027 button",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user clicks on \u0027Service Desk\u0027 link",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user clicks on \u0027Service Requests(SP)\u0027 link",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user navigated to \u0027Service Requests(SP)\u0027 page",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user clicks on plus button to create a new Service Request form",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user fill the new Service Request form",
  "rows": [
    {
      "cells": [
        "Name",
        "Customer",
        "Location",
        "summary",
        "classification",
        "details",
        "reportedByPhone",
        "reportedByEmail",
        "customerReference",
        "customerReference2"
      ],
      "line": 13
    },
    {
      "cells": [
        "UAT Tester",
        "C1000011",
        "L1001455",
        "UAT session5 -test5",
        "QUOTE \\ FABRIC \\ QUOTE2",
        "Test6",
        "012345852132",
        "uattest@email.com",
        "123",
        "7345"
      ],
      "line": 14
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "user clicks on \u0027Save ServiceRequest\u0027 button",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "user verifies the status of the newly created ServiceRequest",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "user copy the SR Number",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.user_log_in_to_Maximo_System()"
});
formatter.result({
  "duration": 8867765203,
  "status": "passed"
});
formatter.match({
  "location": "ServiceRequestCreationSteps.user_clicks_on_GOTO_button()"
});
formatter.result({
  "duration": 1246891275,
  "status": "passed"
});
formatter.match({
  "location": "ServiceRequestCreationSteps.user_clicks_on_Service_Desk_link()"
});
formatter.result({
  "duration": 457109921,
  "status": "passed"
});
formatter.match({
  "location": "ServiceRequestCreationSteps.user_clicks_on_Service_Requests_SP_link()"
});
formatter.result({
  "duration": 77982339,
  "status": "passed"
});
formatter.match({
  "location": "ServiceRequestCreationSteps.user_navigated_to_Service_Requests_SP_page()"
});
formatter.result({
  "duration": 5054309,
  "status": "passed"
});
formatter.match({
  "location": "ServiceRequestCreationSteps.user_clicks_on_plus_button_to_create_a_new_Service_Request_form()"
});
formatter.result({
  "duration": 2844927548,
  "status": "passed"
});
formatter.match({
  "location": "ServiceRequestCreationSteps.userFillTheNewServiceRequestFormForQuote(DataTable)"
});
formatter.result({
  "duration": 11475384123,
  "status": "passed"
});
formatter.match({
  "location": "ServiceRequestCreationSteps.user_clicks_on_Save_ServiceRequest_button()"
});
formatter.result({
  "duration": 93190578,
  "status": "passed"
});
formatter.match({
  "location": "ServiceRequestCreationSteps.user_verifies_the_status_of_the_newly_created_ServiceRequest()"
});
formatter.result({
  "duration": 2542995424,
  "status": "passed"
});
formatter.match({
  "location": "ServiceRequestCreationSteps.userCopyTheSRNumber()"
});
formatter.result({
  "duration": 43075283,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "Creating an Quote",
  "description": "",
  "id": "uat-workflow;creating-an-quote",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 20,
  "name": "user Workflow the ServiceRequest to create the Quote",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "user verifies the status of the newly created Quote",
  "keyword": "And "
});
formatter.match({
  "location": "QuoteCreationSteps.user_Workflow_the_ServiceRequest_to_create_the_Quote()"
});
formatter.result({
  "duration": 3682154315,
  "status": "passed"
});
formatter.match({
  "location": "QuoteCreationSteps.user_verifies_the_status_of_the_newly_created_Quote()"
});
formatter.result({
  "duration": 1295254968,
  "status": "passed"
});
formatter.scenario({
  "line": 23,
  "name": "QM through Scoping",
  "description": "",
  "id": "uat-workflow;qm-through-scoping",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 24,
  "name": "user complete the QuoteManagment through Scoping",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "user Workflow the scoping section to Pricing section",
  "keyword": "And "
});
formatter.match({
  "location": "QuoteCreationSteps.userCompleteTheQuoteManagmentThroughScoping()"
});
formatter.result({
  "duration": 11128782567,
  "status": "passed"
});
formatter.match({
  "location": "QuoteCreationSteps.userWorkflowTheScopingSectionToPricingSection()"
});
formatter.result({
  "duration": 6476695842,
  "status": "passed"
});
formatter.scenario({
  "line": 27,
  "name": "Rejecting Quote",
  "description": "",
  "id": "uat-workflow;rejecting-quote",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 28,
  "name": "user complete the pricing section",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "user workflow the quote",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 30,
      "value": "# And user approve the quote"
    }
  ],
  "line": 31,
  "name": "user Reject the quote",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "user verifies the new quote closed status",
  "keyword": "And "
});
formatter.match({
  "location": "QuoteCreationSteps.userCompleteThePricingSection()"
});
formatter.result({
  "duration": 9873301307,
  "status": "passed"
});
formatter.match({
  "location": "QuoteCreationSteps.userWorkflowTheQuote()"
});
formatter.result({
  "duration": 2537038316,
  "status": "passed"
});
formatter.match({
  "location": "QuoteCreationSteps.userRejectTheQuote()"
});
formatter.result({
  "duration": 46321948866,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//input[@id\u003d\u0027m2f475f2c-rb\u0027 and @tabindex\u003d\u0027-1\u0027]\"}\n  (Session info: chrome\u003d89.0.4389.114)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027INT3244\u0027, ip: \u002710.206.36.160\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002713.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 89.0.4389.114, chrome: {chromedriverVersion: 89.0.4389.23 (61b08ee2c5002..., userDataDir: C:\\Users\\dmarella\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:59953}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 3e7df86a0460bf162a293362e6ac5b48\n*** Element info: {Using\u003dxpath, value\u003d//input[@id\u003d\u0027m2f475f2c-rb\u0027 and @tabindex\u003d\u0027-1\u0027]}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy19.getWrappedElement(Unknown Source)\r\n\tat org.openqa.selenium.remote.internal.WebElementToJsonConverter.apply(WebElementToJsonConverter.java:50)\r\n\tat java.base/java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:195)\r\n\tat java.base/java.util.Spliterators$ArraySpliterator.forEachRemaining(Spliterators.java:948)\r\n\tat java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:484)\r\n\tat java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)\r\n\tat java.base/java.util.stream.ReduceOps$ReduceOp.evaluateSequential(ReduceOps.java:913)\r\n\tat java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)\r\n\tat java.base/java.util.stream.ReferencePipeline.collect(ReferencePipeline.java:578)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.executeScript(RemoteWebDriver.java:484)\r\n\tat com.automationtest.pages.PricingPage.RejectQuote(PricingPage.java:219)\r\n\tat com.automation.stepDefinations.QuoteCreationSteps.userRejectTheQuote(QuoteCreationSteps.java:116)\r\n\tat ✽.And user Reject the quote(UATworkflowsTest/UAT5-Flow6[Reject a Quote].feature:31)\r\n",
  "status": "failed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});