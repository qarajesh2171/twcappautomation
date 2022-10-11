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

WebUI.comment('Tap on Therapy tab on dashboard')

Mobile.tap(findTestObject('Emotional Therapiest/Tharepy tab dashboard'), 30)

WebUI.delay(3)

WebUI.comment('Tap on START NOW of Therapy over chat on Emotional therapy screen')

Mobile.tap(findTestObject('Object Repository/Emotional Therapiest/android.widget.TextView - START NOW'), 30)

WebUI.delay(10)

WebUI.comment('Enter the query in the text box: "Test query via automation testing"')

Mobile.setText(findTestObject('Object Repository/Emotional Therapiest/android.widget.EditText - Eg. - Im having trouble sleeping'), 
    'Test query via automation testing', 30)

WebUI.delay(3)

WebUI.comment('Tap on Select if you would like to stay anonymous radio button on Emotional Therapy screen')

Mobile.tap(findTestObject('Object Repository/Emotional Therapiest/android.view.ViewGroup (1)'), 30)

WebUI.delay(3)

WebUI.comment('Write the text : Test alias name in the text box of EnterAlias')

Mobile.setText(findTestObject('Object Repository/Emotional Therapiest/android.widget.EditText'), 'Test alias name', 30)

WebUI.comment('Tap on START NOW button on emotional therapy screen')

Mobile.tap(findTestObject('Emotional Therapiest/START NOW on emo therapy'), 30)

WebUI.delay(10)

WebUI.comment('Capture the assigned coach name  from finding a therpist screen')

def coachassign = Mobile.getText(findTestObject('Object Repository/Ask a Dietitians/android.widget.TextView - new coach test coach'), 
    30)

WebUI.comment('Cature the text "Congratulations" on Finding the therapist screen or coach assigned screen')

Mobile.getText(findTestObject('Object Repository/Ask a Dietitians/android.widget.TextView - Congratulations'), 30)

WebUI.delay(3)

WebUI.comment('Tap on "VIEW PROFILE" button on finding a therapist screen')

Mobile.tap(findTestObject('Emotional Therapiest/View Profile on emo therapy'), 30)

WebUI.delay(3)

WebUI.comment('capture Coach name from coach profile screen')

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

WebUI.delay(3)

WebUI.comment('Tap back button from coach profile screen')

Mobile.tap(findTestObject('Ask a Dietitians/back button2'), 30)

WebUI.delay(3)

WebUI.comment('User tap on "START CHAT" button on finding a therapist screen where assigned coach is displaying')

Mobile.tap(findTestObject('Emotional Therapiest/START CHAT on find therapy'), 30)

WebUI.delay(3)

WebUI.comment('Capure the coach name from the chat screen')

Mobile.getText(findTestObject('Object Repository/Ask a Dietitians/android.widget.TextView - new coach test coach (2)'), 
    30)

def message = 'test message via automation'

WebUI.comment('Write comment in the chat box: test messase via automation. ')

Mobile.setText(findTestObject('Object Repository/Ask a Dietitians/android.widget.EditText'), message, 30)

WebUI.delay(3)

WebUI.comment('Tap on send button to send the message to coach')

Mobile.tap(findTestObject('Object Repository/Ask a Dietitians/android.view.ViewGroup (6)'), 30)

WebUI.delay(3)

WebUI.comment('Capure the last message sent to the coach')

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

WebUI.comment('Tap on the back button from therapist chat screen')

Mobile.tap(findTestObject('Ask a Dietitians/back1'), 30)

WebUI.delay(3)

Mobile.scrollToText('My Consultations', FailureHandling.STOP_ON_FAILURE)

WebUI.comment('Tap on My consultations card from the Wellness consultations screen')

Mobile.tap(findTestObject('Emotional Therapiest/My Consultations tab'), 30)

WebUI.delay(3)

WebUI.comment('Tap on first ongoing session of dietition consultation')

Mobile.tap(findTestObject('Ask a Dietitians/My Consultations/Ongoing sessions 1st tab'), 30)

WebUI.delay(3)

WebUI.comment('Tap bacck button Dietitian chat')

Mobile.tap(findTestObject('Ask a Dietitians/My Consultations/back button on dietitians tav'), 30)

WebUI.delay(3)

WebUI.comment('Tap on the therapist tab on My Consultation screen')

Mobile.tap(findTestObject('Ask a Dietitians/My Consultations/Therapist tab'), 30)

WebUI.delay(3)

WebUI.comment('Tap on the first ongoing session of therapiest')

Mobile.tap(findTestObject('Ask a Dietitians/My Consultations/Ongoing sessions 1st tab'), 30)

WebUI.delay(3)

WebUI.comment('Tap on the back button from chat screen of therapiest')

Mobile.tap(findTestObject('Ask a Dietitians/My Consultations/back button on dietitians tav'), 30)

WebUI.delay(15)

Mobile.closeApplication()

