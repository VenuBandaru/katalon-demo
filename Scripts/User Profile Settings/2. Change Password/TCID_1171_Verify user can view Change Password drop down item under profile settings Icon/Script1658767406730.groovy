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

WebUI.verifyElementPresent(findTestObject('3. User Profile Settings/UserProfileSettings_Icon'), 10)

WebUI.click(findTestObject('3. User Profile Settings/UserProfileSettings_Icon'))

WebUI.verifyElementPresent(findTestObject('3. User Profile Settings/Dropdown_header'), 10)

WebUI.verifyElementPresent(findTestObject('3. User Profile Settings/ChangePassword_dropdown'), 10)

WebUI.click(findTestObject('3. User Profile Settings/ChangePassword_dropdown'))

WebUI.verifyElementPresent(findTestObject('3. User Profile Settings/Sec_ChangePasssword_Heading'), 10)

WebUI.verifyElementPresent(findTestObject('3. User Profile Settings/label_OldPassword'), 10)

WebUI.verifyElementPresent(findTestObject('3. User Profile Settings/label_NewPassword'), 10)

WebUI.verifyElementPresent(findTestObject('3. User Profile Settings/label_NewPasswordConformation'), 10)

WebUI.verifyElementPresent(findTestObject('3. User Profile Settings/label_PasswordRules'), 10)

WebUI.verifyElementPresent(findTestObject('3. User Profile Settings/label_PasswordRule1'), 10)

WebUI.verifyElementPresent(findTestObject('3. User Profile Settings/label_PasswordRule2'), 10)

WebUI.verifyElementPresent(findTestObject('3. User Profile Settings/label_PasswordRule3'), 10)

WebUI.verifyElementPresent(findTestObject('3. User Profile Settings/label_PasswordRule4'), 10)

WebUI.verifyElementPresent(findTestObject('3. User Profile Settings/btn_ChangePassword'), 10)

WebUI.closeBrowser()

