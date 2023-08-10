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

WebUI.verifyElementPresent(findTestObject('10. Rates/Rates_Module'), 10)

WebUI.click(findTestObject('10. Rates/Rates_Module'))

WebUI.waitForElementPresent(findTestObject('10. Rates/Sub_ByJuris'), 15)

WebUI.doubleClick(findTestObject('10. Rates/Sub_ByJuris'))

WebUI.verifyElementPresent(findTestObject('10. Rates/Sec_RatesByJuris_Heading'), 12)

WebUI.verifyElementPresent(findTestObject('10. Rates/Assessor_Tab'), 12)

WebUI.verifyElementPresent(findTestObject('10. Rates/Collector_Tab'), 12)

WebUI.click(findTestObject('10. Rates/Collector_Tab'))

WebUI.verifyElementPresent(findTestObject('10. Rates/ddl_State'), 12)

WebUI.verifyElementPresent(findTestObject('10. Rates/ddl_selectAssessor'), 12)

WebUI.verifyElementPresent(findTestObject('10. Rates/txtbox_Year'), 12)

WebUI.verifyElementPresent(findTestObject('10. Rates/btn_Submit'), 12)

WebUI.click(findTestObject('10. Rates/btn_Submit'))

WebUI.verifyElementPresent(findTestObject('10. Rates/errormessage'), 12)

WebUI.closeBrowser()

