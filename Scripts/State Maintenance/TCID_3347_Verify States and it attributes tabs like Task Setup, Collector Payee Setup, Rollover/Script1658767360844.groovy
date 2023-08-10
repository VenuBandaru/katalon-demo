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

WebUI.verifyElementPresent(findTestObject('0. State Maintenance/StateMaintenance_Module'), 10)

WebUI.click(findTestObject('0. State Maintenance/StateMaintenance_Module'))

WebUI.verifyElementPresent(findTestObject('0. State Maintenance/Sec_StateMaintenance_Heading'), 10)

WebUI.verifyElementPresent(findTestObject('0. State Maintenance/Link_GA'), 15)

WebUI.click(findTestObject('0. State Maintenance/Link_GA'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('0. State Maintenance/Heading_TrackTaxRate'), 10)

WebUI.verifyElementPresent(findTestObject('0. State Maintenance/Heading_ProposedTaxRate'), 10)

WebUI.verifyElementPresent(findTestObject('0. State Maintenance/Heading_IsEntry'), 10)

WebUI.verifyElementPresent(findTestObject('0. State Maintenance/Heading_HasTaxDistrict'), 10)

WebUI.verifyElementPresent(findTestObject('0. State Maintenance/Heading_DefaultRateFormat'), 10)

WebUI.verifyElementPresent(findTestObject('0. State Maintenance/Heading_ConsitentDueDates'), 10)

WebUI.verifyElementPresent(findTestObject('0. State Maintenance/Tab_TaskSetup'), 10)

WebUI.click(findTestObject('0. State Maintenance/Tab_TaskSetup'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('0. State Maintenance/Tab_CollectorPayeeSetup'), 15)

WebUI.doubleClick(findTestObject('0. State Maintenance/Tab_CollectorPayeeSetup'))

WebUI.verifyElementPresent(findTestObject('0. State Maintenance/Tab_Rollover'), 15)

WebUI.doubleClick(findTestObject('0. State Maintenance/Tab_Rollover'))

WebUI.verifyElementPresent(findTestObject('0. State Maintenance/Tab_Rollover_Heading'), 15)

WebUI.closeBrowser()

