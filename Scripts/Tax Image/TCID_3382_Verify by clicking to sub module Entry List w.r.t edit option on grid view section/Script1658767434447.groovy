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

WebUI.verifyElementPresent(findTestObject('6. Tax Image/TaxImage_Module'), 10)

WebUI.click(findTestObject('6. Tax Image/TaxImage_Module'))

WebUI.verifyElementPresent(findTestObject('6. Tax Image/Sub_Entrylist'), 10)

WebUI.click(findTestObject('6. Tax Image/Sub_Entrylist'))

WebUI.verifyElementPresent(findTestObject('6. Tax Image/Sec_Heading_TaxImageEntryList'), 12)

WebUI.verifyElementPresent(findTestObject('6. Tax Image/Grid_MainHeading'), 12)

WebUI.verifyElementPresent(findTestObject('6. Tax Image/Grid_Col_Year'), 10)

WebUI.verifyElementPresent(findTestObject('6. Tax Image/Grid_Col_State'), 10)

WebUI.verifyElementPresent(findTestObject('6. Tax Image/GirdCol_RequestType'), 10)

WebUI.verifyElementPresent(findTestObject('6. Tax Image/GridCol_Entity'), 10)

WebUI.verifyElementPresent(findTestObject('6. Tax Image/Grid_Col_ParcelCount'), 10)

WebUI.verifyElementPresent(findTestObject('6. Tax Image/Grid_Col_Customer'), 10)

WebUI.verifyElementPresent(findTestObject('6. Tax Image/Grid_Col_Notes'), 10)

WebUI.verifyElementPresent(findTestObject('6. Tax Image/GridCol_Uploaded'), 10)

WebUI.verifyElementPresent(findTestObject('6. Tax Image/Grid_Textbox1'), 10)

WebUI.verifyElementPresent(findTestObject('6. Tax Image/Grid_Textbox2'), 10)

WebUI.verifyElementPresent(findTestObject('6. Tax Image/Grid_Textbox3'), 10)

WebUI.verifyElementPresent(findTestObject('6. Tax Image/Grid_Textbox4'), 10)

WebUI.closeBrowser()

