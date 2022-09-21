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

KeywordLogger log = new KeywordLogger()

WebUI.delay(45)

if (Mobile.verifyElementExist(findTestObject('App update/android.widget.Button - CANCEL'), 15, FailureHandling.OPTIONAL) == 
true) {
    Mobile.tap(findTestObject('App update/android.widget.Button - CANCEL'), 30)
}

username = Mobile.verifyElementExist(findTestObject('Hamburger menu'), 30, FailureHandling.OPTIONAL)

if (username == false) {
    WebUI.callTestCase(findTestCase('TestModules/call dashboard screen'), [:], FailureHandling.STOP_ON_FAILURE)

    not_run: WebUI.comment('Tap on Hamburger menu.')

    not_run: Mobile.tap(findTestObject('Hamburger menu'), 30)

    not_run: WebUI.delay(10)

    not_run: Mobile.scrollToText('Log Out')

    not_run: WebUI.comment('Tap on Logout button.')

    not_run: Mobile.tap(findTestObject('Login/Log Out 1'), 10)

    not_run: WebUI.delay(20)
}

if (Mobile.verifyElementExist(findTestObject('Food tracker/My zone tab 5'), 60, FailureHandling.OPTIONAL) == true) {
    WebUI.comment('Tap on My zone tab on home screen')

    Mobile.tap(findTestObject('Food tracker/My zone tab 5'), 60)
}

WebUI.delay(15)

int random_num = (((Math.random() * ((1000 - 100) + 1)) + 100) as int)

def expected_file = 'health file via automation 1' + random_num

WebUI.comment('Tap on My health Profile card in my zone section')

not_run: Mobile.tap(findTestObject('Object Repository/Health Files/android.view.ViewGroup'), 30)

Mobile.tapAtPosition(528, 450)

WebUI.delay(3)

WebUI.comment('Capture the text My Health File on my health profile screen')

Mobile.getText(findTestObject('Object Repository/Health Files/android.widget.TextView - My Health File'), 30)

WebUI.comment('tap on My health file on my health profile screen')

Mobile.tap(findTestObject('Object Repository/Health Files/android.view.ViewGroup (1)'), 30)

WebUI.delay(3)

not_run: Mobile.getText(findTestObject('Object Repository/Health Files/android.widget.TextView - No Health File Found'), 
    30)

WebUI.comment('Tap on "ADD HEALTH RECORD" button on my Health File')

Mobile.tap(findTestObject('Object Repository/Health Files/android.view.ViewGroup (2)'), 30)

WebUI.delay(3)

WebUI.comment('Tap on "Take a Picture" to take picture to upload in health record')

Mobile.tap(findTestObject('Object Repository/Health Files/android.view.ViewGroup (3)'), 30)

WebUI.delay(15)

not_run: Mobile.tap(findTestObject('Object Repository/Health Files/android.view.View'), 30)

not_run: WebUI.delay(3)

WebUI.comment('Tap on image capure button to click the image.')

Mobile.tap(findTestObject('Health Files/android.view.View12'), 30)

WebUI.delay(8)

WebUI.comment('Tap on "Tap to Preview" to see the captured image')

Mobile.tap(findTestObject('Health Files/Tap to preview text tab'), 30)

WebUI.delay(3)

WebUI.comment('Tap on Cross icon to close the image and user redirect to Add health record screen')

Mobile.tap(findTestObject('Object Repository/Health Files/android.view.ViewGroup (5)'), 30)

WebUI.delay(3)

WebUI.comment('Enter the name of the Health File')

Mobile.setText(findTestObject('Object Repository/Health Files/android.widget.EditText - Enter a name of this health record'), 
    expected_file, 30)

WebUI.comment('Enter the Description of the Health record')

Mobile.setText(findTestObject('Object Repository/Health Files/android.widget.EditText - Enter details about this record to help you identify it later'), 
    'test description', 30)

WebUI.comment('Tap on the Prescription in healh record type on Health record screen')

Mobile.tap(findTestObject('Object Repository/Health Files/android.view.ViewGroup (6)'), 30)

WebUI.comment('Tap on "SAVE" button on Add Health Record Screen')

Mobile.tap(findTestObject('Health Files/SAVE button'), 30)

WebUI.delay(10)

Mobile.scrollToText('health file via automation')

WebUI.delay(3)

WebUI.comment('Capure the name of the health file which is added in the last')

def actual_file = Mobile.getText(findTestObject('Health Files/health file text'), 30)

log.logInfo(actual_file)

log.logInfo(expected_file)

WebUI.delay(3)

WebUI.comment('Tap on the Health record which is added in the last')

Mobile.tap(findTestObject('Object Repository/Health Files/android.view.ViewGroup (7)'), 30)

WebUI.delay(7)

WebUI.comment('Tap on "Download" button on the health file image')

Mobile.tap(findTestObject('Health Files/download button on image'), 30)

WebUI.delay(10)

WebUI.comment('Tap on "OK\' button on file downloaded successfully popup')

Mobile.tap(findTestObject('Object Repository/Health Files/android.widget.Button - OK'), 30)

WebUI.delay(8)

not_run: Mobile.tap(findTestObject('Object Repository/Health Files/android.view.ViewGroup (9)'), 30)

WebUI.comment('Tap on back button on My health files list screen')

Mobile.tap(findTestObject('Health Files/Crossbutton'), 0)

WebUI.delay(3)

WebUI.comment('Tap and hold on the added health file')

Mobile.tapAndHold(findTestObject('Health Files/android.view.ViewGroup (7)'), 5, 30)

WebUI.comment('Tap on "YES" button on the popup Are you sure you would like to delete this health record?')

Mobile.tap(findTestObject('Object Repository/Health Files/android.widget.Button - YES'), 30)

if (actual_file == expected_file) {
    log.logInfo('Health File created.')
} else {
    log.logInfo('Health File isn\'t created.')

    assert false : 'Test case failed- Health file is not created.'
}

WebUI.delay(10)

Mobile.closeApplication()

