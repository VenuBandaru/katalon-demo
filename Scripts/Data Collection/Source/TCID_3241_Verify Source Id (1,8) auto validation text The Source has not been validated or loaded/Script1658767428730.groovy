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

WebUI.verifyElementPresent(findTestObject('7. Data Collection/DataCollection_Module'), 10)

WebUI.click(findTestObject('7. Data Collection/DataCollection_Module'))

WebUI.verifyElementPresent(findTestObject('7. Data Collection/Sub_Source'), 10)

WebUI.click(findTestObject('7. Data Collection/Sub_Source'))

WebUI.verifyElementPresent(findTestObject('7. Data Collection/Sec_SourceList_Heading'), 10)

WebUI.verifyElementPresent(findTestObject('7. Data Collection/Source/Label_Year'), 10)

WebUI.verifyElementPresent(findTestObject('7. Data Collection/Source/label_State(Optional)'), 10)

WebUI.verifyElementPresent(findTestObject('7. Data Collection/Source/label_SourceStatus'), 10)

WebUI.verifyElementPresent(findTestObject('7. Data Collection/Source/Label_SourceTypes'), 10)

WebUI.verifyElementPresent(findTestObject('7. Data Collection/Source/label_RollStatus'), 10)

WebUI.verifyElementPresent(findTestObject('7. Data Collection/Source/Textbox_Year'), 10)

WebUI.sendKeys(findTestObject('7. Data Collection/Source/Textbox_Year'), Keys.chord(Keys.CONTROL, 'A'))

WebUI.sendKeys(findTestObject('7. Data Collection/Source/Textbox_Year'), '2017')

WebUI.sendKeys(findTestObject('7. Data Collection/Source/Textbox_Year'), Keys.chord(Keys.ENTER))

WebUI.verifyElementPresent(findTestObject('7. Data Collection/Source/Textbox_StateOptional'), 15)

WebUI.selectOptionByValue(findTestObject('7. Data Collection/Source/Textbox_StateOptional'), '23', false)

WebUI.verifyElementPresent(findTestObject('7. Data Collection/Source/Textbox_SourceStatus'), 15)

WebUI.selectOptionByValue(findTestObject('7. Data Collection/Source/Textbox_SourceStatus'), '7', false)

WebUI.verifyElementPresent(findTestObject('7. Data Collection/Source/Textbox_SourceTypes'), 10)

WebUI.selectOptionByValue(findTestObject('7. Data Collection/Source/Textbox_SourceTypes'), '8', false)

WebUI.verifyElementPresent(findTestObject('7. Data Collection/Source/label_RollStatus'), 10)

WebUI.selectOptionByValue(findTestObject('7. Data Collection/Source/Textbox_RollStatus'), '2', false)

WebUI.verifyElementPresent(findTestObject('7. Data Collection/Source/Source_bnnSubmit'), 10)

WebUI.click(findTestObject('7. Data Collection/Source/Source_bnnSubmit'))

WebUI.verifyElementPresent(findTestObject('7. Data Collection/Source/Source_GridFirstRow'), 15)

WebUI.click(findTestObject('5. Data Tasks/Source_GridFIrstRow_MN'))

WebUI.verifyElementPresent(findTestObject('7. Data Collection/Source/Heading_SourceEdit'), 15)

WebUI.verifyElementPresent(findTestObject('7. Data Collection/Source/Subheading_Validation'), 10)

WebUI.verifyElementPresent(findTestObject('7. Data Collection/Source/Validation_loadedMessage'), 10)

WebUI.verifyElementText(findTestObject('7. Data Collection/Source/Validation_loadedMessage'), 'This source can not and will not be validated.')

WebUI.verifyElementPresent(findTestObject('7. Data Collection/Source/Heading_Staging'), 10)

WebUI.verifyElementPresent(findTestObject('7. Data Collection/Source/Staging_Message'), 10)

WebUI.verifyElementText(findTestObject('7. Data Collection/Source/Staging_Message'), 'This source has not yet staged.')

WebUI.closeBrowser()

