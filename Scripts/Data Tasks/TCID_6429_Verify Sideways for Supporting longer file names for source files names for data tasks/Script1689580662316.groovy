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

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/Year_Textbox'), 10)

WebUI.sendKeys(findTestObject('5. Data Tasks/Year_Textbox'), Keys.chord(Keys.CONTROL, 'A'))

WebUI.sendKeys(findTestObject('5. Data Tasks/Year_Textbox'), '2022')

WebUI.sendKeys(findTestObject('5. Data Tasks/Year_Textbox'), Keys.chord(Keys.ENTER))

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/States(Optional)_Textbox'), 10)

WebUI.sendKeys(findTestObject('5. Data Tasks/States(Optional)_Textbox'), Keys.chord(Keys.CONTROL, 'A'))

WebUI.sendKeys(findTestObject('5. Data Tasks/States(Optional)_Textbox'), 'Texas')

WebUI.sendKeys(findTestObject('5. Data Tasks/States(Optional)_Textbox'), Keys.chord(Keys.ENTER))

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/Colleciton Method_Textbox'), 10)

WebUI.sendKeys(findTestObject('5. Data Tasks/Colleciton Method_Textbox'), Keys.chord(Keys.CONTROL, 'A'))

WebUI.sendKeys(findTestObject('5. Data Tasks/Colleciton Method_Textbox'), 'Request Dates & Data Files')

WebUI.sendKeys(findTestObject('5. Data Tasks/Colleciton Method_Textbox'), Keys.chord(Keys.ENTER))

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/RequestType_Textbox'), 10)

WebUI.sendKeys(findTestObject('5. Data Tasks/RequestType_Textbox'), Keys.chord(Keys.CONTROL, 'A'))

WebUI.sendKeys(findTestObject('5. Data Tasks/RequestType_Textbox'), 'Asmt Roll - Certified')

WebUI.sendKeys(findTestObject('5. Data Tasks/RequestType_Textbox'), Keys.chord(Keys.ENTER))

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/TaskStatus_Textbox'), 10)

WebUI.sendKeys(findTestObject('5. Data Tasks/TaskStatus_Textbox'), Keys.chord(Keys.CONTROL, 'A'))

WebUI.sendKeys(findTestObject('5. Data Tasks/TaskStatus_Textbox'), 'Processing Complete [RDDF]')

