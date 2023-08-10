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

WebUI.click(findTestObject('7. Data Collection/Sub_Source'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('7. Data Collection/Sec_SourceList_Heading'), 10)

WebUI.verifyElementPresent(findTestObject('7. Data Collection/Source/Label_Year'), 10)

WebUI.verifyElementPresent(findTestObject('7. Data Collection/Source/label_State(Optional)'), 10)

WebUI.verifyElementPresent(findTestObject('7. Data Collection/Source/label_SourceStatus'), 10)

WebUI.verifyElementPresent(findTestObject('7. Data Collection/Source/Label_SourceTypes'), 10)

WebUI.verifyElementPresent(findTestObject('7. Data Collection/Source/label_RollStatus'), 10)

WebUI.verifyElementPresent(findTestObject('7. Data Collection/Source/Textbox_Year'), 10)

WebUI.verifyElementPresent(findTestObject('7. Data Collection/Source/Textbox_StateOptional'), 10)

WebUI.verifyElementPresent(findTestObject('7. Data Collection/Source/Textbox_SourceStatus'), 10)

WebUI.verifyElementPresent(findTestObject('7. Data Collection/Source/Textbox_SourceTypes'), 10)

WebUI.verifyElementPresent(findTestObject('7. Data Collection/Source/Textbox_RollStatus'), 10)

WebUI.clearText(findTestObject('7. Data Collection/Source/Textbox_Year'))

WebUI.click(findTestObject('7. Data Collection/Source/Source_bnnSubmit'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('7. Data Collection/Year_Textbox_ErrorMessage'), 10)

WebUI.closeBrowser()

