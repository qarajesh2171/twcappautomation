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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger

Mobile.startApplication(GlobalVariable.diawi_path, false)

WebUI.delay(40)

KeywordLogger log = new KeywordLogger()

WebUI.delay(3)

WebUI.comment('Verify that Hamburger menu is present and Capture the username from side menu on taping hamburger icon')

username = Mobile.verifyElementExist(findTestObject('Hamburger menu'), 30, FailureHandling.OPTIONAL)

if (username == false) {
    WebUI.callTestCase(findTestCase('TestModules/call dashboard screen'), [:], FailureHandling.STOP_ON_FAILURE)
}

WebUI.comment('Tap on Hamburger menu')

Mobile.tap(findTestObject('Hamburger menu'), 30)

WebUI.delay(10)

Mobile.scrollToText('Log Out')

WebUI.comment('User tap on Setting from side menu')

Mobile.tap(findTestObject('Object Repository/Settings/android.widget.TextView - Settings'), 30)

WebUI.comment('Verify text : Change Mobile Number')

Mobile.verifyElementExist(findTestObject('Object Repository/Settings/android.widget.TextView - Change Mobile Number'), 30)

WebUI.comment('Verify Text : Change Password')

Mobile.verifyElementExist(findTestObject('Object Repository/Settings/android.widget.TextView - Change Password'), 30)

WebUI.comment('Verify Text : Enable Device Authentication')

Mobile.verifyElementExist(findTestObject('Object Repository/Settings/android.widget.TextView - Enable Device Authentication'), 
    30)

WebUI.comment('Verify Text : Delete Account')

Mobile.verifyElementExist(findTestObject('Object Repository/Settings/android.widget.TextView - Delete Account'), 30)

WebUI.comment('User tap on Change Mobile Number option')

Mobile.tap(findTestObject('Settings/android.widget.TextView - Change Mobile Number'), 30)

WebUI.comment('Enter the Mobile number')

Mobile.setText(findTestObject('Object Repository/Settings/android.widget.EditText'), '8888888888', 30)

WebUI.comment('Verify the text : Enter your mobile number')

Mobile.verifyElementExist(findTestObject('Object Repository/Settings/android.widget.TextView - Enter your mobile number'), 
    30)

WebUI.comment('User tap on Continue button')

Mobile.tap(findTestObject('Settings/Continue on mobile number'), 30)

WebUI.comment('Verify "OTP sent to xxxxxx8888" text is present on the screen')

Mobile.verifyElementExist(findTestObject('Object Repository/Settings/android.widget.TextView - OTP sent to xxxxxx8888'), 
    30)

screen1 = Mobile.getText(findTestObject('Object Repository/Settings/android.widget.TextView - OTP sent to xxxxxx8888'), 
    30)

WebUI.comment('User tap on Back button')

Mobile.pressBack()

WebUI.comment('User tap on Back button')

Mobile.pressBack()

WebUI.comment('User tap on "Change Password" Button')

Mobile.tap(findTestObject('Settings/android.widget.TextView - Change Password'), 30)

WebUI.comment('Enter the Current Password')

Mobile.setText(findTestObject('Object Repository/Settings/android.widget.EditText (1)'), GlobalVariable.password, 30)

WebUI.comment('Verify the text : Enter your current Password')

Mobile.verifyElementExist(findTestObject('Object Repository/Settings/android.widget.TextView - Enter your current password'), 
    30)

screen2 = Mobile.getText(findTestObject('Object Repository/Settings/android.widget.TextView - Enter your current password'), 
    30)

WebUI.comment('User tap on Continue button')

Mobile.tap(findTestObject('Object Repository/Settings/android.widget.TextView - Continue (1)'), 30)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

WebUI.comment('Enter new password')

Mobile.setText(findTestObject('Object Repository/Settings/android.widget.EditText (2)'), GlobalVariable.password, 30)

WebUI.comment('User tap on Continue button')

Mobile.tap(findTestObject('Object Repository/Settings/android.widget.TextView - Continue (2)'), 30)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

WebUI.comment('Confirm new password')

Mobile.setText(findTestObject('Object Repository/Settings/android.widget.EditText (3)'), GlobalVariable.password, 30)

WebUI.comment('User tap on Continue button')

Mobile.tap(findTestObject('Object Repository/Settings/android.widget.TextView - Continue (3)'), 30)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

WebUI.comment('Verify the text : Settings')

Mobile.getText(findTestObject('Object Repository/Settings/android.widget.TextView - Settings (2)'), 30)

not_run: WebUI.comment('Verify the text : Create your Password')

not_run: Mobile.verifyElementExist(findTestObject('Object Repository/Settings/android.widget.TextView - Invalid password'), 
    30)

not_run: WebUI.comment('User tap on Back button')

not_run: Mobile.pressBack()

not_run: WebUI.comment('User tap on Back button')

not_run: Mobile.pressBack()

WebUI.comment('User Tap on Enable Device Authentication option')

Mobile.tap(findTestObject('Settings/android.widget.TextView - Enable Device Authentication'), 30)

WebUI.comment('Verify the text : Enable Device Authentication')

Mobile.verifyElementExist(findTestObject('Object Repository/Settings/android.widget.TextView - Enable Device Authentication (1)'), 
    30)

screen3 = Mobile.getText(findTestObject('Object Repository/Settings/android.widget.TextView - Enable Device Authentication (1)'), 
    30)

WebUI.comment('User tap on cross icon')

not_run: Mobile.tap(findTestObject('Object Repository/Settings/android.view.ViewGroup'), 30)

Mobile.tapAtPosition(476, 981)

WebUI.comment('User tap on Delete Account option')

Mobile.tap(findTestObject('Settings/android.widget.TextView - Delete Account'), 30)

WebUI.comment('Verify the text on the screen : Weare sad to see you go')

Mobile.verifyElementExist(findTestObject('Object Repository/Settings/android.widget.TextView - We are sad to see you go'), 
    30)

screen4 = Mobile.getText(findTestObject('Object Repository/Settings/android.widget.TextView - We are sad to see you go'), 
    30)

WebUI.comment('User Select "Other" option')

Mobile.tap(findTestObject('Object Repository/Settings/android.widget.TextView - Other'), 30)

WebUI.comment('User tap on Next button')

Mobile.tap(findTestObject('Object Repository/Settings/android.widget.TextView - NEXT'), 30)

not_run: Mobile.verifyElementExist(findTestObject(''), 30)

WebUI.comment('User tap on Back button')

Mobile.pressBack()

WebUI.comment('User tap on Back button')

Mobile.pressBack()

WebUI.comment('User tap on Back button and redirected to Home screen')

Mobile.pressBack()

if (screen2 == 'Enter your current password') {
    WebUI.comment('Test case Passed- User is at Enter your current password screen')
} else {
    WebUI.comment('Test case Failed- User is not at Enter your current password screen')

    Mobile.closeApplication()

    assert false : 'Test case Failed- User is not at Enter your current password screen'
}

if (screen3 == 'Enable Device Authentication') {
    WebUI.comment('Test case Passed- User is at Enable Device Authentication')
} else {
    WebUI.comment('Test case Failed- User is not at Enable Device Authentication')

    Mobile.closeApplication()

    assert false : 'Test case Failed- User is not at Enable Device Authentication'
}

if (screen4 == 'We are sad to see you go') {
    WebUI.comment('Test case Passed- User is at delete account')
} else {
    WebUI.comment('Test case Failed- User is not at delete account')

    Mobile.closeApplication()

    assert false : 'Test case Failed- User is not at delete account'
}

Mobile.closeApplication()

