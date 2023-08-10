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

WebUI.verifyElementPresent(findTestObject('7. Data Collection/LM_Label_State'), 10)

WebUI.waitForElementPresent(findTestObject('7. Data Collection/LM_dd_State'), 12)

WebUI.selectOptionByLabel(findTestObject('7. Data Collection/LM_dd_State'), StateName, false)

WebUI.verifyElementPresent(findTestObject('1. Login Page/PtxTech_Logo'), 10)

WebUI.verifyElementPresent(findTestObject('7. Data Collection/Sec_LoadMap_Heading'), 12)

WebUI.verifyElementPresent(findTestObject('7. Data Collection/LM_Label_LoadMap'), 10)

WebUI.verifyElementPresent(findTestObject('7. Data Collection/LM_dd_LoadMap'), 12)

WebUI.selectOptionByLabel(findTestObject('7. Data Collection/LM_dd_LoadMap'), LoadMapName, false)

WebUI.verifyElementPresent(findTestObject('7. Data Collection/LM_btn_Submit'), 12)

WebUI.click(findTestObject('7. Data Collection/LM_btn_Submit'))

WebUI.verifyElementPresent(findTestObject('7. Data Collection/Heading_LoadMapStageTable'), 10)

WebUI.verifyElementPresent(findTestObject('7. Data Collection/Label_Stg_Table_Name'), 10)

WebUI.verifyElementPresent(findTestObject('7. Data Collection/Label_File_Name_Regex'), 10)

WebUI.verifyElementPresent(findTestObject('7. Data Collection/Label_Juris_Column'), 10)

WebUI.verifyElementPresent(findTestObject('7. Data Collection/Label_Year_COlumn'), 10)

WebUI.verifyElementPresent(findTestObject('7. Data Collection/Label_Prior_Check'), 10)

WebUI.verifyElementPresent(findTestObject('7. Data Collection/Row1_PriorCheck_Checkbox'), 10)

WebUI.verifyElementPresent(findTestObject('7. Data Collection/Label_VerifyEnabled'), 10)

WebUI.click(findTestObject('7. Data Collection/Checkbox_VerifyEnabled'), FailureHandling.STOP_ON_FAILURE)

'Load Map Setup\r\nUsers can either create a new load map or use the existing load map and update the configuration to\r\nallow auto-validation. Please consult with the product team for best practices.\r\nNote that the user has to click "save all"to reflect the changes in DB (except for the sync functionality in\r\nLoad Map Stg Table column)\r\nAfter the user confirms that everything is set up correctly, user wants to select the "Verify Enabled"to\r\nenable this load map to be used in auto-validation\r'
WebUI.verifyElementPresent(findTestObject('7. Data Collection/LM_btn_SaveAll'), 10)

WebUI.click(findTestObject('7. Data Collection/LM_btn_SaveAll'))

'Load Map Setup\r\nUsers can either create a new load map or use the existing load map and update the configuration to\r\nallow auto-validation. Please consult with the product team for best practices.\r\nNote that the user has to click "save all"to reflect the changes in DB (except for the sync functionality in\r\nLoad Map Stg Table column)\r\nAfter the user confirms that everything is set up correctly, user wants to select the "Verify Enabled"to\r\nenable this load map to be used in auto-validation\r'
WebUI.verifyElementPresent(findTestObject('7. Data Collection/SecHeading_SourceTemplateLoadMap'), 15)

WebUI.verifyElementPresent(findTestObject('7. Data Collection/Visit Loader Config'), 10)

WebUI.click(findTestObject('7. Data Collection/Visit Loader Config'))

WebUI.switchToWindowIndex(1)

WebUI.waitForElementVisible(findTestObject('1. Login Page/UserName_Email'), 30)

WebUI.sendKeys(findTestObject('1. Login Page/UserName_Email'), Keys.chord(Keys.CONTROL, 'A'))

WebUI.sendKeys(findTestObject('1. Login Page/UserName_Email'), 'venu.bandaru@ryan.com')

WebUI.waitForElementPresent(findTestObject('Landing Page/Button_NEXT'), 10)

