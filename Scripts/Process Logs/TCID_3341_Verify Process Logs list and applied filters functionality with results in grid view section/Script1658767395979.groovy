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

WebUI.callTestCase(findTestCase('Login Page/LoginTestPage'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('13. Process Logs/ProcessLogs_Module'), 10)

WebUI.click(findTestObject('13. Process Logs/ProcessLogs_Module'))

WebUI.verifyElementPresent(findTestObject('13. Process Logs/Sec_ProcessList_Heading'), 10)

WebUI.verifyElementPresent(findTestObject('13. Process Logs/Label_Process_Optional'), 10)

WebUI.verifyElementPresent(findTestObject('13. Process Logs/Label_FromDate'), 10)

WebUI.verifyElementPresent(findTestObject('13. Process Logs/Label_ToDate'), 10)

WebUI.verifyElementPresent(findTestObject('13. Process Logs/btn_Submit'), 10)

WebUI.verifyElementPresent(findTestObject('13. Process Logs/Sec_Heading_Logs'), 10)

WebUI.click(findTestObject('13. Process Logs/Process_Optional_TBox'))

WebUI.sendKeys(findTestObject('13. Process Logs/Process_Optional_TBox'), Keys.chord(Keys.CONTROL, 'A'))

WebUI.sendKeys(findTestObject('13. Process Logs/Process_Optional_TBox'), 'AutoValidation')

WebUI.sendKeys(findTestObject('13. Process Logs/Process_Optional_TBox'), Keys.chord(Keys.ENTER))

WebUI.sendKeys(findTestObject('13. Process Logs/ToDate_TBox'), Keys.chord(Keys.CONTROL, 'A'))

WebUI.sendKeys(findTestObject('13. Process Logs/ToDate_TBox'), '01/30/2022')

WebUI.sendKeys(findTestObject('13. Process Logs/FromDate_TBox'), Keys.chord(Keys.CONTROL, 'A'))

WebUI.sendKeys(findTestObject('13. Process Logs/FromDate_TBox'), '11/12/2021')

WebUI.click(findTestObject('13. Process Logs/btn_Submit'))

WebUI.waitForElementPresent(findTestObject('13. Process Logs/GV_ResultRow1_Column1'), 60)

WebUI.waitForElementPresent(findTestObject('13. Process Logs/GV_ResultRow1_Column2'), 60)

WebUI.waitForElementPresent(findTestObject('13. Process Logs/GV_ResultRow1_Column3'), 60)

WebUI.waitForElementVisible(findTestObject('13. Process Logs/GV_ResultRow1_Column4'), 20)

WebUI.waitForElementVisible(findTestObject('13. Process Logs/GV_ResultRow1_Column5'), 20)

WebUI.waitForElementVisible(findTestObject('13. Process Logs/GV_ResultRow1_Column6'), 20)

WebUI.closeBrowser()

