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

Mobile.startApplication(GlobalVariable.diawi_path, false)

WebUI.delay(20)

not_run: if (Mobile.verifyElementExist(findTestObject('App update/android.widget.Button - CANCEL'), 40, FailureHandling.OPTIONAL) == 
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

not_run: if (username == true) {
    Mobile.tap(findTestObject('Hamburger menu'), 30)

    WebUI.delay(10)

    Mobile.scrollToText('Log Out')

    Mobile.tap(findTestObject('null'), 10)

    WebUI.delay(20)
}

not_run: WebUI.callTestCase(findTestCase('TestModules/call dashboard screen'), [:], FailureHandling.STOP_ON_FAILURE)

if (Mobile.verifyElementExist(findTestObject('Food tracker/My zone tab 5'), 60, FailureHandling.OPTIONAL) == true) {
    WebUI.comment('User tap on myzone tab on home screen')

    Mobile.tap(findTestObject('Food tracker/My zone tab 5'), 30)
}

WebUI.delay(15)

WebUI.comment('User tap on "My Health" Profile card on My zone screen')

not_run: Mobile.tap(findTestObject('Object Repository/Health Files/android.view.ViewGroup'), 30)

Mobile.tap(findTestObject('Health Files/My Health Profile text button'), 30)

WebUI.delay(3)

WebUI.comment('Capture the screen name text-"My Health File"')

Mobile.getText(findTestObject('Object Repository/Health Files/android.widget.TextView - My Health File'), 30)

WebUI.comment('User tap on My Health Vital card on My health profile screen.')

Mobile.tap(findTestObject('Object Repository/Health Vitals/android.view.ViewGroup'), 30)

WebUI.delay(3)

not_run: Mobile.getText(findTestObject('Object Repository/Health Vitals/android.widget.TextView - No Health Vitals Tracked'), 
    30)

WebUI.comment('Tap on "+" icon present on My Health Vitals screen')

Mobile.tap(findTestObject('Object Repository/Health Vitals/android.view.ViewGroup (1)'), 30)

WebUI.delay(3)

WebUI.comment('Tap on "Blood Glucose" to add add readings')

Mobile.tap(findTestObject('Object Repository/Health Vitals/android.view.ViewGroup (2)'), 30)

WebUI.delay(3)

WebUI.comment('Enter 150 in Systolic value for Blood Pressure')

Mobile.setText(findTestObject('Object Repository/Health Vitals/android.widget.EditText - Enter systolic BP'), '150', 10)

WebUI.comment('Enter the 120 value dor Diastolic valueof blood pressure')

Mobile.setText(findTestObject('Object Repository/Health Vitals/android.widget.EditText - Enter diastolic BP'), '120', 10)

WebUI.comment('User tap on "Reading Date and Time" field')

Mobile.tap(findTestObject('Object Repository/Health Vitals/android.view.ViewGroup (3)'), 30)

WebUI.delay(7)

WebUI.comment('Tap on "OK" button on date pikker pop-up')

Mobile.tap(findTestObject('Object Repository/Health Vitals/android.widget.Button - OK'), 30)

WebUI.delay(10)

WebUI.comment('Tap on "OK" button Time picker pop-up')

Mobile.tap(findTestObject('Object Repository/Health Vitals/android.widget.Button - OK (1)'), 30)

WebUI.delay(5)

WebUI.comment('Tap on Remark field and Set the text "test text for BP reading" for remark.')

Mobile.setText(findTestObject('Object Repository/Health Vitals/android.widget.EditText - Enter any remarks you would like to add with this reading'), 
    'test text for BP reading', 10)

WebUI.delay(6)

WebUI.comment('Tap on "SAVE" button to add Blood pressure')

Mobile.tap(findTestObject('Object Repository/Health Vitals/android.view.ViewGroup (4)'), 30)

WebUI.delay(5)

Mobile.verifyElementText(findTestObject('Health Vitals/android.widget.TextView - 150120 (1)'), '150/120')

Mobile.verifyElementText(findTestObject('Health Vitals/android.widget.TextView - Blood Pressure'), 'Blood Pressure')

WebUI.comment('Tap on added Blood pressure card on My Health Vitals screen')

Mobile.tap(findTestObject('Object Repository/Health Vitals/android.view.ViewGroup (5)'), 30)

WebUI.delay(7)

WebUI.comment('tap on "All Data" card on Blood Pressure tracker screen')

Mobile.tap(findTestObject('Health Vitals/Tap on all data'), 30)

WebUI.delay(6)

not_run: Mobile.getText(findTestObject('Object Repository/Health Vitals/android.widget.TextView - 150120'), 0)

WebUI.comment('tap on "Delete" icon on Blood Pressure screen')

Mobile.tap(findTestObject('Object Repository/Health Vitals/android.widget.ImageView'), 30)

WebUI.delay(5)

WebUI.comment('Tap on "Yes" button of the pop-up;Are you sure you would like to delete reading 150/120')

Mobile.tap(findTestObject('Object Repository/Health Vitals/android.widget.Button - YES'), 30, FailureHandling.OPTIONAL)

WebUI.delay(10)

Mobile.closeApplication()

