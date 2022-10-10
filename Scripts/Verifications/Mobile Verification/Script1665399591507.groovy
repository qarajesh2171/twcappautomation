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

Mobile.startApplication(GlobalVariable.build_path, false)

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
