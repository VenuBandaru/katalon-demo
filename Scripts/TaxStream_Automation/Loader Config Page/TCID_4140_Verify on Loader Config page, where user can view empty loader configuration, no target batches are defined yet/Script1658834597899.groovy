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

WebUI.navigateToUrl(GlobalVariable.InvalidURL)

WebUI.waitForElementVisible(findTestObject('Landing Page/UserName_Email'), 30)

WebUI.sendKeys(findTestObject('Landing Page/UserName_Email'), Keys.chord(Keys.CONTROL, 'A'))

WebUI.sendKeys(findTestObject('Landing Page/UserName_Email'), 'venu.bandaru@ryan.com')

WebUI.waitForElementPresent(findTestObject('Landing Page/Button_NEXT'), 10)

WebUI.click(findTestObject('Landing Page/Button_NEXT'))

WebUI.waitForElementPresent(findTestObject('Landing Page/Organization_SignIn_Page'), 50)

WebUI.waitForElementVisible(findTestObject('Landing Page/Ryan_Logo'), 40)

WebUI.waitForElementPresent(findTestObject('Landing Page/HomePage_Tab'), 40)

WebUI.verifyElementText(findTestObject('Landing Page/HomePage_Tab'), Header_Home)

result = WebUI.waitForElementVisible(findTestObject('Landing Page/LoaderConfiglist_Tab'), 10)

WebUI.verifyElementText(findTestObject('Landing Page/LoaderConfiglist_Tab'), Header_LoaderConfigList)

WebUI.verifyElementClickable(findTestObject('Landing Page/HomePage_Tab'))

WebUI.waitForElementPresent(findTestObject('Landing Page/Tax_Stream_Tab'), 10)

WebUI.verifyElementText(findTestObject('Landing Page/Tax_Stream_Tab'), Header_TaxStream)

WebUI.verifyElementPresent(findTestObject('Loader Config Page/ViewVersions'), 10)

WebUI.verifyElementPresent(findTestObject('Loader Config Page/RunTest'), 10)

WebUI.verifyElementPresent(findTestObject('Loader Config Page/Plus Add'), 10)

WebUI.verifyElementText(findTestObject('Loader Config Page/EmptyLoaderConfiguration'), EmptyLoaderConfiguration)

WebUI.closeBrowser()