WebUI.click(findTestObject('Landing Page/Button_NEXT'))

WebUI.waitForElementPresent(findTestObject('Landing Page/Organization_SignIn_Page'), 50)

WebUI.waitForElementPresent(findTestObject('Loader Config Page/RunTest'), 30)

WebUI.waitForElementPresent(findTestObject('Loader Config Page/Plus Add'), 10)

WebUI.click(findTestObject('Manage Views/btn_ManageViews'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Manage Views/Loading_Custom_View'), 30)

WebUI.verifyElementPresent(findTestObject('Manage Views/heading_Views'), 30)

WebUI.verifyElementPresent(findTestObject('Manage Views/ColumnHeading_ViewName'), 30)

WebUI.verifyElementPresent(findTestObject('Manage Views/ColumnHeading_Query'), 30)

WebUI.verifyElementPresent(findTestObject('Manage Views/ColumnHeading_Actions'), 30)

WebUI.verifyElementPresent(findTestObject('Manage Views/btn_AddView'), 30)

WebUI.click(findTestObject('Manage Views/btn_AddView'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Manage Views/Heading_AddCustomView'), 30)

WebUI.verifyElementPresent(findTestObject('Manage Views/Label_ViewName'), 30)

WebUI.verifyElementPresent(findTestObject('Manage Views/Label_Query'), 30)

WebUI.verifyElementPresent(findTestObject('Manage Views/textbox_ViewName'), 30)

WebUI.click(findTestObject('Manage Views/textbox_ViewName'))

WebUI.sendKeys(findTestObject('Manage Views/textbox_ViewName'), Keys.chord(Keys.CONTROL, 'A'))

WebUI.sendKeys(findTestObject('Manage Views/textbox_ViewName'), 'Test_View1')

WebUI.verifyElementPresent(findTestObject('Manage Views/textbox_Query'), 30)

WebUI.click(findTestObject('Manage Views/textbox_Query'))

WebUI.sendKeys(findTestObject('Manage Views/textbox_Query'), Keys.chord(Keys.CONTROL, 'A'))

WebUI.sendKeys(findTestObject('Manage Views/textbox_Query'), 'Test Query1')

WebUI.verifyElementPresent(findTestObject('Manage Views/btn_CANCEL'), 30)

WebUI.verifyElementPresent(findTestObject('Manage Views/btn_ADD'), 30)

WebUI.click(findTestObject('Manage Views/btn_ADD'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Manage Views/heading_Views'), 30)

WebUI.verifyElementPresent(findTestObject('Manage Views/ColumnHeading_ViewName'), 30)

WebUI.verifyElementPresent(findTestObject('Manage Views/TestView_1'), 30)

WebUI.verifyElementPresent(findTestObject('Manage Views/Delete_Test_View1_Record'), 30)

WebUI.verifyElementPresent(findTestObject('Manage Views/btn_Edit'), 30)

WebUI.verifyElementPresent(findTestObject('Manage Views/btn_Delete'), 30)

WebUI.click(findTestObject('Manage Views/Delete_Test_View1_Record'))

WebUI.verifyElementPresent(findTestObject('Manage Views/Delete_header_Test_View1'), 30)

WebUI.verifyElementPresent(findTestObject('Manage Views/Description_Test_View1'), 30)

WebUI.verifyElementPresent(findTestObject('Manage Views/Delete_TestView1_YES'), 30)

WebUI.click(findTestObject('Manage Views/Delete_TestView1_YES'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementNotPresent(findTestObject('Manage Views/TestView_1'), 30)

WebUI.verifyElementPresent(findTestObject('Manage Views/heading_Views'), 30)

WebUI.verifyElementPresent(findTestObject('Manage Views/ColumnHeading_ViewName'), 30)

WebUI.verifyElementPresent(findTestObject('Manage Views/ColumnHeading_Query'), 30)

WebUI.verifyElementPresent(findTestObject('Manage Views/ColumnHeading_Actions'), 30)

WebUI.verifyElementPresent(findTestObject('Manage Views/btn_AddView'), 30)

WebUI.closeBrowser()

