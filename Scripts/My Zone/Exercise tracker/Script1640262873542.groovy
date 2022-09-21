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

WebUI.delay(40)

if (Mobile.verifyElementExist(findTestObject('App update/android.widget.Button - CANCEL'), 30, FailureHandling.OPTIONAL) == 
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

    not_run: Mobile.tap(findTestObject('null'), 10)

    not_run: WebUI.delay(20)
}

if (Mobile.verifyElementExist(findTestObject('Food tracker/My zone tab 5'), 60, FailureHandling.OPTIONAL) == true) {
    WebUI.comment('User tap on "My Zone" tab')

    Mobile.tap(findTestObject('Food tracker/My zone tab 5'), 60)
}

WebUI.delay(15)

Mobile.scrollToText('8 hours slept', FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.comment('User tap on Exercise tracker in my zone section')

not_run: Mobile.tap(findTestObject('Exercise tracker/Exercise tracker tab on my zone'), 15, FailureHandling.OPTIONAL)

Mobile.tapAtPosition(632, 1104)

WebUI.delay(3)

verifyscreen = Mobile.verifyElementText(findTestObject('MJ/android.widget.TextView - All Exercises'), 'All Exercises', FailureHandling.OPTIONAL)

if (verifyscreen == true) {
    WebUI.comment('Verified')
} else {
    Mobile.pressBack()

    WebUI.delay(3)

    Mobile.tap(findTestObject('trackers/exercise tracker'), 15, FailureHandling.OPTIONAL)

    WebUI.delay(3)
}

WebUI.comment('User tap on "All Exercises" on search exercise screen')

not_run: Mobile.tap(findTestObject('Object Repository/Exercise tracker/android.view.ViewGroup (1)'), 30)

Mobile.tap(findTestObject('Exercise tracker/Exercise tracker 2/All Exercises exercise tracker t'), 30)

WebUI.delay(3)

WebUI.comment('User tap on Search Exercise input field')

not_run: Mobile.tap(findTestObject('Object Repository/Exercise tracker/android.widget.EditText - Search exercise'), 30)

Mobile.tap(findTestObject('Exercise tracker/Exercise tracker 2/Search exercise execise tracker t'), 30)

WebUI.delay(3)

WebUI.comment('User search "Running" in search exercise field')

Mobile.setText(findTestObject('Object Repository/Exercise tracker/android.widget.EditText - Search exercise (1)'), 'Running', 
    30)

WebUI.delay(3)

WebUI.comment('User tap on exercise showing in the list after the search(06 km/hr)')

Mobile.tap(findTestObject('Object Repository/Exercise tracker/android.view.ViewGroup (3)'), 30)

WebUI.delay(3)

WebUI.comment('Capturing the exercise name from Track Activity screen')

def exercise1 = Mobile.getText(findTestObject('Exercise tracker/Running 06 kmhr'), 30)

log.logInfo(exercise1)

WebUI.comment('User set 15 minutes for the exercise')

Mobile.setText(findTestObject('Object Repository/Exercise tracker/android.widget.EditText - 1'), '15', 30)

WebUI.delay(3)

WebUI.comment('Tap on "ADD TO LOG" button on track Activity screen to add this exercise.')

not_run: Mobile.tap(findTestObject('Object Repository/Exercise tracker/android.view.ViewGroup (4)'), 30)

Mobile.tap(findTestObject('Exercise tracker/Exercise tracker 2/ADD TO LOG exercise tracker t'), 30)

WebUI.delay(5)

WebUI.comment('Capture the Exercise name after adding exercise to logs from exercise screen')

def exercise2 = Mobile.getText(findTestObject('Exercise tracker/Running 06 kmhr 1'), 30)

log.logInfo(exercise2)

if (exercise1 == exercise2) {
    log.logInfo('Exercise logged')
} else {
    log.logInfo('Exercise is not logged')

    assert false : 'Test case failed- Exercise not logged'
}

WebUI.comment('Tap on "ADD MORE EXERCISE" on exercise screen to add more exercise to log')

not_run: Mobile.tap(findTestObject('Object Repository/Exercise tracker/android.view.ViewGroup (5)'), 30)

Mobile.tap(findTestObject('Exercise tracker/Exercise tracker 2/ADD MORE EXERCISE exercise tracker t'), 30)

WebUI.delay(3)

WebUI.comment('Tap on "Search Exercise" field to seach the exercise')

not_run: Mobile.tap(findTestObject('Object Repository/Exercise tracker/android.view.ViewGroup (6)'), 30)

Mobile.tap(findTestObject('Exercise tracker/Exercise tracker 2/Search exercise execise tracker t'), 30)

WebUI.delay(5)

WebUI.comment('Tap on the "Running: 09km/hr" showing in the recent list below the seach box')

not_run: Mobile.tap(findTestObject('Exercise tracker/running 06 km'), 30)

Mobile.tap(findTestObject('Exercise tracker/Exercise tracker 2/Running 06 kmhr exercise tracker t'), 30)

WebUI.delay(3)

WebUI.comment('Set 10 minutes for the exercise')

Mobile.setText(findTestObject('Exercise tracker/Track activity edit text box'), '10', 30)

WebUI.comment('Capure the name of second exercise adding to the log')

exercise_1 = Mobile.getText(findTestObject('Exercise tracker/android.widget.TextView - Ab Roller  Wheel Rollout  Kneeling Roll Extensions'), 
    30)

log.logInfo(exercise_1)

WebUI.comment('Tap on "Add TO LOG" button to add this exercise')

not_run: Mobile.tap(findTestObject('Exercise tracker/Add to log button'), 30)

Mobile.tap(findTestObject('Exercise tracker/Exercise tracker 2/ADD TO LOG exercise tracker t'), 30)

WebUI.delay(3)

WebUI.comment('Capture the name of second exercise added to the log')

exercise_2 = Mobile.getText(findTestObject('Exercise tracker/android.widget.TextView - Ab Roller  Wheel Rollout  Kneeling Roll Extensions2'), 
    30)

log.logInfo(exercise_2)

if (exercise_1 == exercise_2) {
    log.logInfo('Exercise logged')
} else {
    log.logInfo('Exercise is not logged')

    not_run: assert false : 'Test case failed- Exercise not logged'
}

WebUI.comment('Tap on "Delete" icon showing infront of exercise added on exercise "Running: 06km/hr" screen')

Mobile.tap(findTestObject('Object Repository/Exercise tracker/android.view.ViewGroup (8)'), 30)

WebUI.delay(3)

WebUI.comment('Tap on "YES\' button on the pop-up: Are you sre you want to delete this exercise?')

Mobile.tap(findTestObject('Object Repository/Exercise tracker/android.widget.Button - YES'), 30)

WebUI.comment('Tap on back button from Exercise log screen')

Mobile.pressBack()

not_run: Mobile.tap(findTestObject('Object Repository/Exercise tracker/android.view.ViewGroup (9)'), 30)

WebUI.delay(3)

WebUI.comment('Tap on back button.')

Mobile.pressBack()

not_run: Mobile.tap(findTestObject('Object Repository/Exercise tracker/android.view.ViewGroup (10)'), 30)

not_run: WebUI.delay(3)

not_run: Mobile.pressBack()

not_run: Mobile.tap(findTestObject('Object Repository/Exercise tracker/android.view.ViewGroup (11)'), 30)

WebUI.delay(15)

Mobile.closeApplication()

