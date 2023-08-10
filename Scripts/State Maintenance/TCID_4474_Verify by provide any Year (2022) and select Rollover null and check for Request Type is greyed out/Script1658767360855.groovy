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

WebUI.verifyElementPresent(findTestObject('0. State Maintenance/Link_CA'), 15)

WebUI.click(findTestObject('0. State Maintenance/Link_CA'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('0. State Maintenance/Heading_TrackTaxRate'), 10)

WebUI.verifyElementPresent(findTestObject('0. State Maintenance/Heading_ProposedTaxRate'), 10)

WebUI.verifyElementPresent(findTestObject('0. State Maintenance/Heading_IsEntry'), 10)

WebUI.verifyElementPresent(findTestObject('0. State Maintenance/Heading_HasTaxDistrict'), 10)

WebUI.verifyElementPresent(findTestObject('0. State Maintenance/Heading_DefaultRateFormat'), 10)

WebUI.verifyElementPresent(findTestObject('0. State Maintenance/Heading_ConsitentDueDates'), 10)

WebUI.verifyElementPresent(findTestObject('0. State Maintenance/Tab_Rollover'), 10)

WebUI.click(findTestObject('0. State Maintenance/Tab_Rollover'))

WebUI.verifyElementPresent(findTestObject('0. State Maintenance/Tab_Rollover_Heading'), 10)

WebUI.verifyElementPresent(findTestObject('0. State Maintenance/Label_Copy_From_Year'), 10)

WebUI.verifyElementPresent(findTestObject('0. State Maintenance/Label_Rollover_Item'), 10)

WebUI.verifyElementPresent(findTestObject('0. State Maintenance/Label_Copy_From_Request_Type'), 10)

WebUI.verifyElementPresent(findTestObject('0. State Maintenance/Rollover_button_Submit'), 10)

WebUI.verifyElementNotClickable(findTestObject('0. State Maintenance/Rollover_button_Submit'))

WebUI.verifyElementPresent(findTestObject('0. State Maintenance/Copy_From_Year_Textbox'), 10)

WebUI.sendKeys(findTestObject('0. State Maintenance/Copy_From_Year_Textbox'), Keys.chord(Keys.CONTROL, 'A'))

WebUI.sendKeys(findTestObject('0. State Maintenance/Copy_From_Year_Textbox'), '2022')

WebUI.sendKeys(findTestObject('0. State Maintenance/Copy_From_Year_Textbox'), Keys.chord(Keys.ENTER))

WebUI.verifyElementPresent(findTestObject('0. State Maintenance/Rollover_dropdownlist'), 10)

WebUI.click(findTestObject('0. State Maintenance/Rollover_dropdownlist'))

WebUI.selectOptionByValue(findTestObject('0. State Maintenance/Rollover_dropdownlist'), '1', false)

WebUI.click(findTestObject('0. State Maintenance/Rollover_dropdownlist'))

WebUI.selectOptionByValue(findTestObject('0. State Maintenance/Rollover_dropdownlist'), '2', false)

WebUI.click(findTestObject('0. State Maintenance/Rollover_dropdownlist'))

WebUI.selectOptionByValue(findTestObject('0. State Maintenance/Rollover_dropdownlist'), '3', false)

WebUI.click(findTestObject('0. State Maintenance/Rollover_dropdownlist'))

WebUI.selectOptionByLabel(findTestObject('0. State Maintenance/Rollover_NullValue'), '', false)

WebUI.verifyElementPresent(findTestObject('0. State Maintenance/Rollover_button_Submit'), 10)

WebUI.closeBrowser()

