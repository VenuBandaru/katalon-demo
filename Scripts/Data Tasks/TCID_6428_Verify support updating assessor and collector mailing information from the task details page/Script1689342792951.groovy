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

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/Troup_County'), 25)

WebUI.click(findTestObject('5. Data Tasks/Troup_County'))

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/subheading_Relevant_Dates'), 25)

WebUI.verifyElementText(findTestObject('5. Data Tasks/subheading_Relevant_Dates'), 'Relevant Dates')

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/Label_Est_NoticeDate'), 25)

WebUI.verifyElementText(findTestObject('5. Data Tasks/Label_Est_NoticeDate'), 'Est Notice Date')

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/Label_Est_AppealDeadline'), 25)

WebUI.verifyElementText(findTestObject('5. Data Tasks/Label_Est_AppealDeadline'), 'Est Appeal Deadline')

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/label_NextRevelYear'), 25)

WebUI.verifyElementText(findTestObject('5. Data Tasks/label_NextRevelYear'), 'Next Reval Year')

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/label_ConfirmedNoticeDate'), 25)

WebUI.verifyElementText(findTestObject('5. Data Tasks/label_ConfirmedNoticeDate'), 'Confirmed Notice Date')

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/label_Conf_Appeal_Deadline'), 25)

WebUI.verifyElementText(findTestObject('5. Data Tasks/label_Conf_Appeal_Deadline'), 'Conf. Appeal Deadline')

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/label_MainContact'), 25)

WebUI.verifyElementText(findTestObject('5. Data Tasks/label_MainContact'), 'Main Contact edit')

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/button_maincontact_edit'), 25)

WebUI.verifyElementText(findTestObject('5. Data Tasks/button_maincontact_edit'), 'edit')

WebUI.click(findTestObject('5. Data Tasks/button_maincontact_edit'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/newContact'), 25)

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/Label_FirstName'), 25)

WebUI.verifyElementText(findTestObject('5. Data Tasks/Label_FirstName'), 'First Name')

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/Label_LastName'), 25)

WebUI.verifyElementText(findTestObject('5. Data Tasks/Label_LastName'), 'Last Name')

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/Label_Email'), 25)

WebUI.verifyElementText(findTestObject('5. Data Tasks/Label_Email'), 'Email')

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/label_Phone'), 25)

WebUI.verifyElementText(findTestObject('5. Data Tasks/label_Phone'), 'Phone')

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/contacttype_ddl'), 25)

WebUI.doubleClick(findTestObject('5. Data Tasks/contacttype_ddl'))

WebUI.selectOptionByValue(findTestObject('5. Data Tasks/contacttype_ddl'), '6', false)

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/Fname_Textbox'), 25)

WebUI.sendKeys(findTestObject('5. Data Tasks/Fname_Textbox'), Keys.chord(Keys.CONTROL, 'A'))

WebUI.sendKeys(findTestObject('5. Data Tasks/Fname_Textbox'), 'Test_QA')

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/Lname_Textbox'), 25)

WebUI.sendKeys(findTestObject('5. Data Tasks/Lname_Textbox'), Keys.chord(Keys.CONTROL, 'A'))

WebUI.sendKeys(findTestObject('5. Data Tasks/Lname_Textbox'), 'Test1_QA1')

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/Email_textbox'), 25)

WebUI.sendKeys(findTestObject('5. Data Tasks/Email_textbox'), Keys.chord(Keys.CONTROL, 'A'))

WebUI.sendKeys(findTestObject('5. Data Tasks/Email_textbox'), 'qatest@ryan.com')

WebUI.verifyElementPresent(findTestObject('5. Data Tasks/Phone_Textbox'), 25)

WebUI.sendKeys(findTestObject('5. Data Tasks/Phone_Textbox'), Keys.chord(Keys.CONTROL, 'A'))

WebUI.sendKeys(findTestObject('5. Data Tasks/Phone_Textbox'), '777-999-8888')

WebUI.closeBrowser()

