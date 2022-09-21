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

Mobile.startApplication(GlobalVariable.build_path, false)

WebUI.delay(40)

KeywordLogger log = new KeywordLogger()

username = Mobile.verifyElementExist(findTestObject('Hamburger menu'), 30, FailureHandling.OPTIONAL)

if (username == false) {
    WebUI.callTestCase(findTestCase('TestModules/call dashboard screen'), [:], FailureHandling.STOP_ON_FAILURE)

    not_run: WebUI.comment('Tap on Hamburger menu.')

    not_run: Mobile.tap(findTestObject('Hamburger menu'), 30)

    not_run: WebUI.delay(10)

    not_run: Mobile.scrollToText('Log Out')

    not_run: WebUI.comment('Tap on Logout button.')

    not_run: Mobile.tap(findTestObject('null'), 10)

    not_run: WebUI.delay(20)
}

if (Mobile.verifyElementExist(findTestObject('Food tracker/My zone tab 5'), 30, FailureHandling.OPTIONAL) == true) {
    WebUI.comment('user tap on My zone tab on home screen')

    Mobile.tap(findTestObject('Food tracker/My zone tab 5'), 15)
}

WebUI.delay(15)

WebUI.comment('user scroll the screen up to sleep tracker to tap on sleep tracker')

Mobile.scrollToText('8 hours slept', FailureHandling.STOP_ON_FAILURE)

WebUI.delay(8)

WebUI.comment('Tap on Sleep tracker on My zone screen')

not_run: Mobile.tap(findTestObject('Sleep tracker/sleep tracker01'), 30, FailureHandling.OPTIONAL)

not_run: WebUI.delay(3)

not_run: Mobile.tap(findTestObject('trackers/sleep tracker'), 30, FailureHandling.OPTIONAL)

Mobile.tapAtPosition(564, 1460)

WebUI.delay(3)

WebUI.comment('User tap onb "TRACK SLEEP" button')

Mobile.tap(findTestObject('Sleep tracker/android.widget.TextView - TRACK SLEEP'), 30)

WebUI.delay(4)

WebUI.comment('Capture the sleep time ')

def sleep_time1 = Mobile.getText(findTestObject('Sleep tracker/android.widget.EditText - 8 hr 00 min'), 30)

log.logInfo(sleep_time1)

WebUI.comment('Tap on NEXT button after selecting time period for sleep')

Mobile.tap(findTestObject('Sleep tracker/Next button3'), 30)

WebUI.delay(3)

WebUI.comment('User give 4-star to the sleep')

Mobile.tap(findTestObject('Sleep tracker/4star4'), 30)

WebUI.delay(3)

WebUI.comment('user select Secong smiley for th sleep')

Mobile.tap(findTestObject('Sleep tracker/Smile5'), 30)

WebUI.comment('Tap on Tell about sleep field to write about this sleep')

Mobile.tap(findTestObject('Sleep tracker/Tell about sleep'), 30)

Mobile.setText(findTestObject('Sleep tracker/Tell about sleep'), 'test sleep log', 30)

WebUI.comment('User tap on "SAVE LOG" button on Track sleep screen')

Mobile.tap(findTestObject('Sleep tracker/save button 7'), 30)

WebUI.delay(12)

WebUI.comment('Capure the last sleep hours from the last log added')

def sleep_time2 = Mobile.getText(findTestObject('Sleep tracker/android.widget.TextView - 8 hours'), 30)

log.logInfo(sleep_time2)

if (sleep_time1 != sleep_time2) {
    log.logInfo('Sleep time logged')
} else {
    log.logInfo('Sleep time is not logged')

    assert false : 'Test case failed- Sleep time is not logged.'
}

WebUI.comment('Tap on Delete icon visible on last sleep log added by the user')

Mobile.tap(findTestObject('Object Repository/Sleep tracker/android.view.ViewGroup (5)'), 30)

WebUI.delay(3)

WebUI.comment('User tap on "DELETE" button on the pop-up for the question : Are you sure you want to delete this record?')

Mobile.tap(findTestObject('Object Repository/Sleep tracker/android.widget.Button - DELETE'), 30)

WebUI.delay(5)

WebUI.comment('Tap on back button from the sleep tracker log screen')

Mobile.pressBack()

WebUI.delay(5)

Mobile.closeApplication()

