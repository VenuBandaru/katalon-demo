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

WebUI.sendKeys(findTestObject('5. Data Tasks/Year_Textbox'), '2021')

WebUI.sendKeys(findTestObject('5. Data Tasks/Year_Textbox'), Keys.chord(Keys.ENTER))

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/States(Optional)_Textbox'), 10)

WebUI.sendKeys(findTestObject('5. Data Tasks/States(Optional)_Textbox'), Keys.chord(Keys.CONTROL, 'A'))

WebUI.sendKeys(findTestObject('5. Data Tasks/States(Optional)_Textbox'), 'Georgia')

WebUI.sendKeys(findTestObject('5. Data Tasks/States(Optional)_Textbox'), Keys.chord(Keys.ENTER))

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/Colleciton Method_Textbox'), 10)

WebUI.sendKeys(findTestObject('5. Data Tasks/Colleciton Method_Textbox'), Keys.chord(Keys.CONTROL, 'A'))

WebUI.sendKeys(findTestObject('5. Data Tasks/Colleciton Method_Textbox'), 'Request Dates & Data Files')

WebUI.sendKeys(findTestObject('5. Data Tasks/Colleciton Method_Textbox'), Keys.chord(Keys.ENTER))

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/RequestType_Textbox'), 10)

WebUI.sendKeys(findTestObject('5. Data Tasks/RequestType_Textbox'), Keys.chord(Keys.CONTROL, 'A'))

WebUI.sendKeys(findTestObject('5. Data Tasks/RequestType_Textbox'), 'Asmt Roll - Prelim')

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

WebUI.sendKeys(findTestObject('5. Data Tasks/Entity_Textbox_Value'), 'Troup County')

WebUI.sendKeys(findTestObject('5. Data Tasks/Entity_Textbox_Value'), Keys.chord(Keys.ENTER))

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/Troup_County'), 10)

WebUI.click(findTestObject('5. Data Tasks/Troup_County'))

not_run: WebUI.switchToWindowIndex(1)

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/Parent_VisistPage'), 10)

WebUI.click(findTestObject('5. Data Tasks/Parent_VisistPage'))

WebUI.switchToWindowIndex(1)

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/btn_ChildTaskSave_ParentTask'), 10)

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/btn_CreateChild_PatentTask'), 10)

WebUI.click(findTestObject('5. Data Tasks/btn_CreateChild_PatentTask'))

WebUI.waitForElementPresent(findTestObject('5. Data Tasks/heading_CreateChild'), 10)

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

WebUI.sendKeys(findTestObject('5. Data Tasks/Textbox_UserName'), 'vbandaru_Test10')

WebUI.sendKeys(findTestObject('5. Data Tasks/Textbox_UserName'), Keys.chord(Keys.ENTER))

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/Textbox_DateAvaliable'), 10)

WebUI.sendKeys(findTestObject('5. Data Tasks/Textbox_DateAvaliable'), Keys.chord(Keys.ENTER, 'A'))

WebUI.sendKeys(findTestObject('5. Data Tasks/Textbox_DateAvaliable'), '02/10/2022')

WebUI.sendKeys(findTestObject('5. Data Tasks/Textbox_DateAvaliable'), Keys.chord(Keys.ENTER))

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/Textbox_Nextfollowupdate'), 10)

WebUI.sendKeys(findTestObject('5. Data Tasks/Textbox_Nextfollowupdate'), Keys.chord(Keys.ENTER, 'A'))

WebUI.sendKeys(findTestObject('5. Data Tasks/Textbox_Nextfollowupdate'), '06/12/2022')

WebUI.sendKeys(findTestObject('5. Data Tasks/Textbox_Nextfollowupdate'), Keys.chord(Keys.ENTER))

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/Textbox_ScheduleRequestDate'), 10)

WebUI.sendKeys(findTestObject('5. Data Tasks/Textbox_ScheduleRequestDate'), Keys.chord(Keys.CONTROL, 'A'))

WebUI.sendKeys(findTestObject('5. Data Tasks/Textbox_ScheduleRequestDate'), '06/14/2022')

WebUI.sendKeys(findTestObject('5. Data Tasks/Textbox_ScheduleRequestDate'), Keys.chord(Keys.ENTER))

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/Textbox_Datacost'), 10)

WebUI.sendKeys(findTestObject('5. Data Tasks/Textbox_Datacost'), Keys.chord(Keys.CONTROL, 'A'))

WebUI.sendKeys(findTestObject('5. Data Tasks/Textbox_Datacost'), '0')

WebUI.sendKeys(findTestObject('5. Data Tasks/Textbox_Datacost'), Keys.chord(Keys.ENTER))

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/btn_ChildTaskSave_ParentTask'), 20)

