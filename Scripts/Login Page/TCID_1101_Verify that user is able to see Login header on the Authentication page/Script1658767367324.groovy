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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.waitForElementVisible(findTestObject('1. Login Page/PtxTech_Logo'), 10)

WebUI.waitForElementVisible(findTestObject('1. Login Page/Login_Header'), 10)

WebUI.waitForElementVisible(findTestObject('1. Login Page/Username_Label'), 10)

WebUI.waitForElementVisible(findTestObject('1. Login Page/Password_Label'), 10)

WebUI.waitForElementVisible(findTestObject('1. Login Page/Remember_Me_Label'), 10)

WebUI.waitForElementPresent(findTestObject('1. Login Page/Login_Button'), 10)

WebUI.verifyElementClickable(findTestObject('1. Login Page/PtxTech_Logo'))

WebUI.waitForElementPresent(findTestObject('1. Login Page/Forgot_Password'), 10)

WebUI.closeBrowser()

