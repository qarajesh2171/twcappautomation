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

WebUI.delay(60)

if (Mobile.verifyElementExist(findTestObject('App update/android.widget.Button - CANCEL'), 40, FailureHandling.OPTIONAL) == 
true) {
    Mobile.tap(findTestObject('App update/android.widget.Button - CANCEL'), 30)
}

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
    Mobile.tap(findTestObject('Food tracker/My zone tab 5'), 30)
}

WebUI.comment('Tap on "My Zone" tab from home screen')

WebUI.delay(15)

Mobile.scrollToText('8 hours slept', FailureHandling.STOP_ON_FAILURE)

WebUI.delay(6)

WebUI.comment('User tap on Meditation tracker in my zone')

Mobile.tapAtPosition(562, 1316)

not_run: Mobile.tap(findTestObject('Meditation tracker/Meditation button'), 30, FailureHandling.OPTIONAL)

WebUI.delay(3)

WebUI.comment('tap on "Meditate Now" Button')

Mobile.tap(findTestObject('Meditation tracker/android.widget.TextView - MEDITATE NOW'), 30)

WebUI.delay(3)

WebUI.comment('User tap on "Silent Mediation" card on meditations screen')

Mobile.tap(findTestObject('Meditation tracker/Silent Meditation button'), 30)

WebUI.delay(3)

WebUI.comment('Tap on Play button to start silent meditation')

Mobile.tapAtPosition(0, 0)

not_run: Mobile.tap(findTestObject('Meditation tracker/Tap on Play booton'), 30)

Mobile.tapAtPosition(530, 808)

WebUI.delay(10)

WebUI.comment('Tap on Back button from running meditatin screen')

Mobile.pressBack()

WebUI.delay(3)

WebUI.comment('Tap on "YES,STOP NOW" button on pop-up to stop the meditation')

Mobile.tap(findTestObject('Object Repository/Meditation tracker/android.widget.Button - YES, STOP NOW'), 30)

WebUI.delay(3)

WebUI.comment('Tap on back button From Meditations screen')

Mobile.pressBack()

WebUI.delay(6)

def actual_medi_time1 = Mobile.getText(findTestObject('Meditation tracker/log meditate text'), 30)

def actual_medi_time2 = Mobile.getText(findTestObject('Meditation tracker/log meditate time'), 30)

log.logInfo(actual_medi_time1)

log.logInfo(actual_medi_time2)

WebUI.comment('tap on Delete icon of the thee first log.')

Mobile.tap(findTestObject('Object Repository/Meditation tracker/android.view.ViewGroup (5)'), 30)

WebUI.delay(3)

WebUI.comment('User tap on DELETE button of the pop-up-"Are you sure you want to delete this record?"')

Mobile.tap(findTestObject('Object Repository/Meditation tracker/android.widget.Button - DELETE'), 30)

WebUI.delay(6)

def exp_medi_time1 = Mobile.getText(findTestObject('Meditation tracker/log meditate text'), 30)

def exp_medi_time2 = Mobile.getText(findTestObject('Meditation tracker/log meditate time'), 30)

log.logInfo(exp_medi_time1)

log.logInfo(exp_medi_time2)

not_run: Mobile.tap(findTestObject('Meditation tracker/android.view.ViewGroup (1)'), 30)

not_run: WebUI.delay(3)

not_run: Mobile.tap(findTestObject('Object Repository/Meditation tracker/android.view.ViewGroup (6)'), 30)

not_run: WebUI.delay(3)

not_run: Mobile.tap(findTestObject('Object Repository/Meditation tracker/android.view.ViewGroup (7)'), 30)

if (actual_medi_time1 != exp_medi_time1) {
    log.logInfo('log deleted')
} else {
    log.logInfo('log not deleted')

    assert false : 'Test case failed- Log not deleted.'
}

if (actual_medi_time2 != exp_medi_time2) {
    log.logInfo('log deleted')
} else {
    log.logInfo('log not deleted')

    assert false : 'Test case failed- Log not deleted.'
}

WebUI.delay(10)

Mobile.closeApplication()

