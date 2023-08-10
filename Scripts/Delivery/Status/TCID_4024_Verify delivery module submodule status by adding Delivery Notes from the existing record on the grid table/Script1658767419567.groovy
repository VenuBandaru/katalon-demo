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

WebUI.verifyElementPresent(findTestObject('8. Delivery/Delivery_Module'), 10)

WebUI.click(findTestObject('8. Delivery/Delivery_Module'))

WebUI.verifyElementPresent(findTestObject('8. Delivery/Sub_Status'), 10)

WebUI.click(findTestObject('8. Delivery/Sub_Status'))

WebUI.verifyElementPresent(findTestObject('8. Delivery/Sec_StatusList_Heading'), 10)

WebUI.verifyElementPresent(findTestObject('8. Delivery/Delivery_Year'), 10)

WebUI.verifyElementPresent(findTestObject('8. Delivery/Delivery_State(optional)'), 10)

WebUI.verifyElementPresent(findTestObject('8. Delivery/Delivery_RequestType'), 10)

WebUI.verifyElementPresent(findTestObject('8. Delivery/Delivery_Owner(optional)'), 10)

WebUI.verifyElementPresent(findTestObject('8. Delivery/Delivery_Customer(optional)'), 10)

WebUI.verifyElementPresent(findTestObject('8. Delivery/Delivery_Year_textbox'), 10)

WebUI.sendKeys(findTestObject('8. Delivery/Delivery_Year_textbox'), Keys.chord(Keys.CONTROL, 'A'))

WebUI.sendKeys(findTestObject('8. Delivery/Delivery_Year_textbox'), '2018')

WebUI.sendKeys(findTestObject('8. Delivery/Delivery_Year_textbox'), Keys.chord(Keys.ENTER))

WebUI.verifyElementPresent(findTestObject('8. Delivery/Delivery_State(optional)_ddl'), 10)

WebUI.selectOptionByValue(findTestObject('8. Delivery/Delivery_State(optional)_ddl'), '1', false)

WebUI.verifyElementPresent(findTestObject('8. Delivery/Delivery_RequestType_ddl'), 10)

WebUI.selectOptionByValue(findTestObject('8. Delivery/Delivery_RequestType_ddl'), '1', false)

WebUI.verifyElementPresent(findTestObject('8. Delivery/Delivery_Owner(optional)_ddl'), 10)

WebUI.selectOptionByValue(findTestObject('8. Delivery/Delivery_Owner(optional)_ddl'), '-1', false)

WebUI.verifyElementPresent(findTestObject('8. Delivery/Delivery_Customer(optional)_ddl'), 10)

WebUI.verifyElementPresent(findTestObject('8. Delivery/Refresh_btn'), 10)

WebUI.click(findTestObject('8. Delivery/Refresh_btn'))

WebUI.verifyElementPresent(findTestObject('8. Delivery/DeliveryNotes_Rec1'), 10)

WebUI.click(findTestObject('8. Delivery/DeliveryNotes_Rec1'))

WebUI.verifyElementPresent(findTestObject('8. Delivery/heading_deliverynotes'), 10)

WebUI.verifyElementPresent(findTestObject('8. Delivery/Add_notes_here'), 10)

WebUI.verifyElementPresent(findTestObject('8. Delivery/Add_btn_DeliveryNotes'), 10)

WebUI.click(findTestObject('8. Delivery/Add_btn_DeliveryNotes'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('8. Delivery/Errormessage'), 10)

WebUI.closeBrowser()

