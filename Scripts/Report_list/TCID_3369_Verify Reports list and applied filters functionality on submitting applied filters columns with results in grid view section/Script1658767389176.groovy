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

WebUI.verifyElementPresent(findTestObject('12. Reports/Reports_Module'), 10)

WebUI.click(findTestObject('12. Reports/Reports_Module'))

WebUI.verifyElementPresent(findTestObject('12. Reports/Sec_ReportList_Heading'), 10)

WebUI.verifyElementPresent(findTestObject('12. Reports/Label_GroupOptional'), 10)

WebUI.verifyElementPresent(findTestObject('12. Reports/Label_AuthorOptional'), 10)

WebUI.verifyElementPresent(findTestObject('12. Reports/Label_WildcardSearch'), 10)

WebUI.click(findTestObject('12. Reports/GroupOptional_TBox'))

WebUI.click(findTestObject('12. Reports/dd_Group_DataTask'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('12. Reports/Author_Textbox'), 12)

WebUI.click(findTestObject('12. Reports/Author_Textbox'))

WebUI.click(findTestObject('12. Reports/dd_author_Textbox'))

WebUI.verifyElementPresent(findTestObject('12. Reports/btn_Submit'), 10)

WebUI.click(findTestObject('12. Reports/btn_Submit'))

WebUI.verifyElementPresent(findTestObject('12. Reports/GridColumn1'), 10)

WebUI.verifyElementPresent(findTestObject('12. Reports/GridColumn2'), 10)

WebUI.verifyElementPresent(findTestObject('12. Reports/GridColumn3'), 10)

WebUI.verifyElementPresent(findTestObject('12. Reports/GridColumn4'), 10)

WebUI.verifyElementPresent(findTestObject('12. Reports/GridColumn5'), 10)

WebUI.verifyElementPresent(findTestObject('12. Reports/GridRecord_Column1'), 10)

WebUI.verifyElementPresent(findTestObject('12. Reports/GridRecord_Column2'), 10)

WebUI.closeBrowser()

