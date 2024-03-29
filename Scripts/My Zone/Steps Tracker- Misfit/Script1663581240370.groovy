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
    WebUI.comment('Tap on My zone tab fron home screen')

    Mobile.tap(findTestObject('Food tracker/My zone tab 5'), 30)
}

WebUI.delay(10)

not_run: if (Mobile.verifyElementExist(findTestObject('Food tracker/android.view.ViewGroup22'), 40, FailureHandling.OPTIONAL) == 
true) {
    not_run: WebUI.comment('Tap on Meal tracker in my zone section')

    not_run: Mobile.tap(findTestObject('Food tracker/android.view.ViewGroup22'), 20, FailureHandling.OPTIONAL)
}

//Mobile.tap(findTestObject('Food tracker/Food tracker tab1'), 30)
not_run: WebUI.delay(10)

not_run: Mobile.tap(findTestObject('trackers/food tracker'), 20, FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('trackerss/steptracker1'), 30)

WebUI.delay(10)

if (Mobile.verifyElementExist(findTestObject('Object Repository/Steps tracker/android.widget.TextView - Todays Steps'), 
    30, FailureHandling.OPTIONAL) == true) {
    Mobile.tap(findTestObject('Object Repository/Steps tracker/android.view.ViewGroup'), 30)

    WebUI.delay(5)
}

Mobile.tap(findTestObject('Object Repository/Steps tracker/android.widget.TextView - Set Up a Device'), 30)

if (Mobile.verifyElementExist(findTestObject('Object Repository/Steps tracker/android.widget.Button - PROCEED'), 30, FailureHandling.OPTIONAL) == 
true) {
    Mobile.tap(findTestObject('Object Repository/Steps tracker/android.widget.Button - PROCEED'), 30)

    WebUI.delay(5)
}

Mobile.getText(findTestObject('Object Repository/Steps tracker/android.widget.TextView - Step Tracker Settings'), 30)

Mobile.tap(findTestObject('Steps tracker/android.widget.TextView - Set Up a Device'), 30)

if (Mobile.verifyElementExist(findTestObject('Object Repository/Steps tracker/android.widget.Button - PROCEED'), 30, FailureHandling.OPTIONAL) == 
true) {
    Mobile.tap(findTestObject('Object Repository/Steps tracker/android.widget.Button - PROCEED'), 30)

    WebUI.delay(5)
}

Mobile.getText(findTestObject('Object Repository/Steps tracker/android.widget.TextView - Connect Apps and Devices'), 30)

Mobile.getText(findTestObject('Object Repository/Steps tracker/android.widget.TextView - Connected'), 30)

Mobile.tap(findTestObject('Object Repository/Steps tracker/android.widget.TextView - Connect (1)'), 30)

Mobile.delay(15, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Object Repository/Steps tracker/android.widget.EditText (1)'), 'jogendra.singh@truworth.com', 
    30)

Mobile.setText(findTestObject('Object Repository/Steps tracker/android.widget.EditText (2)'), 'Truworth@123', 30)

Mobile.getText(findTestObject('Object Repository/Steps tracker/android.widget.TextView - Misfit Authentication'), 30)

Mobile.tap(findTestObject('Object Repository/Steps tracker/android.widget.Button - Email Sign in'), 30)

Mobile.delay(20, FailureHandling.STOP_ON_FAILURE)

Mobile.getText(findTestObject('Object Repository/Steps tracker/android.widget.TextView - Mis Fit'), 30)

Mobile.getText(findTestObject('Steps tracker/android.widget.TextView - Todays Steps'), 30)

Mobile.getText(findTestObject('Steps tracker/android.widget.TextView - 0 Step'), 30)

Mobile.getText(findTestObject('Object Repository/Steps tracker/android.widget.TextView - Steps'), 30)

Mobile.pressBack()

Mobile.getText(findTestObject('Object Repository/Steps tracker/android.widget.TextView - My Zone'), 30, FailureHandling.OPTIONAL)

Mobile.closeApplication()

