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

WebUI.waitForElementPresent(findTestObject('7. Data Collection/Sub_WebParser'), 15)

WebUI.click(findTestObject('7. Data Collection/Sub_WebParser'))

WebUI.verifyElementPresent(findTestObject('7. Data Collection/Sec_WebParserList_Heading'), 10)

WebUI.verifyElementPresent(findTestObject('7. Data Collection/WebScrape_SourceType'), 10)

WebUI.verifyElementPresent(findTestObject('7. Data Collection/WebScrape_SourceType_ddl'), 10)

WebUI.selectOptionByValue(findTestObject('7. Data Collection/WebScrape_SourceType_ddl'), '1', false)

WebUI.verifyElementPresent(findTestObject('7. Data Collection/WebScrape_State(Optional)'), 10)

WebUI.selectOptionByValue(findTestObject('7. Data Collection/WebScrape_State(Optional)_ddl'), '43', false)

WebUI.verifyElementPresent(findTestObject('7. Data Collection/WebScrape_State(Optional)'), 10)

WebUI.verifyElementPresent(findTestObject('7. Data Collection/Source/WebScrape_Entity(Optional)'), 10)

WebUI.verifyElementPresent(findTestObject('7. Data Collection/Source/WebScrape_Entity(Optional)'), 10)

WebUI.verifyElementPresent(findTestObject('7. Data Collection/WebScrape_ShowInactiveWorkspaces'), 10)

WebUI.verifyElementPresent(findTestObject('7. Data Collection/WebScrape_Checkbox'), 10)

WebUI.check(findTestObject('7. Data Collection/WebScrape_Checkbox'))

WebUI.verifyElementPresent(findTestObject('7. Data Collection/WebScrape_Submit'), 10)

WebUI.click(findTestObject('7. Data Collection/WebScrape_Submit'))

WebUI.verifyElementPresent(findTestObject('7. Data Collection/WebPraser_Grid_Heading'), 10)

WebUI.verifyElementPresent(findTestObject('7. Data Collection/Source/WebParser_Grid_Entity_txtbox'), 10)

WebUI.sendKeys(findTestObject('7. Data Collection/Source/WebParser_Grid_Entity_txtbox'), Keys.chord(Keys.CONTROL, 'A'))

WebUI.sendKeys(findTestObject('7. Data Collection/Source/WebParser_Grid_Entity_txtbox'), 'P&A Mineral')

WebUI.sendKeys(findTestObject('7. Data Collection/Source/WebParser_Grid_Entity_txtbox'), Keys.chord(Keys.ENTER))

WebUI.verifyElementPresent(findTestObject('7. Data Collection/WebParser_Grid_Record1'), 10)

WebUI.closeBrowser()

