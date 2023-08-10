import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('', FailureHandling.STOP_ON_FAILURE)

WebUI.maximizeWindow()

WebUI.navigateToUrl(findTestData('PTX_DataFiles/PTX_LoginCredentials').getValue(1, 1))

WebUI.waitForElementVisible(findTestObject('1. Login Page/PtxTech_Logo'), 10)

WebUI.waitForElementPresent(findTestObject('1. Login Page/Login_Button'), 10)

result = WebUI.waitForElementVisible(findTestObject('1. Login Page/Login_Header'), 10)

if (result) {
    WebUI.sendKeys(findTestObject('1. Login Page/Username_Textbox'), findTestData('PTX_DataFiles/PTX_LoginCredentials').getValue(
            2, 1))

    WebUI.setEncryptedText(findTestObject('1. Login Page/Password_Textbox'), findTestData('PTX_DataFiles/PTX_LoginCredentials').getValue(
            3, 1))

    WebUI.waitForElementPresent(findTestObject('1. Login Page/Login_Button'), 10)

    WebUI.click(findTestObject('1. Login Page/Login_Button'))

    WebUI.waitForElementVisible(findTestObject('1. Login Page/Ptxtechsideways_logo'), 15)

    WebUI.waitForElementVisible(findTestObject('1. Login Page/Dashboard Module'), 10)
}

