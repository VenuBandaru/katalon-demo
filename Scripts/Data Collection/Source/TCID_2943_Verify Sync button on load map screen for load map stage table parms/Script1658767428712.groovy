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

WebUI.waitForElementPresent(findTestObject('7. Data Collection/Sub_LoadMap'), 15)

WebUI.click(findTestObject('7. Data Collection/Sub_LoadMap'))

WebUI.verifyElementPresent(findTestObject('1. Login Page/PtxTech_Logo'), 10)

WebUI.verifyElementPresent(findTestObject('7. Data Collection/Sec_LoadMap_Heading'), 12)

WebUI.verifyElementPresent(findTestObject('7. Data Collection/LM_Label_State'), 10)

WebUI.waitForElementPresent(findTestObject('7. Data Collection/LM_dd_State'), 12)

WebUI.verifyElementPresent(findTestObject('7. Data Collection/LM_dd_LoadMap'), 12)

WebUI.verifyElementPresent(findTestObject('7. Data Collection/LM_Label_LoadMap'), 10)

WebUI.verifyElementPresent(findTestObject('7. Data Collection/LM_btn_SaveAll'), 10)

WebUI.verifyElementPresent(findTestObject('7. Data Collection/LM_btn_AddNewLoadMap'), 10)

WebUI.verifyElementPresent(findTestObject('7. Data Collection/LM_button_Submit'), 10)

WebUI.click(findTestObject('7. Data Collection/LM_button_Submit'))

WebUI.verifyElementPresent(findTestObject('7. Data Collection/LM_State_ValidationError'), 10)

WebUI.verifyElementPresent(findTestObject('7. Data Collection/LM_LoadMap_ValidationError'), 10)

WebUI.verifyElementPresent(findTestObject('7. Data Collection/LM_dd_State'), 12)

WebUI.click(findTestObject('7. Data Collection/LM_dd_State'))

WebUI.selectOptionByValue(findTestObject('7. Data Collection/LM_dd_State'), '43', false)

WebUI.waitForElementPresent(findTestObject('7. Data Collection/LM_dd_LoadMap'), 25)

not_run: WebUI.click(findTestObject('7. Data Collection/LM_dd_LoadMap'))

WebUI.selectOptionByValue(findTestObject('7. Data Collection/LM_dd_LoadMap'), '3', false)

WebUI.waitForElementPresent(findTestObject('7. Data Collection/LM_btn_Submit'), 15)

WebUI.click(findTestObject('7. Data Collection/LM_btn_Submit'))

WebUI.waitForElementPresent(findTestObject('7. Data Collection/heading_LoadMapStageTableParam'), 20)

WebUI.waitForElementPresent(findTestObject('7. Data Collection/btn_plus_QuickAdd'), 20)

WebUI.waitForElementPresent(findTestObject('7. Data Collection/btn_Plus'), 20)

WebUI.waitForElementPresent(findTestObject('7. Data Collection/Heading_LoadMapStageTable'), 15)

WebUI.waitForElementPresent(findTestObject('7. Data Collection/Label_Stg_Table_Name'), 15)

WebUI.waitForElementPresent(findTestObject('7. Data Collection/Stg_tablename_record1'), 15)

WebUI.click(findTestObject('7. Data Collection/Stg_tablename_record1'))

WebUI.switchToWindowIndex(1)

WebUI.waitForElementPresent(findTestObject('7. Data Collection/SecHeading_Assessor_Lookup_Heading'), 15)

WebUI.waitForElementPresent(findTestObject('7. Data Collection/Sync_button'), 15)

WebUI.waitForElementPresent(findTestObject('7. Data Collection/ALC_plusquickbutton'), 15)

WebUI.click(findTestObject('7. Data Collection/ALC_plusquickbutton'))

WebUI.waitForElementPresent(findTestObject('7. Data Collection/ALC_Label_DefaultCode'), 15)

WebUI.waitForElementPresent(findTestObject('7. Data Collection/ALC_Label_Description'), 15)

WebUI.closeBrowser()

