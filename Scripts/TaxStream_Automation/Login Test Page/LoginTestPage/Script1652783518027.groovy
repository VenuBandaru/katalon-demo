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

WebUI.navigateToUrl(GlobalVariable.URL_QA)

WebUI.waitForElementVisible(findTestObject('Landing Page/UserName_Email'), 30)

WebUI.sendKeys(findTestObject('Landing Page/UserName_Email'), Keys.chord(Keys.CONTROL, 'A'))

WebUI.sendKeys(findTestObject('Landing Page/UserName_Email'), 'venu.bandaru@ryan.com')

WebUI.waitForElementPresent(findTestObject('Landing Page/Button_NEXT'), 10)

WebUI.click(findTestObject('Landing Page/Button_NEXT'))

WebUI.waitForElementPresent(findTestObject('Landing Page/Organization_SignIn_Page'), 50)

WebUI.waitForElementVisible(findTestObject('Landing Page/Ryan_Logo'), 40)

WebUI.waitForElementPresent(findTestObject('Landing Page/HomePage_Tab'), 40)

