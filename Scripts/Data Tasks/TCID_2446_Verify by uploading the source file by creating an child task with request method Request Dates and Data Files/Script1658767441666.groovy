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

WebUI.click(findTestObject('5. Data Tasks/Retrieve_for_all_users_Checkbox'))

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/Year_Textbox'), 15)

WebUI.click(findTestObject('5. Data Tasks/Year_Textbox'))

WebUI.sendKeys(findTestObject('5. Data Tasks/Year_Textbox'), Keys.chord(Keys.CONTROL, 'A'))

WebUI.sendKeys(findTestObject('5. Data Tasks/Year_Textbox'), '2021')

WebUI.sendKeys(findTestObject('5. Data Tasks/Year_Textbox'), Keys.chord(Keys.ENTER))

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/States(Optional)_Textbox'), 15)

WebUI.click(findTestObject('5. Data Tasks/States(Optional)_Textbox'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('5. Data Tasks/States(Optional)_Textbox'), Keys.chord(Keys.CONTROL, 'A'))

WebUI.sendKeys(findTestObject('5. Data Tasks/States(Optional)_Textbox'), 'Georgia')

WebUI.sendKeys(findTestObject('5. Data Tasks/States(Optional)_Textbox'), Keys.chord(Keys.ENTER))

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/Colleciton Method_Textbox'), 15)

WebUI.click(findTestObject('5. Data Tasks/Colleciton Method_Textbox'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('5. Data Tasks/Colleciton Method_Textbox'), Keys.chord(Keys.CONTROL, 'A'))

WebUI.sendKeys(findTestObject('5. Data Tasks/Colleciton Method_Textbox'), 'Request Dates & Data Files')

WebUI.sendKeys(findTestObject('5. Data Tasks/Colleciton Method_Textbox'), Keys.chord(Keys.ENTER))

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/RequestType_Textbox'), 15)

WebUI.click(findTestObject('5. Data Tasks/RequestType_Textbox'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('5. Data Tasks/RequestType_Textbox'), Keys.chord(Keys.CONTROL, 'A'))

WebUI.sendKeys(findTestObject('5. Data Tasks/RequestType_Textbox'), 'Asmt Roll - Premil')

WebUI.sendKeys(findTestObject('5. Data Tasks/RequestType_Textbox'), Keys.chord(Keys.ENTER))

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/TaskStatus_Textbox'), 15)

WebUI.sendKeys(findTestObject('5. Data Tasks/TaskStatus_Textbox'), Keys.chord(Keys.CONTROL, 'A'))

WebUI.sendKeys(findTestObject('5. Data Tasks/TaskStatus_Textbox'), 'Awaiting Receipt of Data [RDDF]')

WebUI.sendKeys(findTestObject('5. Data Tasks/TaskStatus_Textbox'), Keys.chord(Keys.ENTER))

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/btn_Submit'), 15)

WebUI.click(findTestObject('5. Data Tasks/btn_Submit'))

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/GridSection_Heading'), 15)

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/Show_Entries'), 15)

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/Pagiantion_Dropdown'), 15)

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/Entity_Searchbox'), 15)

WebUI.sendKeys(findTestObject('5. Data Tasks/Entity_Textbox_Value'), Keys.chord(Keys.CONTROL, 'A'))

WebUI.sendKeys(findTestObject('5. Data Tasks/Entity_Textbox_Value'), 'Troup County')

WebUI.sendKeys(findTestObject('5. Data Tasks/Entity_Textbox_Value'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('5. Data Tasks/Jasper_CAD'))

not_run: WebUI.switchToWindowIndex(1)

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/Parent_VisistPage'), 15)

WebUI.click(findTestObject('5. Data Tasks/Parent_VisistPage'))

WebUI.switchToWindowIndex(1)

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/btn_ChildTaskSave_ParentTask'), 15)

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/btn_CreateChild_PatentTask'), 15)

WebUI.click(findTestObject('5. Data Tasks/btn_CreateChild_PatentTask'))

WebUI.waitForElementPresent(findTestObject('5. Data Tasks/heading_CreateChild'), 15)

WebUI.waitForElementPresent(findTestObject('5. Data Tasks/Label_RequestMethod'), 15)

WebUI.click(findTestObject('5. Data Tasks/ddl_RequestMethod'))

WebUI.selectOptionByLabel(findTestObject('5. Data Tasks/ddl_RequestMethod'), ddlvalue, false)

WebUI.waitForElementPresent(findTestObject('5. Data Tasks/CreateChild_btn_Submit'), 15)

WebUI.click(findTestObject('5. Data Tasks/CreateChild_btn_Submit'))

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/CT_GCol_Request'), 15)

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/CT_GCol_Description'), 15)

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/CT_GCol_CollectionMethod'), 15)

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/CT_GCol_TaskOwner'), 15)

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/CT_GCol_TaskStatus'), 15)

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/CT_GCol_DateAvaliable'), 15)

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/CT_GCol_Followup_Date'), 15)

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/CT_GCol_EstStartDate'), 15)

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/CT_GCol_CompleteBy'), 15)

WebDriver driver = DriverFactory.getWebDriver()

List<WebElement> NoOfRecords = driver.findElements(By.xpath('//div[@class=\'dataTable_wrapper\']/table[@id=\'child_tasks\']/tbody/tr'))

int lastchild = NoOfRecords.size()

println(lastchild)

newpath = (('//div[@class=\'dataTable_wrapper\']/table[@id=\'child_tasks\']/tbody/tr[' + lastchild) + ']')

println(newpath)

driver.findElement(By.xpath(newpath)).click()

println(newpath)

not_run: WebUI.click(findTestObject('5. Data Tasks/Grid_ChildRecord'))

not_run: WebUI.verifyElementPresent(findTestObject('5. Data Tasks/Grid_ChildRecord'), 10)

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/ChildTask_SaveAll'), 15)

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/btn_NextFollowup_Date'), 15)

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/btn_Inactivate_Entity'), 15)

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/btn_Uncooperative_Entity'), 15)

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/ChildTask_TaskStatus'), 15)

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/Secheading_ImportanTasksFields'), 15)

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/Label_DateAvaliable'), 15)

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/label_Nextfollowup_Date'), 15)

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/label_Schedulerequestdate'), 15)

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/Label_Datacost'), 15)

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/label_Requestsentdate'), 15)

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/Label_Est_NoticeDate'), 15)

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/Label_Noticedate'), 15)

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/Label_Est_AppealDeadline'), 15)

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/Label_Assessor_Appealdeadline'), 15)

not_run: WebUI.click(findTestObject('5. Data Tasks/btn_ChildTask_Save'))

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/Textbox_UserName'), 15)

WebUI.sendKeys(findTestObject('5. Data Tasks/Textbox_UserName'), Keys.chord(Keys.CONTROL, 'A'))

WebUI.sendKeys(findTestObject('5. Data Tasks/Textbox_UserName'), 'vbandaru09')

WebUI.sendKeys(findTestObject('5. Data Tasks/Textbox_UserName'), Keys.chord(Keys.ENTER))

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/Textbox_DateAvaliable'), 15)

WebUI.sendKeys(findTestObject('5. Data Tasks/Textbox_DateAvaliable'), Keys.chord(Keys.CONTROL, 'A'))

WebUI.sendKeys(findTestObject('5. Data Tasks/Textbox_DateAvaliable'), '02/11/2022')

WebUI.sendKeys(findTestObject('5. Data Tasks/Textbox_DateAvaliable'), Keys.chord(Keys.ENTER))

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/Textbox_Nextfollowupdate'), 15)

WebUI.sendKeys(findTestObject('5. Data Tasks/Textbox_Nextfollowupdate'), Keys.chord(Keys.CONTROL, 'A'))

WebUI.sendKeys(findTestObject('5. Data Tasks/Textbox_Nextfollowupdate'), '06/13/2022')

WebUI.sendKeys(findTestObject('5. Data Tasks/Textbox_Nextfollowupdate'), Keys.chord(Keys.ENTER))

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/Textbox_ScheduleRequestDate'), 15)

WebUI.sendKeys(findTestObject('5. Data Tasks/Textbox_ScheduleRequestDate'), Keys.chord(Keys.CONTROL, 'A'))

WebUI.sendKeys(findTestObject('5. Data Tasks/Textbox_ScheduleRequestDate'), '06/16/2022')

WebUI.sendKeys(findTestObject('5. Data Tasks/Textbox_ScheduleRequestDate'), Keys.chord(Keys.ENTER))

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/Textbox_Datacost'), 15)

WebUI.sendKeys(findTestObject('5. Data Tasks/Textbox_Datacost'), Keys.chord(Keys.CONTROL, 'A'))

WebUI.sendKeys(findTestObject('5. Data Tasks/Textbox_Datacost'), '0')

WebUI.sendKeys(findTestObject('5. Data Tasks/Textbox_Datacost'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('5. Data Tasks/btn_ChildTaskSave_ParentTask'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/Textbox_Est_NoticeDate'), 15)

WebUI.sendKeys(findTestObject('5. Data Tasks/Textbox_Est_NoticeDate'), Keys.chord(Keys.CONTROL, 'A'))

WebUI.sendKeys(findTestObject('5. Data Tasks/Textbox_Est_NoticeDate'), '06/18/2022')

WebUI.sendKeys(findTestObject('5. Data Tasks/Textbox_Est_NoticeDate'), Keys.chord(Keys.ENTER))

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/Textbox_NoticeDate'), 15)

WebUI.sendKeys(findTestObject('5. Data Tasks/Textbox_NoticeDate'), Keys.chord(Keys.ENTER, 'A'))

WebUI.sendKeys(findTestObject('5. Data Tasks/Textbox_NoticeDate'), '06/19/2022')

WebUI.sendKeys(findTestObject('5. Data Tasks/Textbox_NoticeDate'), Keys.chord(Keys.ENTER))

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/Textbox_Est_AppealDeadline'), 15)

WebUI.sendKeys(findTestObject('5. Data Tasks/Textbox_Est_AppealDeadline'), Keys.chord(Keys.CONTROL, 'A'))

WebUI.sendKeys(findTestObject('5. Data Tasks/Textbox_Est_AppealDeadline'), '06/21/2022')

WebUI.sendKeys(findTestObject('5. Data Tasks/Textbox_Est_AppealDeadline'), Keys.chord(Keys.ENTER))

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/Textbox_AssessorAppealDeadline'), 15)

WebUI.sendKeys(findTestObject('5. Data Tasks/Textbox_AssessorAppealDeadline'), Keys.chord(Keys.CONTROL, 'A'))

WebUI.sendKeys(findTestObject('5. Data Tasks/Textbox_AssessorAppealDeadline'), '06/23/2022')

WebUI.sendKeys(findTestObject('5. Data Tasks/Textbox_AssessorAppealDeadline'), Keys.chord(Keys.ENTER))

not_run: WebUI.verifyElementPresent(findTestObject('5. Data Tasks/btn_RequestforApproval'), 10)

not_run: WebUI.click(findTestObject('5. Data Tasks/btn_RequestforApproval'))

WebUI.verifyElementClickable(findTestObject('5. Data Tasks/btn_ChildTaskSave_ParentTask'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/Textbox_RequestSentDate'), 15)

WebUI.sendKeys(findTestObject('5. Data Tasks/Textbox_RequestSentDate'), Keys.chord(Keys.CONTROL, 'A'))

WebUI.sendKeys(findTestObject('5. Data Tasks/Textbox_RequestSentDate'), '06/25/2022')

WebUI.sendKeys(findTestObject('5. Data Tasks/Textbox_RequestSentDate'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('5. Data Tasks/btn_ChildTaskSave_ParentTask'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/btn_NewSource'), 15)

WebUI.closeBrowser()

