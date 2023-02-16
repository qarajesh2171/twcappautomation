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
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

Mobile.startApplication(GlobalVariable.diawi_path, false)

WebUI.delay(20)

if (Mobile.verifyElementExist(findTestObject('App update/android.widget.Button - CANCEL'), 40, FailureHandling.OPTIONAL) == 
true) {
    Mobile.tap(findTestObject('App update/android.widget.Button - CANCEL'), 30)
}

KeywordLogger log = new KeywordLogger()

username = Mobile.verifyElementExist(findTestObject('Hamburger menu'), 30, FailureHandling.OPTIONAL)

if (username == true) {
    WebUI.comment('Tap on Hamburger Menu.')

    Mobile.tap(findTestObject('Hamburger menu'), 30)

    WebUI.delay(10)

    Mobile.scrollToText('Log Out')

    WebUI.comment('Tap on Logout button')

    Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('Log Out'), 10)

    WebUI.delay(10)
}

WebUI.comment('Tap on Enter email tab.')

Mobile.tap(findTestObject('Login/android.widget.TextView - Enter your Email'), 30, FailureHandling.STOP_ON_FAILURE)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.comment('Enter the Username')

//GlobalVariable.Useremail = 'rajesh.sharma1@truworth.com'
Mobile.setText(findTestObject('Enter your email'), GlobalVariable.Useremail, 10, FailureHandling.STOP_ON_FAILURE)

WebUI.comment('Tap on Continue button.')

Mobile.tap(findTestObject('Continue'), 10)

WebUI.delay(5)

WebUI.comment('Enter the password')

Mobile.setText(findTestObject('Login/android.widget.EditText (3)'), GlobalVariable.password, 10)

WebUI.comment('Tap on Continue button.')

Mobile.tap(findTestObject('Continue button'), 30)

WebUI.delay(5)

WebUI.comment('Tap on Hamburger menu.')

Mobile.tap(findTestObject('Hamburger menu'), 30)

WebUI.delay(10)

WebUI.comment('Get email address text.')

def actualemail = Mobile.getText(findTestObject('Login/email sidemenu text'), 30)

WebUI.delay(5)

if (GlobalVariable.Useremail == actualemail) {
    log.logInfo('email matched')

    log.logInfo(actualemail)

    log.logInfo(GlobalVariable.Useremail)
} else {
    Mobile.scrollToText('Log Out')

    Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('Log Out'), 10)

    WebUI.delay(10)

    log.logInfo('email not matched')

    assert false : 'email address is not matched'

    Mobile.closeApplication()
}

Mobile.scrollToText('Log Out')

WebUI.comment('Tap on Log out button.')

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Log Out'), 10)

WebUI.delay(10)

Mobile.closeApplication()

