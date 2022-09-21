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

WebUI.comment('User tap on "Diet Consultations" on Home screen')

Mobile.tap(findTestObject('Object Repository/Ask a Dietitians/android.view.ViewGroup'), 30)

WebUI.delay(5)

WebUI.comment('User tap on "Chat With Dietitian" on Ask a Dititian screen')

Mobile.tap(findTestObject('Object Repository/Ask a Dietitians/android.view.ViewGroup (1)'), 30)

WebUI.comment('Enter the query in the Enter your query box.')

Mobile.setText(findTestObject('Object Repository/Ask a Dietitians/android.widget.EditText - Eg. - Is keto diet right for me'), 
    'Test query for test diet consultation...', 30)

WebUI.delay(3)

WebUI.comment('Tap on "START NOW" button')

Mobile.tap(findTestObject('Object Repository/Ask a Dietitians/android.view.ViewGroup (2)'), 30)

WebUI.delay(10)

WebUI.comment('Capure the coach name from finding a Dietitian screen')

def coachassign = Mobile.getText(findTestObject('Object Repository/Ask a Dietitians/android.widget.TextView - new coach test coach'), 
    30)

WebUI.comment('Capture the text-"Congratulations" from Finding a dietitian screen')

Mobile.getText(findTestObject('Object Repository/Ask a Dietitians/android.widget.TextView - Congratulations'), 30)

WebUI.delay(3)

WebUI.comment('Tap on "START CHAT" button on finding a Dietitian screen')

Mobile.tap(findTestObject('Object Repository/Ask a Dietitians/android.view.ViewGroup (3)'), 30)

WebUI.delay(3)

WebUI.comment('Capture the coach name from the chat screen.')

def coachname = Mobile.getText(findTestObject('Object Repository/Ask a Dietitians/android.widget.TextView - new coach test coach (1)'), 
    30)

if (coachassign == coachname) {
    log.logInfo('coach is assigned.')

    log.logInfo(coachassign)

    log.logInfo(coachname)

    WebUI.delay(3)
} else {
    log.logInfo('coach is not assigned.')

    log.logInfo(coachassign)

    log.logInfo(coachname)

    assert false : 'Testcase failed- coach is not assined correctly.'

    WebUI.delay(3)
}

WebUI.comment('Tap the back button on the chat screen')

Mobile.tap(findTestObject('Ask a Dietitians/back button2'), 30)

WebUI.delay(3)

WebUI.comment('Tap on the assigned coach')

Mobile.tap(findTestObject('Object Repository/Ask a Dietitians/android.view.ViewGroup (5)'), 30)

WebUI.delay(3)

Mobile.getText(findTestObject('Object Repository/Ask a Dietitians/android.widget.TextView - new coach test coach (2)'), 
    30)

def message = 'test message via automation'

WebUI.comment('Type message in the text field')

Mobile.setText(findTestObject('Object Repository/Ask a Dietitians/android.widget.EditText'), message, 30)

WebUI.delay(3)

WebUI.comment('Tap on the Send button to send the message to the dietitian')

Mobile.tap(findTestObject('Object Repository/Ask a Dietitians/android.view.ViewGroup (6)'), 30)

WebUI.delay(3)

WebUI.comment('Capure the message send to dietitian')

def sent_message = Mobile.getText(findTestObject('Object Repository/Ask a Dietitians/android.widget.TextView - test message via automation'), 
    30)

if (message == sent_message) {
    log.logInfo('message sent successfully.')

    log.logInfo(message)

    log.logInfo(sent_message)
} else {
    log.logInfo('message is not sending.')

    log.logInfo(message)

    log.logInfo(sent_message)

    assert false : 'Testcase failed.'
}

WebUI.delay(3)

WebUI.comment('Tap back button on chat screen')

Mobile.tap(findTestObject('Ask a Dietitians/back1'), 30)

WebUI.delay(3)

Mobile.scrollToText('My Consultations', FailureHandling.STOP_ON_FAILURE)

WebUI.comment('User tap on "My Consultations" on the Wellness Consultations screen')

WebUI.delay(5)

Mobile.tap(findTestObject('Ask a Dietitians/my consultationsViewGroup'), 30)

WebUI.delay(3)

WebUI.comment('User tap on first consultation of Ongoing Sessions list')

Mobile.tap(findTestObject('Ask a Dietitians/My Consultations/Ongoing sessions 1st tab'), 30)

WebUI.delay(3)

WebUI.comment('User tap on back button from chat screen')

Mobile.tap(findTestObject('Ask a Dietitians/My Consultations/back button on dietitians tav'), 30)

WebUI.delay(3)

WebUI.comment('User tap on Therapist tab on My Consultation screen')

Mobile.tap(findTestObject('Ask a Dietitians/My Consultations/Therapist tab'), 30)

WebUI.delay(3)

WebUI.comment('Tap on the ongoing sessions first tab in therapist on My consultation screen')

Mobile.tap(findTestObject('Ask a Dietitians/My Consultations/Ongoing sessions 1st tab'), 30)

WebUI.delay(3)

WebUI.comment('Tap on the back button from therapist chat screen')

Mobile.tap(findTestObject('Ask a Dietitians/My Consultations/back button on dietitians tav'), 30)

WebUI.delay(15)

Mobile.closeApplication()

