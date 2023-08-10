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

WebUI.verifyElementPresent(findTestObject('9. Dataset Setup/Sub_Dataset_Upload'), 10)

WebUI.click(findTestObject('9. Dataset Setup/Sub_Dataset_Upload'))

WebUI.verifyElementPresent(findTestObject('9. Dataset Setup/Sec_DatasetList_Heading'), 30)

WebUI.verifyElementPresent(findTestObject('9. Dataset Setup/Label_Year'), 10)

WebUI.verifyElementPresent(findTestObject('9. Dataset Setup/Label_State'), 10)

WebUI.verifyElementPresent(findTestObject('9. Dataset Setup/Label_Assessors(Optional)'), 10)

WebUI.verifyElementPresent(findTestObject('9. Dataset Setup/Label_RollStatus(Optional)'), 10)

WebUI.verifyElementPresent(findTestObject('9. Dataset Setup/btn_Submit'), 10)

WebUI.verifyElementPresent(findTestObject('9. Dataset Setup/Plus_btn(NewDataset)'), 10)

WebUI.click(findTestObject('9. Dataset Setup/Plus_btn(NewDataset)'))

WebUI.verifyElementPresent(findTestObject('9. Dataset Setup/NewDataset_heading'), 15)

WebUI.verifyElementPresent(findTestObject('9. Dataset Setup/NDS_File_label'), 15)

WebUI.verifyElementPresent(findTestObject('9. Dataset Setup/NDS_Browse_btn'), 15)

WebUI.verifyElementPresent(findTestObject('9. Dataset Setup/NDS_Upload_btn'), 15)

WebUI.click(findTestObject('9. Dataset Setup/NDS_Upload_btn'), FailureHandling.STOP_ON_FAILURE)

String userDir = System.getProperty('user.dir')

String Upload = userDir + '\\Data Files\\SourceValidfile.zip'

WebUI.uploadFile(findTestObject('9. Dataset Setup/NDS_Browse_btn'), Upload)

WebUI.verifyElementPresent(findTestObject('9. Dataset Setup/NDS_Upload_btn'), 15)

WebUI.click(findTestObject('9. Dataset Setup/NDS_Upload_btn'))

WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('9. Dataset Setup/NDS_State_Label'), 30)

WebUI.verifyElementPresent(findTestObject('9. Dataset Setup/NDS_Assessor_label'), 20)

WebUI.verifyElementPresent(findTestObject('9. Dataset Setup/NDS_County_label'), 15)

WebUI.verifyElementPresent(findTestObject('9. Dataset Setup/NDS_Year_label'), 15)

WebUI.verifyElementPresent(findTestObject('9. Dataset Setup/NDS_Rollstatus_label'), 15)

WebUI.verifyElementPresent(findTestObject('9. Dataset Setup/NDS_Dataset_Type'), 15)

WebUI.verifyElementPresent(findTestObject('9. Dataset Setup/NDS_DatasetFilter_Label'), 10)

WebUI.verifyElementPresent(findTestObject('9. Dataset Setup/NDS_DatasetFormat_Label'), 10)

WebUI.verifyElementPresent(findTestObject('9. Dataset Setup/NDS_CreateDate_Label'), 10)

WebUI.verifyElementPresent(findTestObject('9. Dataset Setup/NDS_FilenameAppended_label'), 10)

WebUI.verifyElementPresent(findTestObject('9. Dataset Setup/NDS_Notes_label'), 10)

WebUI.verifyElementPresent(findTestObject('9. Dataset Setup/NDS_State_ddl'), 10)

WebUI.verifyElementPresent(findTestObject('9. Dataset Setup/NDS_Assessor_ddl'), 10)

WebUI.verifyElementPresent(findTestObject('9. Dataset Setup/NDS_County_ddl'), 10)

WebUI.verifyElementPresent(findTestObject('9. Dataset Setup/NDS_Year'), 10)

WebUI.verifyElementPresent(findTestObject('9. Dataset Setup/NDS_Rollstatus_ddl'), 10)

WebUI.verifyElementPresent(findTestObject('9. Dataset Setup/NDS_Datasetformat_ddl'), 10)

WebUI.verifyElementPresent(findTestObject('9. Dataset Setup/NDS_Datasettype_ddl'), 10)

WebUI.verifyElementPresent(findTestObject('9. Dataset Setup/NDS_Save_btn'), 10)

WebUI.click(findTestObject('9. Dataset Setup/NDS_Save_btn'))

WebUI.verifyElementPresent(findTestObject('9. Dataset Setup/NDS_errormessage_State'), 10)

WebUI.verifyElementPresent(findTestObject('9. Dataset Setup/NDS_errormessage_Assessor'), 10)

WebUI.verifyElementPresent(findTestObject('9. Dataset Setup/NDS_errormessage_County'), 10)

WebUI.verifyElementPresent(findTestObject('9. Dataset Setup/NDS_errormessage_Year'), 10)

WebUI.verifyElementPresent(findTestObject('9. Dataset Setup/NDS_errormessage_RollStatus'), 10)

WebUI.verifyElementPresent(findTestObject('9. Dataset Setup/NDS_errormessage_Datasetfilter'), 10)

WebUI.verifyElementPresent(findTestObject('9. Dataset Setup/NDS_errormessage_Datasetformat'), 10)

WebUI.verifyElementPresent(findTestObject('9. Dataset Setup/NDS_Save_btn'), 10)

WebUI.closeBrowser()