WebUI.click(findTestObject('5. Data Tasks/btn_ChildTaskSave_ParentTask'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/Textbox_Est_NoticeDate'), 20)

WebUI.sendKeys(findTestObject('5. Data Tasks/Textbox_Est_NoticeDate'), Keys.chord(Keys.ENTER, 'A'))

WebUI.sendKeys(findTestObject('5. Data Tasks/Textbox_Est_NoticeDate'), '06/16/2022')

WebUI.sendKeys(findTestObject('5. Data Tasks/Textbox_Est_NoticeDate'), Keys.chord(Keys.ENTER))

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/Textbox_NoticeDate'), 20)

WebUI.sendKeys(findTestObject('5. Data Tasks/Textbox_NoticeDate'), Keys.chord(Keys.CONTROL, 'A'))

WebUI.sendKeys(findTestObject('5. Data Tasks/Textbox_NoticeDate'), '06/17/2022')

WebUI.sendKeys(findTestObject('5. Data Tasks/Textbox_NoticeDate'), Keys.chord(Keys.ENTER))

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/Textbox_Est_AppealDeadline'), 20)

WebUI.sendKeys(findTestObject('5. Data Tasks/Textbox_Est_AppealDeadline'), Keys.chord(Keys.CONTROL, 'A'))

WebUI.sendKeys(findTestObject('5. Data Tasks/Textbox_Est_AppealDeadline'), '06/23/2022')

WebUI.sendKeys(findTestObject('5. Data Tasks/Textbox_Est_AppealDeadline'), Keys.chord(Keys.ENTER))

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/Textbox_AssessorAppealDeadline'), 20)

WebUI.sendKeys(findTestObject('5. Data Tasks/Textbox_AssessorAppealDeadline'), Keys.chord(Keys.CONTROL, 'A'))

WebUI.sendKeys(findTestObject('5. Data Tasks/Textbox_AssessorAppealDeadline'), '06/28/2022')

WebUI.sendKeys(findTestObject('5. Data Tasks/Textbox_AssessorAppealDeadline'), Keys.chord(Keys.ENTER))

WebUI.verifyElementClickable(findTestObject('5. Data Tasks/btn_ChildTaskSave_ParentTask'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/Textbox_RequestSentDate'), 20)

WebUI.sendKeys(findTestObject('5. Data Tasks/Textbox_RequestSentDate'), Keys.chord(Keys.CONTROL, 'A'))

WebUI.sendKeys(findTestObject('5. Data Tasks/Textbox_RequestSentDate'), '06/28/2022')

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

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/label_CSN_Secheading_Notes'), 12)

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/label_CSN_RollStatus'), 12)

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/label_CSN_RequestContent'), 12)

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/label_CSN_County'), 12)

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

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/Upload_Submit'), 25)

WebUI.delay(2)

String userDir = System.getProperty('user.dir')

String Upload = userDir + '/Data Files/Auto-Verification Validation - Multiple Custom Checks.zip'

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

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/Source_btn_Save'), 12)

WebUI.mouseOver(findTestObject('5. Data Tasks/Source_btn_Save'))

WebUI.click(findTestObject('5. Data Tasks/Source_btn_Save'))

WebUI.switchToWindowIndex(1)

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/Label_TaskStatus'), 12)

WebUI.selectOptionByValue(findTestObject('5. Data Tasks/TaskStatus_Textboxvalue'), '137', false)

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/button_Source'), 12)

WebUI.click(findTestObject('5. Data Tasks/button_Source'))

WebUI.delay(15)

WebUI.refresh()

WebUI.delay(10)

WebUI.refresh()

WebUI.waitForElementPresent(findTestObject('5. Data Tasks/Currently_Staging'), 20)

WebUI.waitForElementPresent(findTestObject('5. Data Tasks/btn_ResetStaging'), 15)

WebUI.waitForElementPresent(findTestObject('5. Data Tasks/btn_Cleanup'), 15)

WebUI.refresh()

WebUI.delay(30)

WebUI.refresh()

WebUI.delay(30)

WebUI.refresh()

WebUI.delay(0)

WebUI.refresh()

WebUI.waitForElementPresent(findTestObject('5. Data Tasks/Staged_Successfully'), 12)

WebUI.refresh()

WebUI.waitForElementPresent(findTestObject('5. Data Tasks/href_DataTaskDetail'), 15)

WebUI.click(findTestObject('5. Data Tasks/href_DataTaskDetail'))

WebUI.refresh()

WebUI.waitForElementPresent(findTestObject('5. Data Tasks/Label_TaskStatus'), 15)

WebUI.waitForElementPresent(findTestObject('5. Data Tasks/dd_textbox_TaskStatus'), 15)

WebUI.refresh()

not_run: WebUI.verifyOptionSelectedByValue(findTestObject('5. Data Tasks/dd_textbox_TaskStatus'), '138', false, 10)

not_run: WebUI.verifyElementPresent(findTestObject('5. Data Tasks/ViewFullLog'), 10)

not_run: WebUI.click(findTestObject('5. Data Tasks/ViewFullLog'))

WebUI.refresh()

WebUI.delay(30)

WebUI.refresh()

WebUI.click(findTestObject('5. Data Tasks/btn_Source'))

WebUI.delay(35)

WebUI.refresh()

WebUI.waitForElementPresent(findTestObject('5. Data Tasks/SecHeading_Validation'), 30)

WebUI.refresh()

WebUI.delay(30)

WebUI.refresh()

WebUI.waitForElementPresent(findTestObject('5. Data Tasks/AutoVerfication_Unmapped_Juris_Code_Error'), 25)

WebUI.refresh()

WebUI.verifyElementText(findTestObject('5. Data Tasks/AutoVerfication_Unmapped_Juris_Code_Error'), 'There are unmapped jurisdiction codes in this source')

WebUI.waitForElementPresent(findTestObject('5. Data Tasks/AutoVerification_Unmapped_Assessor_Code_Error'), 15)

WebUI.verifyElementText(findTestObject('5. Data Tasks/AutoVerification_Unmapped_Assessor_Code_Error'), 'There are unmapped assessor codes in this source')

WebUI.waitForElementPresent(findTestObject('5. Data Tasks/AutoVerification_CustomCheck_Message'), 15)

WebUI.verifyElementText(findTestObject('5. Data Tasks/AutoVerification_CustomCheck_Message'), 'Valid Parcel Validation')

WebUI.waitForElementPresent(findTestObject('5. Data Tasks/AutoVerification_CustomCheck_Pencil_Icon'), 15)

WebUI.click(findTestObject('5. Data Tasks/AutoVerification_CustomCheck_Pencil_Icon'))

WebUI.waitForElementPresent(findTestObject('5. Data Tasks/ErrorResoluiton_Message'), 15)

ErrorMessage_HoverText = WebUI.getText(findTestObject('5. Data Tasks/ErrorResoluiton_Message'))

println(ErrorMessage_HoverText)

String[] a = ErrorMessage_HoverText.split('\n')

WebUI.verifyEqual(a[0], 'Error Message: Valid Parcel Validation')

WebUI.verifyEqual(a[1], 'Validation Type: Custom Check')

WebUI.verifyEqual(a[2], 'Custom Error Message: Invalid Parcel Found')

WebUI.verifyEqual(a[3], 'Information: {"records": [{"parcel_id": "BADVALUE"}]}')

WebUI.verifyEqual(a[4], 'Not yet resolved.')

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/ErrorResolution_btnCancel'), 15)

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/ErrorResolution_btn_Override'), 15)

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/ErrorResolution_btn_Resolve'), 15)

WebUI.click(findTestObject('5. Data Tasks/ErrorResolution_btnCancel'))

WebUI.waitForElementPresent(findTestObject('5. Data Tasks/AutoVerification_Multiple_CustomCheck'), 15)

WebUI.verifyElementText(findTestObject('5. Data Tasks/AutoVerification_Multiple_CustomCheck'), 'Another Valid Parcel Validation')

WebUI.waitForElementPresent(findTestObject('5. Data Tasks/AutoVerification_Multiple_CustomCheck_Pencil_Icon'), 15)

WebUI.waitForElementPresent(findTestObject('5. Data Tasks/ErrorResoluiton_Message'), 15)

WebUI.click(findTestObject('5. Data Tasks/AutoVerification_Multiple_CustomCheck_Pencil_Icon'))

ErrorMessage_HoverText1 = WebUI.getText(findTestObject('5. Data Tasks/ErrorResoluiton_Message'))

println(ErrorMessage_HoverText1)

String[] b = ErrorMessage_HoverText1.split('\n')

WebUI.verifyEqual(b[0], 'Error Message: Another Valid Parcel Validation')

WebUI.verifyEqual(b[1], 'Validation Type: Custom Check')

WebUI.verifyEqual(b[2], 'Custom Error Message: Another Invalid Parcel Found')

WebUI.verifyEqual(b[3], 'Information: {"records": [{"parcel_id": "GOODVALUE"}]}')

WebUI.verifyEqual(b[4], 'Not yet resolved.')

WebUI.closeBrowser()

