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

WebUI.verifyElementPresent(findTestObject('9. Dataset Setup/DatasetSetup_Module'), 10)

WebUI.click(findTestObject('9. Dataset Setup/DatasetSetup_Module'))

WebUI.verifyElementPresent(findTestObject('9. Dataset Setup/Sub_CustomerAssignment'), 10)

WebUI.click(findTestObject('9. Dataset Setup/Sub_CustomerAssignment'))

WebUI.verifyElementPresent(findTestObject('9. Dataset Setup/Sec_DatasetList_Heading'), 30)

WebUI.verifyElementPresent(findTestObject('9. Dataset Setup/Label_Year'), 10)

WebUI.verifyElementPresent(findTestObject('9. Dataset Setup/Label_State'), 10)

WebUI.verifyElementPresent(findTestObject('9. Dataset Setup/Label_Assessors(Optional)'), 10)

WebUI.verifyElementPresent(findTestObject('9. Dataset Setup/Label_RollStatus(Optional)'), 10)

WebUI.verifyElementPresent(findTestObject('9. Dataset Setup/btn_Submit'), 10)

WebUI.verifyElementPresent(findTestObject('9. Dataset Setup/Toggle_Dropdown_AddNewCustomer'), 10)

WebUI.click(findTestObject('9. Dataset Setup/Toggle_Dropdown_AddNewCustomer'))

WebUI.verifyElementPresent(findTestObject('9. Dataset Setup/AddNew_dropdown'), 10)

WebUI.click(findTestObject('9. Dataset Setup/AddNew_dropdown'))

WebUI.verifyElementPresent(findTestObject('9. Dataset Setup/heading_NewCustomerDataset'), 10)

WebUI.verifyElementPresent(findTestObject('9. Dataset Setup/NCD_Customer'), 10)

WebUI.verifyElementPresent(findTestObject('9. Dataset Setup/NCD_State'), 10)

WebUI.verifyElementPresent(findTestObject('9. Dataset Setup/NCD_Assessor'), 10)

WebUI.verifyElementPresent(findTestObject('9. Dataset Setup/NCD_County'), 10)

WebUI.verifyElementPresent(findTestObject('9. Dataset Setup/NCD_AssessmentYear'), 10)

WebUI.verifyElementPresent(findTestObject('9. Dataset Setup/NCD_Rollstatus'), 10)

WebUI.verifyElementPresent(findTestObject('9. Dataset Setup/NCD_Datasettype'), 10)

WebUI.verifyElementPresent(findTestObject('9. Dataset Setup/NCD_Datasetfilter'), 10)

WebUI.verifyElementPresent(findTestObject('9. Dataset Setup/NCD_datasetfileformat'), 10)

WebUI.verifyElementPresent(findTestObject('9. Dataset Setup/heading_NewCustomerDataset'), 10)

WebUI.verifyElementPresent(findTestObject('9. Dataset Setup/NCD_Add_btn'), 10)

WebUI.click(findTestObject('9. Dataset Setup/NCD_Add_btn'))

WebUI.waitForElementPresent(findTestObject('9. Dataset Setup/ErrorMessage'), 20)

WebUI.closeBrowser()

