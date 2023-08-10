import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.support.events.EventFiringWebDriver as EventFiringWebDriver
import org.openqa.selenium.remote.RemoteWebDriver as RemoteWebDriver
import org.openqa.selenium.remote.SessionId as SessionId
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger
import org.openqa.selenium.By as By
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.chrome.ChromeDriver as ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions as ChromeOptions
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW

WebUI.callTestCase(findTestCase('Login Page/LoginTestPage'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/DataTasks_Module'), 10)

WebUI.click(findTestObject('5. Data Tasks/DataTasks_Module'))

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/Assessor'), 10)

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/Collector'), 10)

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/Both'), 10)

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/Retrieve_for_all_users_Checkbox'), 10)

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/Year_Label'), 10)

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/States(Optional)_Label'), 10)

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/Collection Method (Optional)'), 10)

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/Request Type (Optional)'), 10)

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/Task Status (Optional)'), 10)

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/btn_Submit'), 10)

WebUI.verifyElementClickable(findTestObject('5. Data Tasks/btn_Submit'))

WebUI.click(findTestObject('5. Data Tasks/Assessor'))

WebUI.click(findTestObject('5. Data Tasks/Both'))

WebUI.click(findTestObject('5. Data Tasks/Retrieve_for_all_users_Checkbox'))

WebUI.click(findTestObject('5. Data Tasks/Year_Textbox'))

WebUI.sendKeys(findTestObject('5. Data Tasks/Year_Textbox'), Keys.chord(Keys.CONTROL, 'A'))

WebUI.sendKeys(findTestObject('5. Data Tasks/Year_Textbox'), '2021')

WebUI.sendKeys(findTestObject('5. Data Tasks/Year_Textbox'), Keys.chord(Keys.ENTER))

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/States(Optional)_Textbox'), 10)

not_run: WebUI.sendKeys(findTestObject('5. Data Tasks/States(Optional)_Textbox'), Keys.chord(Keys.CONTROL, 'A'))

not_run: WebUI.sendKeys(findTestObject('5. Data Tasks/States(Optional)_Textbox'), '')

not_run: WebUI.sendKeys(findTestObject('5. Data Tasks/States(Optional)_Textbox'), Keys.chord(Keys.ENTER))

WebUI.waitForElementPresent(findTestObject('5. Data Tasks/Colleciton Method_Textbox'), 10)

WebUI.sendKeys(findTestObject('5. Data Tasks/Colleciton Method_Textbox'), Keys.chord(Keys.CONTROL, 'A'))

WebUI.sendKeys(findTestObject('5. Data Tasks/Colleciton Method_Textbox'), 'Request Copies of Bills/Notices')

WebUI.sendKeys(findTestObject('5. Data Tasks/Colleciton Method_Textbox'), Keys.chord(Keys.ENTER))

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/RequestType_Textbox'), 10)

WebUI.sendKeys(findTestObject('5. Data Tasks/RequestType_Textbox'), Keys.chord(Keys.CONTROL, 'A'))

WebUI.sendKeys(findTestObject('5. Data Tasks/RequestType_Textbox'), 'Asmt Roll - Certified')

WebUI.sendKeys(findTestObject('5. Data Tasks/RequestType_Textbox'), Keys.chord(Keys.ENTER))

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/TaskStatus_Textbox'), 10)

WebUI.sendKeys(findTestObject('5. Data Tasks/TaskStatus_Textbox'), Keys.chord(Keys.CONTROL, 'A'))

WebUI.sendKeys(findTestObject('5. Data Tasks/TaskStatus_Textbox'), 'Make Inquiry for Copies [RCOBN]')

WebUI.sendKeys(findTestObject('5. Data Tasks/TaskStatus_Textbox'), Keys.chord(Keys.ENTER))

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/GridSection_Heading'), 10)

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/btn_Submit'), 10)

WebUI.click(findTestObject('5. Data Tasks/btn_Submit'))

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/GridSection_Heading'), 10)

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/Show_Entries'), 10)

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/Pagiantion_Dropdown'), 10)

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/Entity_Searchbox'), 10)

WebUI.sendKeys(findTestObject('5. Data Tasks/Entity_Textbox_Value'), Keys.chord(Keys.CONTROL, 'A'))

WebUI.sendKeys(findTestObject('5. Data Tasks/Entity_Textbox_Value'), 'Taos County')

WebUI.sendKeys(findTestObject('5. Data Tasks/Entity_Textbox_Value'), Keys.chord(Keys.ENTER))

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/Jasper_CAD'), 10)

WebUI.click(findTestObject('5. Data Tasks/Jasper_CAD'))

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/Parent_VisistPage'), 10)

WebUI.click(findTestObject('5. Data Tasks/Parent_VisistPage'))

WebUI.switchToWindowIndex(1)

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/btn_ChildTask_Save'), 10)

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/btn_ChildTask'), 10)

WebUI.click(findTestObject('5. Data Tasks/btn_ChildTask'))

WebUI.waitForElementPresent(findTestObject('5. Data Tasks/heading_CreateChild'), 10)

WebUI.waitForElementPresent(findTestObject('5. Data Tasks/Label_RequestMethod'), 10)

WebUI.click(findTestObject('5. Data Tasks/ddl_RequestMethod'))

WebUI.selectOptionByLabel(findTestObject('5. Data Tasks/ddl_RequestMethod'), ddlvalue, false)

WebUI.waitForElementPresent(findTestObject('5. Data Tasks/CreateChild_btn_Submit'), 10)

WebUI.click(findTestObject('5. Data Tasks/CreateChild_btn_Submit'))

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/CT_GCol_Request'), 10)

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/CT_GCol_Description'), 10)

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/CT_GCol_CollectionMethod'), 10)

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/CT_GCol_TaskOwner'), 10)

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/CT_GCol_TaskStatus'), 10)

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/CT_GCol_DateAvaliable'), 10)

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/CT_GCol_Followup_Date'), 10)

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/CT_GCol_EstStartDate'), 10)

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/CT_GCol_CompleteBy'), 10)

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/CT_GCol_CompleteBy'), 10)

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/ChildTask_TaskStatus'), 10)

WebDriver driver = DriverFactory.getWebDriver()

List<WebElement> NoOfRecords = driver.findElements(By.xpath('//div[@class=\'dataTable_wrapper\']/table[@id=\'child_tasks\']/tbody/tr'))

int lastchild = NoOfRecords.size()

println(lastchild)

newpath = (('//div[@class=\'dataTable_wrapper\']/table[@id=\'child_tasks\']/tbody/tr[' + lastchild) + ']')

println(newpath)

driver.findElement(By.xpath(newpath)).click()

println(newpath)

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/Textbox_UserName'), 10)

not_run: WebUI.sendKeys(findTestObject('5. Data Tasks/Textbox_UserName'), Keys.chord(Keys.CONTROL, 'A'))

not_run: WebUI.sendKeys(findTestObject('5. Data Tasks/Textbox_UserName'), 'vbandaru_Test4')

not_run: WebUI.sendKeys(findTestObject('5. Data Tasks/Textbox_UserName'), Keys.chord(Keys.ENTER))

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/ChildTask_SaveAll'), 10)

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/btn_SelectParcels'), 10)

WebUI.click(findTestObject('5. Data Tasks/btn_SelectParcels'))

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/parcel_Col_Include'), 10)

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/parcel_Col_ImgOnly'), 10)

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/parcel_Col_Customer'), 10)

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/parcel_Col_PropertyType'), 10)

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/parcel_Col_Ptxnumber'), 10)

WebUI.closeBrowser()