WebUI.sendKeys(findTestObject('5. Data Tasks/TaskStatus_Textbox'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('5. Data Tasks/btn_Submit'))

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/GridSection_Heading'), 10)

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/Show_Entries'), 10)

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/Pagiantion_Dropdown'), 10)

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/Entity_Searchbox'), 10)

WebUI.click(findTestObject('5. Data Tasks/State_Sorting'))

WebUI.sendKeys(findTestObject('5. Data Tasks/Entity_Textbox_Value'), Keys.chord(Keys.CONTROL, 'A'))

WebUI.sendKeys(findTestObject('5. Data Tasks/Entity_Textbox_Value'), 'Carson CAD')

WebUI.sendKeys(findTestObject('5. Data Tasks/Entity_Textbox_Value'), Keys.chord(Keys.ENTER))

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/Troup_County'), 10)

WebUI.click(findTestObject('5. Data Tasks/Troup_County'))

not_run: WebUI.switchToWindowIndex(1)

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/Parent_VisistPage'), 10)

WebUI.click(findTestObject('5. Data Tasks/Parent_VisistPage'))

WebUI.switchToWindowIndex(1)

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/btn_ChildTaskSave_ParentTask'), 10)

WebUI.waitForElementPresent(findTestObject('5. Data Tasks/ChildTask_button2'), 25)

WebUI.waitForElementPresent(findTestObject('5. Data Tasks/btn_ChildTaskSave_ParentTask'), 10)

WebUI.click(findTestObject('5. Data Tasks/btn_CreateChild_PatentTask'))

WebUI.waitForElementPresent(findTestObject('5. Data Tasks/heading_CreateChild'), 24)

WebUI.waitForElementPresent(findTestObject('5. Data Tasks/Label_RequestMethod'), 10)

WebUI.click(findTestObject('5. Data Tasks/ddl_RequestMethod'))

WebUI.selectOptionByValue(findTestObject('5. Data Tasks/ddl_RequestMethod'), '11', false)

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

WebDriver driver = DriverFactory.getWebDriver()

List<WebElement> NoOfRecords = driver.findElements(By.xpath('//div[@class=\'dataTable_wrapper\']/table[@id=\'child_tasks\']/tbody/tr'))

int lastchild = NoOfRecords.size()

println(lastchild)

newpath = (('//div[@class=\'dataTable_wrapper\']/table[@id=\'child_tasks\']/tbody/tr[' + lastchild) + ']')

println(newpath)

driver.findElement(By.xpath(newpath)).click()

println(newpath)

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/ChildTask_TaskStatus'), 10)

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/ChildTask_SaveAll'), 10)

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/btn_NextFollowup_Date'), 15)

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/btn_Inactivate_Entity'), 15)

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/btn_Uncooperative_Entity'), 15)

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/Secheading_ImportanTasksFields'), 10)

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/Label_DateAvaliable'), 10)

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/label_Nextfollowup_Date'), 10)

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/label_Schedulerequestdate'), 10)

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/Label_Datacost'), 10)

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/label_Requestsentdate'), 10)

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/Label_Est_NoticeDate'), 10)

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/Label_Noticedate'), 10)

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/Label_Est_AppealDeadline'), 10)

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/Label_Assessor_Appealdeadline'), 10)

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/Textbox_UserName'), 10)

WebUI.sendKeys(findTestObject('5. Data Tasks/Textbox_UserName'), Keys.chord(Keys.CONTROL, 'A'))

WebUI.sendKeys(findTestObject('5. Data Tasks/Textbox_UserName'), 'vbandaru_Test111')

WebUI.sendKeys(findTestObject('5. Data Tasks/Textbox_UserName'), Keys.chord(Keys.ENTER))

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/Textbox_DateAvaliable'), 10)

WebUI.sendKeys(findTestObject('5. Data Tasks/Textbox_DateAvaliable'), Keys.chord(Keys.ENTER, 'A'))

WebUI.sendKeys(findTestObject('5. Data Tasks/Textbox_DateAvaliable'), '08/01/2023')

WebUI.sendKeys(findTestObject('5. Data Tasks/Textbox_DateAvaliable'), Keys.chord(Keys.ENTER))

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/Textbox_Nextfollowupdate'), 10)

WebUI.sendKeys(findTestObject('5. Data Tasks/Textbox_Nextfollowupdate'), Keys.chord(Keys.ENTER, 'A'))

WebUI.sendKeys(findTestObject('5. Data Tasks/Textbox_Nextfollowupdate'), '08/15/2023')

WebUI.sendKeys(findTestObject('5. Data Tasks/Textbox_Nextfollowupdate'), Keys.chord(Keys.ENTER))

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/Textbox_ScheduleRequestDate'), 10)

WebUI.sendKeys(findTestObject('5. Data Tasks/Textbox_ScheduleRequestDate'), Keys.chord(Keys.CONTROL, 'A'))

WebUI.sendKeys(findTestObject('5. Data Tasks/Textbox_ScheduleRequestDate'), '08/18/2023')

WebUI.sendKeys(findTestObject('5. Data Tasks/Textbox_ScheduleRequestDate'), Keys.chord(Keys.ENTER))

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/btn_ChildTaskSave_ParentTask'), 20)

WebUI.click(findTestObject('5. Data Tasks/btn_ChildTaskSave_ParentTask'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/Textbox_Est_NoticeDate'), 20)

WebUI.sendKeys(findTestObject('5. Data Tasks/Textbox_Est_NoticeDate'), Keys.chord(Keys.ENTER, 'A'))

WebUI.sendKeys(findTestObject('5. Data Tasks/Textbox_Est_NoticeDate'), '08/21/2023')

WebUI.sendKeys(findTestObject('5. Data Tasks/Textbox_Est_NoticeDate'), Keys.chord(Keys.ENTER))

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/Textbox_NoticeDate'), 20)

WebUI.sendKeys(findTestObject('5. Data Tasks/Textbox_NoticeDate'), Keys.chord(Keys.CONTROL, 'A'))

WebUI.sendKeys(findTestObject('5. Data Tasks/Textbox_NoticeDate'), '08/25/2023')

WebUI.sendKeys(findTestObject('5. Data Tasks/Textbox_NoticeDate'), Keys.chord(Keys.ENTER))

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/Textbox_Est_AppealDeadline'), 20)

WebUI.sendKeys(findTestObject('5. Data Tasks/Textbox_Est_AppealDeadline'), Keys.chord(Keys.CONTROL, 'A'))

WebUI.sendKeys(findTestObject('5. Data Tasks/Textbox_Est_AppealDeadline'), '08/28/2023')

WebUI.sendKeys(findTestObject('5. Data Tasks/Textbox_Est_AppealDeadline'), Keys.chord(Keys.ENTER))

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/Textbox_AssessorAppealDeadline'), 20)

WebUI.sendKeys(findTestObject('5. Data Tasks/Textbox_AssessorAppealDeadline'), Keys.chord(Keys.CONTROL, 'A'))

WebUI.sendKeys(findTestObject('5. Data Tasks/Textbox_AssessorAppealDeadline'), '08/29/2023')

WebUI.sendKeys(findTestObject('5. Data Tasks/Textbox_AssessorAppealDeadline'), Keys.chord(Keys.ENTER))

WebUI.verifyElementClickable(findTestObject('5. Data Tasks/btn_ChildTaskSave_ParentTask'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/Textbox_RequestSentDate'), 20)

WebUI.sendKeys(findTestObject('5. Data Tasks/Textbox_RequestSentDate'), Keys.chord(Keys.CONTROL, 'A'))

WebUI.sendKeys(findTestObject('5. Data Tasks/Textbox_RequestSentDate'), '06/20/2023')

WebUI.sendKeys(findTestObject('5. Data Tasks/Textbox_RequestSentDate'), Keys.chord(Keys.ENTER))

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/Textbox_Datacost'), 10)

WebUI.sendKeys(findTestObject('5. Data Tasks/Textbox_Datacost'), Keys.chord(Keys.CONTROL, 'A'))

WebUI.sendKeys(findTestObject('5. Data Tasks/Textbox_Datacost'), '0')

WebUI.sendKeys(findTestObject('5. Data Tasks/Textbox_Datacost'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('5. Data Tasks/btn_ChildTaskSave_ParentTask'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/Textbox_RequestSentDate'), 20)

WebUI.sendKeys(findTestObject('5. Data Tasks/Textbox_RequestSentDate'), Keys.chord(Keys.CONTROL, 'A'))

WebUI.sendKeys(findTestObject('5. Data Tasks/Textbox_RequestSentDate'), '06/20/2023')

WebUI.sendKeys(findTestObject('5. Data Tasks/Textbox_RequestSentDate'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('5. Data Tasks/btn_ChildTaskSave_ParentTask'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/btn_NewSource'), 20)

WebUI.click(findTestObject('5. Data Tasks/btn_NewSource'))

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/label_CSN_Year'), 12)

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/label_CSN_State'), 12)

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/label_CSN_SourceType'), 12)

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/label_CSN_SourceTemplate'), 12)

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/label_CSN_SourceOrigin'), 12)

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/label_CSN_SourceCreateDate'), 12)

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/label_CSN_County'), 12)

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/label_CSN_Secheading_Notes'), 12)

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/label_CSN_RollStatus'), 12)

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/label_CSN_RequestContent'), 12)

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/label_CSN_DateAdded'), 12)

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/label_CSN_Description'), 12)

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/label_CSN_GoogleDriveLocation'), 12)

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/label_CSN_GoogleFileName'), 12)

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/label_CSN_Notemplate'), 12)

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/label_CSN_OtherAssociatedTasks'), 12)

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/Checkbox_CSN_NoTemplate'), 12)

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/Checkbox_CSN_RemoveAll'), 12)

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/hlink_CSN_Upload'), 12)

WebUI.click(findTestObject('5. Data Tasks/hlink_CSN_Upload'))

String userDir = System.getProperty('user.dir')

String Upload = userDir + '\\Data Files\\carson_cad_2022_assmt_roll_certified_mineral_n_industrial-src56604_carson_cad_2022_assmt_roll_certified_mineral_n_industrial-src56604_carson_cad_2022_assmt_roll_certified_mineral_n_.zip'

WebUI.uploadFile(findTestObject('5. Data Tasks/Browse_upload'), Upload)

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/Upload_Submit'), 12)

WebUI.click(findTestObject('5. Data Tasks/Upload_Submit'))

WebUI.waitForElementPresent(findTestObject('5. Data Tasks/Upload_Progress'), 12)

WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/label_CSN_SourceTemplate'), 12)

WebUI.selectOptionByLabel(findTestObject('5. Data Tasks/SourceTemplate_Textbox'), template, false)

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/label_CSN_SourceOrigin'), 12)

WebUI.selectOptionByLabel(findTestObject('5. Data Tasks/SourceOrigin_Textbox'), Sourceorigin, false)

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/Source_Tablename1'), 12)

WebUI.selectOptionByLabel(findTestObject('5. Data Tasks/Source_Tablename1_textbox'), tablename1, false)

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/Source_Tablename2'), 12)

WebUI.selectOptionByLabel(findTestObject('5. Data Tasks/Source_Tablename2_textbox'), tablename2, false)

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/Source_Tablename3'), 12)

WebUI.selectOptionByLabel(findTestObject('5. Data Tasks/Source_Tablename3_textbox'), tablename3, false)

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/Source_btn_Save'), 12)

WebUI.mouseOver(findTestObject('5. Data Tasks/Source_btn_Save'))

WebUI.click(findTestObject('5. Data Tasks/Source_btn_Save'))

WebUI.switchToWindowIndex(1)

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/Label_TaskStatus'), 12)

WebUI.selectOptionByValue(findTestObject('5. Data Tasks/TaskStatus_Textboxvalue'), '137', false)

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/button_Source'), 12)

WebUI.click(findTestObject('5. Data Tasks/button_Source'))

WebUI.delay(10)

WebUI.refresh()

WebUI.waitForElementPresent(findTestObject('5. Data Tasks/Currently_Staging'), 20)

WebUI.waitForElementPresent(findTestObject('5. Data Tasks/btn_ResetStaging'), 15)

WebUI.waitForElementPresent(findTestObject('5. Data Tasks/btn_Cleanup'), 15)

WebUI.refresh()

WebUI.delay(8)

WebUI.refresh()

WebUI.delay(10)

WebUI.refresh()

WebUI.delay(10)

WebUI.refresh()

WebUI.delay(10)

WebUI.refresh()

WebUI.delay(10)

WebUI.refresh()

WebUI.delay(10)

WebUI.refresh()

WebUI.waitForElementPresent(findTestObject('5. Data Tasks/Secheading_Staging'), 25)

WebUI.refresh()

WebUI.waitForElementPresent(findTestObject('5. Data Tasks/StagedSucessfully_msg'), 25)

WebUI.verifyElementText(findTestObject('5. Data Tasks/StagedSucessfully_msg'), 'This source was staged successfully.')

WebUI.delay(5)

WebUI.refresh()

WebUI.waitForElementPresent(findTestObject('5. Data Tasks/SecHeading_Validation'), 15)

WebUI.refresh()

WebUI.delay(8)

WebUI.refresh()

WebUI.delay(8)

WebUI.waitForElementPresent(findTestObject('5. Data Tasks/Validation_SuccessfulMessage'), 25)

WebUI.refresh()

WebUI.verifyElementText(findTestObject('5. Data Tasks/Validation_SuccessfulMessage'), 'The source has been validated and is ready for loading.')

WebUI.closeBrowser()

