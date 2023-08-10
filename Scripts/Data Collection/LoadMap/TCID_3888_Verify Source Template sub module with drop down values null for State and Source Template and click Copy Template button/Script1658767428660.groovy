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

WebUI.verifyElementPresent(findTestObject('7. Data Collection/Sub_SourceTemplate'), 10)

WebUI.click(findTestObject('7. Data Collection/Sub_SourceTemplate'))

WebUI.verifyElementPresent(findTestObject('7. Data Collection/Sec_SourceTemplateTable_Heading'), 10)

WebUI.verifyElementPresent(findTestObject('7. Data Collection/SourceTemplate_State_Label'), 10)

WebUI.verifyElementPresent(findTestObject('7. Data Collection/Source/SourceTemplate_ST_Label'), 10)

WebUI.verifyElementPresent(findTestObject('7. Data Collection/SourceTempalteTable_SourceTemplate_ddl'), 10)

WebUI.verifyElementPresent(findTestObject('7. Data Collection/Source/SourceTemplate_ddl'), 10)

WebUI.verifyElementPresent(findTestObject('7. Data Collection/SourceTempalte_Submit'), 10)

WebUI.click(findTestObject('7. Data Collection/SourceTempalte_Submit'))

WebUI.verifyElementPresent(findTestObject('7. Data Collection/SourceTemplat_AlterStgTables_button'), 10)

WebUI.verifyElementPresent(findTestObject('7. Data Collection/SourceTemplate_CopyTemplate_btn'), 10)

WebUI.click(findTestObject('7. Data Collection/SourceTemplate_CopyTemplate_btn'))

WebUI.verifyElementPresent(findTestObject('7. Data Collection/CopyTempalte_heading'), 10)

WebUI.verifyElementPresent(findTestObject('7. Data Collection/Label_CopyTemplate_Name'), 10)

WebUI.verifyElementPresent(findTestObject('7. Data Collection/Label_CopyTemplate_Notes'), 10)

WebUI.verifyElementPresent(findTestObject('7. Data Collection/Label_CopyTempalte_SpecialProcessingClass'), 10)

WebUI.verifyElementPresent(findTestObject('7. Data Collection/txtbox_CopyTemplate_Name'), 10)

WebUI.verifyElementPresent(findTestObject('7. Data Collection/txtbox_CopyTemplate_Notes'), 10)

WebUI.verifyElementPresent(findTestObject('7. Data Collection/txtbox_CopyTemplate_SpecialProcessingClass'), 10)

WebUI.verifyElementPresent(findTestObject('7. Data Collection/CopyTempalte_btn_Submit'), 10)

WebUI.verifyElementPresent(findTestObject('7. Data Collection/CopyTempalte_btn_Cancel'), 10)

WebUI.click(findTestObject('7. Data Collection/CopyTempalte_btn_Submit'))

WebUI.verifyElementPresent(findTestObject('7. Data Collection/CopyTemplate_ErrorMessage'), 0)

WebUI.closeBrowser()

